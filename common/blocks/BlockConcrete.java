package communityMod.common.blocks;

import java.util.Random;

import communityMod.common.CommunityMod;
import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockConcrete extends Block{
	
    public BlockConcrete(int id, Material mat)
    {
    	super(id, mat);
    	this.setCreativeTab(CommunityMod.modTab);
    }
   
    public String getTextureFile(){
    	return TextureHandler.BLOCK_TEXTURE_A;
    }
           
    public int idDropped(int par1, Random rand, int par2){
    	return this.blockID;
    }      
}