package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

import communityMod.common.CommunityMod;
import communityMod.common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidConcreteFlowing extends BlockFlowing implements ILiquid {
    private int freezeProgress = 0;

    protected BlockLiquidConcreteFlowing(int par1) {
        super(par1, Material.water);

        this.blockHardness = 100.0F;
        this.setLightOpacity(2);
        this.setCreativeTab(CommunityMod.modTab);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {

        super.updateTick(world, x, y, z, random);

        if (random.nextInt(3) == 0) {
            if (freezeProgress < 400) {
                ++freezeProgress;
            } else {
                if (random.nextInt(2) == 0) {
                    world.setBlock(x, y, z, 0);
                    world.setBlock(x, y, z, BlocksHelper.concrete.blockID);
                }
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
    	this.theIcon = new Icon[]{ reg.registerIcon(Reference.modTextureID + ":LiquidConcreteStill"),
				reg.registerIcon(Reference.modTextureID + ":LiquidConcreteFlowing")};
    }

    @Override
    public int stillLiquidId() {
        return BlocksHelper.liquidConcreteStill.blockID;
    }

    @Override
    public boolean isMetaSensitive() {
        return false;
    }

    @Override
    public int stillLiquidMeta() {
        return 0;
    }

    @Override
    public boolean isBlockReplaceable(World world, int i, int j, int k) {
        return true;
    }
    
}
