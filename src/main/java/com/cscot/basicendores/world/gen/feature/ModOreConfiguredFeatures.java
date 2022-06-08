package com.cscot.basicendores.world.gen.feature;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.OreBlockLists;
import com.cscot.basicendores.api.OreFeatureLists;
import com.cscot.basicendores.config.ModConfig;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModOreConfiguredFeatures
{
    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_EMERALD_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.EMERALD_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_EMERALD_ORE.getDefaultState(),
                    ModConfig.emeraldVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_DIAMOND_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.DIAMOND_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_DIAMOND_ORE.getDefaultState(),
                    ModConfig.diamondVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_REDSTONE_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.REDSTONE_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_REDSTONE_ORE.getDefaultState(),
                    ModConfig.redstoneVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_LAPIS_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.LAPIS_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_LAPIS_ORE.getDefaultState(),
                    ModConfig.lapisVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_COAL_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.COAL_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_COAL_ORE.getDefaultState(),
                    ModConfig.coalVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_SILVER_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.SILVER_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_SILVER_ORE.getDefaultState(),
                    ModConfig.silverVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_GOLD_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.GOLD_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_GOLD_ORE.getDefaultState(),
                    ModConfig.goldVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_IRON_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.IRON_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_IRON_ORE.getDefaultState(),
                    ModConfig.ironVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_LEAD_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.LEAD_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_LEAD_ORE.getDefaultState(),
                    ModConfig.leadVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_NICKEL_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.NICKEL_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_NICKEL_ORE.getDefaultState(),
                    ModConfig.nickelVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_COPPER_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.COPPER_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_COPPER_ORE.getDefaultState(),
                    ModConfig.copperVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_ALUMINUM_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.ALUMINUM_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_ALUMINUM_ORE.getDefaultState(),
                    ModConfig.aluminumVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_TIN_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.TIN_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_TIN_ORE.getDefaultState(),
                    ModConfig.tinVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_OSMIUM_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.OSMIUM_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_OSMIUM_ORE.getDefaultState(),
                    ModConfig.osmiumVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_URANIUM_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.URANIUM_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_URANIUM_ORE.getDefaultState(),
                    ModConfig.uraniumVeinSize));

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_ZINC_CONFIGURED_FEATURE = ConfiguredFeatures.register(OreFeatureLists.ZINC_ORE_FEATURE_ID, Feature.ORE,
            new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_ZINC_ORE.getDefaultState(),
                    ModConfig.zincVeinSize));

    public static final class Rules {
        public static final RuleTest BASE_STONE_END;

        static {
            BASE_STONE_END = new BlockMatchRuleTest(Blocks.END_STONE);
        }
    }
}
