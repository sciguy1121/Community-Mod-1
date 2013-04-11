package communityMod.common.blocks;

import java.util.Random;

import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.IDsHelper;
import communityMod.common.items.ItemsHelper;

public class BlockOre extends Block {

	private String textureName;

	public BlockOre(int id, String textureName) {
		super(id, Material.iron);
		this.setStepSound(Block.soundStoneFootstep);
		this.textureName = textureName;
	}

	public String getTextureName() {
		return this.textureName;
	}

	public String getTextureFile() {
		return TextureHandler.BLOCK_TEXTURE_A;
	}

	@Override
	public int idDropped(int par1, Random rand, int par3) {
		if (this.blockID == IDsHelper.ligniteOreID) {
			return ItemsHelper.ligniteCoal.itemID;
		} else if (this.blockID == IDsHelper.bituminousOreID) {
			return ItemsHelper.bituminousCoal.itemID;
		} else if (this.blockID == IDsHelper.anthraciteOreID) {
			return ItemsHelper.anthraciteCoal.itemID;
		} else {
			return this.blockID;
		}
	}

	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("communityMod:"
				+ this.getTextureName());
	}

}
