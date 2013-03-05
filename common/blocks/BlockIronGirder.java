package communityMod.common.blocks;

import java.util.Random;

import communityMod.common.CommunityMod;
import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIronGirder extends Block{
	
    public BlockIronGirder(int id, int texture, Material mat)
    {
    	super(id, texture, mat);
    	this.setCreativeTab(CommunityMod.modTab);
    }
   
    public String getTextureFile(){
    	return TextureHandler.BLOCK_TEXTURE_A;
    }
   
    public boolean isOpaqueCube(){
    	return false;
    }
   
    public boolean renderAsNormalBlock(){
    	return false;
    }
   
    public int idDropped(int par1, Random rand, int par2){
    	return this.blockID;
    }
   
    public int getBlockTextureFromSide(int side){
    	if(side == 0 || side == 1){
    		return this.blockIndexInTexture + 1;              
    	}              
    	else{
    		return this.blockIndexInTexture;
    	}
    }
}
