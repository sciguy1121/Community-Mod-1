package communityMod.common.entities.tile;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;

import communityMod.common.blocks.BlockLogger;
import communityMod.common.container.ContainerLogger;
import communityMod.common.gui.GuiLogger;
import communityMod.common.gui.IGuiTile;

public class TileEntityLogger extends TileEntity implements IInventory, IGuiTile {
	private ItemStack[] inventory;
	public int progress = 0;
	private int loggingTime = 60;
	public int burning = 0;

	public TileEntityLogger() {
		this.inventory = new ItemStack[3];
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
	public ItemStack getStackInSlotOnClosing(int var1) {
		ItemStack stack = getStackInSlot(var1);

		if (stack != null) {
			setInventorySlotContents(var1, stack);
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
		return "Logger";
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
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }

    @Override
	public void updateEntity() {
		ItemStack log = getStackInSlot(0);
		ItemStack outputSlot = getStackInSlot(1);

		boolean powered = burning > 0;
		boolean canProcess = log != null
				&& (outputSlot == null || outputSlot.isItemEqual(new ItemStack(
						Block.planks, 1, log.getItemDamage()))
						&& outputSlot.stackSize < getInventoryStackLimit() - 4);

		if (log != null && powered) {
			if (canProcess && outputSlot == null) {
				if (progress < loggingTime) {
					progress++;
				} else {
					progress = 0;
					decrStackSize(0, 1);
					setInventorySlotContents(1, new ItemStack(Block.planks, 6,
							log.getItemDamage()));
				}
			} else if (canProcess && outputSlot != null) {
				if (progress < loggingTime) {
					progress++;
				} else {
					decrStackSize(0, 1);
					outputSlot.stackSize = outputSlot.stackSize + 6;
					progress = 0;
				}
			} else {
				progress = 0;
			}
		} else {
			progress = 0;
		}

		if (powered) {
			burning--;
		}

		ItemStack fuel = getStackInSlot(2);

		if (fuel != null && canProcess) {
			if (TileEntityFurnace.getItemBurnTime(fuel) > 0) {
				if (!powered) {
					decrStackSize(2, 1);
					burning = TileEntityFurnace.getItemBurnTime(fuel);
				}
			}
		}

		if (powered != burning > 0) {
			this.onInventoryChanged();
			BlockLogger.updateState(burning > 0, worldObj, xCoord, yCoord,
					zCoord);
		}
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

		compound.setShort("Progress", (short) progress);
		compound.setTag("Items", var2);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		NBTTagList var2 = compound.getTagList("Items");

		this.progress = compound.getShort("Progress");

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
	public Container getContainer(World world, int x, int y, int z,
			EntityPlayer player) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		
		if (tile instanceof TileEntityLogger) {
			return new ContainerLogger((TileEntityLogger) tile,
					player.inventory);
		}
		return null;
	}

	@Override
	public GuiContainer getGuiContainer(World world, int x, int y, int z,
			EntityPlayer player) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		
		if (tile instanceof TileEntityLogger) {
			return new GuiLogger((TileEntityLogger) tile,
					player.inventory);
		}
		return null;
	}
}
