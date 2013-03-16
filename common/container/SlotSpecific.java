package mods.communityMod.common.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSpecific extends Slot
{
	private ItemStack item;

	public SlotSpecific(IInventory inventory, int id, int x, int y, ItemStack item) 
	{
		super(inventory, id, x, y);
		this.item = item;
	}
	
	public boolean isItemValid(ItemStack stack)
	{
		if(stack.itemID == item.itemID)
		{
			return true;
		}
		
		return false;
	}

}
