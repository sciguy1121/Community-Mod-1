package communityMod.common;

import communityMod.common.items.ItemCoal;
import communityMod.common.items.ItemIngot;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemsHelper{

	//Items
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
	
	public static void setupItems() {
		//Item Loading
		leadIngot = new ItemIngot(CommunityMod.leadIngotID, 1).setCreativeTab(CommunityMod.modTab).setItemName("LeadIngot");
		titaniumIngot = new ItemIngot(CommunityMod.titaniumIngotID, 0).setCreativeTab(CommunityMod.modTab).setItemName("TitaniumIngot");
		copperIngot = new ItemIngot(CommunityMod.copperIngotID, 3).setCreativeTab(CommunityMod.modTab).setItemName("CopperIngot");
		siliconIngot = new ItemIngot(CommunityMod.siliconIngotID, 2).setCreativeTab(CommunityMod.modTab).setItemName("SiliconIngot");
		ligniteCoal = new ItemCoal(CommunityMod.ligniteCoalID, 4).setCreativeTab(CommunityMod.modTab).setItemName("Lignite");
		bituminousCoal = new ItemCoal(CommunityMod.bituminousCoalID, 5).setCreativeTab(CommunityMod.modTab).setItemName("BituminousCoal");
		anthraciteCoal = new ItemCoal(CommunityMod.anthraciteCoalID, 6).setCreativeTab(CommunityMod.modTab).setItemName("Anthracite");
		platinumIngot = new ItemIngot(CommunityMod.platinumIngotID, 9).setCreativeTab(CommunityMod.modTab).setItemName("PlatinumIngot");
		tungstenIngot = new ItemIngot(CommunityMod.tungstenIngotID, 11).setCreativeTab(CommunityMod.modTab).setItemName("TungstenIngot");
		arsmiumIngot = new ItemIngot(CommunityMod.arsmiumIngotID, 10).setCreativeTab(CommunityMod.modTab).setItemName("ArsmiumIngot");
		urdiumIngot = new ItemIngot(CommunityMod.urdiumIngotID, 8).setCreativeTab(CommunityMod.modTab).setItemName("UrdiumIngot");
		franciumIngot = new ItemIngot(CommunityMod.franciumIngotID, 7).setCreativeTab(CommunityMod.modTab).setItemName("FranciumIngot");
		cosileadiumAlloy = new ItemIngot(CommunityMod.cosileadiumAlloyID, 12).setCreativeTab(CommunityMod.modTab).setItemName("CosileadiumAlloy");
			
		gameRegisters();
		languageRegisters();
	}
	
	private static void gameRegisters(){
		//Item Registry
		GameRegistry.registerItem(leadIngot, "LeadIngot");
		GameRegistry.registerItem(titaniumIngot, "TitaniumIngot");
		GameRegistry.registerItem(copperIngot, "CopperIngot");
		GameRegistry.registerItem(siliconIngot, "SiliconIngot");
		GameRegistry.registerItem(ligniteCoal, "Lignite");
		GameRegistry.registerItem(bituminousCoal, "Bituminous Coal");
		GameRegistry.registerItem(anthraciteCoal, "Anthracite");
		GameRegistry.registerItem(platinumIngot, "PlatinumIngot");
		GameRegistry.registerItem(tungstenIngot, "tungstenIngot");
		GameRegistry.registerItem(arsmiumIngot, "ArsmiumShard");
		GameRegistry.registerItem(urdiumIngot, "UrdiumIngot");
        GameRegistry.registerItem(franciumIngot, "FranciumIngot");
        GameRegistry.registerItem(cosileadiumAlloy, "CosileadiumAlloy");
	}
	

	private static void languageRegisters(){
		//Item LanguageRegistry
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
	}

}
