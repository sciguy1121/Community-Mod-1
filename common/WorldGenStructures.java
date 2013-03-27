package mods.communityMod.common;

import java.util.Random;


import mods.communityMod.common.blocks.BlocksHelper;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenStructures implements IWorldGenerator{
	@Override
	public void generate(Random random, int x, int z, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

		//Make sure it's not generating in the end or nether
		if(world.provider.dimensionId != 1 && world.provider.dimensionId != -1){
			generateSurface(world, random, x*16, z*16);
		}
		
	}
    
	private void generateSurface(World world, Random random, int x, int z){
		
		//Science Lab Generation Code:
		if(random.nextInt(30) == 1)
		{
			for(int i = 0; i < 1; i++)
			{		
				int xCoord = x + random.nextInt(16);
				int zCoord = z + random.nextInt(16);
				int yCoord = getSurface(world, xCoord, zCoord);
				int titanium = BlocksHelper.titaniumBlock.blockID;
				int torch = Block.torchWood.blockID;
				
				for(int zA = 0; zA < 5; zA++)
				{
					for(int xA = 0; xA < 8; xA++)
					{
						createBlock(world, xCoord + xA, yCoord - 1, zCoord + zA, titanium, 0);
					}
				}
				for(int zA = 0; zA < 5; zA++)
				{
					for(int xA = 0; xA < 8; xA++)
					{
						createBlock(world, xCoord + xA, yCoord + 3, zCoord + zA, titanium, 0);
					}
				}
				for(int yA = 0; yA < 3; yA++)
				{
					for(int zA = 0; zA < 7; zA++)
					{
						createBlock(world, xCoord - 1, yCoord + yA, zCoord + zA - 1, titanium, 0);
					}
					for(int zA = 0; zA < 7; zA++)
					{
						createBlock(world, xCoord + 8, yCoord + yA, zCoord + zA - 1, titanium, 0);
					}
					for(int xA = 0; xA < 8; xA ++)
					{
						createBlock(world, xCoord + xA, yCoord + yA, zCoord - 1, titanium, 0);
					}
					for(int xA = 0; xA < 8; xA ++)
					{
						createBlock(world, xCoord + xA, yCoord + yA, zCoord + 5, titanium, 0);
					}
				}
				
				createBlock(world, xCoord - 1, yCoord - 1, zCoord + 2, titanium, 0);
				
				createBlock(world, xCoord + 7, yCoord, zCoord + 2, BlocksHelper.researcher.blockID, 0);
				
				createBlock(world, xCoord + 7, yCoord + 1, zCoord + 2, torch, 0);
				createBlock(world, xCoord + 5, yCoord + 1, zCoord, torch, 0);
				createBlock(world, xCoord + 5, yCoord + 1, zCoord + 4, torch, 0);
				createBlock(world, xCoord + 2, yCoord + 1, zCoord, torch, 0);
				createBlock(world, xCoord + 2, yCoord + 1, zCoord + 4, torch, 0);

				createBlock(world, xCoord - 1, yCoord, zCoord + 2, Block.doorSteel.blockID, 0);
				createBlock(world, xCoord - 1, yCoord + 1, zCoord + 2, Block.doorSteel.blockID, 8);
				
				createBlock(world, xCoord - 2, yCoord + 1, zCoord + 1, Block.stoneButton.blockID, 2);

				createBlock(world, xCoord, yCoord, zCoord + 2, Block.pressurePlateStone.blockID, 0);

				createBlock(world, xCoord + 3, yCoord, zCoord + 4, Block.chest.blockID, 0);
				createBlock(world, xCoord + 4, yCoord, zCoord + 4, Block.chest.blockID, 0);
				
				
			}
		}
	}
	
	private void createBlock(World world, int xCoord, int yCoord, int zCoord, int blockID, int metadata)
	{
		world.setBlock(xCoord, yCoord, zCoord, blockID, metadata, 2);
	}
	
	private int getSurface(World world, int x, int z)
	{
		int height = 256;
		
		boolean continueQ = true;
		
		while(continueQ)
		{
			if(world.isAirBlock(x, height, z))
			{
				height = height - 1;
			}
			else
			{
				continueQ = false;
			}
			
		}
		
		return height + 1;
	}

}
