package communityMod.common.entities.tile;

import communityMod.common.recipes.ResearcherRecipes;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityResearcher extends TileEntity implements IInventory{

	private ItemStack[] inventory;
	
	public int progress = 0;
	public int researchPower = 0;
	public ItemStack currentResearch = new ItemStack(Block.bedrock, 1);
	
	private int delay = 0;
	
	public TileEntityResearcher(){
		inventory = new ItemStack[3];
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
		NBTTagList research = new NBTTagList();

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

		NBTTagCompound tag = new NBTTagCompound();
		tag.setByte("Research", (byte)0);
		this.currentResearch.writeToNBT(tag);
		research.appendTag(tag);
		
		compound.setTag("Items", var2);
		compound.setTag("Research", research);
		compound.setInteger("Progress", progress);
		compound.setInteger("Research Power", researchPower);
	 }
	
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		NBTTagList var2 = compound.getTagList("Items");
		NBTTagList research = compound.getTagList("Research");
	     
		this.progress = compound.getInteger("Progress");
		this.currentResearch = ItemStack.loadItemStackFromNBT((NBTTagCompound)research.tagAt(0));
		this.researchPower = compound.getInteger("Research Power");
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

	public void updateEntity(){
		ItemStack fuel = getStackInSlot(0);
		ItemStack research = getStackInSlot(1);
		ItemStack output = getStackInSlot(2);
		ItemStack result = ResearcherRecipes.instance().getResearchResult(research);
		
		if(research != null && research.stackSize != 0){
			if(result != null){
				if(delay == 3){
					if(this.currentResearch.itemID == new ItemStack(Block.bedrock, 1).itemID){
						this.currentResearch = research;
					}
					if(this.currentResearch.itemID == research.itemID && progress <= 25){
						progress += 25 / ResearcherRecipes.instance().getProgressRequired(research);
						this.inventory[1].stackSize--;
						delay = 0;
					}
				}
				delay++;
			}
		}
		
		if(progress >= 25){
			this.currentResearch = new ItemStack(Block.bedrock, 1);
			if(this.inventory[2] == null){
				this.inventory[2] = ResearcherRecipes.instance().getResearchResult(research);
			}else{
				this.inventory[2].stackSize++;
			}
			progress = 0;
		}
	}
	
	public boolean isResearching(){
		return progress > 0;
	}

	//Required function
	public boolean func_94042_c() {
		return false;
	}

	//Required function
	public boolean func_94041_b(int i, ItemStack itemstack) {
		return false;
	}
	
}
