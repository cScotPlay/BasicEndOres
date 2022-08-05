package com.cscot.basicendores.data;

import com.cscot.basicendores.BasicEndOres;

import com.cscot.basicendores.data.loottables.LootTableGenerator;
import com.cscot.basicendores.data.models.BlockStateGenerator;
import com.cscot.basicendores.data.models.ItemModelGenerator;
import com.cscot.basicendores.data.recipes.CraftingRecipeBuilder;
import com.cscot.basicendores.data.tags.BlockTagGenerator;
import com.cscot.basicendores.data.tags.ItemTagGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BasicEndOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt)
    {
        if (evt.includeServer())
        {
            evt.getGenerator().addProvider(true, new CraftingRecipeBuilder(evt.getGenerator()));
            evt.getGenerator().addProvider(true, new LootTableGenerator(evt.getGenerator()));
            BlockTagsProvider blocktags = new BlockTagGenerator(evt.getGenerator(), evt.getExistingFileHelper());
            evt.getGenerator().addProvider(true, blocktags);
            evt.getGenerator().addProvider(true, new ItemTagGenerator(evt.getGenerator(), blocktags, evt.getExistingFileHelper()));
        }

        if (evt.includeClient())
        {
            evt.getGenerator().addProvider(true, new BlockStateGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(true, new ItemModelGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
        }
    }
}
