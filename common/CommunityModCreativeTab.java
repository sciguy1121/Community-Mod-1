package communityMod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CommunityModCreativeTab extends CreativeTabs
{

	public CommunityModCreativeTab(String label) 
	{
		super(label);
	}

	@Override
	public ItemStack getIconItemStack() 
	{
		return new ItemStack(CommunityMod.lavafurnace);
	}
}
