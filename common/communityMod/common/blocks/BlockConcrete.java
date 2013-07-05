package communityMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.CommunityMod;
import communityMod.common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockConcrete extends Block {

	public BlockConcrete(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(CommunityMod.modTab);
	}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + "Concrete");
    }


}