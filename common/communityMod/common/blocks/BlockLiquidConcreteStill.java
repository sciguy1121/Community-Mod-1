package communityMod.common.blocks;

import communityMod.common.Reference;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidConcreteStill extends BlockStationary implements
		ILiquid {

	private String TextureName;
	private String SideTextureName;
	private Icon side;
	private Icon bottom;
	private int freezeProgress = 0;

	BlockLiquidConcreteStill(int par1, String textureName) {
		super(par1, Material.water);

		this.blockHardness = 100.0F;
		this.setLightOpacity(2);
		this.disableStats();
		TextureName = textureName;
		SideTextureName = "LiquidConcrete";

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

	public String getTextureName() {
		return this.TextureName;
	}

	private String getSideTextureName() {
		return this.SideTextureName;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.theIcon = new Icon[]{ reg.registerIcon("communityMod:LiquidConcreteStill"),
				reg.registerIcon("communityMod:LiquidConcreteFlowing")};
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
