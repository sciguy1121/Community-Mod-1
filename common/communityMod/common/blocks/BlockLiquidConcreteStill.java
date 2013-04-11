package communityMod.common.blocks;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidConcreteStill extends BlockStationary implements ILiquid {

	private String TextureName;
	private String SideTextureName;
	private Icon side;
	private Icon bottom;

	BlockLiquidConcreteStill(int par1, String textureName) {
		super(par1, Material.water);

		this.blockHardness = 100.0F;
		this.setLightOpacity(2);
		this.disableStats();
		TextureName = textureName;
		SideTextureName = "LiquidConcrete";
	}

	public String getTextureName() {
		return this.TextureName;
	}

	private String getSideTextureName() {
		return this.SideTextureName;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("communityMod:"
				+ this.getTextureName());
		this.side = reg.registerIcon("communityMod:"
				+ this.getSideTextureName());
		this.bottom = reg.registerIcon("communityMod:liquidConcreteFlowing");
	}

	@Override
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata) {
		if (side == 1)
			return blockIcon;
		else if (side == 0)
			return bottom;
		
		return this.side;
	}

	@Override
	public int stillLiquidId() 
	{
		return this.blockID;
	}

	@Override
	public boolean isMetaSensitive() 
	{
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
