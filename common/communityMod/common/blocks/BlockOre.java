package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.IDsHelper;
import communityMod.common.Reference;
import communityMod.common.items.ItemsHelper;

public class BlockOre extends Block {

    public BlockOre(int id) {
        super(id, Material.iron);
        this.setStepSound(Block.soundStoneFootstep);
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
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + this.getUnlocalizedName().substring(5));
    }

}
