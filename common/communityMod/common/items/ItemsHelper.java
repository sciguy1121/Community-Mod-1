package communityMod.common.items;

import net.minecraft.item.Item;

import communityMod.common.CommunityMod;
import communityMod.common.IDsHelper;
import communityMod.common.Reference;
import communityMod.common.blocks.BlocksHelper;

import cpw.mods.fml.common.registry.GameRegistry;

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
        ligniteCoal = new ItemCoal(IDsHelper.ligniteCoalID, "Lignite").setCreativeTab(CommunityMod.modTab);
        bituminousCoal = new ItemCoal(IDsHelper.bituminousCoalID, "BituminousCoal").setCreativeTab(CommunityMod.modTab);
        anthraciteCoal = new ItemCoal(IDsHelper.anthraciteCoalID, "Anthracite").setCreativeTab(CommunityMod.modTab);
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
        robotModel = new ItemRobotModel(IDsHelper.robotModelID).setCreativeTab(CommunityMod.modTab);
        uraniumChunk = new ItemIngot(IDsHelper.uraniumChunkID, "UraniumChunk").setCreativeTab(CommunityMod.modTab);

        raspberry = new ItemRaspberry(IDsHelper.RaspberryID, 4, 2.0F, false)
                .setCreativeTab(CommunityMod.modTab);
        raspberryPie = new ItemRaspberryPie(IDsHelper.RaspberryPieID, 8, 6.0F, false)
                .setCreativeTab(CommunityMod.modTab);
        bucketConcrete = new ItemBucketConcrete(IDsHelper.bucketConcreteID, BlocksHelper.liquidConcreteFlowing.blockID)
                .setCreativeTab(CommunityMod.modTab).setUnlocalizedName("bucketConcrete").setContainerItem(
                        Item.bucketEmpty);

        gameRegisters();
    }

    private static void gameRegisters() {
        // Item Registry
        GameRegistry.registerItem(leadIngot, "LeadIngot", Reference.modid);
        GameRegistry.registerItem(titaniumIngot, "TitaniumIngot", Reference.modid);
        GameRegistry.registerItem(copperIngot, "CopperIngot", Reference.modid);
        GameRegistry.registerItem(siliconIngot, "SiliconIngot", Reference.modid);
        GameRegistry.registerItem(ligniteCoal, "Lignite", Reference.modid);
        GameRegistry.registerItem(bituminousCoal, "Bituminous Coal", Reference.modid);
        GameRegistry.registerItem(anthraciteCoal, "Anthracite", Reference.modid);
        GameRegistry.registerItem(platinumIngot, "PlatinumIngot", Reference.modid);
        GameRegistry.registerItem(tungstenIngot, "tungstenIngot", Reference.modid);
        GameRegistry.registerItem(arsmiumIngot, "ArsmiumShard", Reference.modid);
        GameRegistry.registerItem(urdiumIngot, "UrdiumIngot", Reference.modid);
        GameRegistry.registerItem(franciumIngot, "FranciumIngot", Reference.modid);
        GameRegistry.registerItem(cosileadiumAlloy, "CosileadiumAlloy", Reference.modid);
        GameRegistry.registerItem(siliconWafer, "SiliconWafer", Reference.modid);
        GameRegistry.registerItem(siliconChip, "SiliconChip", Reference.modid);
        GameRegistry.registerItem(research, "Research", Reference.modid);
        GameRegistry.registerItem(robotModel, "RobotModel", Reference.modid);
        GameRegistry.registerItem(uraniumChunk, "UraniumChunk", Reference.modid);

        GameRegistry.registerItem(raspberry, "Raspberry", Reference.modid);
        GameRegistry.registerItem(raspberryPie, "RaspberryPie", Reference.modid);

        GameRegistry.registerItem(bucketConcrete, "BucketConcrete", Reference.modid);
    }

}
