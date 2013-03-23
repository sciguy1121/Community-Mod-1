package mods.communityMod.common.blocks;

import java.util.Random;

import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.communityMod.common.CommunityMod;
import mods.communityMod.common.entities.tile.TileEntityLavaFurnace;
import mods.communityMod.common.entities.tile.TileEntityLogger;
import mods.communityMod.textures.TextureHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockLavaFurnace extends BlockContainer {
	private static boolean keepInventory = false;
	private String TextureName;
	private Icon top;
	private Icon sides;

	public BlockLavaFurnace(int id, String textureName) {
		super(id, Material.rock);
		TextureName = textureName;
		setTickRandomly(true);
	}

	public String getTextureName() {
		return this.TextureName;
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityLavaFurnace();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int i, float f, float g, float t) {
		TileEntityLavaFurnace tile_entity = (TileEntityLavaFurnace) world
				.getBlockTileEntity(x, y, z);

		if (tile_entity == null || player.isSneaking()) {
			return false;
		}

		player.openGui(CommunityMod.instance, 0, world, x, y, z);
		return true;
	}
	

	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata) 
	{
		if(side == metadata)
		{
			return this.blockIcon;
		}
		
		if(side == 1 || side == 0)
		{
			return top;
		}
		
		if(metadata == 0)  //For display as item
		{
			if(side == 3)
				return this.blockIcon;
		}
		
		return sides;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("communityMod:" + this.getTextureName());
		this.top = reg.registerIcon("furnace_top");
		this.sides = reg.registerIcon("furnace_side");
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j) {
		if (!keepInventory) {
			dropItems(world, x, y, z);
		}
		super.breakBlock(world, x, y, z, i, j);
	}

	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if (!(tile_entity instanceof IInventory)) {
			return;
		}

		IInventory inventory = (IInventory) tile_entity;

		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			ItemStack item = inventory.getStackInSlot(i);

			if (item != null && item.stackSize > 0) {
				float rx = rand.nextFloat() * 0.6F + 0.1F;
				float ry = rand.nextFloat() * 0.6F + 0.1F;
				float rz = rand.nextFloat() * 0.6F + 0.1F;

				EntityItem entity_item = new EntityItem(world, x + rx, y + ry,
						z + rz, new ItemStack(item.itemID, item.stackSize,
								item.getItemDamage()));

				if (item.hasTagCompound()) {
					item.setTagCompound((NBTTagCompound) item.getTagCompound()
							.copy());
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

	public String getTextureFile() {
		return TextureHandler.MACHINE_TEXTURE_A;
	}

	public boolean isHeatProvided(World world, int x, int y, int z) {
		if (world.getBlockId(x, y - 1, z) == Block.lavaStill.blockID
				|| world.getBlockId(x, y - 1, z) == Block.lavaMoving.blockID) {
			return true;
		}
		return false;
	}
	
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
	{
	        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	
	        if (l == 0)
		    {
	            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
	        }
	        
		    if (l == 1)
	        {
	            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
	        }
	
		    if (l == 2)
	        {
	            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
	        }
	
		    if (l == 3)
		    {
	           par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
		    }
	 }
	 
	public static void updateState(boolean active, World world, int x, int y, int z)
	{
		 int metadata = world.getBlockMetadata(x, y, z);
		 TileEntityLavaFurnace tile = (TileEntityLavaFurnace)world.getBlockTileEntity(x, y, z);
		 
		 keepInventory = true;
		 if(active)
		 {
			 world.func_94575_c(x, y, z, BlocksHelper.geothermalOvenActive.blockID);
		 }
		 else
		 {
			 world.func_94575_c(x, y, z, BlocksHelper.geothermalOven.blockID);
		 }
		 
		 keepInventory = false;
		 world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
		 
		 if(tile != null)
		 {
			 tile.validate();
			 world.setBlockTileEntity(x, y, z, tile);
		 }
	}
}
