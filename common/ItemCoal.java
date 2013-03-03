package communityMod.common;

import communityMod.textures.TextureHandler;

import net.minecraft.item.Item;

public class ItemCoal extends Item {

	public ItemCoal(int par1, int texture) {
		super(par1);
		this.iconIndex = texture;
		this.setTextureFile(TextureHandler.ITEM_TEXTURE_A);
	}

}
