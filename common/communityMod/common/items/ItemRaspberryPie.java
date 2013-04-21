package communityMod.common.items;

import communityMod.common.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRaspberryPie extends ItemFood {

	public ItemRaspberryPie(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setUnlocalizedName("RaspberryPie");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		super.registerIcons(iconRegister);
		this.itemIcon = iconRegister.registerIcon(Reference.modTextureID + ":RaspberryPie");
	}

}
