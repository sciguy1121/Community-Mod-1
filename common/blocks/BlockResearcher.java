package communityMod.common.blocks;

import java.util.Random;

import communityMod.common.CommunityMod;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.common.entities.tile.TileEntityResearcher;
import communityMod.textures.TextureHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockResearcher extends BlockContainer{

	public BlockResearcher(int id, int texture) {
		super(id, texture, Material.iron);
	}

	public String getTextureFile(){
		return TextureHandler.MACHINE_TEXTURE_A;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1){
		return new TileEntityResearcher();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t){
		TileEntityResearcher tileEntity = (TileEntityResearcher)world.getBlockTileEntity(x, y, z);
	   
		if(tileEntity == null || player.isSneaking())
		{
			return false;
		}
	   
		player.openGui(CommunityMod.instance, 0, world, x, y, z);
		return true;
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j){
		dropItems(world, x, y, z);
		super.breakBlock(world, x, y, z, i, j);
	}

	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();
		  
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		  
		if(!(tile_entity instanceof IInventory)){
			return;
		}
	   
		IInventory inventory = (IInventory) tile_entity;
	   
		for(int i = 0; i < inventory.getSizeInventory(); i++){
			ItemStack item = inventory.getStackInSlot(i);
	                   
			if(item != null && item.stackSize > 0){
				float rx = rand.nextFloat() * 0.6F + 0.1F;
				float ry = rand.nextFloat() * 0.6F + 0.1F;
				float rz = rand.nextFloat() * 0.6F + 0.1F;
	                   
				EntityItem entity_item = new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));
	                   
				if(item.hasTagCompound()){
					item.setTagCompound((NBTTagCompound) item.getTagCompound().copy());
				}
	   
				float factor = 0.5F;
	                   
				entity_item.motionX = rand.nextGaussian() * factor;
				entity_item.motionY = rand.nextGaussian() * factor + 0.2F;
				entity_item.motionZ = rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entity_item);
				item.stackSize = 0;
			}
		}
	}
	
}
