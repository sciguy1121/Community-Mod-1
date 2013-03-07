package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import communityMod.common.CommunityMod;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.textures.TextureHandler;

public class BlockLavaFurnace extends BlockContainer
{
	private boolean active;

	public BlockLavaFurnace(int id, int texture, boolean powered) 
	{
		super(id, texture, Material.rock);
		active = powered;
		setTickRandomly(true);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) 
	{
		return new TileEntityLavaFurnace(!active);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t){
		TileEntityLavaFurnace tile_entity = (TileEntityLavaFurnace)world.getBlockTileEntity(x, y, z);
	   
		if(tile_entity == null || player.isSneaking())
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
	   
	private void dropItems(World world, int x, int y, int z){
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
	    
	  public String getTextureFile()
	  {
		  return TextureHandler.MACHINE_TEXTURE_A;
	  }
	    
	  public boolean isHeatProvided(World world, int x, int y, int z)
	  {
		  if(world.getBlockId(x, y - 1, z) == Block.lavaStill.blockID || world.getBlockId(x, y - 1, z) == Block.lavaMoving.blockID)
		  {
			  return true;
		  }
		  return false;
	  }

	  @Override
	  public void onNeighborBlockChange(World world, int x, int y, int z, int id) 
	  {
		  super.onNeighborBlockChange(world, x, y, z, id);
		  int metadata = world.getBlockMetadata(x, y, z);
		  if(isHeatProvided(world, x, y, z)){
			  if(this.blockID == BlocksHelper.lavafurnace.blockID){
				  world.setBlockAndMetadataWithNotify(x, y, z, BlocksHelper.lavafurnaceactive.blockID, metadata);
			  }
		  } else if(this.blockID == BlocksHelper.lavafurnaceactive.blockID)
		  {
			  world.setBlockAndMetadataWithNotify(x, y, z, BlocksHelper.lavafurnace.blockID, metadata);
		  }
	  }
		
	  public int getBlockTextureFromSideAndMetadata(int side, int metadata)
	  {
		  if(side == 0 || side == 1)
		  {
			  return 3;
		  }
		  if(metadata == side)
		  {
			  return this.blockIndexInTexture;
		  }
			
		  if(side == 3)   //For display as item
		  {
			  if(metadata == 0)
			  {
				  return 0;
			  } else
			  {
				  return 2;
			  }
		  }
			
		  return 2;
	  }
		
	  public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	  {
		  int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		  if (var6 == 0)
		  {
			  par1World.setBlockMetadataWithNotify(par2, par3, par4, 2);
		  }

		  if (var6 == 1)
		  {
			  par1World.setBlockMetadataWithNotify(par2, par3, par4, 5);
		  }

		  if (var6 == 2)
		  {
			  par1World.setBlockMetadataWithNotify(par2, par3, par4, 3);
		  }

		  if (var6 == 3)
		  {
			  par1World.setBlockMetadataWithNotify(par2, par3, par4, 4);
		  }
	  }
}
