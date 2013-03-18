package mods.communityMod.common.items;


import mods.communityMod.textures.TextureHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemRasberry extends ItemFood{

	public ItemRasberry(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
	
	public String getTextureFile(){
    	return TextureHandler.ITEM_TEXTURE_A;
    }
	
}
