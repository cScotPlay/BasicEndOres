package com.cscot.basicendores.data.tags;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Predicate;

import static net.minecraftforge.common.Tags.Blocks.*;

public class BlockTagGenerator extends BlockTagsProvider
{
    protected final Predicate<Block> ORE_BLOCKS = registry -> BasicEndOres.MODID.equals(registry.toString());

    public static final TagKey<Block> ORES_ALUMINUM = tagForge("ores/aluminum");
    public static final TagKey<Block> ORES_GOLD = tagForge("ores/gold");
    public static final TagKey<Block> ORES_SILVER = tagForge("ores/silver");
    public static final TagKey<Block> ORES_LEAD = tagForge("ores/lead");
    public static final TagKey<Block> ORES_NICKEL = tagForge("ores/nickel");
    public static final TagKey<Block> ORES_COPPER = tagForge("ores/copper");
    public static final TagKey<Block> ORES_TIN = tagForge("ores/tin");
    public static final TagKey<Block> ORES_OSMIUM = tagForge("ores/osmium");
    public static final TagKey<Block> ORES_URANIUM = tagForge("ores/uranium");
    public static final TagKey<Block> ORES_ZINC = tagForge("ores/zinc");

    public static final TagKey<Block> ALUMINUM_BLOCK = tagForge("storage_blocks/aluminum");
    public static final TagKey<Block> SILVER_BLOCK = tagForge("storage_blocks/silver");
    public static final TagKey<Block> LEAD_BLOCK = tagForge("storage_blocks/lead");
    public static final TagKey<Block> NICKEL_BLOCK = tagForge("storage_blocks/nickel");
    public static final TagKey<Block> COPPER_BLOCK = tagForge("storage_blocks/copper");
    public static final TagKey<Block> TIN_BLOCK = tagForge("storage_blocks/tin");
    public static final TagKey<Block> OSMIUM_BLOCK = tagForge("storage_blocks/osmium");
    public static final TagKey<Block> URANIUM_BLOCK = tagForge("storage_blocks/uranium");
    public static final TagKey<Block> ZINC_BLOCK = tagForge("storage_blocks/zinc");

    //BLOCKS OF RAW ORES
    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = tagForge("storage_blocks/raw_aluminum");
    public static final TagKey<Block> RAW_LEAD_BLOCK = tagForge("storage_blocks/raw_lead");
    public static final TagKey<Block> RAW_NICKEL_BLOCK = tagForge("storage_blocks/raw_nickel");
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = tagForge("storage_blocks/raw_osmium");
    public static final TagKey<Block> RAW_SILVER_BLOCK = tagForge("storage_blocks/raw_silver");
    public static final TagKey<Block> RAW_TIN_BLOCK = tagForge("storage_blocks/raw_tin");
    public static final TagKey<Block> RAW_URANIUM_BLOCK = tagForge("storage_blocks/raw_uranium");
    public static final TagKey<Block> RAW_ZINC_BLOCK = tagForge("storage_blocks/raw_zinc");

    public BlockTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
        super(generator, BasicEndOres.MODID, exFileHelper);
    }

    @Override
    protected void addTags()
    {
        // ***************************************************************************** //
        //  Forge Tags
        // ***************************************************************************** //
//        tag(ORES).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModOreBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));
//        tag(STORAGE_BLOCKS).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModMetalBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));

        tag(ORES).add(
                ModBlocks.END_DIAMOND_ORE.get(),
                ModBlocks.END_EMERALD_ORE.get(),
                ModBlocks.END_REDSTONE_ORE.get(),
                ModBlocks.END_SILVER_ORE.get(),
                ModBlocks.END_GOLD_ORE.get(),
                ModBlocks.END_LEAD_ORE.get(),
                ModBlocks.END_NICKEL_ORE.get(),
                ModBlocks.END_URANIUM_ORE.get(),
                ModBlocks.END_IRON_ORE.get(),
                ModBlocks.END_LAPIS_ORE.get(),
                ModBlocks.END_COPPER_ORE.get(),
                ModBlocks.END_ALUMINUM_ORE.get(),
                ModBlocks.END_TIN_ORE.get(),
                ModBlocks.END_COAL_ORE.get(),
                ModBlocks.END_ZINC_ORE.get(),
                ModBlocks.END_OSMIUM_ORE.get()
        );

        tag(ORES_COAL).add(ModBlocks.END_COAL_ORE.get());
        tag(ORES_DIAMOND).add(ModBlocks.END_DIAMOND_ORE.get());
        tag(ORES_EMERALD).add(ModBlocks.END_EMERALD_ORE.get());
        tag(ORES_GOLD).add(ModBlocks.END_GOLD_ORE.get());
        tag(ORES_IRON).add(ModBlocks.END_IRON_ORE.get());
        tag(ORES_LAPIS).add(ModBlocks.END_LAPIS_ORE.get());
        tag(ORES_REDSTONE).add(ModBlocks.END_REDSTONE_ORE.get());

        tag(ORES_ALUMINUM).add(ModBlocks.END_ALUMINUM_ORE.get());
        tag(ORES_SILVER).add(ModBlocks.END_SILVER_ORE.get());
        tag(ORES_LEAD).add(ModBlocks.END_LEAD_ORE.get());
        tag(ORES_NICKEL).add(ModBlocks.END_NICKEL_ORE.get());
        tag(ORES_COPPER).add(ModBlocks.END_COPPER_ORE.get());
        tag(ORES_TIN).add(ModBlocks.END_TIN_ORE.get());
        tag(ORES_OSMIUM).add(ModBlocks.END_OSMIUM_ORE.get());
        tag(ORES_URANIUM).add(ModBlocks.END_URANIUM_ORE.get());
        tag(ORES_ZINC).add(ModBlocks.END_ZINC_ORE.get());

        tag(STORAGE_BLOCKS).addTags(
                ALUMINUM_BLOCK,
                LEAD_BLOCK,
                NICKEL_BLOCK,
                OSMIUM_BLOCK,
                SILVER_BLOCK,
                TIN_BLOCK,
                URANIUM_BLOCK,
                ZINC_BLOCK
        );
        tag(ALUMINUM_BLOCK).add(ModBlocks.ALUMINUM_BLOCK.get());
        tag(SILVER_BLOCK).add(ModBlocks.SILVER_BLOCK.get());
        tag(LEAD_BLOCK).add(ModBlocks.LEAD_BLOCK.get());
        tag(NICKEL_BLOCK).add(ModBlocks.NICKEL_BLOCK.get());
        tag(COPPER_BLOCK).add(Blocks.COPPER_BLOCK);
        tag(TIN_BLOCK).add(ModBlocks.TIN_BLOCK.get());
        tag(OSMIUM_BLOCK).add(ModBlocks.OSMIUM_BLOCK.get());
        tag(URANIUM_BLOCK).add(ModBlocks.URANIUM_BLOCK.get());
        tag(ZINC_BLOCK).add(ModBlocks.ZINC_BLOCK.get());

        //BLOCKS OF RAW ORES
        tag(STORAGE_BLOCKS).addTags(
                RAW_ALUMINUM_BLOCK,
                RAW_LEAD_BLOCK,
                RAW_NICKEL_BLOCK,
                RAW_OSMIUM_BLOCK,
                RAW_SILVER_BLOCK,
                RAW_TIN_BLOCK,
                RAW_URANIUM_BLOCK,
                RAW_ZINC_BLOCK
        );
        tag(RAW_ALUMINUM_BLOCK).add(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        tag(RAW_LEAD_BLOCK).add(ModBlocks.RAW_LEAD_BLOCK.get());
        tag(RAW_NICKEL_BLOCK).add(ModBlocks.RAW_NICKEL_BLOCK.get());
        tag(RAW_OSMIUM_BLOCK).add(ModBlocks.RAW_OSMIUM_BLOCK.get());
        tag(RAW_SILVER_BLOCK).add(ModBlocks.RAW_SILVER_BLOCK.get());
        tag(RAW_TIN_BLOCK).add(ModBlocks.RAW_TIN_BLOCK.get());
        tag(RAW_URANIUM_BLOCK).add(ModBlocks.RAW_URANIUM_BLOCK.get());
        tag(RAW_ZINC_BLOCK).add(ModBlocks.RAW_ZINC_BLOCK.get());

        // ***************************************************************************** //
        //  Vanilla Tags
        // ***************************************************************************** //
        this.tag(BlockTags.IRON_ORES).add(ModBlocks.END_IRON_ORE.get());
        this.tag(BlockTags.DIAMOND_ORES).add(ModBlocks.END_DIAMOND_ORE.get());
        this.tag(BlockTags.REDSTONE_ORES).add(ModBlocks.END_REDSTONE_ORE.get());
        this.tag(BlockTags.COAL_ORES).add(ModBlocks.END_COAL_ORE.get());
        this.tag(BlockTags.EMERALD_ORES).add(ModBlocks.END_EMERALD_ORE.get());
        this.tag(BlockTags.GOLD_ORES).add(ModBlocks.END_GOLD_ORE.get());
        this.tag(BlockTags.COPPER_ORES).add(ModBlocks.END_COPPER_ORE.get());
        this.tag(BlockTags.LAPIS_ORES).add(ModBlocks.END_LAPIS_ORE.get());

        ///// MINEABLE WITH PICKAXE ///////
//        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModOreBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));
//        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModMetalBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));
//        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModRawOreBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));
//        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(registry.stream().filter(ORE_BLOCKS).filter(b -> b instanceof ModRedstoneOreBlock).sorted(Comparator.comparing(Block::toString)).toArray(Block[]::new));

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.END_DIAMOND_ORE.get(),
                ModBlocks.END_EMERALD_ORE.get(),
                ModBlocks.END_REDSTONE_ORE.get(),
                ModBlocks.END_GOLD_ORE.get(),
                ModBlocks.END_IRON_ORE.get(),
                ModBlocks.END_LAPIS_ORE.get(),
                ModBlocks.END_COPPER_ORE.get(),

                ModBlocks.ALUMINUM_BLOCK.get(),
                ModBlocks.END_ALUMINUM_ORE.get(),
                ModBlocks.RAW_ALUMINUM_BLOCK.get(),

                ModBlocks.END_LEAD_ORE.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),

                ModBlocks.RAW_NICKEL_BLOCK.get(),
                ModBlocks.END_NICKEL_ORE.get(),
                ModBlocks.NICKEL_BLOCK.get(),

                ModBlocks.END_OSMIUM_ORE.get(),
                ModBlocks.OSMIUM_BLOCK.get(),
                ModBlocks.RAW_OSMIUM_BLOCK.get(),

                ModBlocks.END_SILVER_ORE.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),

                ModBlocks.END_TIN_ORE.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),

                ModBlocks.END_URANIUM_ORE.get(),
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.RAW_URANIUM_BLOCK.get(),

                ModBlocks.END_ZINC_ORE.get(),
                ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.END_DIAMOND_ORE.get(),
                ModBlocks.END_EMERALD_ORE.get(),
                ModBlocks.END_REDSTONE_ORE.get(),
                ModBlocks.END_GOLD_ORE.get(),

                ModBlocks.END_SILVER_ORE.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),

                ModBlocks.END_LEAD_ORE.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.LEAD_BLOCK.get(),

                ModBlocks.END_NICKEL_ORE.get(),
                ModBlocks.RAW_NICKEL_BLOCK.get(),
                ModBlocks.NICKEL_BLOCK.get(),

                ModBlocks.END_URANIUM_ORE.get(),
                ModBlocks.RAW_URANIUM_BLOCK.get(),
                ModBlocks.URANIUM_BLOCK.get(),

                ModBlocks.END_ZINC_ORE.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.ZINC_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.END_IRON_ORE.get(),
                ModBlocks.END_LAPIS_ORE.get(),
                ModBlocks.END_COPPER_ORE.get(),

                ModBlocks.END_ALUMINUM_ORE.get(),
                ModBlocks.RAW_ALUMINUM_BLOCK.get(),
                ModBlocks.ALUMINUM_BLOCK.get(),

                ModBlocks.END_TIN_ORE.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),

                ModBlocks.END_OSMIUM_ORE.get(),
                ModBlocks.RAW_OSMIUM_BLOCK.get(),
                ModBlocks.OSMIUM_BLOCK.get()
        );
    }

    private static TagKey<Block> tagForge(String name)
    {
        return BlockTags.create(new ResourceLocation("forge", name));
    }
}
