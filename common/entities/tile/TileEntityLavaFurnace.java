package communityMod.common.entities.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLavaFurnace extends TileEntity implements IInventory
{
	private boolean powered;
	private boolean canwork = false;
	private ItemStack[] inventory;
	
	public int furnaceBurnTime = 0;
	  
	public int currentItemBurnTime = 0;

	public int furnaceCookTime = 0;
	
	public int heat = 0;

	public TileEntityLavaFurnace(boolean active)
	{
		this.powered = active;
		this.inventory = new ItemStack[2];
	}

	@Override
	public int getSizeInventory() 
	{
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) 
	{
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amount) 
	{
		ItemStack stack = getStackInSlot(slot);
		
		if(stack != null)
		{
			if(stack.stackSize <= amount)
			{
				stack = null;
			}
			else
			{
				stack = stack.splitStack(amount);
				
				if(stack.stackSize == 0)
				{
					stack = null;
				}
				
			}
		}
		
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) 
	{
		 if (this.inventory[slot] != null)
	        {
	            ItemStack stack = this.inventory[slot];
	            this.inventory[slot] = null;
	            return stack;
	        }
	        else
	        {
	            return null;
	        }
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) 
	{
		if(getStackInSlot(slot) == null)
		{
			inventory[slot] = stack;
		
			if (stack != null && stack.stackSize > this.getInventoryStackLimit())
			{
				stack.stackSize = this.getInventoryStackLimit();
			}
		}
	}

	@Override
	public String getInvName() 
	{
		return "Geothermal Oven";
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}
	
	@Override
	public void updateEntity()
	{
		if(powered && heat < 50)
		{
			heat++;
		}
		
		if(powered && heat == 50)
		{
			canwork = true;
		}
		
		if(canwork)
		{
			ItemStack stack = getStackInSlot(0);
			ItemStack output = getStackInSlot(1);
			ItemStack result = FurnaceRecipes.smelting().getSmeltingResult(stack);
			if(result != null)
			{
				if(output == null)
				{
					decrStackSize(0, 1);
					setInventorySlotContents(1, result);
				} else
				{
					if(output.isItemEqual(stack))
					{
						decrStackSize(0, 1);
						output.stackSize++;
					}
				}
			}
		}
	}
	
	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		NBTTagList var2 = new NBTTagList();

		for (int var3 = 0; var3 < this.inventory.length; ++var3)
	    {
	        if (this.inventory[var3] != null)
	        {
	             NBTTagCompound var4 = new NBTTagCompound();
	             var4.setByte("Slot", (byte)var3);
	             this.inventory[var3].writeToNBT(var4);
	             var2.appendTag(var4);
	        }
	     }

		 compound.setTag("Items", var2);
		 compound.setInteger("Heat", heat);
	 }
	
	 public void readFromNBT(NBTTagCompound compound)
	 {
	     super.readFromNBT(compound);
	     NBTTagList var2 = compound.getTagList("Items");
	     
	     this.heat = compound.getInteger("Heat");
	     
	     this.inventory = new ItemStack[this.getSizeInventory()];
	     
	     for (int var3 = 0; var3 < var2.tagCount(); ++var3)
	     {
	         NBTTagCompound var4 = (NBTTagCompound)var2.tagAt(var3);
	         int var5 = var4.getByte("Slot") & 255;

	         if (var5 >= 0 && var5 < this.inventory.length)
	         {
	             this.inventory[var5] = ItemStack.loadItemStackFromNBT(var4);
	         }
	     }
	 }
	     
}
