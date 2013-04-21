package communityMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.Reference;

public class BlockMetal extends Block {

    public BlockMetal(int par1) {
        super(par1, Material.iron);
    }

    @Override
    public void registerIcons(IconRegister reg) {
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + this.getUnlocalizedName().substring(5));
    }

}
