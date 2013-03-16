package mods.communityMod.common.blocks;

import java.util.Random;


import mods.communityMod.client.ClientProxyCommunityMod;
import mods.communityMod.common.IDsHelper;
import mods.communityMod.common.items.ItemsHelper;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOre extends Block{

	private String textureName;
	
	public BlockOre(int id, String textureName){
		super(id, Material.iron);
		this.setStepSound(Block.soundStoneFootstep);
		this.textureName = textureName;
	}
	
	public String getTextureName(){
		return this.textureName;
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
	
	public void func_94332_a(IconRegister reg){
		this.field_94336_cN = reg.func_94245_a("communityMod:" + this.getTextureName());
	}
	
}
