package com.cscot.basicendores.data.worldgen;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacedFeature
{
    public static String MODID = BasicEndOres.MODID;

    public static final PlacedFeature ORE_EMERALD_END = ModOreConfiguredFeatures.ORE_EMERALD_END.placed(commonOrePlacement(OreGenerationConfig.emeraldPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.emeraldMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.emeraldMaxHeight.get()))));
    public static final PlacedFeature ORE_DIAMOND_END = ModOreConfiguredFeatures.ORE_DIAMOND_END.placed(commonOrePlacement(OreGenerationConfig.diamondPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.diamondMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.diamondMaxHeight.get()))));
    public static final PlacedFeature ORE_REDSTONE_END = ModOreConfiguredFeatures.ORE_REDSTONE_END.placed(commonOrePlacement(OreGenerationConfig.redstonePerChunk.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.redstoneMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.redstoneMaxHeight.get()))));
    public static final PlacedFeature ORE_LAPIS_END = ModOreConfiguredFeatures.ORE_LAPIS_END.placed(commonOrePlacement(OreGenerationConfig.lapisPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.lapisMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.lapisMaxHeight.get()))));
    public static final PlacedFeature ORE_COAL_END = ModOreConfiguredFeatures.ORE_COAL_END.placed(commonOrePlacement(OreGenerationConfig.coalPerChunk.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OreGenerationConfig.coalMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.coalMaxHeight.get()))));
    public static final PlacedFeature ORE_GOLD_END = ModOreConfiguredFeatures.ORE_GOLD_END.placed(commonOrePlacement(OreGenerationConfig.goldPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.goldMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.goldMaxHeight.get()))));
    public static final PlacedFeature ORE_SILVER_END = ModOreConfiguredFeatures.ORE_SILVER_END.placed(commonOrePlacement(OreGenerationConfig.silverPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.silverMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.silverMaxHeight.get()))));
    public static final PlacedFeature ORE_IRON_END = ModOreConfiguredFeatures.ORE_IRON_END.placed(commonOrePlacement(OreGenerationConfig.ironPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.ironMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.ironMaxHeight.get()))));
    public static final PlacedFeature ORE_LEAD_END = ModOreConfiguredFeatures.ORE_LEAD_END.placed(commonOrePlacement(OreGenerationConfig.leadPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.leadMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.leadMaxHeight.get()))));
    public static final PlacedFeature ORE_NICKEL_END = ModOreConfiguredFeatures.ORE_NICKEL_END.placed(commonOrePlacement(OreGenerationConfig.nickelPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.nickelMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.nickelMaxHeight.get()))));
    public static final PlacedFeature ORE_COPPER_END = ModOreConfiguredFeatures.ORE_COPPER_END.placed(commonOrePlacement(OreGenerationConfig.copperPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.copperMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.copperMaxHeight.get()))));
    public static final PlacedFeature ORE_ALUMINUM_END = ModOreConfiguredFeatures.ORE_ALUMINUM_END.placed(commonOrePlacement(OreGenerationConfig.aluminumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.aluminumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.aluminumMaxHeight.get()))));
    public static final PlacedFeature ORE_TIN_END = ModOreConfiguredFeatures.ORE_TIN_END.placed(commonOrePlacement(OreGenerationConfig.tinPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.tinMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.tinMaxHeight.get()))));
    public static final PlacedFeature ORE_OSMIUM_END = ModOreConfiguredFeatures.ORE_OSMIUM_END.placed(commonOrePlacement(OreGenerationConfig.osmiumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.osmiumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.osmiumMaxHeight.get()))));
    public static final PlacedFeature ORE_URANIUM_END = ModOreConfiguredFeatures.ORE_URANIUM_END.placed(commonOrePlacement(OreGenerationConfig.uraniumPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.uraniumMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.uraniumMaxHeight.get()))));
    public static final PlacedFeature ORE_ZINC_END = ModOreConfiguredFeatures.ORE_ZINC_END.placed(commonOrePlacement(OreGenerationConfig.zincPerChunk.get(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OreGenerationConfig.zincMinHeight.get()), VerticalAnchor.absolute(OreGenerationConfig.zincMaxHeight.get()))));

    public static void initOrePlacedFeatures()
    {
        PlacementUtils.register( new ResourceLocation(MODID, "ore_emerald_end").toString(), ORE_EMERALD_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_diamond_end").toString(), ORE_DIAMOND_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_redstone_end").toString(), ORE_REDSTONE_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_lapis_end").toString(), ORE_LAPIS_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_coal_end").toString(), ORE_COAL_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_silver_end").toString(), ORE_SILVER_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_iron_end").toString(), ORE_IRON_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_lead_end").toString(), ORE_LEAD_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_nickel_end").toString(), ORE_NICKEL_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_copper_end").toString(), ORE_COPPER_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_aluminum_end").toString(), ORE_ALUMINUM_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_tin_end").toString(), ORE_TIN_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_osmium_end").toString(), ORE_OSMIUM_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_uranium_end").toString(), ORE_URANIUM_END);
        PlacementUtils.register( new ResourceLocation(MODID, "ore_zinc_end").toString(), ORE_ZINC_END);

    }

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
