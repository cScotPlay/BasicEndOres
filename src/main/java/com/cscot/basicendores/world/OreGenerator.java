package com.cscot.basicendores.world;


import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import static com.cscot.basicendores.world.gen.feature.ModOreFeatures.*;
import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.FORGE;


@Mod.EventBusSubscriber(modid = BasicEndOres.modid, bus = FORGE)
public class OreGenerator
{
    @SubscribeEvent
    public static void setupOreGenerator(BiomeLoadingEvent event)
    {
        if(event.getCategory() == Biome.Category.THEEND)
        {
            if(OreGenerationConfig.emeraldGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_EMERALD_END);

            if(OreGenerationConfig.diamondGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_DIAMOND_END);

            if(OreGenerationConfig.redstoneGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_REDSTONE_END);

            if(OreGenerationConfig.lapisGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_LAPIS_END);

            if(OreGenerationConfig.coalGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_COAL_END);

            if(OreGenerationConfig.silverGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_SILVER_END);

            if(OreGenerationConfig.goldGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_GOLD_END);

            if(OreGenerationConfig.ironGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_IRON_END);

            if(OreGenerationConfig.leadGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_LEAD_END);

            if(OreGenerationConfig.nickelGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_NICKEL_END);

            if(OreGenerationConfig.copperGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_COPPER_END);

            if(OreGenerationConfig.aluminumGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_ALUMINUM_END);

            if(OreGenerationConfig.tinGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_TIN_END);

            if(OreGenerationConfig.osmiumGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_OSMIUM_END);

            if(OreGenerationConfig.uraniumGeneration.get())
                event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_URANIUM_END);
        }
    }
}
