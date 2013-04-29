package communityMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import communityMod.common.blocks.BlocksHelper;
import communityMod.common.items.ItemsHelper;

import cpw.mods.fml.common.IWorldGenerator;

//import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenStructures implements IWorldGenerator {
	@Override
	public void generate(Random random, int x, int z, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		// Make sure it's not generating in the end or nether
		if (world.provider.dimensionId != 1 && world.provider.dimensionId != -1) {
			generateSurface(world, random, x * 16, z * 16);
		}

	}

	private void generateSurface(World world, Random random, int x, int z) {

		// Science Lab Generation Code:
		if (random.nextInt(100) == 1) {
			for (int i = 0; i < 1; i++) {
				int xCoord = x + random.nextInt(16);
				int zCoord = z + random.nextInt(16);
				int yCoord = getSurface(world, xCoord, zCoord);
				int titanium = BlocksHelper.titaniumBlock.blockID;
				int torch = Block.torchWood.blockID;

				for (int zA = 0; zA < 5; zA++) {
					for (int xA = 0; xA < 8; xA++) {
						createBlock(world, xCoord + xA, yCoord - 1,
								zCoord + zA, titanium, 0);
					}
				}
				for (int zA = 0; zA < 5; zA++) {
					for (int xA = 0; xA < 8; xA++) {
						createBlock(world, xCoord + xA, yCoord + 3,
								zCoord + zA, titanium, 0);
					}
				}
				for (int yA = 0; yA < 3; yA++) {
					for (int zA = 0; zA < 7; zA++) {
						createBlock(world, xCoord - 1, yCoord + yA, zCoord + zA
								- 1, titanium, 0);
					}
					for (int zA = 0; zA < 7; zA++) {
						createBlock(world, xCoord + 8, yCoord + yA, zCoord + zA
								- 1, titanium, 0);
					}
					for (int xA = 0; xA < 8; xA++) {
						createBlock(world, xCoord + xA, yCoord + yA,
								zCoord - 1, titanium, 0);
					}
					for (int xA = 0; xA < 8; xA++) {
						createBlock(world, xCoord + xA, yCoord + yA,
								zCoord + 5, titanium, 0);
					}
				}

				createBlock(world, xCoord - 1, yCoord - 1, zCoord + 2,
						titanium, 0);

				createBlock(world, xCoord + 7, yCoord, zCoord + 2,
						BlocksHelper.researcher.blockID, 0);

				createBlock(world, xCoord + 7, yCoord + 1, zCoord + 2, torch, 0);
				createBlock(world, xCoord + 5, yCoord + 1, zCoord, torch, 0);
				createBlock(world, xCoord + 5, yCoord + 1, zCoord + 4, torch, 0);
				createBlock(world, xCoord + 2, yCoord + 1, zCoord, torch, 0);
				createBlock(world, xCoord + 2, yCoord + 1, zCoord + 4, torch, 0);

				createBlock(world, xCoord - 1, yCoord, zCoord + 2,
						Block.doorIron.blockID, 0);
				createBlock(world, xCoord - 1, yCoord + 1, zCoord + 2,
						Block.doorIron.blockID, 8);

				createBlock(world, xCoord - 2, yCoord + 1, zCoord + 1,
						Block.stoneButton.blockID, 2);

				createBlock(world, xCoord, yCoord, zCoord + 2,
						Block.pressurePlateStone.blockID, 0);

				createBlock(world, xCoord + 3, yCoord, zCoord + 4,
						Block.chest.blockID, 0);
				createBlock(world, xCoord + 4, yCoord, zCoord + 4,
						Block.chest.blockID, 0);

				TileEntityChest tileEntityChest = new TileEntityChest();
				world.setBlockTileEntity(xCoord + 3, yCoord, zCoord + 4,
						tileEntityChest);

				for (int slot = 0; slot < tileEntityChest.getSizeInventory(); slot++) {
					int item = random.nextInt(250);
					int stackSize;

					if (item == 1 || item == 2 || item == 3) {
						stackSize = random.nextInt(2) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.anthraciteCoal, stackSize));
					}
					if (item == 4 || item == 5 || item == 6) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.arsmiumIngot, stackSize));
					}
					if (item == 7 || item == 8 || item == 9) {
						stackSize = random.nextInt(2);
						if(stackSize == 0) { stackSize = 1; }
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.bituminousCoal,
										stackSize));
					}
					if (item == 10 || item == 11 || item == 12) {
						stackSize = random.nextInt(4) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.copperIngot, stackSize));
					}
					if (item == 13 || item == 14 || item == 15) {
						stackSize = random.nextInt(2);
						if(stackSize == 0) { stackSize = 1; }
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.cosileadiumAlloy,
										stackSize));
					}
					if (item == 16 || item == 17 || item == 18) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.franciumIngot,
								stackSize));
					}
					if (item == 19 || item == 20 || item == 21) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.leadIngot,
								stackSize));
					}
					if (item == 22 || item == 23 || item == 24) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.ligniteCoal,
								stackSize));
					}
					if (item == 25 || item == 26 || item == 27) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.platinumIngot,
								stackSize));
					}
					if (item == 28 || item == 28 || item == 30) {
						stackSize = random.nextInt(2);
						if(stackSize == 0) { stackSize = 1; }
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.robotModel, stackSize));
					}
					if (item == 31 || item == 31 || item == 33) {
						stackSize = random.nextInt(3);
						if(stackSize == 0) { stackSize = 1; }
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.siliconChip,
										stackSize));
					}
					if (item == 34 || item == 34 || item == 36) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.siliconIngot, stackSize));
					}
					if (item == 37 || item == 37 || item == 39) {
						stackSize = random.nextInt(2) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.siliconWafer,
								stackSize));
					}
					if (item == 40 || item == 40 || item == 42) {
						stackSize = random.nextInt(2) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.titaniumIngot,
										stackSize));
					}
					if (item == 43 || item == 43 || item == 45) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.tungstenIngot,
										stackSize));
					}
					if (item == 46 || item == 46 || item == 48) {
						stackSize = random.nextInt(3) + 1;
						tileEntityChest.setInventorySlotContents(slot, new ItemStack(ItemsHelper.urdiumIngot,
										stackSize));
					}

				}
			}
		}
	}

	private void createBlock(World world, int xCoord, int yCoord, int zCoord,
			int blockID, int metadata) {
		world.setBlock(xCoord, yCoord, zCoord, blockID, metadata, 2);
	}

	private int getSurface(World world, int x, int z) {
		int height = 256;

		boolean continueQ = true;

		while (continueQ) {
			if (world.isAirBlock(x, height, z)) {
				height = height - 1;
			} else {
				continueQ = false;
			}

		}

		return height + 1;
	}

}
