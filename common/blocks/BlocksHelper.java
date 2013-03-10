package communityMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import communityMod.common.CommunityMod;
import communityMod.common.IDsHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlocksHelper {

	//Blocks
	public static Block siliconOre;
	public static Block leadOre;
	public static Block titaniumOre;
	public static Block leadBlock;
	public static Block titaniumBlock;
	public static Block copperOre;
	public static Block siliconBlock;
	public static Block ironGirder;
	public static Block concrete;
	public static Block ligniteOre;
	public static Block bituminousOre;
	public static Block anthraciteOre;
	public static Block platinumOre;
	public static Block tungstenOre;
	public static Block arsmiumOre;
	public static Block urdiumOre;
	public static Block franciumOre;
	public static Block franciumBlock;
	public static Block geothermalOven;
	public static Block geothermalOvenActive;
	public static Block researcher;
	public static Block logger;

	public static void setupBlocks() {
		//Normal Blocks
		siliconOre = new BlockOre(IDsHelper.siliconOreID, 0).setHardness(10F).setResistance(0.2F).setBlockName("SiliconOre").setCreativeTab(CommunityMod.modTab);
		leadOre = new BlockOre(IDsHelper.leadOreID, 1).setHardness(10F).setResistance(0.2F).setBlockName("LeadOre").setCreativeTab(CommunityMod.modTab);
		titaniumOre = new BlockOre(IDsHelper.titaniumOreID, 2).setHardness(10F).setResistance(0.2F).setBlockName("TitaniumOre").setCreativeTab(CommunityMod.modTab);				
		leadBlock = new BlockMetal(IDsHelper.leadBlockID, 17).setHardness(12F).setResistance(10F).setBlockName("LeadBlock").setCreativeTab(CommunityMod.modTab);
		titaniumBlock = new BlockMetal(IDsHelper.titaniumBlockID, 18).setHardness(12F).setResistance(10F).setBlockName("TitaniumBlock").setCreativeTab(CommunityMod.modTab);
		copperOre = new BlockOre(IDsHelper.copperOreID, 3).setHardness(10F).setResistance(0.2F).setBlockName("CopperOre").setCreativeTab(CommunityMod.modTab);
		siliconBlock = new BlockMetal(IDsHelper.siliconBlockID, 16).setHardness(12F).setResistance(10F).setBlockName("SiliconBlock").setCreativeTab(CommunityMod.modTab);
		ironGirder = new BlockIronGirder(IDsHelper.ironGirderID, 32, Material.iron).setBlockName("Iron Girder").setHardness(2F).setStepSound(Block.soundMetalFootstep);
		concrete = new BlockConcrete(IDsHelper.concreteID, 33, Material.iron).setBlockName("Concrete").setHardness(2F).setResistance(17.5F).setStepSound(Block.soundStoneFootstep);
		ligniteOre = new BlockOre(IDsHelper.ligniteOreID, 4).setBlockName("LigniteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		bituminousOre = new BlockOre(IDsHelper.bituminousOreID, 5).setBlockName("BituminousOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		anthraciteOre = new BlockOre(IDsHelper.anthraciteOreID, 6).setBlockName("AnthraciteOre").setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
		platinumOre = new BlockOre(IDsHelper.platinumOreID, 9).setHardness(18F).setResistance(22F).setBlockName("PlatinumOre").setCreativeTab(CommunityMod.modTab);
		tungstenOre = new BlockOre(IDsHelper.tungstenOreID, 11).setHardness(18F).setResistance(22F).setBlockName("TungstenOre").setCreativeTab(CommunityMod.modTab);
		arsmiumOre = new BlockOre(IDsHelper.arsmiumOreID, 10).setHardness(18F).setResistance(22F).setBlockName("ArsmiumOre").setCreativeTab(CommunityMod.modTab);
		urdiumOre = new BlockOre(IDsHelper.urdiumOreID, 8).setHardness(18F).setResistance(22F).setBlockName("UrdiumOre").setCreativeTab(CommunityMod.modTab);
		franciumOre = new BlockOre(IDsHelper.franciumOreID, 7).setHardness(18F).setResistance(22F).setBlockName("FranciumOre").setCreativeTab(CommunityMod.modTab);
		franciumBlock = new BlockMetal(IDsHelper.franciumBlockID, 23).setHardness(18F).setResistance(22F).setBlockName("FranciumBlock").setCreativeTab(CommunityMod.modTab);
		
		//Machines
		geothermalOven = new BlockLavaFurnace(IDsHelper.lavafurnaceID, 0).setHardness(2.5F).setResistance(22F).setBlockName("geothermaloven").setStepSound(Block.soundStoneFootstep).setCreativeTab(CommunityMod.modTab);
		geothermalOvenActive = new BlockLavaFurnace(IDsHelper.lavafurnaceID + 1, 1).setHardness(2.5F).setResistance(22F).setBlockName("geothermaloven1").setStepSound(Block.soundStoneFootstep).setLightValue(0.3F);
		researcher = new BlockResearcher(IDsHelper.researcherID, 8).setBlockName("researcher").setHardness(2.5F).setResistance(10F).setCreativeTab(CommunityMod.modTab).setStepSound(Block.soundMetalFootstep);
		logger = new BlockLogger(IDsHelper.loggerID, 25).setBlockName("logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep).setCreativeTab(CommunityMod.modTab);
		
		gameRegisters();
		languageRegisters();
	}

	private static void gameRegisters() {
		//Block Registry
		GameRegistry.registerBlock(siliconOre, "SiliconOre");
		GameRegistry.registerBlock(leadOre, "LeadOre");
		GameRegistry.registerBlock(titaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(leadBlock, "LeadBlock");
		GameRegistry.registerBlock(titaniumBlock, "TitaniumBlock");
		GameRegistry.registerBlock(copperOre, "CopperOre");
		GameRegistry.registerBlock(siliconBlock, "SiliconBlock");
		GameRegistry.registerBlock(ironGirder, "IronGirder");
		GameRegistry.registerBlock(concrete, "Concrete");
		GameRegistry.registerBlock(ligniteOre, "Lignite Ore");
		GameRegistry.registerBlock(bituminousOre, "Bituminous Ore");
		GameRegistry.registerBlock(anthraciteOre, "Anthracite Ore");
		GameRegistry.registerBlock(platinumOre, "PlatinumOre");
		GameRegistry.registerBlock(tungstenOre, "tungstenOre");
		GameRegistry.registerBlock(arsmiumOre, "ArsmiumOre");
		GameRegistry.registerBlock(urdiumOre, "UrdiumOre");
		GameRegistry.registerBlock(franciumOre, "FranciumOre");
		GameRegistry.registerBlock(franciumBlock, "FranciumBlock");
		GameRegistry.registerBlock(geothermalOven, "GeothermalOven");
		GameRegistry.registerBlock(geothermalOvenActive, "GeothermalOven1");
		GameRegistry.registerBlock(researcher, "Researcher");
		GameRegistry.registerBlock(logger, "Logger");
	}
	
	private static void languageRegisters() {
		//Blocks
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
		LanguageRegistry.addName(leadOre, "Lead Ore");
		LanguageRegistry.addName(titaniumOre, "Titanium Ore");
		LanguageRegistry.addName(leadBlock, "Lead Block");
		LanguageRegistry.addName(titaniumBlock, "Titanium Block");
		LanguageRegistry.addName(copperOre, "Copper Ore");
		LanguageRegistry.addName(siliconBlock, "Silicon Block");
		LanguageRegistry.addName(ironGirder, "Iron Girder");
		LanguageRegistry.addName(concrete, "Concrete");
		LanguageRegistry.addName(ligniteOre, "Lignite Ore");
		LanguageRegistry.addName(bituminousOre, "Bituminous Coal Ore");
		LanguageRegistry.addName(anthraciteOre, "Anthracite Ore");
		LanguageRegistry.addName(platinumOre, "Platinum Ore");
		LanguageRegistry.addName(tungstenOre, "Tungsten Ore");
		LanguageRegistry.addName(arsmiumOre, "Arsmium Ore");
		LanguageRegistry.addName(urdiumOre, "Urdium Ore");
		LanguageRegistry.addName(franciumOre, "Francium Ore");
		LanguageRegistry.addName(franciumBlock, "Francium Block");
		LanguageRegistry.addName(geothermalOven, "Geothermal Oven");
		LanguageRegistry.addName(researcher, "Researcher");
		LanguageRegistry.addName(logger, "Logger");
	}

}
