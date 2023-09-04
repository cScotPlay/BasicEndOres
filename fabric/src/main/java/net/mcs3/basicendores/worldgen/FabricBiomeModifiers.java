package net.mcs3.basicendores.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.mcs3.basicendores.config.BasicEndOresConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.mcs3.basicendores.util.helper.ResourceLocationHelper.prefix;

public class FabricBiomeModifiers {

    public void biomeModificationHelper() {

        var modifications = BiomeModifications.create(prefix("biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();

            if (biome.is(BiomeTags.IS_END)) {
                if(BasicEndOresConfig.common().emeraldGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_emerald_end"));
                }
                if(BasicEndOresConfig.common().diamondGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_diamond_end"));
                }
                if(BasicEndOresConfig.common().goldGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_gold_end"));
                }
                if(BasicEndOresConfig.common().redstoneGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_redstone_end"));
                }
                if(BasicEndOresConfig.common().lapisGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lapis_end"));
                }
                if(BasicEndOresConfig.common().coalGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_coal_end"));
                }
                if (BasicEndOresConfig.common().silverGeneration()){
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_silver_end"));
                }
                if(BasicEndOresConfig.common().ironGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_iron_end"));
                }
                if(BasicEndOresConfig.common().leadGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_lead_end"));
                }
                if(BasicEndOresConfig.common().nickelGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_nickel_end"));
                }
                if(BasicEndOresConfig.common().copperGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_copper_end"));
                }
                if(BasicEndOresConfig.common().aluminumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_aluminum_end"));
                }
                if(BasicEndOresConfig.common().tinGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_tin_end"));
                }
                if(BasicEndOresConfig.common().osmiumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_osmium_end"));
                }
                if(BasicEndOresConfig.common().uraniumGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_uranium_end"));
                }
                if(BasicEndOresConfig.common().zincGeneration()) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ore_zinc_end"));
                }
            }
        });
    }

    private ResourceKey<PlacedFeature> getPlacedFeatureKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, prefix(key));
    }
}
