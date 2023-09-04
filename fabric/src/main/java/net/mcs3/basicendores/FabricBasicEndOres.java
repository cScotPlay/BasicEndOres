package net.mcs3.basicendores;

import net.fabricmc.api.ModInitializer;
import net.mcs3.basicendores.config.FabricBasicEndOresConfig;
import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.mcs3.basicendores.util.helper.GuardOreBlocks;
import net.mcs3.basicendores.worldgen.FabricBiomeModifiers;
import net.mcs3.basicendores.worldgen.item.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.function.BiConsumer;

public class FabricBasicEndOres implements ModInitializer {
    public static FabricBasicEndOres INSTANCE;

    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        INSTANCE = this;
        Constants.LOGGER.info("Loading Basic End Ores");

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModCreativeModeTabs.BEO_TAB_KEY, ModCreativeModeTabs.BEO_TAB);

        FabricBasicEndOresConfig.setup();

        BEOBlocks.registerBlocks(bind(BuiltInRegistries.BLOCK));
        BEOBlocks.registerItemBlocks(bind(BuiltInRegistries.ITEM));
        BEOItems.registerItems(registerItemAndPutInTab);

        CommonClass.init();

        new FabricBiomeModifiers().biomeModificationHelper();

    }

    private static <T> BiConsumer<T, ResourceLocation> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }

    private static final BiConsumer<Item, ResourceLocation> registerItemAndPutInTab = (item, id) -> {
        Registry.register(BuiltInRegistries.ITEM, id, item);
    };
}
