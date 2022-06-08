package com.cscot.basicendores.data.worldgen;

import com.cscot.basicendores.api.OreFeatureList;
import com.cscot.basicendores.config.OreGenerationConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacedFeature
{
    public static final Holder<PlacedFeature> ORE_EMERALD_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.EMERALD_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_EMERALD_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.emeraldPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.emeraldMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.emeraldMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_DIAMOND_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.DIAMOND_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_DIAMOND_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.diamondPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.diamondMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.diamondMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_REDSTONE_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.REDSTONE_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_REDSTONE_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.redstonePerChunk.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.redstoneMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.redstoneMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_LAPIS_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.LAPIS_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_LAPIS_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.lapisPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.lapisMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.lapisMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_COAL_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.COAL_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_COAL_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.coalPerChunk.get(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.coalMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.coalMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_SILVER_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.SILVER_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_SILVER_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.silverPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.silverMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.silverMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_GOLD_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.GOLD_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_GOLD_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.goldPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.goldMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.goldMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_IRON_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.IRON_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_IRON_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.ironPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.ironMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.ironMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_LEAD_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.LEAD_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_LEAD_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.leadPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.leadMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.leadMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_NICKEL_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.NICKEL_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_NICKEL_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.nickelPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.nickelMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.nickelMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_COPPER_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.COPPER_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_COPPER_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.copperPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.copperMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.copperMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_ALUMINUM_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.ALUMINUM_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_ALUMINUM_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.aluminumPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.aluminumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.aluminumMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_TIN_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.TIN_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_TIN_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.tinPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.tinMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.tinMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_OSMIUM_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.OSMIUM_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_OSMIUM_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.osmiumPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.osmiumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.osmiumMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_URANIUM_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.URANIUM_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_URANIUM_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.uraniumPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.uraniumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.uraniumMaxHeight.get()))));

    public static final Holder<PlacedFeature> ORE_ZINC_PLACED_FEATURE = PlacementUtils.register(OreFeatureList.ZINC_ORE_FEATURE_ID, ModOreConfiguredFeatures.ORE_ZINC_CONFIGURED_FEATURE,
            commonOrePlacement(OreGenerationConfig.zincPerChunk.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.zincMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.zincMaxHeight.get()))));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
