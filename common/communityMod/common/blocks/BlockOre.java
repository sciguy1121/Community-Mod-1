package communityMod.common.blocks;

import java.util.Random;

import communityMod.common.CommunityMod;
import net.minecraft.client.renderer.texture.IconRegister;

import communityMod.common.Reference;
import communityMod.common.items.ItemsHelper;

public class BlockOre extends net.minecraft.block.BlockOre {



    public BlockOre(int id) {
        super(id);
        this.setCreativeTab(CommunityMod.modTab);
    }



    @Override
    public int idDropped(int par1, Random rand, int par3) {
        return this.blockID == BlocksHelper.ligniteOre.blockID ? ItemsHelper.ligniteCoal.itemID
            : (this.blockID == BlocksHelper.bituminousOre.blockID ? ItemsHelper.bituminousCoal.itemID
            : (this.blockID ==BlocksHelper.anthraciteOre.blockID ? ItemsHelper.anthraciteCoal.itemID
            : this.blockID));
    }

    @Override
    public void registerIcons(IconRegister reg) {
        this.blockIcon = reg.registerIcon(Reference.modTextureID + ":" + this.getUnlocalizedName());
    }

}
