package com.cscot.basicendores.world.gen.feature;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.lists.BlockOreList;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class ModOreFeatures
{
    public static String modID = BasicEndOres.modid;
    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);

    public static ConfiguredFeature<?, ?> ORE_EMERALD_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_emerald_ore.getDefaultState(),
                    OreGenerationConfig.emeraldVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.emeraldMinHeight.get(),
                            0,
                            OreGenerationConfig.emeraldMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.emeraldPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_DIAMOND_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_diamond_ore.getDefaultState(),
                    OreGenerationConfig.diamondVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.diamondMinHeight.get(),
                            0,
                            OreGenerationConfig.diamondMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.diamondPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_REDSTONE_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_redstone_ore.getDefaultState(),
                    OreGenerationConfig.redstoneVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.redstoneMinHeight.get(),
                            0,
                            OreGenerationConfig.redstoneMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.redstonePerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LAPIS_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_lapis_ore.getDefaultState(),
                    OreGenerationConfig.lapisVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.lapisMinHeight.get(),
                            0,
                            OreGenerationConfig.lapisMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.lapisPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_COAL_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_coal_ore.getDefaultState(),
                    OreGenerationConfig.coalVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.coalMinHeight.get(),
                            0,
                            OreGenerationConfig.coalMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.coalPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_SILVER_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_silver_ore.getDefaultState(),
                    OreGenerationConfig.silverVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.silverMinHeight.get(),
                            0,
                            OreGenerationConfig.silverMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.silverPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_GOLD_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_gold_ore.getDefaultState(),
                    OreGenerationConfig.goldVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.goldMinHeight.get(),
                            0,
                            OreGenerationConfig.goldMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.goldPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_IRON_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_iron_ore.getDefaultState(),
                    OreGenerationConfig.ironVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.ironMinHeight.get(),
                            0,
                            OreGenerationConfig.ironMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.ironPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_LEAD_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_lead_ore.getDefaultState(),
                    OreGenerationConfig.leadVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.leadMinHeight.get(),
                            0,
                            OreGenerationConfig.leadMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.leadPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_NICKEL_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_nickel_ore.getDefaultState(),
                    OreGenerationConfig.nickelVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.nickelMinHeight.get(),
                            0,
                            OreGenerationConfig.nickelMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.nickelPerChunk.get());
    
    public static ConfiguredFeature<?, ?> ORE_COPPER_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_copper_ore.getDefaultState(),
                    OreGenerationConfig.copperVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.copperMinHeight.get(),
                            0,
                            OreGenerationConfig.copperMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.copperPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_aluminum_ore.getDefaultState(),
                    OreGenerationConfig.aluminumVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.aluminumMinHeight.get(),
                            0,
                            OreGenerationConfig.aluminumMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.aluminumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_TIN_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_tin_ore.getDefaultState(),
                    OreGenerationConfig.tinVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.tinMinHeight.get(),
                            0,
                            OreGenerationConfig.tinMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.tinPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_OSMIUM_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_osmium_ore.getDefaultState(),
                    OreGenerationConfig.osmiumVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.osmiumMinHeight.get(),
                            0,
                            OreGenerationConfig.osmiumMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.osmiumPerChunk.get());

    public static ConfiguredFeature<?, ?> ORE_URANIUM_END = Feature.ORE
            .withConfiguration(new OreFeatureConfig(
                    END_STONE, BlockOreList.end_uranium_ore.getDefaultState(),
                    OreGenerationConfig.uraniumVeinSize.get()))
            .withPlacement(Placement.RANGE.configure(
                    new TopSolidRangeConfig(
                            OreGenerationConfig.uraniumMinHeight.get(),
                            0,
                            OreGenerationConfig.uraniumMaxHeight.get())))
            .square().func_242731_b(OreGenerationConfig.uraniumPerChunk.get());


    public static void initModFeatures ()
    {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_emerald_end"), ORE_EMERALD_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_diamond_end"), ORE_DIAMOND_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_redstone_end"), ORE_REDSTONE_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_lapis_end"), ORE_LAPIS_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_coal_end"), ORE_COAL_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_silver_end"), ORE_SILVER_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_iron_end"), ORE_IRON_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_lead_end"), ORE_LEAD_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_nickel_end"), ORE_NICKEL_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_copper_end"), ORE_COPPER_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_aluminum_end"), ORE_ALUMINUM_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_tin_end"), ORE_TIN_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_osmium_end"), ORE_OSMIUM_END);
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(modID, "ore_uranium_end"), ORE_URANIUM_END);
    }

}
