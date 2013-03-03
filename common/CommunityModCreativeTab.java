package communityMod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CommunityModCreativeTab extends CreativeTabs {

	public CommunityModCreativeTab(int par1, String par2Str) 
	{
		super(par1, par2Str);
	}
	
	//Icon of Tab
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex(){
	return CommunityMod.siliconOre.blockID;
}
	//Name of Tab
public String getTranslatedTabLabel(){
	return "Community Mod";
}
}
