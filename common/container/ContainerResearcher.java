package communityMod.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.common.entities.tile.TileEntityResearcher;

public class ContainerResearcher extends Container{

	private TileEntityResearcher entity;

	public ContainerResearcher(TileEntityResearcher entity, InventoryPlayer inventory)
	{
		this.entity = entity;
		
		this.addSlotToContainer(new SlotFuel(entity, 0, 56, 53));
		this.addSlotToContainer(new Slot(entity, 1, 56, 17));
		this.addSlotToContainer(new SlotOutput(entity, 2, 116, 35));
		
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
	
}
