package net.mcs3.basicendores.data.tags;

import net.mcs3.basicendores.Constants;
import net.mcs3.basicendores.init.BEOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static net.minecraftforge.common.Tags.Blocks.*;


public class ForgeBlockTagGenerator extends BlockTagsProvider
{
    public static final TagKey<Block> ORES_ALUMINUM = tagForge("ores/aluminum");
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
    public static final TagKey<Block> TIN_BLOCK = tagForge("storage_blocks/tin");
    public static final TagKey<Block> OSMIUM_BLOCK = tagForge("storage_blocks/osmium");
    public static final TagKey<Block> URANIUM_BLOCK = tagForge("storage_blocks/uranium");
    public static final TagKey<Block> ZINC_BLOCK = tagForge("storage_blocks/zinc");

    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = tagForge("storage_blocks/raw_aluminum");
    public static final TagKey<Block> RAW_SILVER_BLOCK = tagForge("storage_blocks/raw_silver");
    public static final TagKey<Block> RAW_LEAD_BLOCK = tagForge("storage_blocks/raw_lead");
    public static final TagKey<Block> RAW_NICKEL_BLOCK = tagForge("storage_blocks/raw_nickel");
    public static final TagKey<Block> RAW_TIN_BLOCK = tagForge("storage_blocks/raw_tin");
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = tagForge("storage_blocks/raw_osmium");
    public static final TagKey<Block> RAW_URANIUM_BLOCK = tagForge("storage_blocks/raw_uranium");
    public static final TagKey<Block> RAW_ZINC_BLOCK = tagForge("storage_blocks/raw_zinc");

    public ForgeBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // ***************************************************************************** //
        //  Forge Tags (Only Account for Forge Tags Here)
        // ***************************************************************************** //
        tag(ORES).add(
                BEOBlocks.END_EMERALD_ORE,
                BEOBlocks.END_DIAMOND_ORE,
                BEOBlocks.END_GOLD_ORE,
                BEOBlocks.END_REDSTONE_ORE,
                BEOBlocks.END_LAPIS_ORE,
                BEOBlocks.END_COAL_ORE,
                BEOBlocks.END_SILVER_ORE,
                BEOBlocks.END_IRON_ORE,
                BEOBlocks.END_LEAD_ORE,
                BEOBlocks.END_NICKEL_ORE,
                BEOBlocks.END_COPPER_ORE,
                BEOBlocks.END_ALUMINUM_ORE,
                BEOBlocks.END_TIN_ORE,
                BEOBlocks.END_OSMIUM_ORE,
                BEOBlocks.END_URANIUM_ORE,
                BEOBlocks.END_ZINC_ORE
        );

        tag(STORAGE_BLOCKS).add(
                BEOBlocks.RAW_SILVER_BLOCK,
                BEOBlocks.SILVER_BLOCK,
                BEOBlocks.RAW_LEAD_BLOCK,
                BEOBlocks.LEAD_BLOCK,
                BEOBlocks.RAW_NICKEL_BLOCK,
                BEOBlocks.NICKEL_BLOCK,
                BEOBlocks.RAW_URANIUM_BLOCK,
                BEOBlocks.URANIUM_BLOCK,
                BEOBlocks.RAW_ZINC_BLOCK,
                BEOBlocks.ZINC_BLOCK,
                BEOBlocks.RAW_ALUMINUM_BLOCK,
                BEOBlocks.ALUMINUM_BLOCK,
                BEOBlocks.RAW_TIN_BLOCK,
                BEOBlocks.TIN_BLOCK,
                BEOBlocks.RAW_OSMIUM_BLOCK,
                BEOBlocks.OSMIUM_BLOCK
        );

        tag(ORES_COAL).add(BEOBlocks.END_COAL_ORE);
        tag(ORES_DIAMOND).add(BEOBlocks.END_DIAMOND_ORE);
        tag(ORES_GOLD).add(BEOBlocks.END_GOLD_ORE);
        tag(ORES_EMERALD).add(BEOBlocks.END_EMERALD_ORE);
        tag(ORES_IRON).add(BEOBlocks.END_IRON_ORE);
        tag(ORES_LAPIS).add(BEOBlocks.END_LAPIS_ORE);
        tag(ORES_REDSTONE).add(BEOBlocks.END_REDSTONE_ORE);

        tag(ORES_ALUMINUM).add(BEOBlocks.END_ALUMINUM_ORE);
        tag(ORES_SILVER).add(BEOBlocks.END_SILVER_ORE);
        tag(ORES_LEAD).add(BEOBlocks.END_LEAD_ORE);
        tag(ORES_NICKEL).add(BEOBlocks.END_NICKEL_ORE);
        tag(ORES_COPPER).add(BEOBlocks.END_COPPER_ORE);
        tag(ORES_TIN).add(BEOBlocks.END_TIN_ORE);
        tag(ORES_OSMIUM).add(BEOBlocks.END_OSMIUM_ORE);
        tag(ORES_URANIUM).add(BEOBlocks.END_URANIUM_ORE);
        tag(ORES_ZINC).add(BEOBlocks.END_ZINC_ORE);

        tag(ALUMINUM_BLOCK).add(BEOBlocks.ALUMINUM_BLOCK);
        tag(SILVER_BLOCK).add(BEOBlocks.SILVER_BLOCK);
        tag(LEAD_BLOCK).add(BEOBlocks.LEAD_BLOCK);
        tag(NICKEL_BLOCK).add(BEOBlocks.NICKEL_BLOCK);
        tag(TIN_BLOCK).add(BEOBlocks.TIN_BLOCK);
        tag(OSMIUM_BLOCK).add(BEOBlocks.OSMIUM_BLOCK);
        tag(URANIUM_BLOCK).add(BEOBlocks.URANIUM_BLOCK);
        tag(ZINC_BLOCK).add(BEOBlocks.ZINC_BLOCK);

        tag(RAW_ALUMINUM_BLOCK).add(BEOBlocks.RAW_ALUMINUM_BLOCK);
        tag(RAW_SILVER_BLOCK).add(BEOBlocks.RAW_SILVER_BLOCK);
        tag(RAW_LEAD_BLOCK).add(BEOBlocks.RAW_LEAD_BLOCK);
        tag(RAW_NICKEL_BLOCK).add(BEOBlocks.RAW_NICKEL_BLOCK);
        tag(RAW_TIN_BLOCK).add(BEOBlocks.RAW_TIN_BLOCK);
        tag(RAW_OSMIUM_BLOCK).add(BEOBlocks.RAW_OSMIUM_BLOCK);
        tag(RAW_URANIUM_BLOCK).add(BEOBlocks.RAW_URANIUM_BLOCK);
        tag(RAW_ZINC_BLOCK).add(BEOBlocks.RAW_ZINC_BLOCK);

    }

    private static TagKey<Block> tagForge(String name)
    {
        return BlockTags.create(new ResourceLocation("forge", name));
    }


}
