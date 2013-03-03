package kreepmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LeadIngot extends Item{
    
	public LeadIngot(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
    
	public String getTextureFile(){
		return TextureHandler.ITEM_TEXTURE_A;
	}
	
}
