package com.cscot.basicendores.data.tags;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.IngotList;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ItemTagGenerator extends ItemTagsProvider
{
    public static final ITag.INamedTag<Item> ORES_ALUMINUM = ItemTags.makeWrapperTag("forge:ores/aluminum");
    public static final ITag.INamedTag<Item> ORES_SILVER = ItemTags.makeWrapperTag("forge:ores/silver");
    public static final ITag.INamedTag<Item> ORES_LEAD = ItemTags.makeWrapperTag("forge:ores/lead");
    public static final ITag.INamedTag<Item> ORES_NICKEL = ItemTags.makeWrapperTag("forge:ores/nickel");
    public static final ITag.INamedTag<Item> ORES_COPPER = ItemTags.makeWrapperTag("forge:ores/copper");
    public static final ITag.INamedTag<Item> ORES_TIN = ItemTags.makeWrapperTag("forge:ores/tin");
    public static final ITag.INamedTag<Item> ORES_OSMIUM = ItemTags.makeWrapperTag("forge:ores/osmium");
    public static final ITag.INamedTag<Item> ORES_URANIUM = ItemTags.makeWrapperTag("forge:ores/uranium");

    public static final ITag.INamedTag<Item> ALUMINUM_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/aluminum");
    public static final ITag.INamedTag<Item> SILVER_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/silver");
    public static final ITag.INamedTag<Item> LEAD_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/lead");
    public static final ITag.INamedTag<Item> NICKEL_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/nickel");
    public static final ITag.INamedTag<Item> COPPER_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/copper");
    public static final ITag.INamedTag<Item> TIN_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/tin");
    public static final ITag.INamedTag<Item> OSMIUM_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/osmium");
    public static final ITag.INamedTag<Item> URANIUM_BLOCK = ItemTags.makeWrapperTag("forge:storage_blocks/uranium");

    public static final ITag.INamedTag<Item> INGOT_ALUMINUM = ItemTags.makeWrapperTag("forge:ingots/aluminum");
    public static final ITag.INamedTag<Item> INGOT_SILVER = ItemTags.makeWrapperTag("forge:ingots/silver");
    public static final ITag.INamedTag<Item> INGOT_LEAD = ItemTags.makeWrapperTag("forge:ingots/lead");
    public static final ITag.INamedTag<Item> INGOT_NICKEL = ItemTags.makeWrapperTag("forge:ingots/nickel");
    public static final ITag.INamedTag<Item> INGOT_COPPER = ItemTags.makeWrapperTag("forge:ingots/copper");
    public static final ITag.INamedTag<Item> INGOT_TIN = ItemTags.makeWrapperTag("forge:ingots/tin");
    public static final ITag.INamedTag<Item> INGOT_OSMIUM = ItemTags.makeWrapperTag("forge:ingots/osmium");
    public static final ITag.INamedTag<Item> INGOT_URANIUM = ItemTags.makeWrapperTag("forge:ingots/uranium");

    public static final ITag.INamedTag<Item> NUGGET_ALUMINUM = ItemTags.makeWrapperTag("forge:nuggets/aluminum");
    public static final ITag.INamedTag<Item> NUGGET_SILVER = ItemTags.makeWrapperTag("forge:nuggets/silver");
    public static final ITag.INamedTag<Item> NUGGET_LEAD = ItemTags.makeWrapperTag("forge:nuggets/lead");
    public static final ITag.INamedTag<Item> NUGGET_NICKEL = ItemTags.makeWrapperTag("forge:nuggets/nickel");
    public static final ITag.INamedTag<Item> NUGGET_COPPER = ItemTags.makeWrapperTag("forge:nuggets/copper");
    public static final ITag.INamedTag<Item> NUGGET_TIN = ItemTags.makeWrapperTag("forge:nuggets/tin");
    public static final ITag.INamedTag<Item> NUGGET_OSMIUM = ItemTags.makeWrapperTag("forge:nuggets/osmium");

    public ItemTagGenerator(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, BasicEndOres.modid, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void registerTags()
    {
        copy(Tags.Blocks.ORES, Tags.Items.ORES);

        copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        copy(Tags.Blocks.ORES_GOLD, Tags.Items.ORES_GOLD);
        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        copy(Tags.Blocks.ORES_QUARTZ, Tags.Items.ORES_QUARTZ);
        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);

        copy(BlockTagGenerator.ORES_ALUMINUM, ORES_ALUMINUM);
        copy(BlockTagGenerator.ORES_SILVER, ORES_SILVER);
        copy(BlockTagGenerator.ORES_LEAD, ORES_LEAD);
        copy(BlockTagGenerator.ORES_NICKEL, ORES_NICKEL);
        copy(BlockTagGenerator.ORES_COPPER, ORES_COPPER);
        copy(BlockTagGenerator.ORES_TIN, ORES_TIN);
        copy(BlockTagGenerator.ORES_OSMIUM, ORES_OSMIUM);
        copy(BlockTagGenerator.ORES_URANIUM, ORES_URANIUM);

        copy(BlockTagGenerator.ALUMINUM_BLOCK, ALUMINUM_BLOCK);
        copy(BlockTagGenerator.SILVER_BLOCK, SILVER_BLOCK);
        copy(BlockTagGenerator.LEAD_BLOCK, LEAD_BLOCK);
        copy(BlockTagGenerator.NICKEL_BLOCK, NICKEL_BLOCK);
        copy(BlockTagGenerator.COPPER_BLOCK, COPPER_BLOCK);
        copy(BlockTagGenerator.TIN_BLOCK, TIN_BLOCK);
        copy(BlockTagGenerator.OSMIUM_BLOCK, OSMIUM_BLOCK);
        copy(BlockTagGenerator.URANIUM_BLOCK, URANIUM_BLOCK);

        getOrCreateBuilder(Tags.Items.INGOTS).addTags(INGOT_ALUMINUM, INGOT_SILVER, INGOT_LEAD, INGOT_NICKEL, INGOT_COPPER, INGOT_TIN, INGOT_OSMIUM, INGOT_URANIUM);
        getOrCreateBuilder(INGOT_ALUMINUM).add(IngotList.aluminum_ingot);
        getOrCreateBuilder(INGOT_SILVER).add(IngotList.silver_ingot);
        getOrCreateBuilder(INGOT_LEAD).add(IngotList.lead_ingot);
        getOrCreateBuilder(INGOT_NICKEL).add(IngotList.nickel_ingot);
        getOrCreateBuilder(INGOT_COPPER).add(IngotList.copper_ingot);
        getOrCreateBuilder(INGOT_TIN).add(IngotList.tin_ingot);
        getOrCreateBuilder(INGOT_OSMIUM).add(IngotList.osmium_ingot);
        getOrCreateBuilder(INGOT_URANIUM).add(IngotList.uranium_ingot);

        getOrCreateBuilder(Tags.Items.NUGGETS).addTags(NUGGET_ALUMINUM, NUGGET_SILVER, NUGGET_LEAD, NUGGET_NICKEL, NUGGET_COPPER, NUGGET_TIN, NUGGET_OSMIUM);
        getOrCreateBuilder(NUGGET_ALUMINUM).add(IngotList.aluminum_nugget);
        getOrCreateBuilder(NUGGET_SILVER).add(IngotList.silver_nugget);
        getOrCreateBuilder(NUGGET_LEAD).add(IngotList.lead_nugget);
        getOrCreateBuilder(NUGGET_NICKEL).add(IngotList.nickel_nugget);
        getOrCreateBuilder(NUGGET_COPPER).add(IngotList.copper_nugget);
        getOrCreateBuilder(NUGGET_TIN).add(IngotList.tin_nugget);
        getOrCreateBuilder(NUGGET_OSMIUM).add(IngotList.osmium_nugget);
    }
}
