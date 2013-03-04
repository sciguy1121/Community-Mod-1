package communityMod.common.entities.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLavaFurnace extends TileEntity implements IInventory
{
	private boolean powered;
	private ItemStack[] inventory;
	
	public int furnaceBurnTime = 0;
	  
	public int currentItemBurnTime = 0;

	public int furnaceCookTime = 0;
	
	public int heat = 0;

	public TileEntityLavaFurnace(boolean powered)
	{
		this.powered = powered;
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
		return "Lava Furnace";
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
		if(heat < 50)
		{
			heat++;
		}
		
	}
}
