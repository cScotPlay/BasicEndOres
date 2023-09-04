package net.mcs3.basicendores;

import net.mcs3.basicendores.config.ForgeBasicEndOresConfig;
import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.mcs3.basicendores.worldgen.item.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Mod(Constants.MOD_ID)
public class ForgeBasicEndOres {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registries.CONFIGURED_FEATURE, Constants.MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registries.PLACED_FEATURE, Constants.MOD_ID);


    public static final RegistryObject<CreativeModeTab> BEO_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> ModCreativeModeTabs.BEO_TAB);
    
    public ForgeBasicEndOres() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registryInit();
        CREATIVE_MODE_TABS.register(modEventBus);
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
//        Constants.LOGGER.info("Hello Forge world!");
        ForgeBasicEndOresConfig.setup();
        CommonClass.init();
        PLACED_FEATURES.register(modEventBus);

    }

    private void registryInit() {
        bind(Registries.BLOCK, BEOBlocks::registerBlocks);
        bind(Registries.ITEM, BEOBlocks::registerItemBlocks);
        bind(Registries.ITEM, BEOItems::registerItems);

    }

    private static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener((RegisterEvent event) -> {
            if (registry.equals(event.getRegistryKey())) {
                source.accept((t, rl) -> event.register(registry, rl, () -> t));
            }
        });
    }
}