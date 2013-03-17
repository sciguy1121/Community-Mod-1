package mods.communityMod.common.items;


import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemRasberryPie extends ItemFood{

	public ItemRasberryPie(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
	
	public void func_94581_a(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.func_94245_a("communityMod:RasberryPie");
	}
	
}
