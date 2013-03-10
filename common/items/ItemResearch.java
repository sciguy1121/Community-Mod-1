package communityMod.common.items;

import java.util.List;

import communityMod.common.research.Research;
import communityMod.textures.TextureHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemResearch extends Item{

	Research research;
	
	public ItemResearch(int par1, int texture) {
		super(par1);
		this.iconIndex = texture;
		this.setHasSubtypes(true);
		this.setMaxDamage(1);
	}
	
	public String getTextureFile(){
		return TextureHandler.ITEM_TEXTURE_A;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add(research.name);
    }
	
}
