package communityMod.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import communityMod.common.CommunityMod;
import communityMod.common.entities.tile.TileEntityResearcher;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockResearcher extends BlockContainer {

	private String TextureName;
	private String SideTextureName;
	private Icon side;
	private Icon bottom;

	public BlockResearcher(int id, String textureName, String sideTextureName) {
		super(id, Material.iron);
		TextureName = textureName;
		SideTextureName = sideTextureName;
	}

	public String getTextureName() {
		return this.TextureName;
	}

	private String getSideTextureName() {
		return this.SideTextureName;
	}

	@Override
	public Icon getBlockTextureFromSideAndMetadata(int side, int metadata) {
		if (side == 1)
			return blockIcon;
		else if (side == 0)
			return bottom;
		else
			return this.side;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("communityMod:"
				+ this.getTextureName());
		this.side = reg.registerIcon("communityMod:"
				+ this.getSideTextureName());
		this.bottom = reg.registerIcon("furnace_top");
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityResearcher();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int i, float f, float g, float t) {
		TileEntityResearcher tileEntity = (TileEntityResearcher) world
				.getBlockTileEntity(x, y, z);

		if (tileEntity == null || player.isSneaking()) {
			return false;
		}

		player.openGui(CommunityMod.instance, 0, world, x, y, z);
		return true;
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, int i, int j) {
		dropItems(world, x, y, z);
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

}
