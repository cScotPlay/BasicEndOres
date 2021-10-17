package com.cscot.basicendores;


import com.cscot.basicendores.lists.IngotList;
import com.cscot.basicendores.util.itemgroups.BEOItemGroup;
import com.cscot.basicendores.util.handler.ConfigHandler;
import com.cscot.basicendores.util.handler.RegisteryHandler;
import com.cscot.basicendores.world.gen.feature.ModOreFeatures;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("beo")
public class BasicEndOres
{
    public static BasicEndOres instance;
    public static final String modid = "beo";

    public static final ItemGroup beoItemGroup = new BEOItemGroup();

    private static final Logger LOGGER = LogManager.getLogger(modid);


    public BasicEndOres()
    {
        instance = this;

        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the clientRegistries method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        new IngotList();

        // Registers and Loads Config File
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("beo-common.toml"));

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final Logger logger = LogManager.getLogger();

    //This used to be the PreInit
    private void setup(FMLCommonSetupEvent event)
    {
        ModOreFeatures.initModFeatures();
        RegisteryHandler.ProtectedListInit();

        LOGGER.info("Setup Method Registered (PreInit)");
    }

    //This is something that can only be done on the client
    private void clientRegistries(FMLClientSetupEvent event)
    {
        LOGGER.info("Client Registries Method Registered (Client Side)");
    }

    // Registration helper
    public static <T extends IForgeRegistryEntry<T>> T register(IForgeRegistry<T> registry, T entry, String registryKey)
    {
        entry.setRegistryName(new ResourceLocation(modid, registryKey));
        registry.register(entry);
        return entry;
    }
}
