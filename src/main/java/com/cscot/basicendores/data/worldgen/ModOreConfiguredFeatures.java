package com.cscot.basicendores.data.worldgen;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.OreFeatureList;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.core.Holder;
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

        public static OreConfiguration ORE_EMERALD_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_EMERALD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.emeraldVeinSize.get());

        public static OreConfiguration ORE_DIAMOND_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_DIAMOND_ORE.get().defaultBlockState(),
                        OreGenerationConfig.diamondVeinSize.get());

        public static OreConfiguration ORE_REDSTONE_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_REDSTONE_ORE.get().defaultBlockState(),
                        OreGenerationConfig.redstoneVeinSize.get());

        public static OreConfiguration ORE_LAPIS_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_LAPIS_ORE.get().defaultBlockState(),
                        OreGenerationConfig.lapisVeinSize.get());

        public static OreConfiguration ORE_COAL_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_COAL_ORE.get().defaultBlockState(),
                        OreGenerationConfig.coalVeinSize.get());

        public static OreConfiguration ORE_SILVER_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_SILVER_ORE.get().defaultBlockState(),
                        OreGenerationConfig.silverVeinSize.get());

        public static OreConfiguration ORE_GOLD_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_GOLD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.silverVeinSize.get());

        public static OreConfiguration ORE_IRON_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_IRON_ORE.get().defaultBlockState(),
                        OreGenerationConfig.ironVeinSize.get());

        public static OreConfiguration ORE_LEAD_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_LEAD_ORE.get().defaultBlockState(),
                        OreGenerationConfig.leadVeinSize.get());

        public static OreConfiguration ORE_NICKEL_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_NICKEL_ORE.get().defaultBlockState(),
                        OreGenerationConfig.nickelVeinSize.get());

        public static OreConfiguration ORE_COPPER_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_COPPER_ORE.get().defaultBlockState(),
                        OreGenerationConfig.copperVeinSize.get());

        public static OreConfiguration ORE_ALUMINUM_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_ALUMINUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.aluminumVeinSize.get());

        public static OreConfiguration ORE_TIN_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_TIN_ORE.get().defaultBlockState(),
                        OreGenerationConfig.tinVeinSize.get());

        public static OreConfiguration ORE_OSMIUM_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_OSMIUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.osmiumVeinSize.get());

        public static OreConfiguration ORE_URANIUM_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_URANIUM_ORE.get().defaultBlockState(),
                        OreGenerationConfig.uraniumVeinSize.get());

        public static OreConfiguration ORE_ZINC_CONFIGURED_FEATURE = new OreConfiguration(
                        ENDSTONE_CHECK, ModBlocks.END_ZINC_ORE.get().defaultBlockState(),
                        OreGenerationConfig.zincVeinSize.get());

}
