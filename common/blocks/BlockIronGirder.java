package mods.communityMod.common.blocks;

import java.util.Random;


import mods.communityMod.common.CommunityMod;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIronGirder extends Block{
	
    public BlockIronGirder(int id, Material mat)
    {
    	super(id, mat);
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
    
    private String textureName;
	
	public BlockIronGirder(int par1, String tex) {
		super(par1, Material.iron);
		this.textureName = tex;
	}
	
	public String getTextureName(){
		return this.textureName;
	}
    
}
