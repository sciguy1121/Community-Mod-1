package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import communityMod.client.ClientProxyCommunityMod;

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
	
	//Blocks
	public static Block siliconOre;
	public static Block leadOre;
	public static Block titaniumOre;
	public static Block leadBlock;
	public static Block titaniumBlock;
	public static Block copperOre;
	public static Block siliconBlock;
	public static Block ironGirder;
	
	//Items
	public static Item leadIngot;
	public static Item titaniumIngot;
	public static Item copperIngot;
	public static Item siliconIngot;
	
	//Block IDs
	public static int siliconOreID;
	public static int leadOreID;
	public static int titaniumOreID;
	public static int leadBlockID;
	public static int titaniumBlockID;
	public static int copperOreID;
	public static int siliconBlockID;
	public static int ironGirderID;
	
	//Item IDs
	public static int leadIngotID;
	public static int titaniumIngotID;
	public static int copperIngotID;
	public static int siliconIngotID;
	
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
		
		//Item IDs
		leadIngotID = config.get("Item IDs", "Lead Ingot ID", 1000).getInt();
		titaniumIngotID = config.get("Item IDs", "Titanium Ingot ID", 1001).getInt();
		copperIngotID = config.get("Item IDs", "Copper Ingot ID", 1002).getInt();
		siliconIngotID = config.get("Item IDs", "Silicon Ingot ID", 1003).getInt();
		
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();
		
		//Block Loading
		siliconOre = new BlockOre(siliconOreID, 0).setHardness(10F).setResistance(0.2F).setBlockName("SiliconOre").setCreativeTab(CreativeTabs.tabBlock);
		leadOre = new BlockOre(leadOreID, 1).setHardness(10F).setResistance(0.2F).setBlockName("LeadOre").setCreativeTab(CreativeTabs.tabBlock);
		titaniumOre = new BlockOre(titaniumOreID, 2).setHardness(10F).setResistance(0.2F).setBlockName("TitaniumOre").setCreativeTab(CreativeTabs.tabBlock);
		leadBlock = new BlockMetal(leadBlockID, 4).setHardness(12F).setResistance(10F).setBlockName("LeadBlock").setCreativeTab(CreativeTabs.tabBlock);
		titaniumBlock = new BlockMetal(titaniumBlockID, 3).setHardness(12F).setResistance(10F).setBlockName("TitaniumBlock").setCreativeTab(CreativeTabs.tabBlock);
		copperOre = new BlockOre(copperOreID, 6).setHardness(10F).setResistance(0.2F).setBlockName("CopperOre").setCreativeTab(CreativeTabs.tabBlock);
		siliconBlock = new BlockMetal(siliconBlockID, 5).setHardness(12F).setResistance(10F).setBlockName("SiliconBlock").setCreativeTab(CreativeTabs.tabBlock);
		ironGirder = new BlockIronGirder(ironGirderID, 0, Material.iron).setBlockName("Iron Girder").setHardness(2F).setStepSound(Block.soundMetalFootstep);
		
		//Item Loading
		leadIngot = new ItemIngot(leadIngotID, 1).setCreativeTab(CreativeTabs.tabMaterials).setItemName("LeadIngot");
		titaniumIngot = new ItemIngot(titaniumIngotID, 0).setCreativeTab(CreativeTabs.tabMaterials).setItemName("TitaniumIngot");
		copperIngot = new ItemIngot(copperIngotID, 3).setCreativeTab(CreativeTabs.tabMaterials).setItemName("CopperIngot");
		siliconIngot = new ItemIngot(siliconIngotID, 2).setCreativeTab(CreativeTabs.tabMaterials).setItemName("Silicon Ingot");
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();
		smeltingRecipes();
		
		GameRegistry.registerWorldGenerator(new WorldGenOres());
	}
	
	private static void smeltingRecipes(){
		GameRegistry.addSmelting(leadOreID, new ItemStack(leadIngot, 1), 0.6F);
		GameRegistry.addSmelting(titaniumOreID, new ItemStack(titaniumIngot, 1), 0.75F);
		GameRegistry.addSmelting(siliconOreID, new ItemStack(siliconIngot, 1), 0.5F);
	}
	
	private static void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(leadBlock, 1), new Object[]{
			"LLL",
			"LLL",
			"LLL",
			'L', leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(titaniumBlock, 1), new Object[]{
			"TTT",
			"TTT",
			"TTT",
			'T', titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(siliconBlock, 1), new Object[]{
			"SSS",
			"SSS",
			"SSS",
			'S', siliconIngot
		});
		GameRegistry.addRecipe(new ItemStack(ironGirder, 4), new Object[]{
			"III", " I ", "III", 'I', Item.ingotIron,
		});
	}
	
	private static void gameRegisters(){
		//Block Registry
		GameRegistry.registerBlock(siliconOre, "SiliconOre");
		GameRegistry.registerBlock(leadOre, "LeadOre");
		GameRegistry.registerBlock(titaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(leadBlock, "LeadBlock");
		GameRegistry.registerBlock(titaniumBlock, "TitaniumBlock");
		GameRegistry.registerBlock(copperOre, "CopperOre");
		GameRegistry.registerBlock(siliconBlock, "SiliconBlock");
		GameRegistry.registerBlock(ironGirder, "IronGirder");
		
		//Item Registry
		GameRegistry.registerItem(leadIngot, "LeadIngot");
		GameRegistry.registerItem(titaniumIngot, "TitaniumIngot");
		GameRegistry.registerItem(copperIngot, "CopperIngot");
		GameRegistry.registerItem(siliconIngot, "SiliconIngot");
	}
	
	private static void languageRegisters(){
		//Block LanguageRegistry
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
		LanguageRegistry.addName(leadOre, "Lead Ore");
		LanguageRegistry.addName(titaniumOre, "Titanium Ore");
		LanguageRegistry.addName(leadBlock, "Lead Block");
		LanguageRegistry.addName(titaniumBlock, "Titanium Block");
		LanguageRegistry.addName(copperOre, "Copper Ore");
		LanguageRegistry.addName(siliconBlock, "Silicon Block");
		LanguageRegistry.addName(ironGirder, "Iron Girder");
		
		//Item LanguageRegistry
		LanguageRegistry.addName(leadIngot, "Lead Ingot");
		LanguageRegistry.addName(titaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(copperIngot, "Copper Ingot");
		LanguageRegistry.addName(siliconIngot, "Silicon Ingot");
	}
}
