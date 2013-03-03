package communityMod.common;

import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block{

	public TitaniumOre(int id, int texture){
		super(id, texture, Material.iron);
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
	
}
