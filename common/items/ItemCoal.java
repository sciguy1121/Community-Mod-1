package mods.communityMod.common.items;

import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemCoal extends Item {
	
	
	private String textureName;
	
	public ItemCoal(int par1, String textureName)
	{
		super(par1);
		this.textureName = textureName;
	}
	
	private String getTextureName() 
	{
		return this.textureName;
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.func_94245_a("communityMod:" + this.getTextureName());
	}

	
}
