package blocks;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import communityMod.common.CommunityMod;
import communityMod.common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidFlowing extends BlockFlowing {

    private String textureName;
    private Icon side;
    private Icon bottom;

    protected BlockLiquidFlowing(int par1, String textureName) {
        super(par1, Material.water);

        blockHardness = 100.0F;
        this.setLightOpacity(2);
        this.setCreativeTab(CommunityMod.modTab);

        this.textureName = textureName;
    }

    public String getTextureName() {
        return textureName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(Reference.modTextureID + ":" + this.getTextureName());
        // this.side = reg.registerIcon("communityMod:" +
        // this.getSideTextureName());
        bottom = reg.registerIcon("liquidConcreteFlowing");
    }

    @Override
    public Icon getBlockTextureFromSideAndMetadata(int side, int metadata) {
        if (side == 1)
            return blockIcon;
        else if (side == 0)
            return bottom;
        else
            return this.side;
    }
}
