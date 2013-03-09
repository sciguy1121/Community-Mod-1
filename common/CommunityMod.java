package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import communityMod.client.ClientProxyCommunityMod;
import communityMod.common.blocks.BlockConcrete;
import communityMod.common.blocks.BlockIronGirder;
import communityMod.common.blocks.BlockMetal;
import communityMod.common.blocks.BlockOre;
import communityMod.common.blocks.BlocksHelper;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.common.entities.tile.TileEntityResearcher;
import communityMod.common.gui.GuiHandler;
import communityMod.common.items.ItemCoal;
import communityMod.common.items.ItemIngot;
import communityMod.common.items.ItemsHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Community_Mod", name = "Community_Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CommunityMod {

	@SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod",
				serverSide = "communityMod.common.CommonProxyCommunityMod")
	public static ClientProxyCommunityMod proxy = new ClientProxyCommunityMod();
	
	@Instance
	public static CommunityMod instance = new CommunityMod();
	
	public static GuiHandler guihandler = new GuiHandler();

	public static CreativeTabs modTab = new CreativeTab(CreativeTabs.getNextID(),"CommunityMod");
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		IDsHelper.runConfiguration(config);

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
		
		NetworkRegistry.instance().registerGuiHandler(instance, guihandler);
		
		GameRegistry.registerTileEntity(TileEntityLavaFurnace.class, "GeothermalOven");
		GameRegistry.registerTileEntity(TileEntityResearcher.class, "Researcher");
	}

	private static void smeltingRecipes(){
		GameRegistry.addSmelting(IDsHelper.leadOreID, new ItemStack(ItemsHelper.leadIngot, 1), 0.6F);
		GameRegistry.addSmelting(IDsHelper.titaniumOreID, new ItemStack(ItemsHelper.titaniumIngot, 1), 0.75F);
		GameRegistry.addSmelting(IDsHelper.siliconOreID, new ItemStack(ItemsHelper.siliconIngot, 1), 0.5F);
		GameRegistry.addSmelting(IDsHelper.copperOreID, new ItemStack(ItemsHelper.copperIngot, 1), 0.5F);
		GameRegistry.addSmelting(IDsHelper.platinumOreID, new ItemStack(ItemsHelper.platinumIngot, 1), 0.5F);
		GameRegistry.addSmelting(IDsHelper.tungstenOreID, new ItemStack(ItemsHelper.tungstenIngot, 1), 0.5F);
		GameRegistry.addSmelting(IDsHelper.arsmiumOreID, new ItemStack(ItemsHelper.arsmiumIngot, 1), 0.5F);
		GameRegistry.addSmelting(IDsHelper.urdiumOreID, new ItemStack(ItemsHelper.urdiumIngot, 1), 0.5F);
        	GameRegistry.addSmelting(IDsHelper.franciumOreID, new ItemStack(ItemsHelper.franciumIngot, 1), 0.5F);
	}

	private static void craftingRecipes(){
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.leadBlock, 1), new Object[]{
			"LLL", "LLL", "LLL", 'L', ItemsHelper.leadIngot
		});
		
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.titaniumBlock, 1), new Object[]{
			"TTT", "TTT", "TTT", 'T', ItemsHelper.titaniumIngot
		});
		
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.siliconBlock, 1), new Object[]{
			"SSS", "SSS", "SSS", 'S', ItemsHelper.siliconIngot
		});
		
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.ironGirder, 4), new Object[]{
			"III", " I ", "III", 'I', Item.ingotIron,
		});
		
        	GameRegistry.addRecipe(new ItemStack(BlocksHelper.franciumBlock, 1), new Object[]{
			"FFF", "FFF", "FFF", 'F', ItemsHelper.franciumIngot
		});
        
        GameRegistry.addRecipe(new ItemStack(BlocksHelper.concrete, 4), new Object[]{
        "GSG", "SWS", "GSG", 'G', Block.gravel, 'S', Block.sand, 'W', Item.bucketWater
       	});
        
        GameRegistry.addRecipe(new ItemStack(BlocksHelper.concrete, 4), new Object[]{
        "SGS", "GWG", "SGS", 'G', Block.gravel, 'S', Block.sand, 'W', Item.bucketWater
        });
        
        GameRegistry.addRecipe(new ItemStack(BlocksHelper.geothermalOven, 1), new Object[]{
        "SSS", "S S", "XXX", 'S', Block.cobblestone, 'X', Item.ingotIron
       	});
        	
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.rasberryPie, 1),
        new ItemStack(Item.sugar), new ItemStack(Item.egg), new ItemStack(ItemsHelper.rasberry));
	}
	GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconWafer, 8), new Object[]{
       	"SSS", "SNS", "SSS", 'S', ItemsHelper.siliconIngot
       	});
       	GameRegistry.addRecipe(new ItemStack(BlocksHelper.siliconChip, 4), new Object[]{
       	"SIS", "IWI", "SIS", 'S', ItemsHelper.siliconIngot, 'I', ItemsHelper.siliconWafer, 'W', Item.bucketWater
       	});
}
