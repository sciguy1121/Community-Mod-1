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

	@SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod",
				serverSide = "communityMod.common.CommonProxyCommunityMod")
	public static ClientProxyCommunityMod proxy = new ClientProxyCommunityMod();
	
	public static int siliconOreID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		siliconOreID = config.get("BlockIDs", "Silicon Ore ID", 700).getInt();
		
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();
		
		siliconOre = new BlockOre(siliconOreID, 0).setHardness(10F).setResistance(.2F).setBlockName("SiliconOre").setCreativeTab(CreativeTabs.tabBlock);
		
		gameRegisters();
		languageRegisters();
		craftingRecipes();
	}
	
	private static void craftingRecipes(){
		
	}
	
	private static void gameRegisters(){
		GameRegistry.registerBlock(siliconOre, "SiliconOre");
	}
	
	private static void languageRegisters(){
		LanguageRegistry.addName(siliconOre, "Silicon Ore");
	}
}
