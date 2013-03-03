package communityMod.common;

import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LeadOre extends Block{

	public LeadOre(int id, int texture){
		super(id, texture, Material.iron);
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
	
}
