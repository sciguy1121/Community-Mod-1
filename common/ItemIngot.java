package communityMod.common;

import communityMod.textures.TextureHandler;

import net.minecraft.item.Item;

public class ItemIngot extends Item{

	public ItemIngot(int id, int texture) {
		super(id);
		this.setTextureFile(TextureHandler.ITEM_TEXTURE_A);
		this.iconIndex = texture;
	}
	
}
