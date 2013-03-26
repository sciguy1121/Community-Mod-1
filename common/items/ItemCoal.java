package mods.communityMod.common.items;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemCoal extends Item 
{
	private String itemName;

	public ItemCoal(int par1, String name) {
		super(par1);
		this.itemName = name;
		this.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) 
	{
		super.updateIcons(iconRegister);
		this.iconIndex = iconRegister.registerIcon("communityMod:" + itemName);
	}

}
