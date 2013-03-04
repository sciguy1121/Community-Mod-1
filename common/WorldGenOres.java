package communityMod.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator{
    
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

		//Make sure it's not generating in the end or nether
		if(world.provider.dimensionId != 1 && world.provider.dimensionId != -1){
			generateSurface(world, random, chunkX, chunkZ);
		}
		
	}
    
	private void generateSurface(World world, Random random, int chunkX, int chunkZ){
		for(int i = 0; i < 10; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(CommunityMod.leadOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 7; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(CommunityMod.titaniumOre.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 12; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(CommunityMod.copperOre.blockID, 12)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 14; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(48);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(CommunityMod.siliconOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 10; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(50);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.ligniteOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 8; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(40);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.bituminousOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 6; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(35);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.anthraciteOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 4; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.platinumOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 4; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.platinumOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 8; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(30);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.tungstenOre.blockID, 2)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 10; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(35);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.arsmiumOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 10; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(20);
			int zCoord = chunkZ + random.nextInt(16);
			(new WorldGenMinable(CommunityMod.urdiumOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}
