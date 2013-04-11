package communityMod.common.container;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.common.registry.GameRegistry;

public class SlotFuel extends Slot {

	public SlotFuel(IInventory inventory, int id, int x, int y) {
		super(inventory, id, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		if (getItemBurnTime(stack) > 0) {
			return true;
		}

		return false;
	}

	public static int getItemBurnTime(ItemStack par0ItemStack) {
		if (par0ItemStack == null) {
			return 0;
		} else {
			int var1 = par0ItemStack.getItem().itemID;
			Item var2 = par0ItemStack.getItem();

			if (par0ItemStack.getItem() instanceof ItemBlock
					&& Block.blocksList[var1] != null) {
				Block var3 = Block.blocksList[var1];

				if (var3 == Block.woodSingleSlab) {
					return 150;
				}

				if (var3.blockMaterial == Material.wood) {
					return 300;
				}
			}

			if (var2 instanceof ItemTool
					&& ((ItemTool) var2).getToolMaterialName().equals("WOOD"))
				return 200;
			// if (var2 instanceof ItemSword && ((ItemSword)
			// var2).getToolMaterialName().equals("WOOD")) return 200;
			// if (var2 instanceof ItemHoe && ((ItemHoe)
			// var2).func_77842_f().equals("WOOD")) return 200;
			if (var1 == Item.stick.itemID)
				return 100;
			if (var1 == Item.coal.itemID)
				return 1600;
			if (var1 == Item.bucketLava.itemID)
				return 20000;
			if (var1 == Block.sapling.blockID)
				return 100;
			if (var1 == Item.blazeRod.itemID)
				return 2400;
			return GameRegistry.getFuelValue(par0ItemStack);
		}
	}

}
