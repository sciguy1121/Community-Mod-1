package communityMod.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRaspberry extends ItemFood {
	private String itemName;

	public ItemRaspberry(int par1, int par2, float par3, boolean par4,
			String name) {
		super(par1, par2, par3, par4);
		this.itemName = name;
		this.setUnlocalizedName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		super.registerIcons(iconRegister);
		this.itemIcon = iconRegister.registerIcon("communityMod:" + itemName);
	}

}
