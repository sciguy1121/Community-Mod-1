package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
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
	
	public static Block siliconOre;
    public static Block titaniumOre;
    public static Block leadOre;
    public static Block titaniumBlock;
    public static Block leadBlock;

	@SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod",
				serverSide = "communityMod.common.CommonProxyCommunityMod")
	public static ClientProxyCommunityMod proxy = new ClientProxyCommunityMod();
	
	public static int siliconOreID;
    public static int titaniumOreID;
    public static int leadOreID;
    public static int titaniumBlockID;
    public static int leadBlockID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		siliconOreID = config.get("BlockIDs", "Silicon Ore ID", 700).getInt();
        titaniumOreID = config.get("BlockIDs", "Titanium Ore ID", 701).getInt();
        leadOreID = config.get("BlockIDs", "Lead Ore ID", 702).getInt();
        titaniumBlockID = config.get("BlockIDs", "Titanium BLock ID", 703).getInt();
        leadBlockID = config.get("BlockIDs", "Lead Block ID", 704).getInt();
        
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();
		
		siliconOre = new BlockOre(siliconOreID, 0).setHardness(10F).setResistance(.2F).setBlockName("SiliconOre").setCreativeTab(CreativeTabs.tabBlock);
        titaniumOre = new TitaniumOre(titaniumOreID, 1).setHardness(10F).setResistance(.2F).setBlockName("TitaniumOre").setCreativeTab(CreativeTabs.tabBlock);
        leadOre = new LeadOre(leadOreID, 2).setHardness(10F).setResistance(.
            2F).setBlockName("LeadOre").setCreativeTab(CreativeTabs.tabBlock);
        titaniumBlock = new TitaniumBlock(titaniumBlockID, 1).setHardness(10F).setResistance(.2F).setBlockName("TitaniumBlock").setCreativeTab(CreativeTabs.tabBlock);
        leadBlock = new LeadBlock(leadBlockID, 2).setHardness(10F).setResistance(.
            2F).setBlockName("LeadBlock").setCreativeTab(CreativeTabs.tabBlock);
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();
	}
	
	private static void craftingRecipes(){
		
	}
	
	private static void gameRegisters(){
		GameRegistry.registerBlock(siliconOre, "Silicon Ore");
        GameRegistry.registerBlock(titaniumOre, "Titanium Ore");
        GameRegistry.registerBlock(leadOre, "Lead Ore");
        GameRegistry.registerBlock(titaniumOre, "Titanium Block");
        GameRegistry.registerBlock(leadOre, "Lead Block");
	}
	
	private static void languageRegisters(){
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
        LanguageRegistry.addName(titaniumOre, "Titanium Ore");
        LanguageRegistry.addName(leadOre, "Lead Ore");
        LanguageRegistry.addName(titaniumOre, "Titanium Block");
        LanguageRegistry.addName(leadOre, "Lead Block");
	}
}
