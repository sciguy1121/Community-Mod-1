package communityMod.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;

import communityMod.client.gui.GuiHandler;
import communityMod.common.blocks.BlocksHelper;
import communityMod.common.entities.EntityRobot;
import communityMod.common.entities.EntityScientist;
import communityMod.common.entities.tile.TileEntityLavaFurnace;
import communityMod.common.entities.tile.TileEntityLogger;
import communityMod.common.entities.tile.TileEntityResearcher;
import communityMod.common.items.ItemsHelper;
import communityMod.common.research.ResearchHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//import communityMod.common.entities.EntityScientist;

@Mod(modid = Reference.modid, name = "Technicraft", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class CommunityMod {

    @SidedProxy(clientSide = "communityMod.client.ClientProxyCommunityMod", serverSide = "communityMod.common.CommonProxyCommunityMod")
    public static CommonProxyCommunityMod proxy;

    static int startEntityId = 300;

    @Instance(Reference.modid)
    public static CommunityMod instance = new CommunityMod();

    public static GuiHandler guihandler = new GuiHandler();

    public static CreativeTabs modTab = new CreativeTab(CreativeTabs.getNextID(), "Technicraft");
    
    public static LiquidStack concreteLiquid;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        IDsHelper.runConfiguration(config);

        config.save();
        TextureAnimationConverter.convertTxtToPngMCMeta();
        BlocksHelper.setupBlocks();
        ItemsHelper.setupItems();
        proxy.init();
        LocaleHelper.loadLanguages();

        craftingRecipes();
        smeltingRecipes();

        GameRegistry.registerWorldGenerator(new WorldGenStructures());
        GameRegistry.registerWorldGenerator(new WorldGenOres());
        GameRegistry.registerFuelHandler(new FuelHandler());
        
        NetworkRegistry.instance().registerGuiHandler(instance, guihandler);

        GameRegistry.registerTileEntity(TileEntityLavaFurnace.class, "GeothermalOven");
        GameRegistry.registerTileEntity(TileEntityResearcher.class, "Researcher");
        GameRegistry.registerTileEntity(TileEntityLogger.class, "Logger");

        ResearchHandler.instance().setResearchValue(ItemsHelper.siliconIngot.itemID, true);
        ResearchHandler.instance().initResearchHandler();

        EntityRegistry.registerModEntity(EntityRobot.class, "Robot", 1, this, 80, 3, true);
        EntityRegistry.registerModEntity(EntityScientist.class, "Scientist", 2, this, 80, 3, true);

        registerEntityEgg(EntityRobot.class, 0x4A4849, 0x000000);
        registerEntityEgg(EntityScientist.class, 0xfff, 0x9c37bc);

        MinecraftForge.EVENT_BUS.register(new ConcreteBucketHandler());
        
        concreteLiquid = LiquidDictionary.getOrCreateLiquid("Concrete",  new LiquidStack(BlocksHelper.liquidConcreteStill,
                LiquidContainerRegistry.BUCKET_VOLUME));

        LiquidContainerRegistry.registerLiquid(new LiquidContainerData(LiquidDictionary.getLiquid("Concrete", LiquidContainerRegistry.BUCKET_VOLUME),
                new ItemStack(ItemsHelper.bucketConcrete), new ItemStack(Item.bucketEmpty)));
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        
    }

    public static int getUniqueEntityId() {
        do {
            startEntityId++;
        } while (EntityList.getStringFromID(startEntityId) != null);

        return startEntityId;
    }

    @SuppressWarnings("unchecked")
	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }

    private static void smeltingRecipes() {
        GameRegistry.addSmelting(IDsHelper.leadOreID, new ItemStack(ItemsHelper.leadIngot, 1), 0.6F);
        GameRegistry.addSmelting(IDsHelper.titaniumOreID, new ItemStack(ItemsHelper.titaniumIngot, 1), 0.75F);
        GameRegistry.addSmelting(IDsHelper.siliconOreID, new ItemStack(ItemsHelper.siliconIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.copperOreID, new ItemStack(ItemsHelper.copperIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.platinumOreID, new ItemStack(ItemsHelper.platinumIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.tungstenOreID, new ItemStack(ItemsHelper.tungstenIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.arsmiumOreID, new ItemStack(ItemsHelper.arsmiumIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.urdiumOreID, new ItemStack(ItemsHelper.urdiumIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.franciumOreID, new ItemStack(ItemsHelper.franciumIngot, 1), 0.5F);
        GameRegistry.addSmelting(IDsHelper.uraniumOreID, new ItemStack(ItemsHelper.uraniumChunk, 2), 0.5F);
    }

    private static void craftingRecipes() {
        GameRegistry.addRecipe(new ItemStack(BlocksHelper.leadBlock, 1), new Object[] { "LLL", "LLL", "LLL", 'L',
            ItemsHelper.leadIngot });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.titaniumBlock, 1), new Object[] { "TTT", "TTT", "TTT", 'T',
            ItemsHelper.titaniumIngot });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.ironGirder, 4), new Object[] { "III", " I ", "III", 'I',
            Item.ingotIron, });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.franciumBlock, 1), new Object[] { "FFF", "FFF", "FFF", 'F',
            ItemsHelper.franciumIngot });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.concrete, 4), new Object[] { "GSG", "SWS", "GSG", 'G',
            Block.gravel, 'S', Block.sand, 'W', Item.bucketWater });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.concrete, 4), new Object[] { "SGS", "GWG", "SGS", 'G',
            Block.gravel, 'S', Block.sand, 'W', Item.bucketWater });

        GameRegistry.addRecipe(new ItemStack(BlocksHelper.geothermalOven, 1), new Object[] { "SSS", "S S", "XXX", 'S',
            Block.cobblestone, 'X', Item.ingotIron });

        GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.raspberryPie, 1), new ItemStack(Item.sugar),
                                        new ItemStack(Item.egg), new ItemStack(ItemsHelper.raspberry));

        GameRegistry.addRecipe(new ItemStack(ItemsHelper.robotModel, 1), new Object[] { "WIW", "SCS", "ISI", 'S',
            BlocksHelper.siliconBlock, 'I', ItemsHelper.siliconIngot, 'W', ItemsHelper.siliconWafer, 'C',
            ItemsHelper.siliconChip });

        GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconWafer, 8), new Object[] { "SAS", "ABA", "SAS", 'S',
            ItemsHelper.siliconIngot, 'A', Block.sand, 'B', Item.bucketWater });

        GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconWafer, 8), new Object[] { "ASA", "SBS", "ASA", 'S',
            ItemsHelper.siliconIngot, 'A', Block.sand, 'B', Item.bucketWater });

        GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconChip, 4), new Object[] { "SWS", "WSW", "SWS", 'S',
            ItemsHelper.siliconIngot, 'W', ItemsHelper.siliconWafer });

        GameRegistry.addRecipe(new ItemStack(ItemsHelper.siliconChip, 4), new Object[] { "WSW", "SWS", "WSW", 'S',
            ItemsHelper.siliconIngot, 'W', ItemsHelper.siliconWafer });
    }
}