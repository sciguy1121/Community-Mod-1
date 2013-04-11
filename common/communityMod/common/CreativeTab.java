package communityMod.common;

import net.minecraft.creativetab.CreativeTabs;

import communityMod.common.items.ItemsHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	// Icon of Tab
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return ItemsHelper.siliconIngot.itemID;
	}

	// Name of Tab
	@Override
	public String getTranslatedTabLabel() {
		return "Community Mod";
	}

}