package com.cscot.basicendores.data.models;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ItemModelGenerator extends ItemModelProvider
{
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, BasicEndOres.modid, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        for (Block block : BlockList.blocks)
        {
            withExistingParent(block.getRegistryName().getPath(), new ResourceLocation(modid, "block/" + block.getRegistryName().getPath()));
        }

        for (Block block : BlockOreList.blockores)
        {
            withExistingParent(block.getRegistryName().getPath(), new ResourceLocation(modid, "block/" + block.getRegistryName().getPath()));
        }

        generated("aluminum_ingot", new ResourceLocation(modid, "item/aluminum_ingot"));
        generated("copper_ingot", new ResourceLocation(modid, "item/copper_ingot"));
        generated("lead_ingot", new ResourceLocation(modid, "item/lead_ingot"));
        generated("nickel_ingot", new ResourceLocation(modid, "item/nickel_ingot"));
        generated("silver_ingot", new ResourceLocation(modid, "item/silver_ingot"));
        generated("tin_ingot", new ResourceLocation(modid, "item/tin_ingot"));
        generated("osmium_ingot", new ResourceLocation(modid, "item/osmium_ingot"));
        generated("uranium_ingot", new ResourceLocation(modid, "item/uranium_ingot"));

        generated("aluminum_nugget", new ResourceLocation(modid, "item/aluminum_nugget"));
        generated("copper_nugget", new ResourceLocation(modid, "item/copper_nugget"));
        generated("lead_nugget", new ResourceLocation(modid, "item/lead_nugget"));
        generated("nickel_nugget", new ResourceLocation(modid, "item/nickel_nugget"));
        generated("silver_nugget", new ResourceLocation(modid, "item/silver_nugget"));
        generated("tin_nugget", new ResourceLocation(modid, "item/tin_nugget"));
        generated("osmium_nugget", new ResourceLocation(modid, "item/osmium_nugget"));

    }

    private ItemModelBuilder generated(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/generated");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }
}
