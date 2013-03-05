package communityMod.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ItemsHelper.ligniteCoal.shiftedIndex){
			return 3200;
		}else if(fuel.itemID == ItemsHelper.bituminousCoal.shiftedIndex){
			return 6400;
		}else if(fuel.itemID == ItemsHelper.anthraciteCoal.shiftedIndex){
			return 12800;
		}
		return 0;
	}
}
			
	
		

	
		

