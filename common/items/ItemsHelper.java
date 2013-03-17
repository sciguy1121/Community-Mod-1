package mods.communityMod.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.communityMod.common.CommunityMod;
import mods.communityMod.common.IDsHelper;
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
	public static Item siliconWafer;
	public static Item siliconChip;
	public static Item research;
	
	public static Item rasberry;
	public static Item rasberryPie;
	
	public static void setupItems() {
		//Item Loading
		leadIngot = new ItemIngot(IDsHelper.leadIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("LeadIngot");
		titaniumIngot = new ItemIngot(IDsHelper.titaniumIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("TitaniumIngot");
		copperIngot = new ItemIngot(IDsHelper.copperIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("CopperIngot");
		siliconIngot = new ItemIngot(IDsHelper.siliconIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("SiliconIngot");
		ligniteCoal = new ItemCoal(IDsHelper.ligniteCoalID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("Lignite");
		bituminousCoal = new ItemCoal(IDsHelper.bituminousCoalID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("BituminousCoal");
		anthraciteCoal = new ItemCoal(IDsHelper.anthraciteCoalID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("Anthracite");
		platinumIngot = new ItemIngot(IDsHelper.platinumIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("PlatinumIngot");
		tungstenIngot = new ItemIngot(IDsHelper.tungstenIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("TungstenIngot");
		arsmiumIngot = new ItemIngot(IDsHelper.arsmiumIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("ArsmiumIngot");
		urdiumIngot = new ItemIngot(IDsHelper.urdiumIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("UrdiumIngot");
		franciumIngot = new ItemIngot(IDsHelper.franciumIngotID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("FranciumIngot");
		cosileadiumAlloy = new ItemIngot(IDsHelper.cosileadiumAlloyID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("CosileadiumAlloy");
		siliconWafer = new ItemOther(IDsHelper.siliconWaferID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("SiliconWafer");
		siliconChip = new ItemOther(IDsHelper.siliconChipID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("SiliconChip");
		//research = new ItemResearch(IDsHelper.researchID).setCreativeTab(CommunityMod.modTab).setUnlocalizedName("Research");
		
		rasberry = new ItemRasberry(IDsHelper.rasberryID, 4, 2.0F, false).setUnlocalizedName("Rasberry").setCreativeTab(CommunityMod.modTab);
		rasberryPie = new ItemRasberryPie(IDsHelper.rasberryPieID, 8, 6.0F, false).setUnlocalizedName("RasberryPie").setCreativeTab(CommunityMod.modTab);
		
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
		GameRegistry.registerItem(siliconWafer, "SiliconWafer");
		GameRegistry.registerItem(siliconChip, "SiliconChip");
		//GameRegistry.registerItem(research, "Research");
        
		GameRegistry.registerItem(rasberry, "Rasberry");
		GameRegistry.registerItem(rasberryPie, "Rasberry Pie");
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
		LanguageRegistry.addName(siliconWafer, "Silicon Wafer");
		LanguageRegistry.addName(siliconChip, "Silicon Chip");
        //LanguageRegistry.addName(research, "Research");
		
		LanguageRegistry.addName(rasberry, "Rasberry");
		LanguageRegistry.addName(rasberryPie, "Rasberry Pie");
	}

}
