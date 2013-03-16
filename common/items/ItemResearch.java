package mods.communityMod.common.items;

import java.util.List;


import mods.communityMod.common.research.Research;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemResearch extends Item{

	Research research;
	
	public ItemResearch(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
	}
	
	public String getTextureFile(){
		return TextureHandler.ITEM_TEXTURE_A;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add(research.name);
    }
	
	public void getSubItems(int itemID, CreativeTabs tab, List itemList)
	{
		for(int i = 0; i < 3; i++){
			itemList.add(new ItemStack(itemID, 1, i));
		}
	}

}
