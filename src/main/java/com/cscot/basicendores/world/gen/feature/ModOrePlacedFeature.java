package com.cscot.basicendores.world.gen.feature;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.ModConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class ModOrePlacedFeature
{
    public static String MODID = BasicEndOres.MOD_ID;

    public static final PlacedFeature ORE_EMERALD_END = ModOreConfiguredFeatures.ORE_EMERALD_END.withPlacement(modifiersWithCount(ModConfig.emeraldPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.emeraldMinHeight),YOffset.fixed(ModConfig.emeraldMaxHeight))));
    public static final PlacedFeature ORE_DIAMOND_END = ModOreConfiguredFeatures.ORE_DIAMOND_END.withPlacement(modifiersWithCount(ModConfig.diamondPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.diamondMinHeight),YOffset.fixed(ModConfig.diamondMaxHeight))));
    public static final PlacedFeature ORE_REDSTONE_END = ModOreConfiguredFeatures.ORE_REDSTONE_END.withPlacement(modifiersWithCount(ModConfig.redstonePerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.redstoneMinHeight),YOffset.fixed(ModConfig.redstoneMaxHeight))));
    public static final PlacedFeature ORE_LAPIS_END = ModOreConfiguredFeatures.ORE_LAPIS_END.withPlacement(modifiersWithCount(ModConfig.lapisPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.lapisMinHeight),YOffset.fixed(ModConfig.lapisMaxHeight))));
    public static final PlacedFeature ORE_COAL_END = ModOreConfiguredFeatures.ORE_COAL_END.withPlacement(modifiersWithCount(ModConfig.coalPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.coalMinHeight),YOffset.fixed(ModConfig.coalMaxHeight))));
    public static final PlacedFeature ORE_GOLD_END = ModOreConfiguredFeatures.ORE_GOLD_END.withPlacement(modifiersWithCount(ModConfig.goldPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.goldMinHeight),YOffset.fixed(ModConfig.goldMaxHeight))));
    public static final PlacedFeature ORE_SILVER_END = ModOreConfiguredFeatures.ORE_SILVER_END.withPlacement(modifiersWithCount(ModConfig.silverPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.silverMinHeight),YOffset.fixed(ModConfig.silverMaxHeight))));
    public static final PlacedFeature ORE_IRON_END = ModOreConfiguredFeatures.ORE_IRON_END.withPlacement(modifiersWithCount(ModConfig.ironPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.ironMinHeight),YOffset.fixed(ModConfig.ironMaxHeight))));
    public static final PlacedFeature ORE_LEAD_END = ModOreConfiguredFeatures.ORE_LEAD_END.withPlacement(modifiersWithCount(ModConfig.leadPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.leadMinHeight),YOffset.fixed(ModConfig.leadMaxHeight))));
    public static final PlacedFeature ORE_NICKEL_END = ModOreConfiguredFeatures.ORE_NICKEL_END.withPlacement(modifiersWithCount(ModConfig.nickelPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.nickelMinHeight),YOffset.fixed(ModConfig.nickelMaxHeight))));
    public static final PlacedFeature ORE_COPPER_END = ModOreConfiguredFeatures.ORE_COPPER_END.withPlacement(modifiersWithCount(ModConfig.copperPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.copperMinHeight),YOffset.fixed(ModConfig.copperMaxHeight))));
    public static final PlacedFeature ORE_ALUMINUM_END = ModOreConfiguredFeatures.ORE_ALUMINUM_END.withPlacement(modifiersWithCount(ModConfig.aluminumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.aluminumMinHeight),YOffset.fixed(ModConfig.aluminumMaxHeight))));
    public static final PlacedFeature ORE_TIN_END = ModOreConfiguredFeatures.ORE_TIN_END.withPlacement(modifiersWithCount(ModConfig.tinPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.tinMinHeight),YOffset.fixed(ModConfig.tinMaxHeight))));
    public static final PlacedFeature ORE_OSMIUM_END = ModOreConfiguredFeatures.ORE_OSMIUM_END.withPlacement(modifiersWithCount(ModConfig.osmiumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.osmiumMinHeight),YOffset.fixed(ModConfig.osmiumMaxHeight))));
    public static final PlacedFeature ORE_URANIUM_END = ModOreConfiguredFeatures.ORE_URANIUM_END.withPlacement(modifiersWithCount(ModConfig.uraniumPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.uraniumMinHeight),YOffset.fixed(ModConfig.uraniumMaxHeight))));
    public static final PlacedFeature ORE_ZINC_END = ModOreConfiguredFeatures.ORE_ZINC_END.withPlacement(modifiersWithCount(ModConfig.zincPerChunk, HeightRangePlacementModifier.uniform(YOffset.fixed(ModConfig.zincMinHeight),YOffset.fixed(ModConfig.zincMaxHeight))));

    public static void initOrePlacedFeatures()
    {
        RegistryKey<PlacedFeature> oreEmeraldEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_emerald_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreEmeraldEnd.getValue(), ORE_EMERALD_END);

        RegistryKey<PlacedFeature> oreDiamondEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_diamond_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreDiamondEnd.getValue(), ORE_DIAMOND_END);

        RegistryKey<PlacedFeature> oreRedstoneEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_redstone_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreRedstoneEnd.getValue(), ORE_REDSTONE_END);

        RegistryKey<PlacedFeature> oreLapisEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_lapis_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreLapisEnd.getValue(), ORE_LAPIS_END);

        RegistryKey<PlacedFeature> oreCoalEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_coal_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCoalEnd.getValue(), ORE_COAL_END);

        RegistryKey<PlacedFeature> oreGoldEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_gold_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreGoldEnd.getValue(), ORE_GOLD_END);

        RegistryKey<PlacedFeature> oreSilverEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_silver_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreSilverEnd.getValue(), ORE_SILVER_END);

        RegistryKey<PlacedFeature> oreIronEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_iron_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreIronEnd.getValue(), ORE_IRON_END);

        RegistryKey<PlacedFeature> oreLeadEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_lead_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreLeadEnd.getValue(), ORE_LEAD_END);

        RegistryKey<PlacedFeature> oreNickelEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_nickel_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreNickelEnd.getValue(), ORE_NICKEL_END);

        RegistryKey<PlacedFeature> oreCopperEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_copper_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreCopperEnd.getValue(), ORE_COPPER_END);

        RegistryKey<PlacedFeature> oreAluminumEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_aluminum_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreAluminumEnd.getValue(), ORE_ALUMINUM_END);

        RegistryKey<PlacedFeature> oreTinEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_tin_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreTinEnd.getValue(), ORE_TIN_END);

        RegistryKey<PlacedFeature> oreOsmiumEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_osmium_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreOsmiumEnd.getValue(), ORE_OSMIUM_END);

        RegistryKey<PlacedFeature> oreUraniumEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_uranium_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreUraniumEnd.getValue(), ORE_URANIUM_END);

        RegistryKey<PlacedFeature> oreZincEnd = RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MODID, "ore_zinc_end"));
        Registry.register(BuiltinRegistries.PLACED_FEATURE, oreZincEnd.getValue(), ORE_ZINC_END);

        if(ModConfig.emeraldGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEmeraldEnd);
        }

        if(ModConfig.diamondGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreDiamondEnd);
        }

        if(ModConfig.redstoneGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreRedstoneEnd);
        }

        if(ModConfig.lapisGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreLapisEnd);
        }

        if(ModConfig.coalGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreCoalEnd);
        }

        if(ModConfig.goldGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreGoldEnd);
        }

        if(ModConfig.silverGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverEnd);
        }

        if(ModConfig.ironGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreIronEnd);
        }

        if(ModConfig.leadGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadEnd);
        }

        if(ModConfig.nickelGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelEnd);
        }

        if(ModConfig.copperGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreCopperEnd);
        }

        if(ModConfig.aluminumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumEnd);
        }

        if(ModConfig.tinGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinEnd);
        }

        if(ModConfig.osmiumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreOsmiumEnd);
        }

        if(ModConfig.uraniumGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreUraniumEnd);
        }
        if(ModConfig.zincGeneration) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreZincEnd);
        }
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModfier) {
        return modifiers(CountPlacementModifier.of(count), heightModfier);
    }

}
