package com.cscot.basicendores.data.worldgen;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class ModOreConfiguredFeatures
{
        public static String modID = BasicEndOres.MODID;
        public static RuleTest ENDSTONE_CHECK = new BlockMatchTest(Blocks.END_STONE);
        
        public static ConfiguredFeature<?, ?> ORE_EMERALD_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_EMERALD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.emeraldVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_DIAMOND_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_DIAMOND_ORE.get().defaultBlockState(),
                        OreGenerationConfig.diamondVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_REDSTONE_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_REDSTONE_ORE.get().defaultBlockState(),
                        OreGenerationConfig.redstoneVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_LAPIS_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_LAPIS_ORE.get().defaultBlockState(),
                        OreGenerationConfig.lapisVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_COAL_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_COAL_ORE.get().defaultBlockState(),
                        OreGenerationConfig.coalVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_GOLD_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_GOLD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.goldVeinSize.get()));

        public static ConfiguredFeature<?, ?> ORE_SILVER_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_SILVER_ORE.get().defaultBlockState(),
                        OreGenerationConfig.silverVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_IRON_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_IRON_ORE.get().defaultBlockState(),
                        OreGenerationConfig.ironVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_LEAD_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_LEAD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.leadVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_NICKEL_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_NICKEL_ORE.get().defaultBlockState(),
                        OreGenerationConfig.nickelVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_COPPER_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_COAL_ORE.get().defaultBlockState(),
                        OreGenerationConfig.copperVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_ALUMINUM_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_ALUMINUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.aluminumVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_TIN_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_TIN_ORE.get().defaultBlockState(),
                        OreGenerationConfig.tinVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_OSMIUM_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_OSMIUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.osmiumVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_URANIUM_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_URANIUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.uraniumVeinSize.get()));
        
        public static ConfiguredFeature<?, ?> ORE_ZINC_END = Feature.ORE
                .configured(new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_ZINC_ORE.get().defaultBlockState(),
                        OreGenerationConfig.zincVeinSize.get()));
        
        public static void initModFeatures ()
        {
                FeatureUtils.register(new ResourceLocation(modID, "ore_emerald_end").toString(), ORE_EMERALD_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_diamond_end").toString(), ORE_DIAMOND_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_redstone_end").toString(), ORE_REDSTONE_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_lapis_end").toString(), ORE_LAPIS_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_coal_end").toString(), ORE_COAL_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_gold_end").toString(), ORE_GOLD_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_silver_end").toString(), ORE_SILVER_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_iron_end").toString(), ORE_IRON_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_lead_end").toString(), ORE_LEAD_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_nickel_end").toString(), ORE_NICKEL_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_copper_end").toString(), ORE_COPPER_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_aluminum_end").toString(), ORE_ALUMINUM_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_tin_end").toString(), ORE_TIN_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_osmium_end").toString(), ORE_OSMIUM_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_uranium_end").toString(), ORE_URANIUM_END);
                FeatureUtils.register(new ResourceLocation(modID, "ore_zinc_end").toString(), ORE_ZINC_END);
        }
}
