package communityMod.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import communityMod.common.blocks.BlocksHelper;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		// Make sure it's not generating in the end or nether
		if (world.provider.dimensionId != 1 && world.provider.dimensionId != -1) {
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}

	}

	private void generateSurface(World world, Random random, int chunkX,
			int chunkZ) {
		for (int i = 0; i < 10; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(BlocksHelper.leadOre.blockID, 10)).generate(
					world, random, xCoord, yCoord, zCoord);
		}

		for (int i = 0; i < 7; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(BlocksHelper.titaniumOre.blockID, 8))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 12; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(BlocksHelper.copperOre.blockID, 12)).generate(
					world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 14; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(BlocksHelper.siliconOre.blockID, 10))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 10; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(50);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.ligniteOre.blockID, 5)).generate(
					world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 8; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(40);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.bituminousOre.blockID, 5))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 6; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(35);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.anthraciteOre.blockID, 5))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 4; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.platinumOre.blockID, 4))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 8; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(30);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.tungstenOre.blockID, 2))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 10; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(35);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.arsmiumOre.blockID, 5)).generate(
					world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 10; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.urdiumOre.blockID, 5)).generate(
					world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 3; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(10);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(BlocksHelper.franciumOre.blockID, 3))
					.generate(world, random, xCoord, yCoord, zCoord);
		}
		for (int i = 0; i < 2; i++) {
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(5);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(
					communityMod.common.blocks.BlocksHelper.uraniumOre.blockID,
					3)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}
