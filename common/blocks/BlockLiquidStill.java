package blocks;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidStill extends BlockStationary {

    private String textureName;
    private String sideTextureName;
    private Icon side;
    private Icon bottom;

    BlockLiquidStill(int par1, String textureName) {
        super(par1, Material.water);

        blockHardness = 100.0F;
        this.setLightOpacity(2);
        this.disableStats();
        this.textureName = textureName;
    }

    public String getTextureName() {
        return textureName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon("communityMod:" + this.getTextureName());
        // side = reg.registerIcon("communityMod:" + this.getSideTextureName());
        bottom = reg.registerIcon("liquidConcrete.png");
    }

    @Override
    public Icon getIcon(int side, int metadata) {
        if (side == 1)
            return blockIcon;
        else if (side == 0)
            return bottom;
        else
            return this.side;
    }

}
