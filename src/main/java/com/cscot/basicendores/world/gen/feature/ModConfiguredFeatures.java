package com.cscot.basicendores.world.gen.feature;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.OreBlockLists;
import com.cscot.basicendores.config.ModConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModConfiguredFeatures
{
    public static String modID = BasicEndOres.MOD_ID;

    public static ConfiguredFeature<?, ?> ORE_EMERALD_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_EMERALD_ORE.getDefaultState(),
                    ModConfig.emeraldVeinSize))
            .decorate(Decorator.RANGE.configure(
                            new RangeDecoratorConfig(
                                    ModConfig.emeraldMinHeight,
                                    0,
                                    ModConfig.emeraldMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.emeraldPerChunk);

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_DIAMOND_ORE.getDefaultState(),
                    ModConfig.diamondVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.diamondMinHeight,
                            0,
                            ModConfig.diamondMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.diamondPerChunk);

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_REDSTONE_ORE.getDefaultState(),
                    ModConfig.redstoneVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.redstoneMinHeight,
                            0,
                            ModConfig.redstoneMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.redstonePerChunk);

    public static ConfiguredFeature<?, ?> ORE_LAPIS_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_LAPIS_ORE.getDefaultState(),
                    ModConfig.lapisVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.lapisMinHeight,
                            0,
                            ModConfig.lapisMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.lapisPerChunk);

    public static ConfiguredFeature<?, ?> ORE_COAL_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_COAL_ORE.getDefaultState(),
                    ModConfig.coalVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.coalMinHeight,
                            0,
                            ModConfig.coalMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.coalPerChunk);

    public static ConfiguredFeature<?, ?> ORE_GOLD_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_GOLD_ORE.getDefaultState(),
                    ModConfig.goldVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.goldMinHeight,
                            0,
                            ModConfig.goldMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.silverPerChunk);

    public static ConfiguredFeature<?, ?> ORE_SILVER_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_SILVER_ORE.getDefaultState(),
                    ModConfig.silverVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.silverMinHeight,
                            0,
                            ModConfig.silverMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.silverPerChunk);

    public static ConfiguredFeature<?, ?> ORE_IRON_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_IRON_ORE.getDefaultState(),
                    ModConfig.ironVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.ironMinHeight,
                            0,
                            ModConfig.ironMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.ironPerChunk);

    public static ConfiguredFeature<?, ?> ORE_LEAD_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_LEAD_ORE.getDefaultState(),
                    ModConfig.leadVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.leadMinHeight,
                            0,
                            ModConfig.leadMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.leadPerChunk);

    public static ConfiguredFeature<?, ?> ORE_NICKEL_END = Feature.ORE
        .configure(new OreFeatureConfig(
                Rules.BASE_STONE_END, OreBlockLists.END_NICKEL_ORE.getDefaultState(),
                ModConfig.nickelVeinSize))
        .decorate(Decorator.RANGE.configure(
                new RangeDecoratorConfig(
                        ModConfig.nickelMinHeight,
                        0,
                        ModConfig.nickelMaxHeight)))
        .spreadHorizontally().repeat(ModConfig.nickelPerChunk);

    public static ConfiguredFeature<?, ?> ORE_COPPER_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_COPPER_ORE.getDefaultState(),
                    ModConfig.copperVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.copperMinHeight,
                            0,
                            ModConfig.copperMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.copperPerChunk);

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_ALUMINUM_ORE.getDefaultState(),
                    ModConfig.aluminumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.aluminumMinHeight,
                            0,
                            ModConfig.aluminumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.aluminumPerChunk);

    public static ConfiguredFeature<?, ?> ORE_TIN_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_TIN_ORE.getDefaultState(),
                    ModConfig.tinVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.tinMinHeight,
                            0,
                            ModConfig.tinMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.tinPerChunk);

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_OSMIUM_ORE.getDefaultState(),
                    ModConfig.osmiumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.osmiumMinHeight,
                            0,
                            ModConfig.osmiumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.osmiumPerChunk);

    public static ConfiguredFeature<?, ?> ORE_URANIUM_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    Rules.BASE_STONE_END, OreBlockLists.END_URANIUM_ORE.getDefaultState(),
                    ModConfig.uraniumVeinSize))
            .decorate(Decorator.RANGE.configure(
                    new RangeDecoratorConfig(
                            ModConfig.uraniumMinHeight,
                            0,
                            ModConfig.uraniumMaxHeight)))
            .spreadHorizontally().repeat(ModConfig.uraniumPerChunk);


    public static void initModFeatures ()
    {
        if(ModConfig.emeraldGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_emerald_end"), ORE_EMERALD_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreEmeraldEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_emerald_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEmeraldEnd);
        }
        if(ModConfig.diamondGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_diamond_end"), ORE_DIAMOND_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreDiamondEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_diamond_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreDiamondEnd);
        }
        if(ModConfig.redstoneGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_redstone_end"), ORE_REDSTONE_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreRedstoneEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_redstone_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreRedstoneEnd);
        }
        if(ModConfig.lapisGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_lapis_end"), ORE_LAPIS_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreLapisEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_lapis_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreLapisEnd);
        }
        if(ModConfig.coalGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_coal_end"), ORE_COAL_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreCoalEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_coal_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreCoalEnd);
        }
        if(ModConfig.goldGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_gold_end"), ORE_GOLD_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreGoldEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_gold_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreGoldEnd);
        }
        if(ModConfig.silverGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_silver_end"), ORE_SILVER_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreSilverEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_silver_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverEnd);
        }
        if(ModConfig.ironGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_iron_end"), ORE_IRON_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreIronEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_iron_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreIronEnd);
        }
        if(ModConfig.leadGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_lead_end"), ORE_LEAD_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreLeadEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_lead_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadEnd);
        }
        if(ModConfig.nickelGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_nickel_end"), ORE_NICKEL_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreNickelEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_nickel_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelEnd);
        }
        if(ModConfig.copperGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_copper_end"), ORE_COPPER_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreCopperEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_copper_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreCopperEnd);
        }
        if(ModConfig.aluminumGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_aluminum_end"), ORE_ALUMINUM_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreAluminumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_aluminum_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumEnd);
        }
        if(ModConfig.tinGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_tin_end"), ORE_TIN_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreTinEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_tin_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinEnd);
        }
        if(ModConfig.osmiumGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_osmium_end"), ORE_OSMIUM_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreOsmiumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_osmium_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreOsmiumEnd);
        }
        if(ModConfig.uraniumGeneration)
        {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(modID, "ore_uranium_end"), ORE_URANIUM_END);
            RegistryKey<ConfiguredFeature<?, ?>> oreUraniumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(modID, "ore_uranium_end"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreUraniumEnd);
        }
    }

    public static final class Rules {
        public static final RuleTest BASE_STONE_END;

        static {
            BASE_STONE_END = new BlockMatchRuleTest(Blocks.END_STONE);
        }
    }
}
