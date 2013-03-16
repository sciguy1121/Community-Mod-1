package mods.communityMod.common.container;


import mods.communityMod.common.entities.tile.TileEntityLogger;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerLogger extends Container
{
	private TileEntityLogger entity;
	
	public ContainerLogger(TileEntityLogger entity, InventoryPlayer inventory)
	{
		this.entity = entity;
		
		this.addSlotToContainer(new SlotSpecific(entity, 0, 56, 17, new ItemStack(Block.wood)));
		this.addSlotToContainer(new SlotFuel(entity, 2, 56, 53));
		this.addSlotToContainer(new SlotOutput(entity, 1, 116, 35));
		
	    int var3;

        for (var3 = 0; var3 < 3; ++var3)
        {
            for (int var4 = 0; var4 < 9; ++var4)
            {
                this.addSlotToContainer(new Slot(inventory, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
            }
        }

        for (var3 = 0; var3 < 9; ++var3)
        {
            this.addSlotToContainer(new Slot(inventory, var3, 8 + var3 * 18, 142));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return entity.isUseableByPlayer(player);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index)
    {
		ItemStack stack = null;
		Slot slot = (Slot)inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack())
		{
			ItemStack stackInSlot = slot.getStack();
			stack = stackInSlot.copy();
			
			if(index <= 1)
			{
				if(!mergeItemStack(stackInSlot, 1, inventorySlots.size(), true))
				{
					return null;
				}
				
				slot.onSlotChange(stackInSlot, stack);
			}
			else if(index != 1 && !getSlot(0).getHasStack() && stackInSlot.itemID == Block.wood.blockID)
			{
				ItemStack copy = slot.decrStackSize(slot.getStack().stackSize);
				getSlot(0).putStack(copy);
				
				return null;
			}
			else if(index != 2 && !getSlot(1).getHasStack() && SlotFuel.getItemBurnTime(stackInSlot) > 0)
			{
				ItemStack copy = slot.decrStackSize(slot.getStack().stackSize);
				getSlot(1).putStack(copy);
				
				return null;
			} else
			{
				return null;
			}
			
			if(stackInSlot.stackSize == 0)
			{
				slot.putStack(null);
			}
			else
			{
				slot.onSlotChanged();
			}
			
			return stack;
		}
		
       return stack;
    }
}
