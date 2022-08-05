package com.cscot.basicendores.data.models;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.world.level.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ItemModelGenerator extends ItemModelProvider
{
    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, BasicEndOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Block> registryObject : ModBlocks.BLOCKS.getEntries()) {
            Block block = registryObject.get();

            if (block instanceof ModOreBlock)
                withExistingParent(block.asItem().toString(), new ResourceLocation(modid, "block/" + block.asItem().toString()));

            if (block instanceof ModRedstoneOreBlock)
                withExistingParent(block.asItem().toString(), new ResourceLocation(modid, "block/" + block.asItem().toString()));

            if (block instanceof ModMetalBlock)
                withExistingParent(block.asItem().toString(), new ResourceLocation(modid, "block/" + block.asItem().toString()));

            if (block instanceof ModRawOreBlock)
                withExistingParent(block.asItem().toString(), new ResourceLocation(modid, "block/" + block.asItem().toString()));

        }

        generated("aluminum_ingot", new ResourceLocation(modid, "item/aluminum_ingot"));
        generated("lead_ingot", new ResourceLocation(modid, "item/lead_ingot"));
        generated("nickel_ingot", new ResourceLocation(modid, "item/nickel_ingot"));
        generated("silver_ingot", new ResourceLocation(modid, "item/silver_ingot"));
        generated("tin_ingot", new ResourceLocation(modid, "item/tin_ingot"));
        generated("osmium_ingot", new ResourceLocation(modid, "item/osmium_ingot"));
        generated("uranium_ingot", new ResourceLocation(modid, "item/uranium_ingot"));
        generated("zinc_ingot", new ResourceLocation(modid, "item/zinc_ingot"));

        generated("aluminum_nugget", new ResourceLocation(modid, "item/aluminum_nugget"));
        generated("copper_nugget", new ResourceLocation(modid, "item/copper_nugget"));
        generated("lead_nugget", new ResourceLocation(modid, "item/lead_nugget"));
        generated("nickel_nugget", new ResourceLocation(modid, "item/nickel_nugget"));
        generated("silver_nugget", new ResourceLocation(modid, "item/silver_nugget"));
        generated("tin_nugget", new ResourceLocation(modid, "item/tin_nugget"));
        generated("osmium_nugget", new ResourceLocation(modid, "item/osmium_nugget"));
        generated("zinc_nugget", new ResourceLocation(modid, "item/zinc_nugget"));

        generated("raw_aluminum", new ResourceLocation(modid, "item/raw_aluminum"));
        generated("raw_lead", new ResourceLocation(modid, "item/raw_lead"));
        generated("raw_nickel", new ResourceLocation(modid, "item/raw_nickel"));
        generated("raw_silver", new ResourceLocation(modid, "item/raw_silver"));
        generated("raw_tin", new ResourceLocation(modid, "item/raw_tin"));
        generated("raw_osmium", new ResourceLocation(modid, "item/raw_osmium"));
        generated("raw_uranium", new ResourceLocation(modid, "item/raw_uranium"));
        generated("raw_zinc", new ResourceLocation(modid, "item/raw_zinc"));

    }

    private ItemModelBuilder generated(String name, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, "item/generated");
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        return builder;
    }
}
