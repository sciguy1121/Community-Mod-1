package communityMod.common;

import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOre extends Block{

	public BlockOre(int id, int texture){
		super(id, texture, Material.iron);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
	
}
