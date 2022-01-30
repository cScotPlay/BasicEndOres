package com.cscot.basicendores;

import com.cscot.basicendores.data.worldgen.ModOreConfiguredFeatures;
import com.cscot.basicendores.data.worldgen.ModOrePlacedFeature;
import com.cscot.basicendores.util.helpers.BlockListHelper;
import com.cscot.basicendores.util.itemgroups.BEOItemGroup;
import com.cscot.basicendores.util.handler.ConfigHandler;
import com.cscot.basicendores.world.OreGenerator;
import com.cscot.basicendores.world.item.ModBlockItems;
import com.cscot.basicendores.world.item.ModItems;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("beo")
public class BasicEndOres
{
    public static BasicEndOres instance;
    public static final String MODID = "beo";

    public static final CreativeModeTab beoItemGroup = new BEOItemGroup();

    public static final Logger LOGGER = LogManager.getLogger(MODID);


    public BasicEndOres()
    {
        instance = this;

        final IEventBus FML = FMLJavaModLoadingContext.get().getModEventBus();
        final IEventBus MTA = MinecraftForge.EVENT_BUS;

        FML.addListener(this::setup);
        //MTA.addListener(this::clientRegistries);

        // Registers and Loads Config File
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("beo-common.toml"));

        // Register ourselves for server and other game events we are interested in
        MTA.register(this);

        ModItems.ITEMS.register(FML);
        ModBlockItems.ITEMS.register(FML);
        ModBlocks.BLOCKS.register(FML);

        MTA.register(OreGenerator.class);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,
                () -> () -> BasicEndOresClient.clientSetup(FML, MTA));
    }

    //This used to be the PreInit
    private void setup(FMLCommonSetupEvent event)
    {
        ModOreConfiguredFeatures.initModFeatures();
        ModOrePlacedFeature.initOrePlacedFeatures();
        ProtectedListInit();
    }

    public static void ProtectedListInit()
    {
        //Loads the list of protected blocks
        BlockListHelper.initProtectedBlocks();
    }
}
