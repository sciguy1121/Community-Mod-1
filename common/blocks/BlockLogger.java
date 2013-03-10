package communityMod.common.blocks;

import java.util.Random;

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
import communityMod.common.entities.tile.TileEntityLogger;
import communityMod.common.entities.tile.TileEntityLogger;
import communityMod.textures.TextureHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLogger extends BlockContainer
{
	private static boolean keepInventory = false;
	
	public BlockLogger(int par1, int par2) 
	{
		super(par1, par2, Material.wood);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) 
	{
		return new TileEntityLogger();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g, float t){
		TileEntityLogger tile_entity = (TileEntityLogger)world.getBlockTileEntity(x, y, z);
	   
		if(tile_entity == null || player.isSneaking())
		{
			return false;
		}
	   
		player.openGui(CommunityMod.instance, 2, world, x, y, z);
		return true;
	}
	   
	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j)
	{
		if(!keepInventory)
		{
			dropItems(world, x, y, z);
		}
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
	
	 public int getBlockTextureFromSideAndMetadata(int side, int metadata)
	 {
		 if(side == 0 || side == 1)
		 {
			 return 26;
		 }
		 
		 switch(metadata)
		 {
		 case 2:
			 if(side == 2)
			 {
				 return this.blockIndexInTexture;
			 } else if(side == 3)
			 {
				 return 26;
			 }
			 else
			 {
				 return 25;
			 }
		 case 3:
			 if(side == 3)
			 {
				 return this.blockIndexInTexture;
			 } else if(side == 2)
			 {
				 return 26;
			 }
			 else
			 {
				 return 25;
			 }
		 case 4:
			 if(side == 4)
			 {
				 return this.blockIndexInTexture;
			 } else if(side == 5)
			 {
				 return 26;
			 }
			 else
			 {
				 return 25;
			 }
		 case 5:
			 if(side == 5)
			 {
				 return this.blockIndexInTexture;
			 } else if(side == 4)
			 {
				 return 26;
			 }
			 else
			 {
				 return 25;
			 }
		 }
			
		 if(side == 3)   //For display as item
		 {
			 if(metadata == 0)
			 {
				 return this.blockIndexInTexture;
			 }
		 }
			
		 return 25;
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

	 public static void updateState(boolean active, World world, int x, int y, int z)
	 {
		 int metadata = world.getBlockMetadata(x, y, z);
		 TileEntityLogger tile = (TileEntityLogger)world.getBlockTileEntity(x, y, z);
		 keepInventory = true;
		 
		 if(active)
		 {
			 world.setBlockWithNotify(x, y, z, BlocksHelper.loggeractive.blockID);
		 }
		 else
		 {
			 world.setBlockWithNotify(x, y, z, BlocksHelper.logger.blockID);
		 }
		 
		 keepInventory = false;
		 world.setBlockMetadata(x, y, z, metadata);
		 
		 if(tile != null)
		 {
			 tile.validate();
			 world.setBlockTileEntity(x, y, z, tile);
		 }
	 }
	 
}
