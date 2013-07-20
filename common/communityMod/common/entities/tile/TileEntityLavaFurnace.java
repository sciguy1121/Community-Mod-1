package communityMod.common.entities.tile;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import communityMod.common.blocks.BlockLavaFurnace;
import communityMod.common.container.ContainerLavaFurnace;
import communityMod.common.gui.GuiLavaFurnace;
import communityMod.common.gui.IGuiTile;

public class TileEntityLavaFurnace extends TileEntity implements IInventory, IGuiTile {
	private ItemStack[] inventory;

	public int furnaceBurnTime = 0;

	public int currentItemBurnTime = furnaceBurnTime;

	public int heat = 0;

	public int furnaceCookTime = 5000;

	public static boolean active = false;

	public TileEntityLavaFurnace() {
		this.inventory = new ItemStack[2];
	}

	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount) {
		ItemStack stack = getStackInSlot(slot);

		if (stack != null) {
			if (stack.stackSize <= amount) {
				setInventorySlotContents(slot, null);
			} else {
				stack = stack.splitStack(amount);
				if (stack.stackSize == 0) {
					setInventorySlotContents(slot, null);
				}
			}
		}

		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack = getStackInSlot(slot);

		if (stack != null) {
			setInventorySlotContents(slot, null);
		}

		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inventory[slot] = stack;

		if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName() {
		return "Geothermal Oven";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord,
				this.zCoord) != this ? false
				: player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D,
						this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}

	@Override
	public void updateEntity() {
		boolean powered = worldObj.getBlockId(xCoord, yCoord - 1, zCoord) == Block.lavaStill.blockID
				|| worldObj.getBlockId(xCoord, yCoord - 1, zCoord) == Block.lavaMoving.blockID;

		active = powered;

		boolean canwork = powered && heat > 0;

		if (powered && heat < 50) {
			heat++;
		}

		if (canwork) {
			furnaceCookTime = 5000 / heat;

			ItemStack stack = getStackInSlot(0);
			ItemStack output = getStackInSlot(1);
			ItemStack result = FurnaceRecipes.smelting().getSmeltingResult(
					stack);

			if (result != null) {
				if (furnaceBurnTime == furnaceCookTime) {
					furnaceBurnTime = 0;
					if (output == null) {
						decrStackSize(0, 1);
						setInventorySlotContents(1, result);
						onInventoryChanged();
					} else {
						if (output.isItemEqual(result)) {
							decrStackSize(0, 1);
							output.stackSize++;
						}
					}
				} else {
					furnaceBurnTime++;
					if (output != null && !output.isItemEqual(result)) {
						furnaceBurnTime = 0;
					}
				}
			}
			if (output != null && output.stackSize == 0) {
				output.stackSize = 1;
			}
		}

		if (getStackInSlot(0) == null) {
			furnaceBurnTime = 0;
		}

		BlockLavaFurnace
				.updateState(
						worldObj.getBlockId(xCoord, yCoord - 1, zCoord) == Block.lavaStill.blockID
								|| worldObj.getBlockId(xCoord, yCoord - 1,
										zCoord) == Block.lavaMoving.blockID,
						worldObj, xCoord, yCoord, zCoord);
	}

	public boolean isSmelting() {
		return furnaceBurnTime > 0;
	}

	public int getBurnTimeRemainingScaled(int par1) {
		if (this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = 200;
		}

		return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		NBTTagList var2 = new NBTTagList();

		for (int var3 = 0; var3 < this.inventory.length; ++var3) {
			if (this.inventory[var3] != null) {
				NBTTagCompound var4 = new NBTTagCompound();
				var4.setByte("Slot", (byte) var3);
				this.inventory[var3].writeToNBT(var4);
				var2.appendTag(var4);
			}
		}

		compound.setShort("Heat", (short) heat);
		compound.setShort("Progress", (short) furnaceBurnTime);
		compound.setTag("Items", var2);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		NBTTagList var2 = compound.getTagList("Items");

		this.heat = compound.getShort("Heat");
		this.furnaceBurnTime = compound.getShort("Progress");

		this.inventory = new ItemStack[this.getSizeInventory()];

		for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
			NBTTagCompound var4 = (NBTTagCompound) var2.tagAt(var3);
			int var5 = var4.getByte("Slot") & 255;

			if (var5 >= 0 && var5 < this.inventory.length) {
				this.inventory[var5] = ItemStack.loadItemStackFromNBT(var4);
			}
		}
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public Container getContainer(World world, int x, int y, int z,
			EntityPlayer player) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		
		if (tile instanceof TileEntityLavaFurnace) {
			return new ContainerLavaFurnace((TileEntityLavaFurnace) tile,
					player.inventory);
		}
		return null;
	}

	@Override
	public GuiContainer getGuiContainer(World world, int x, int y, int z,
			EntityPlayer player) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		
		if (tile instanceof TileEntityLavaFurnace) {
			return new GuiLavaFurnace((TileEntityLavaFurnace) tile,
					player.inventory);
		}
		return null;
	}
}
