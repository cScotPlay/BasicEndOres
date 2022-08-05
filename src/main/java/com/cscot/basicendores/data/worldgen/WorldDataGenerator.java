package com.cscot.basicendores.data.worldgen;

import com.cscot.basicendores.data.worldgen.biomemodifier.BiomeModifierGenerator;
import com.cscot.basicendores.data.worldgen.configuredfeatures.ConfiguredFeatureGenerator;
import com.cscot.basicendores.data.worldgen.placedfeatures.PlacedFeatureGenerator;
import net.minecraftforge.data.event.GatherDataEvent;

public class WorldDataGenerator
{
    public static void generateWorldData(GatherDataEvent event)
    {
        ConfiguredFeatureGenerator.onGatherData(event);
        PlacedFeatureGenerator.onGatherData(event);
        BiomeModifierGenerator.onGatherData(event);
    }
}
