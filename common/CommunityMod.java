package mods.communityMod.common;

import mods.communityMod.client.ClientProxyCommunityMod;
import mods.communityMod.common.blocks.BlockConcrete;
import mods.communityMod.common.blocks.BlockIronGirder;
import mods.communityMod.common.blocks.BlockMetal;
import mods.communityMod.common.blocks.BlockOre;
import mods.communityMod.common.blocks.BlocksHelper;
import mods.communityMod.common.entities.EntityRobot;
import mods.communityMod.common.entities.tile.TileEntityLavaFurnace;
import mods.communityMod.common.entities.tile.TileEntityLogger;
import mods.communityMod.common.entities.tile.TileEntityResearcher;
import mods.communityMod.common.gui.GuiHandler;
import mods.communityMod.common.items.ItemCoal;
import mods.communityMod.common.items.ItemIngot;
import mods.communityMod.common.items.ItemsHelper;
import mods.communityMod.common.research.ResearchHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.Configuration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Community_Mod", name = "Community_Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = CommonPacketHandler.class, channels = {"CommunityMod"})

public class CommunityMod {
	@SidedProxy(clientSide = "mods.communityMod.client.ClientProxyCommunityMod", serverSide = "mods.communityMod.common.CommonProxyCommunityMod")
	public static CommonProxyCommunityMod proxy;
	
	static int startEntityId = 300;
	
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
        proxy.init();
		BlocksHelper.setupBlocks();
        ItemsHelper.setupItems();
        
		craftingRecipes();
		smeltingRecipes();
        
		GameRegistry.registerWorldGenerator(new WorldGenOres());
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		NetworkRegistry.instance().registerGuiHandler(instance, guihandler);
		
		GameRegistry.registerTileEntity(TileEntityLavaFurnace.class, "GeothermalOven");
		GameRegistry.registerTileEntity(TileEntityResearcher.class, "Researcher");
		GameRegistry.registerTileEntity(TileEntityLogger.class, "Logger");
		
		ResearchHandler.instance().setResearchValue(ItemsHelper.siliconIngot.itemID, true);
		ResearchHandler.instance().initResearchHandler();
		
		EntityRegistry.registerModEntity(EntityRobot.class, "Robot", 1, this, 80, 3, true);
        
		LanguageRegistry.instance().addStringLocalization("entity.Community_Mod.Robot.name", "Robot");
        
		registerEntityEgg(EntityRobot.class, 0x000000, 0x4A4849);
	}
    
	public static int getUniqueEntityId()
	{
		do
		{
			startEntityId++;
		}
		while(EntityList.getStringFromID(startEntityId) != null);
        
		return startEntityId;
	}
	
	public static void registerEntityEgg(Class <? extends Entity> entity, int primaryColor, int secondaryColor){
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
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
}
