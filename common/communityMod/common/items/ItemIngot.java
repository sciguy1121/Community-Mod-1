package communityMod.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIngot extends Item {
	private String itemName;

	public ItemIngot(int id, String name) {
		super(id);
		this.itemName = name;
		this.setUnlocalizedName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) {
		this.iconIndex = iconRegister.registerIcon("communityMod:" + itemName);
	}

}
