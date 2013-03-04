package communityMod.common;

import communityMod.common.items.ItemCoal;
import communityMod.common.items.ItemIngot;

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
				
	}

}
