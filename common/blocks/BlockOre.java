package communityMod.common.blocks;

import java.util.Random;

import communityMod.client.ClientProxyCommunityMod;
import communityMod.common.IDsHelper;
import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import communityMod.common.IDsHelper;
import communityMod.common.items.ItemsHelper;
import communityMod.textures.TextureHandler;

public class BlockOre extends Block{

	public BlockOre(int id, int texture){
		super(id, texture, Material.iron);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
	
	public int idDropped(int par1, Random rand, int par3){
		if(this.blockID == IDsHelper.ligniteOreID){
			return ItemsHelper.ligniteCoal.itemID;
		}else if(this.blockID == IDsHelper.bituminousOreID){
			return ItemsHelper.bituminousCoal.itemID;
		}else if(this.blockID == IDsHelper.anthraciteOreID){
			return ItemsHelper.anthraciteCoal.itemID;
		}else{
			return this.blockID;
		}
	}
	
}
