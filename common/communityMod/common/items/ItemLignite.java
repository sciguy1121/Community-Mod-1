package communityMod.common.items;

import assets.communitymod.textures.TextureHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLignite extends Item {

	public ItemLignite(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

	public String getTextureFile() {
		return TextureHandler.ITEM_TEXTURE_A;
	}

}
