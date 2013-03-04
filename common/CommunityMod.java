package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import communityMod.client.ClientProxyCommunityMod;
import communityMod.common.blocks.BlockConcrete;
import communityMod.common.blocks.BlockIronGirder;
import communityMod.common.blocks.BlockMetal;
import communityMod.common.blocks.BlockOre;
import communityMod.common.items.ItemCoal;
import communityMod.common.items.ItemIngot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Community_Mod", name = "Community_Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CommunityMod {

	@SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod",
				serverSide = "communityMod.common.CommonProxyCommunityMod")
	public static ClientProxyCommunityMod proxy = new ClientProxyCommunityMod();

	public static CreativeTabs modTab = new CreativeTab(CreativeTabs.getNextID(),"CommunityMod");
	
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

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

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

		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();
        
        BlocksHelper.setupBlocks();
        ItemsHelper.setupItems();
        
		craftingRecipes();
		smeltingRecipes();

		GameRegistry.registerWorldGenerator(new WorldGenOres());
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	private static void smeltingRecipes(){
		GameRegistry.addSmelting(leadOreID, new ItemStack(ItemsHelper.leadIngot, 1), 0.6F);
		GameRegistry.addSmelting(titaniumOreID, new ItemStack(ItemsHelper.titaniumIngot, 1), 0.75F);
		GameRegistry.addSmelting(siliconOreID, new ItemStack(ItemsHelper.siliconIngot, 1), 0.5F);
		GameRegistry.addSmelting(copperOreID, new ItemStack(ItemsHelper.copperIngot, 1), 0.5F);
		GameRegistry.addSmelting(platinumOreID, new ItemStack(ItemsHelper.copperIngot, 1), 0.5F);
		GameRegistry.addSmelting(tungstenOreID, new ItemStack(ItemsHelper.tungstenIngot, 1), 0.5F);
		GameRegistry.addSmelting(arsmiumOreID, new ItemStack(ItemsHelper.arsmiumIngot, 1), 0.5F);
		GameRegistry.addSmelting(urdiumOreID, new ItemStack(ItemsHelper.urdiumIngot, 1), 0.5F);
        GameRegistry.addSmelting(franciumOreID, new ItemStack(ItemsHelper.franciumIngot, 1), 0.5F);
        GameRegistry.addSmelting(franciumIngotID, new ItemStack(ItemsHelper.leadIngot, 1), 1F);
	}

	private static void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.leadBlock, 1), new Object[]{
			"LLL",
			"LLL",
			"LLL",
			'L', ItemsHelper.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.titaniumBlock, 1), new Object[]{
			"TTT",
			"TTT",
			"TTT",
			'T', ItemsHelper.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.siliconBlock, 1), new Object[]{
			"SSS",
			"SSS",
			"SSS",
			'S', ItemsHelper.siliconIngot
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.ironGirder, 4), new Object[]{
			"III", " I ", "III", 'I', Item.ingotIron,
		});
        GameRegistry.addRecipe(new ItemStack(BlocksHelper.franciumBlock, 1), new Object[]{
			"FFF",
			"FFF",
			"FFF",
			'F', ItemsHelper.franciumIngot
		});
	}
}
