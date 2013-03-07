package communityMod.common.entities.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityResearcher extends TileEntity implements IInventory{

	private ItemStack[] inventory;
	
	public int progress = 0;
	
	public TileEntityResearcher(){
		inventory = new ItemStack[2];
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
		
		if(stack != null)
		{
			if (stack.stackSize <= amount)
			{
				setInventorySlotContents(slot, null);
			} else
			{
				stack = stack.splitStack(amount);
				if (stack.stackSize == 0)
				{
					setInventorySlotContents(slot, null);
				}
			}
		}
		
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		ItemStack stack = getStackInSlot(var1);
		
		if(stack != null){
			setInventorySlotContents(var1, stack);
		}
		
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		inventory[slot] = stack;
		
		if (stack != null && stack.stackSize > this.getInventoryStackLimit())
		{
			stack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName() {
		return "Researcher";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openChest() {
		
	}

	@Override
	public void closeChest() {
		
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
		compound.setInteger("Progress", progress);
	 }
	
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		NBTTagList var2 = compound.getTagList("Items");
	     
		this.progress = compound.getInteger("Progress");
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
