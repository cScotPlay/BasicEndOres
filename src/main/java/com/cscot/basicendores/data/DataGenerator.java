package com.cscot.basicendores.data;

import com.cscot.basicendores.BasicEndOres;

import com.cscot.basicendores.data.loottables.LootTableGenerator;
import com.cscot.basicendores.data.models.BlockStateGenerator;
import com.cscot.basicendores.data.models.ItemModelGenerator;
import com.cscot.basicendores.data.recipes.CraftingRecipeBuilder;
import com.cscot.basicendores.data.tags.BlockTagGenerator;
import com.cscot.basicendores.data.tags.ItemTagGenerator;
import net.minecraft.data.BlockTagsProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BasicEndOres.modid, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt)
    {
        if (evt.includeServer())
        {
            evt.getGenerator().addProvider(new CraftingRecipeBuilder(evt.getGenerator()));
            evt.getGenerator().addProvider(new LootTableGenerator(evt.getGenerator()));
            BlockTagsProvider blocktags = new BlockTagGenerator(evt.getGenerator(), evt.getExistingFileHelper());
            evt.getGenerator().addProvider(blocktags);
            evt.getGenerator().addProvider(new ItemTagGenerator(evt.getGenerator(), blocktags, evt.getExistingFileHelper()));
        }

        if (evt.includeClient())
        {
            evt.getGenerator().addProvider(new BlockStateGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
            evt.getGenerator().addProvider(new ItemModelGenerator(evt.getGenerator(), evt.getExistingFileHelper()));
        }
    }
}
