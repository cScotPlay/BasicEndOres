package com.cscot.basicendores.data.tags;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import com.cscot.basicendores.objects.BlockBase;
import com.cscot.basicendores.objects.BlockOreBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.Tag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.minecraftforge.common.Tags.Blocks.*;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.function.Predicate;

public class BlockTagGenerator extends BlockTagsProvider
{
    protected final Predicate<Block> ORE_BLOCKS = registry -> BasicEndOres.modid.equals(registry.getRegistryName().getNamespace());

    public static final ITag.INamedTag<Block> ORES_ALUMINUM = BlockTags.makeWrapperTag("forge:ores/aluminum");
    public static final ITag.INamedTag<Block> ORES_SILVER = BlockTags.makeWrapperTag("forge:ores/silver");
    public static final ITag.INamedTag<Block> ORES_LEAD = BlockTags.makeWrapperTag("forge:ores/lead");
    public static final ITag.INamedTag<Block> ORES_NICKEL = BlockTags.makeWrapperTag("forge:ores/nickel");
    public static final ITag.INamedTag<Block> ORES_COPPER = BlockTags.makeWrapperTag("forge:ores/copper");
    public static final ITag.INamedTag<Block> ORES_TIN = BlockTags.makeWrapperTag("forge:ores/tin");
    public static final ITag.INamedTag<Block> ORES_OSMIUM = BlockTags.makeWrapperTag("forge:ores/osmium");
    public static final ITag.INamedTag<Block> ORES_URANIUM = BlockTags.makeWrapperTag("forge:ores/uranium");

    public static final ITag.INamedTag<Block> ALUMINUM_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/aluminum");
    public static final ITag.INamedTag<Block> SILVER_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/silver");
    public static final ITag.INamedTag<Block> LEAD_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/lead");
    public static final ITag.INamedTag<Block> NICKEL_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/nickel");
    public static final ITag.INamedTag<Block> COPPER_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/copper");
    public static final ITag.INamedTag<Block> TIN_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/tin");
    public static final ITag.INamedTag<Block> OSMIUM_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/osmium");
    public static final ITag.INamedTag<Block> URANIUM_BLOCK = BlockTags.makeWrapperTag("forge:storage_blocks/uranium");

    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
        super(generator, BasicEndOres.modid, exFileHelper);
    }

    @Override
    protected void registerTags()
    {
        getOrCreateBuilder(ORES).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof BlockOreBase).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));
        getOrCreateBuilder(STORAGE_BLOCKS).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof BlockBase).sorted(Comparator.comparing(Block::getRegistryName)).toArray(Block[]::new));

        getOrCreateBuilder(ORES_COAL).add(BlockOreList.end_coal_ore);
        getOrCreateBuilder(ORES_DIAMOND).add(BlockOreList.end_diamond_ore);
        getOrCreateBuilder(ORES_EMERALD).add(BlockOreList.end_emerald_ore);
        getOrCreateBuilder(ORES_GOLD).add(BlockOreList.end_gold_ore);
        getOrCreateBuilder(ORES_IRON).add(BlockOreList.end_iron_ore);
        getOrCreateBuilder(ORES_LAPIS).add(BlockOreList.end_lapis_ore);
        getOrCreateBuilder(ORES_REDSTONE).add(BlockOreList.end_redstone_ore);

        getOrCreateBuilder(ORES_ALUMINUM).add(BlockOreList.end_aluminum_ore);
        getOrCreateBuilder(ORES_SILVER).add(BlockOreList.end_silver_ore);
        getOrCreateBuilder(ORES_LEAD).add(BlockOreList.end_lead_ore);
        getOrCreateBuilder(ORES_NICKEL).add(BlockOreList.end_nickel_ore);
        getOrCreateBuilder(ORES_COPPER).add(BlockOreList.end_copper_ore);
        getOrCreateBuilder(ORES_TIN).add(BlockOreList.end_tin_ore);
        getOrCreateBuilder(ORES_OSMIUM).add(BlockOreList.end_osmium_ore);
        getOrCreateBuilder(ORES_URANIUM).add(BlockOreList.end_uranium_ore);

        getOrCreateBuilder(ALUMINUM_BLOCK).add(BlockList.aluminum_block);
        getOrCreateBuilder(SILVER_BLOCK).add(BlockList.silver_block);
        getOrCreateBuilder(LEAD_BLOCK).add(BlockList.lead_block);
        getOrCreateBuilder(NICKEL_BLOCK).add(BlockList.nickel_block);
        getOrCreateBuilder(COPPER_BLOCK).add(BlockList.copper_block);
        getOrCreateBuilder(TIN_BLOCK).add(BlockList.tin_block);
        getOrCreateBuilder(OSMIUM_BLOCK).add(BlockList.osmium_block);
        getOrCreateBuilder(URANIUM_BLOCK).add(BlockList.uranium_block);


    }
}
