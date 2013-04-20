package communityMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.CommunityMod;
import communityMod.common.Reference;

public class BlockIronGirder extends Block {

	public BlockIronGirder(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(CommunityMod.modTab);
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
    public void registerIcons(IconRegister reg) {
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + "Girder");
    }


}
