package com.cscot.basicendores.world;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.data.worldgen.ModOrePlacedFeature;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.FORGE;


@Mod.EventBusSubscriber(modid = BasicEndOres.MODID, bus = FORGE)
public class OreGenerator
{
    @SubscribeEvent
    public static void setupOreGenerator(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        Biome.BiomeCategory biome = event.getCategory();

        if(event.getCategory() == Biome.BiomeCategory.THEEND)
        {
            if(OreGenerationConfig.emeraldGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_EMERALD_PLACED_FEATURE);

            if(OreGenerationConfig.diamondGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_DIAMOND_PLACED_FEATURE);

            if(OreGenerationConfig.redstoneGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_REDSTONE_PLACED_FEATURE);

            if(OreGenerationConfig.lapisGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_LAPIS_PLACED_FEATURE);

            if(OreGenerationConfig.coalGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_COAL_PLACED_FEATURE);

            if(OreGenerationConfig.silverGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_SILVER_PLACED_FEATURE);

            if(OreGenerationConfig.goldGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_GOLD_PLACED_FEATURE);

            if(OreGenerationConfig.ironGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_IRON_PLACED_FEATURE);

            if(OreGenerationConfig.leadGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_LEAD_PLACED_FEATURE);

            if(OreGenerationConfig.nickelGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_NICKEL_PLACED_FEATURE);

            if(OreGenerationConfig.copperGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_COPPER_PLACED_FEATURE);

            if(OreGenerationConfig.aluminumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_ALUMINUM_PLACED_FEATURE);

            if(OreGenerationConfig.tinGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_TIN_PLACED_FEATURE);

            if(OreGenerationConfig.osmiumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_OSMIUM_PLACED_FEATURE);

            if(OreGenerationConfig.uraniumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_URANIUM_PLACED_FEATURE);

            if(OreGenerationConfig.zincGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_ZINC_PLACED_FEATURE);
            }
        }
    }
}
