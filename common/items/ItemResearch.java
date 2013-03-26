package mods.communityMod.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import mods.communityMod.common.research.Research;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemResearch extends Item
{
	Research research;
	private String itemName;
	
	public ItemResearch(int par1, String name) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.itemName = name;
		this.setUnlocalizedName(name);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		//par3List.add(research.name);
    }
	
	public void getSubItems(int itemID, CreativeTabs tab, List itemList)
	{
		for(int i = 0; i < 3; i++){
			itemList.add(new ItemStack(itemID, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconRegister) 
	{
		super.updateIcons(iconRegister);
		this.iconIndex = iconRegister.registerIcon("communityMod:" + itemName);
	}

}
