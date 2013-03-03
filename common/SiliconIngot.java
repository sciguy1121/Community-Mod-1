package kreepmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SiliconIngot extends Item{
    
	public SiliconIngot(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
    
	public String getTextureFile(){
		return TextureHandler.ITEM_TEXTURE_A;
	}
	
}
