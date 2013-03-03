package communityMod.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == CommunityMod.ligniteCoal.itemID){
			return 3200;
		}else if(fuel.itemID == CommunityMod.bituminousCoal.itemID){
			return 6400;
		//}else if(fuel.itemID == CommunityMod.anthracite.itemID){
			//return 12800;
		}
		return 0;
	}
}
			
	
		

	
		

