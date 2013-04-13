package communityMod.common.items;

import net.minecraft.item.Item;

import communityMod.common.CommunityMod;
import communityMod.common.IDsHelper;
import communityMod.common.Reference;
import communityMod.common.blocks.BlocksHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemsHelper {

    // Items
    public static Item leadIngot;
    public static Item titaniumIngot;
    public static Item copperIngot;
    public static Item siliconIngot;
    public static Item ligniteCoal;
    public static Item bituminousCoal;
    public static Item anthraciteCoal;
    public static Item platinumIngot;
    public static Item tungstenIngot;
    public static Item arsmiumIngot;
    public static Item urdiumIngot;
    public static Item franciumIngot;
    public static Item cosileadiumAlloy;
    public static Item siliconWafer;
    public static Item siliconChip;
    public static Item research;
    public static Item robotModel;
    public static Item uraniumChunk;

    public static Item raspberry;
    public static Item raspberryPie;

    public static Item bucketConcrete;

    public static void setupItems() {
        // Item Loading
        leadIngot = new ItemIngot(IDsHelper.leadIngotID, "LeadIngot").setCreativeTab(CommunityMod.modTab);
        titaniumIngot = new ItemIngot(IDsHelper.titaniumIngotID, "TitaniumIngot").setCreativeTab(CommunityMod.modTab);
        copperIngot = new ItemIngot(IDsHelper.copperIngotID, "CopperIngot").setCreativeTab(CommunityMod.modTab);
        siliconIngot = new ItemIngot(IDsHelper.siliconIngotID, "SiliconIngot").setCreativeTab(CommunityMod.modTab);
        ligniteCoal = new ItemCoal(IDsHelper.ligniteCoalID, "BituminousCoal").setCreativeTab(CommunityMod.modTab)
                .setUnlocalizedName("Lignite");
        bituminousCoal = new ItemCoal(IDsHelper.bituminousCoalID, "BituminousCoal").setCreativeTab(CommunityMod.modTab)
                .setUnlocalizedName("BituminousCoal");
        anthraciteCoal = new ItemCoal(IDsHelper.anthraciteCoalID, "Anthracite").setCreativeTab(CommunityMod.modTab)
                .setUnlocalizedName("Anthracite");
        platinumIngot = new ItemIngot(IDsHelper.platinumIngotID, "PlatinumIngot").setCreativeTab(CommunityMod.modTab);
        tungstenIngot = new ItemIngot(IDsHelper.tungstenIngotID, "TungstenIngot").setCreativeTab(CommunityMod.modTab);
        arsmiumIngot = new ItemIngot(IDsHelper.arsmiumIngotID, "ArsmiumIngot").setCreativeTab(CommunityMod.modTab);
        urdiumIngot = new ItemIngot(IDsHelper.urdiumIngotID, "UrdiumIngot").setCreativeTab(CommunityMod.modTab);
        franciumIngot = new ItemIngot(IDsHelper.franciumIngotID, "FranciumIngot").setCreativeTab(CommunityMod.modTab);
        cosileadiumAlloy = new ItemIngot(IDsHelper.cosileadiumAlloyID, "CosileadiumAlloy")
                .setCreativeTab(CommunityMod.modTab);
        siliconWafer = new ItemOther(IDsHelper.siliconWaferID, "SiliconWafer").setCreativeTab(CommunityMod.modTab);
        siliconChip = new ItemOther(IDsHelper.siliconChipID, "SiliconChip").setCreativeTab(CommunityMod.modTab);
        research = new ItemResearch(IDsHelper.researchID, "Research").setCreativeTab(CommunityMod.modTab);
        robotModel = new ItemRobotModel(IDsHelper.robotModelID, "RobotModel").setCreativeTab(CommunityMod.modTab);
        uraniumChunk = new ItemIngot(IDsHelper.uraniumChunkID, "UraniumChunk").setCreativeTab(CommunityMod.modTab);

        raspberry = new ItemRaspberry(IDsHelper.RaspberryID, 4, 2.0F, false, "Raspberry")
                .setCreativeTab(CommunityMod.modTab);
        raspberryPie = new ItemRaspberryPie(IDsHelper.RaspberryPieID, 8, 6.0F, false, "RaspberryPie")
                .setCreativeTab(CommunityMod.modTab);
        bucketConcrete = new ItemBucketConcrete(IDsHelper.bucketConcreteID, BlocksHelper.liquidConcreteFlowing.blockID)
                .setCreativeTab(CommunityMod.modTab).setUnlocalizedName("bucketConcrete").setContainerItem(
                        Item.bucketEmpty);

        gameRegisters();
        languageRegisters();
    }

    private static void gameRegisters() {
        // Item Registry
        GameRegistry.registerItem(leadIngot, "LeadIngot", Reference.modTextureID);
        GameRegistry.registerItem(titaniumIngot, "TitaniumIngot", Reference.modTextureID);
        GameRegistry.registerItem(copperIngot, "CopperIngot", Reference.modTextureID);
        GameRegistry.registerItem(siliconIngot, "SiliconIngot", Reference.modTextureID);
        GameRegistry.registerItem(ligniteCoal, "Lignite", Reference.modTextureID);
        GameRegistry.registerItem(bituminousCoal, "Bituminous Coal", Reference.modTextureID);
        GameRegistry.registerItem(anthraciteCoal, "Anthracite", Reference.modTextureID);
        GameRegistry.registerItem(platinumIngot, "PlatinumIngot", Reference.modTextureID);
        GameRegistry.registerItem(tungstenIngot, "tungstenIngot", Reference.modTextureID);
        GameRegistry.registerItem(arsmiumIngot, "ArsmiumShard", Reference.modTextureID);
        GameRegistry.registerItem(urdiumIngot, "UrdiumIngot", Reference.modTextureID);
        GameRegistry.registerItem(franciumIngot, "FranciumIngot", Reference.modTextureID);
        GameRegistry.registerItem(cosileadiumAlloy, "CosileadiumAlloy", Reference.modTextureID);
        GameRegistry.registerItem(siliconWafer, "SiliconWafer", Reference.modTextureID);
        GameRegistry.registerItem(siliconChip, "SiliconChip", Reference.modTextureID);
        GameRegistry.registerItem(research, "Research", Reference.modTextureID);
        GameRegistry.registerItem(robotModel, "RobotModel", Reference.modTextureID);
        GameRegistry.registerItem(uraniumChunk, "UraniumChunk", Reference.modTextureID);

        GameRegistry.registerItem(raspberry, "Raspberry", Reference.modTextureID);
        GameRegistry.registerItem(raspberryPie, "RaspberryPie", Reference.modTextureID);

        GameRegistry.registerItem(bucketConcrete, "BucketConcrete", Reference.modTextureID);
    }

    private static void languageRegisters() {
        // Item LanguageRegistry
        LanguageRegistry.addName(leadIngot, "Lead Ingot");
        LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
        LanguageRegistry.addName(copperIngot, "Copper Ingot");
        LanguageRegistry.addName(siliconIngot, "Silicon Ingot");
        LanguageRegistry.addName(ligniteCoal, "Lignite");
        LanguageRegistry.addName(bituminousCoal, "Bituminous Coal");
        LanguageRegistry.addName(anthraciteCoal, "Anthracite");
        LanguageRegistry.addName(platinumIngot, "Platinum Ingot");
        LanguageRegistry.addName(tungstenIngot, "Tungsten Ingot");
        LanguageRegistry.addName(arsmiumIngot, "Arsmium Ingot");
        LanguageRegistry.addName(urdiumIngot, "Urdium Ingot");
        LanguageRegistry.addName(franciumIngot, "Francium Ingot");
        LanguageRegistry.addName(cosileadiumAlloy, "Cosileadium Alloy");
        LanguageRegistry.addName(siliconWafer, "Silicon Wafer");
        LanguageRegistry.addName(siliconChip, "Silicon Chip");
        LanguageRegistry.addName(research, "Research");
        LanguageRegistry.addName(robotModel, "Robot Model");
        LanguageRegistry.addName(uraniumChunk, "Uranium Chunk");

        LanguageRegistry.addName(raspberry, "Raspberry");
        LanguageRegistry.addName(raspberryPie, "Raspberry Pie");

        LanguageRegistry.addName(bucketConcrete, "Bucket of Concrete");
    }

}
