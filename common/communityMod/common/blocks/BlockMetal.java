package communityMod.common.blocks;

import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMetal extends Block {

	private String textureName;

	public BlockMetal(int par1, String tex) {
		super(par1, Material.iron);
		this.textureName = tex;
	}

	public String getTextureName() {
		return this.textureName;
	}

	public String getTextureFile() {
		return TextureHandler.BLOCK_TEXTURE_A;
	}

	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("communityMod:"
				+ this.getTextureName());
	}

}
