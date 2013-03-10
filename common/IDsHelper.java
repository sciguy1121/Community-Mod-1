package communityMod.common;

import net.minecraftforge.common.Configuration;

public class IDsHelper {
	
	//Configuration categories
	public static String blockids = "Block IDs";
	public static String itemids = "Item IDs";

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
	public static int lavafurnaceID;
	public static int researcherID;
	public static int loggerID;

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
	public static int siliconWaferID;
	public static int siliconChipID;
	
	public static int rasberryID;
	public static int rasberryPieID;
	
	public static void runConfiguration(Configuration config){
		//Block IDs
		siliconOreID = config.get(blockids, "Silicon Ore ID", 700).getInt();
		leadOreID = config.get(blockids, "Lead Ore ID", 701).getInt();
		titaniumOreID = config.get(blockids, "Titanium Ore ID", 702).getInt();
		leadBlockID = config.get(blockids, "Lead Block ID", 703).getInt();
		titaniumBlockID = config.get(blockids, "Titanium Block ID", 704).getInt();
		copperOreID = config.get(blockids, "Copper Ore ID", 705).getInt();
		siliconBlockID = config.get(blockids, "Silicon Block ID", 706).getInt();
		ironGirderID = config.get(blockids, "Iron Girder ID", 707).getInt();
		concreteID = config.get(blockids, "Concrete ID", 708).getInt();
		ligniteOreID = config.get(blockids, "Lignite Ore ID", 709).getInt();
		bituminousOreID = config.get(blockids, "Bituminous Ore ID", 710).getInt();
		anthraciteOreID = config.get(blockids, "Anthracite Ore ID", 711).getInt();
		platinumOreID = config.get(blockids, "Platinum Ore ID", 712).getInt();
		tungstenOreID = config.get(blockids, "tungsten Ore ID", 713).getInt();
		arsmiumOreID = config.get(blockids, "Arsium Ore ID", 714).getInt();
		urdiumOreID = config.get(blockids, "Urdium Ore ID", 715).getInt();
		franciumOreID = config.get(blockids, "Francium Ore ID", 716).getInt();
		franciumBlockID = config.get(blockids, "Francium Block ID", 717).getInt();
		lavafurnaceID = config.get(blockids, "Lava Furnace ID", 801).getInt();
		researcherID = config.get(blockids, "Researcher ID", 803).getInt();
		loggerID = config.get(blockids, "Logger ID", 804).getInt();

		//Item IDs
		leadIngotID = config.get(itemids, "Lead Ingot ID", 1000).getInt();
		titaniumIngotID = config.get(itemids, "Titanium Ingot ID", 1001).getInt();
		copperIngotID = config.get(itemids, "Copper Ingot ID", 1002).getInt();
		siliconIngotID = config.get(itemids, "Silicon Ingot ID", 1003).getInt();
		ligniteCoalID = config.get(itemids, "Lignite ID", 1004).getInt();
		bituminousCoalID = config.get(itemids, "Bituminous Coal ID", 1005).getInt();
		anthraciteCoalID = config.get(itemids, "Anthracite ID", 1006).getInt();
		platinumIngotID = config.get(itemids, "Platinum Ingot ID", 1007).getInt();
		tungstenIngotID = config.get(itemids, "Tungsten Ingot ID", 1008).getInt();
		arsmiumIngotID = config.get(itemids, "Arsmium Ingot ID", 1009).getInt();
		urdiumIngotID = config.get(itemids, "Urdium Ingot ID", 1010).getInt();
		franciumIngotID = config.get(itemids, "Francium Ingot ID", 1011).getInt();
		cosileadiumAlloyID = config.get(itemids, "Cosileadium Alloy ID", 1012).getInt();
		siliconWaferID = config.get(itemids, "Silicon Wafer ID", 1015).getInt();
		siliconChipID = config.get(itemids, "Silicon Chip ID", 1016).getInt();
		
		rasberryID = config.get(itemids, "Resberry ID", 1013).getInt();
		rasberryPieID = config.get(itemids, "Resberry Pie ID", 1014).getInt();
	}
	
}
