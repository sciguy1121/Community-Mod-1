package communityMod.common.blocks;

import communityMod.common.entities.tile.TileEntityResearcher;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockResearcher extends BlockContainer{

	public BlockResearcher(int id, int texture) {
		super(id, texture, Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World var1){
		return new TileEntityResearcher();
	}
	
	
	
}
