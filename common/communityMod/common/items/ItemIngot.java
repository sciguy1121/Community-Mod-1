package communityMod.common.items;

import communityMod.common.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIngot extends Item {

	public ItemIngot(int id, String name) {
		super(id);
		this.setUnlocalizedName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Reference.modTextureID + ":" + this.getUnlocalizedName().substring(5));
	}

}
