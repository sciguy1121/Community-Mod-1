package communityMod.common.blocks;

import java.util.Random;

import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockConcrete extends Block{
	
    public BlockConcrete(int id, int texture, Material mat)
    {
    	super(id, texture, mat);
    	this.setCreativeTab(CreativeTabs.tabBlock);
    }
   
    public String getTextureFile(){
    	return TextureHandler.BLOCK_TEXTURE_A;
    }
           
    public int idDropped(int par1, Random rand, int par2){
    	return this.blockID;
    }      
}