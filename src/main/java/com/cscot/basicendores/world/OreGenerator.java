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
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_EMERALD_END);

            if(OreGenerationConfig.diamondGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_DIAMOND_END);

            if(OreGenerationConfig.redstoneGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_REDSTONE_END);

            if(OreGenerationConfig.lapisGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_LAPIS_END);

            if(OreGenerationConfig.coalGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_COAL_END);

            if(OreGenerationConfig.silverGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_SILVER_END);

            if(OreGenerationConfig.goldGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_GOLD_END);

            if(OreGenerationConfig.ironGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_IRON_END);

            if(OreGenerationConfig.leadGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_LEAD_END);

            if(OreGenerationConfig.nickelGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_NICKEL_END);

            if(OreGenerationConfig.copperGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_COPPER_END);

            if(OreGenerationConfig.aluminumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_ALUMINUM_END);

            if(OreGenerationConfig.tinGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_TIN_END);

            if(OreGenerationConfig.osmiumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_OSMIUM_END);

            if(OreGenerationConfig.uraniumGeneration.get())
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_URANIUM_END);

            if(OreGenerationConfig.zincGeneration.get()){
                builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeature.ORE_ZINC_END);
            }
        }
    }
}
