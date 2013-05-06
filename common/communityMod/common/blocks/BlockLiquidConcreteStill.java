package communityMod.common.blocks;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;

import communityMod.common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidConcreteStill extends BlockStationary implements
		ILiquid {

	//private int freezeProgress = 0;

	public BlockLiquidConcreteStill(int par1) {
		super(par1, Material.water);

		this.blockHardness = 100.0F;
		this.setLightOpacity(2);
		this.disableStats();

		this.setTickRandomly(true);
	}

	// @Override
	// public void randomDisplayTick(World world, int x, int y, int z,
	// Random random)
	// {
	//
	// super.randomDisplayTick(world, x, y, z, random);
	//
	// if (random.nextInt(3) == 0) {
	// if (freezeProgress < 600) {
	// ++freezeProgress;
	// } else {
	// if (random.nextInt(2) == 0) {
	// world.setBlock(x, y, z, BlocksHelper.concrete.blockID, 0, 2);
	// }
	// }
	// }
	// }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.theIcon = new Icon[]{ reg.registerIcon(Reference.modTextureID + ":LiquidConcreteStill"),
				reg.registerIcon(Reference.modTextureID + ":LiquidConcreteFlowing")};
	}

	@Override
	public int stillLiquidId() {
		return this.blockID;
	}

	@Override
	public boolean isMetaSensitive() {
		return true;
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
