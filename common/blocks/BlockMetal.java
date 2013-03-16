package mods.communityMod.common.blocks;

import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMetal extends Block{

	private String textureName;
	
	public BlockMetal(int par1, String tex) {
		super(par1, Material.iron);
		this.textureName = tex;
	}
	
	public String getTextureName(){
		return this.textureName;
	}
	
	public String getTextureFile(){
		return TextureHandler.BLOCK_TEXTURE_A;
	}
	
	public void func_94332_a(IconRegister reg){
		this.field_94336_cN = reg.func_94245_a("communityMod:" + this.getTextureName());
	}

}
