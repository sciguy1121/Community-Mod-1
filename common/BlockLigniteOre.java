package communityMod.common;

import java.util.Random;

import communityMod.textures.TextureHandler;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLigniteOre extends Block{
  
	public BlockLigniteOre(int id, int texture, Material mat){
		super(id, texture, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
}
