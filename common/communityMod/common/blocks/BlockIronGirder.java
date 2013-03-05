package communityMod.common.blocks;

import java.util.Random;

import communityMod.common.Reference;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import communityMod.common.CommunityMod;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockIronGirder extends Block {

	public BlockIronGirder(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(CommunityMod.modTab);
	}

	public String getTextureFile() {
		return TextureHandler.BLOCK_TEXTURE_A;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int idDropped(int par1, Random rand, int par2) {
		return this.blockID;
	}

	private String textureName;

	public BlockIronGirder(int par1, String tex) {
		super(par1, Material.iron);
		this.textureName = tex;
	}

	public String getTextureName() {
		return this.textureName;
	}

    @Override
    public void registerIcons(IconRegister reg) {
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + this.getTextureName());
    }


}
