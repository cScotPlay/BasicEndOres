package net.mcs3.basicendores.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mcs3.basicendores.Constants;
import net.mcs3.basicendores.data.loottables.LootTableGenerator;
import net.mcs3.basicendores.data.models.BlockStateGenerator;
import net.mcs3.basicendores.data.recipes.CraftingRecipeBuilder;
import net.mcs3.basicendores.data.tags.FabricBlockTagGenerator;
import net.mcs3.basicendores.data.tags.FabricItemTagGenerator;
import net.mcs3.basicendores.data.tags.VanillaBlockTagGenerator;
import net.mcs3.basicendores.data.tags.VanillaItemTagGenerator;
import net.mcs3.basicendores.data.worldgen.FabricWorldDataGenerator;
import net.mcs3.basicendores.init.BEOConfiguredFeatures;
import net.mcs3.basicendores.init.BEOPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;


public class FabricDataGenerators implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        if (System.getProperty("beo.common_datagen") != null) {
            configureCommonDatagen(generator.createPack());
        } else {
            configureFabricDatagen(generator.createPack());
        }
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        if (System.getProperty("beo.common_datagen") != null) {

        } else {
            registryBuilder.add(Registries.CONFIGURED_FEATURE, BEOConfiguredFeatures::bootstrap);
            registryBuilder.add(Registries.PLACED_FEATURE, BEOPlacedFeatures::bootstrap);

        }
        DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
    }

    private static void configureFabricDatagen(FabricDataGenerator.Pack pack) {
        Constants.LOGGER.info("Fabric Data Gen");

        var blockTagGenerator = pack.addProvider(FabricBlockTagGenerator::new);
        pack.addProvider(((output, registriesFuture) -> new FabricItemTagGenerator(output, registriesFuture, blockTagGenerator.contentsGetter())));

        pack.addProvider(FabricWorldDataGenerator::new);
    }

    private static void configureCommonDatagen(FabricDataGenerator.Pack pack) {

        Constants.LOGGER.info("Common Data Gen");
        VanillaBlockTagGenerator blockTagProvider = pack.addProvider(VanillaBlockTagGenerator::new);
        pack.addProvider((output, registriesFuture) -> new VanillaItemTagGenerator(output, registriesFuture, blockTagProvider.contentsGetter()));

        pack.addProvider(BlockStateGenerator::new);
        pack.addProvider(LootTableGenerator::new);
        pack.addProvider(CraftingRecipeBuilder::new);
    }
}
