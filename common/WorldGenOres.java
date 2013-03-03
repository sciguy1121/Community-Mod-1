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
			
			(new WorldGenMinable(CommunityMod.titaniumOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 12; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(32);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(CommunityMod.copperOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}
