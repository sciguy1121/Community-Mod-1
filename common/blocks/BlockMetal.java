package communityMod.common.blocks;

import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMetal extends Block{

	public BlockMetal(int par1) {
		super(par1, Material.iron);
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}

}
