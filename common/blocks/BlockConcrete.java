package mods.communityMod.common.blocks;

import java.util.Random;


import mods.communityMod.common.CommunityMod;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockConcrete extends Block{
	
    public BlockConcrete(int id, Material mat)
    {
    	super(id, mat);
    	this.setCreativeTab(CommunityMod.modTab);
    }
   
    public void func_94332_a(IconRegister par1IconRegister)
    {
             this.field_94336_cN = par1IconRegister.func_94245_a("communityMod:Concrete");
    }
           
    public int idDropped(int par1, Random rand, int par2){
    	return this.blockID;
    }      
}