package communityMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import communityMod.common.CommunityMod;
import communityMod.common.IDsHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlocksHelper {

    // Blocks
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
    public static Block loggeractive;
    public static Block arsmiumBlock;
    public static Block urdiumBlock;
    public static Block uraniumOre;
    public static Block liquidConcreteStill;
    public static Block liquidConcreteFlowing;

    public static void setupBlocks() {
        // Normal Blocks
        siliconOre = new BlockOre(IDsHelper.siliconOreID).setHardness(10F).setResistance(0.2F)
                .setUnlocalizedName("SiliconOre").setCreativeTab(CommunityMod.modTab);
        leadOre = new BlockOre(IDsHelper.leadOreID).setHardness(10F).setResistance(0.2F).setUnlocalizedName(
                "LeadOre").setCreativeTab(CommunityMod.modTab);
        titaniumOre = new BlockOre(IDsHelper.titaniumOreID).setHardness(10F).setResistance(0.2F)
                .setUnlocalizedName("TitaniumOre").setCreativeTab(CommunityMod.modTab);
        leadBlock = new BlockMetal(IDsHelper.leadBlockID).setHardness(12F).setResistance(10F)
                .setUnlocalizedName("LeadBlock").setCreativeTab(CommunityMod.modTab);
        titaniumBlock = new BlockMetal(IDsHelper.titaniumBlockID).setHardness(12F).setResistance(10F)
                .setUnlocalizedName("TitaniumBlock").setCreativeTab(CommunityMod.modTab);
        copperOre = new BlockOre(IDsHelper.copperOreID).setHardness(10F).setResistance(0.2F)
                .setUnlocalizedName("CopperOre").setCreativeTab(CommunityMod.modTab);
        siliconBlock = new BlockMetal(IDsHelper.siliconBlockID).setHardness(12F).setResistance(10F)
                .setUnlocalizedName("SiliconBlock").setCreativeTab(CommunityMod.modTab);
        ironGirder = new BlockIronGirder(IDsHelper.ironGirderID, Material.iron).setUnlocalizedName("Iron Girder")
                .setHardness(2F).setStepSound(Block.soundMetalFootstep);
        concrete = new BlockConcrete(IDsHelper.concreteID).setUnlocalizedName("Concrete").setHardness(2F)
                .setResistance(17.5F).setStepSound(Block.soundStoneFootstep);
        ligniteOre = new BlockOre(IDsHelper.ligniteOreID).setUnlocalizedName("LigniteOre").setHardness(
                10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
        bituminousOre = new BlockOre(IDsHelper.bituminousOreID).setUnlocalizedName("BituminousOre")
                .setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
        anthraciteOre = new BlockOre(IDsHelper.anthraciteOreID).setUnlocalizedName("AnthraciteOre")
                .setHardness(10F).setResistance(0.2F).setCreativeTab(CommunityMod.modTab);
        platinumOre = new BlockOre(IDsHelper.platinumOreID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("PlatinumOre").setCreativeTab(CommunityMod.modTab);
        tungstenOre = new BlockOre(IDsHelper.tungstenOreID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("TungstenOre").setCreativeTab(CommunityMod.modTab);
        arsmiumOre = new BlockOre(IDsHelper.arsmiumOreID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("ArsmiumOre").setCreativeTab(CommunityMod.modTab);
        urdiumOre = new BlockOre(IDsHelper.urdiumOreID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("UrdiumOre").setCreativeTab(CommunityMod.modTab);
        franciumOre = new BlockOre(IDsHelper.franciumOreID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("FranciumOre").setCreativeTab(CommunityMod.modTab);
        franciumBlock = new BlockMetal(IDsHelper.franciumBlockID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("FranciumBlock").setCreativeTab(CommunityMod.modTab);
        arsmiumBlock = new BlockMetal(IDsHelper.arsmiumBlockID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("ArsmiumBlock").setCreativeTab(CommunityMod.modTab);
        urdiumBlock = new BlockMetal(IDsHelper.urdiumBlockID).setHardness(18F).setResistance(22F)
                .setUnlocalizedName("UrdiumBlock").setCreativeTab(CommunityMod.modTab);
        uraniumOre = new BlockOre(IDsHelper.uraniumOreID).setHardness(19F).setResistance(23F)
                .setUnlocalizedName("UraniumOre").setCreativeTab(CommunityMod.modTab);

        // Machines
        geothermalOven = new BlockLavaFurnace(IDsHelper.lavafurnaceID, false).setHardness(2.5F)
                .setResistance(22F).setUnlocalizedName("geothermaloven").setStepSound(Block.soundStoneFootstep)
                .setCreativeTab(CommunityMod.modTab);
        geothermalOvenActive = new BlockLavaFurnace(IDsHelper.lavafurnaceID + 1, true)
                .setHardness(2.5F).setResistance(22F).setUnlocalizedName("geothermaloven1").setStepSound(
                        Block.soundStoneFootstep).setLightValue(0.3F);
        researcher = new BlockResearcher(IDsHelper.researcherID).setUnlocalizedName(
                "researcher").setHardness(2.5F).setResistance(10F).setCreativeTab(CommunityMod.modTab).setStepSound(
                Block.soundMetalFootstep);
        logger = new BlockLogger(IDsHelper.loggerID, false).setUnlocalizedName("logger")
                .setHardness(1.2F).setStepSound(Block.soundWoodFootstep).setCreativeTab(CommunityMod.modTab);
        loggeractive = new BlockLogger(IDsHelper.loggerID + 10, true).setUnlocalizedName(
                "logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep);

        // Liquids
        liquidConcreteStill = new BlockLiquidConcreteStill(IDsHelper.liquidConcreteStillID)
        		.setUnlocalizedName("LiquidConcreteStill");
        liquidConcreteFlowing = new BlockLiquidConcreteFlowing(IDsHelper.liquidConcreteFlowingID)
        		.setUnlocalizedName("LiquidConcreteFlowing");

        gameRegisters();
        languageRegisters();
    }

    private static void gameRegisters() {
        // Block Registry
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
        GameRegistry.registerBlock(arsmiumBlock, "ArsmiumBlock");
        GameRegistry.registerBlock(urdiumBlock, "UrdiumBlock");
        GameRegistry.registerBlock(uraniumOre, "UraniumOre");
        GameRegistry.registerBlock(liquidConcreteStill, "LiquidConcrete");
        GameRegistry.registerBlock(liquidConcreteFlowing, "LiquidConcreteFlowing");
    }

    private static void languageRegisters() {
        // Blocks
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
        LanguageRegistry.addName(arsmiumBlock, "Arsmium Block");
        LanguageRegistry.addName(urdiumBlock, "Urdium Block");
        LanguageRegistry.addName(uraniumOre, "Uranium Ore");
        LanguageRegistry.addName(liquidConcreteFlowing, "Concrete");
    }

}