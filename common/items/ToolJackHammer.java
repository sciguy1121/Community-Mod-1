package mods.communityMod.common.items;

import mods.communityMod.common.CommunityMod;
import mods.communityMod.common.blocks.BlocksHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolJackHammer extends ItemTool {
    private static final Block[] blocksEffectiveAgainst = new Block[]{Block.stone, Block.stoneBrick, BlocksHelper.concrete
    ,Block.blockSteel, Block.anvil, Block.cobblestone};

    private ToolJackHammer(int par1, int par2, EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
        super(par1, par2, par3EnumToolMaterial, blocksEffectiveAgainst);
        this.setCreativeTab(CommunityMod.modTab);
        this.setMaxStackSize(1);
        this.setNoRepair();
    }

    @Override
    public int getItemEnchantability(){
        return 0;
    }

    public void updateIcons(IconRegister reg){
        iconIndex = reg.registerIcon("communityMod:" + getUnlocalizedName());
    }
}
