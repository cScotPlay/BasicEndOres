package net.mcs3.basicendores.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import static net.mcs3.basicendores.util.helper.ResourceLocationHelper.prefix;

public class BEOConfiguredFeatures {

    private static final RuleTest END_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_EMERALD_CONFIGURED_FEATURE = registerKey("ore_emerald_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_CONFIGURED_FEATURE = registerKey("ore_diamond_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_GOLD_CONFIGURED_FEATURE = registerKey("ore_gold_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_REDSTONE_CONFIGURED_FEATURE = registerKey("ore_redstone_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LAPIS_CONFIGURED_FEATURE = registerKey("ore_lapis_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COAL_CONFIGURED_FEATURE = registerKey("ore_coal_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SILVER_CONFIGURED_FEATURE = registerKey("ore_silver_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_IRON_CONFIGURED_FEATURE = registerKey("ore_iron_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LEAD_CONFIGURED_FEATURE = registerKey("ore_lead_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_NICKEL_CONFIGURED_FEATURE = registerKey("ore_nickel_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COPPER_CONFIGURED_FEATURE = registerKey("ore_copper_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALUMINUM_CONFIGURED_FEATURE = registerKey("ore_aluminum_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN_CONFIGURED_FEATURE = registerKey("ore_tin_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_OSMIUM_CONFIGURED_FEATURE = registerKey("ore_osmium_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_URANIUM_CONFIGURED_FEATURE = registerKey("ore_uranium_end");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ZINC_CONFIGURED_FEATURE = registerKey("ore_zinc_end");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ORE_EMERALD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_EMERALD_ORE.defaultBlockState(), 4));
        register(context, ORE_DIAMOND_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_DIAMOND_ORE.defaultBlockState(), 8));
        register(context, ORE_GOLD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_GOLD_ORE.defaultBlockState(), 9));
        register(context, ORE_REDSTONE_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_REDSTONE_ORE.defaultBlockState(), 8));
        register(context, ORE_LAPIS_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_LAPIS_ORE.defaultBlockState(), 7));
        register(context, ORE_COAL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_COAL_ORE.defaultBlockState(), 17));
        register(context, ORE_SILVER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_SILVER_ORE.defaultBlockState(), 9));
        register(context, ORE_IRON_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_IRON_ORE.defaultBlockState(), 8));
        register(context, ORE_LEAD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_LEAD_ORE.defaultBlockState(), 8));
        register(context, ORE_NICKEL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_NICKEL_ORE.defaultBlockState(), 4));
        register(context, ORE_COPPER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_COPPER_ORE.defaultBlockState(), 8));
        register(context, ORE_ALUMINUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_ALUMINUM_ORE.defaultBlockState(), 8));
        register(context, ORE_TIN_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_TIN_ORE.defaultBlockState(), 8));
        register(context, ORE_OSMIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_OSMIUM_ORE.defaultBlockState(), 8));
        register(context, ORE_URANIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_URANIUM_ORE.defaultBlockState(), 4));
        register(context, ORE_ZINC_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES, BEOBlocks.END_ZINC_ORE.defaultBlockState(), 12));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, prefix(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void initialize() {};
}
