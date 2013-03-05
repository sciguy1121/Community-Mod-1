package communityMod.common;

import net.minecraftforge.common.Configuration;

public class IDsHelper {

	//Block IDs
	public static int siliconOreID;
	public static int leadOreID;
	public static int titaniumOreID;
	public static int leadBlockID;
	public static int titaniumBlockID;
	public static int copperOreID;
	public static int siliconBlockID;
	public static int ironGirderID;
	public static int concreteID;
	public static int ligniteOreID;
	public static int bituminousOreID;
	public static int anthraciteOreID;
	public static int platinumOreID;
	public static int tungstenOreID;
	public static int arsmiumOreID;
	public static int urdiumOreID;
	public static int franciumOreID;
	public static int franciumBlockID;

	//Item IDs
	public static int leadIngotID;
	public static int titaniumIngotID;
	public static int copperIngotID;
	public static int siliconIngotID;
	public static int ligniteCoalID;
	public static int bituminousCoalID;
	public static int anthraciteCoalID;
	public static int platinumIngotID;
	public static int tungstenIngotID;
	public static int arsmiumIngotID;
	public static int urdiumIngotID;
	public static int franciumIngotID;
	public static int cosileadiumAlloyID;
	
	public static int rasberryID;
	public static int rasberryPieID;
	
	public static void runConfiguration(Configuration config){
		//Block IDs
		siliconOreID = config.get("Block IDs", "Silicon Ore ID", 700).getInt();
		leadOreID = config.get("Block IDs", "Lead Ore ID", 701).getInt();
		titaniumOreID = config.get("Block IDs", "Titanium Ore ID", 702).getInt();
		leadBlockID = config.get("Block IDs", "Lead Block ID", 703).getInt();
		titaniumBlockID = config.get("Block IDs", "Titanium Block ID", 704).getInt();
		copperOreID = config.get("Block IDs", "Copper Ore ID", 705).getInt();
		siliconBlockID = config.get("Block IDs", "Silicon Block ID", 706).getInt();
		ironGirderID = config.get("Block IDs", "Iron Girder ID", 707).getInt();
		concreteID = config.get("Block IDs", "Concrete ID", 708).getInt();
		ligniteOreID = config.get("Block IDs", "Lignite Ore ID", 709).getInt();
		bituminousOreID = config.get("Block IDs", "Bituminous Ore ID", 710).getInt();
		anthraciteOreID = config.get("Block IDs", "Anthracite Ore ID", 711).getInt();
		platinumOreID = config.get("Block IDs", "Platinum Ore ID", 712).getInt();
		tungstenOreID = config.get("Block IDs", "tungsten Ore ID", 713).getInt();
		arsmiumOreID = config.get("Block IDs", "Arsium Ore ID", 714).getInt();
		urdiumOreID = config.get("Block IDs", "Urdium Ore ID", 715).getInt();
		franciumOreID = config.get("Block IDs", "Francium Ore ID", 716).getInt();
		franciumBlockID = config.get("Block IDs", "Francium Block ID", 717).getInt();

		//Item IDs
		leadIngotID = config.get("Item IDs", "Lead Ingot ID", 1000).getInt();
		titaniumIngotID = config.get("Item IDs", "Titanium Ingot ID", 1001).getInt();
		copperIngotID = config.get("Item IDs", "Copper Ingot ID", 1002).getInt();
		siliconIngotID = config.get("Item IDs", "Silicon Ingot ID", 1003).getInt();
		ligniteCoalID = config.get("Item IDs", "Lignite ID", 1004).getInt();
		bituminousCoalID = config.get("Item IDs", "Bituminous Coal ID", 1005).getInt();
		anthraciteCoalID = config.get("Item IDs", "Anthracite ID", 1006).getInt();
		platinumIngotID = config.get("Item IDs", "Platinum Ingot ID", 1007).getInt();
		tungstenIngotID = config.get("Item IDs", "Tungsten Ingot ID", 1008).getInt();
		arsmiumIngotID = config.get("Item IDs", "Arsmium Ingot ID", 1009).getInt();
		urdiumIngotID = config.get("Item IDs", "Urdium Ingot ID", 1010).getInt();
		franciumIngotID = config.get("Item IDs", "Francium Ingot ID", 1011).getInt();
		cosileadiumAlloyID = config.get("Item IDs", "Cosileadium Alloy ID", 1012).getInt();
		
		rasberryID = config.get("Item IDs", "Resberry ID", 1013).getInt();
		rasberryPieID = config.get("Item IDs", "Resberry Pie ID", 1014).getInt();
	}
	
}
