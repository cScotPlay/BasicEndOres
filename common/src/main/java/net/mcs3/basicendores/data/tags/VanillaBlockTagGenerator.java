package net.mcs3.basicendores.data.tags;

import net.mcs3.basicendores.init.BEOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class VanillaBlockTagGenerator extends IntrinsicHolderTagsProvider<Block> {

    public VanillaBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, Registries.BLOCK, lookupProvider, (block) -> block.builtInRegistryHolder().key());
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        // ***************************************************************************** //
        //  Vanilla Tags (Only Account for Vanilla Tags Here)
        // ***************************************************************************** //

        tag(BlockTags.EMERALD_ORES).add(BEOBlocks.END_EMERALD_ORE);
        tag(BlockTags.DIAMOND_ORES).add(BEOBlocks.END_DIAMOND_ORE);
        tag(BlockTags.GOLD_ORES).add(BEOBlocks.END_GOLD_ORE);
        tag(BlockTags.REDSTONE_ORES).add(BEOBlocks.END_REDSTONE_ORE);
        tag(BlockTags.LAPIS_ORES).add(BEOBlocks.END_LAPIS_ORE);
        tag(BlockTags.COAL_ORES).add(BEOBlocks.END_COAL_ORE);
        tag(BlockTags.IRON_ORES).add(BEOBlocks.END_IRON_ORE);
        tag(BlockTags.COPPER_ORES).add(BEOBlocks.END_COPPER_ORE);

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BEOBlocks.END_DIAMOND_ORE,
                BEOBlocks.END_EMERALD_ORE,
                BEOBlocks.END_GOLD_ORE,
                BEOBlocks.END_REDSTONE_ORE,
                BEOBlocks.END_COAL_ORE,
                BEOBlocks.END_IRON_ORE,
                BEOBlocks.END_LAPIS_ORE,
                BEOBlocks.END_COPPER_ORE,
                BEOBlocks.END_SILVER_ORE,
                BEOBlocks.RAW_SILVER_BLOCK,
                BEOBlocks.SILVER_BLOCK,
                BEOBlocks.END_LEAD_ORE,
                BEOBlocks.RAW_LEAD_BLOCK,
                BEOBlocks.LEAD_BLOCK,
                BEOBlocks.END_NICKEL_ORE,
                BEOBlocks.RAW_NICKEL_BLOCK,
                BEOBlocks.NICKEL_BLOCK,
                BEOBlocks.END_URANIUM_ORE,
                BEOBlocks.RAW_URANIUM_BLOCK,
                BEOBlocks.URANIUM_BLOCK,
                BEOBlocks.END_ZINC_ORE,
                BEOBlocks.RAW_ZINC_BLOCK,
                BEOBlocks.ZINC_BLOCK,
                BEOBlocks.END_ALUMINUM_ORE,
                BEOBlocks.RAW_ALUMINUM_BLOCK,
                BEOBlocks.ALUMINUM_BLOCK,
                BEOBlocks.END_TIN_ORE,
                BEOBlocks.RAW_TIN_BLOCK,
                BEOBlocks.TIN_BLOCK,
                BEOBlocks.END_OSMIUM_ORE,
                BEOBlocks.RAW_OSMIUM_BLOCK,
                BEOBlocks.OSMIUM_BLOCK
        );

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BEOBlocks.END_DIAMOND_ORE,
                BEOBlocks.END_EMERALD_ORE,
                BEOBlocks.END_GOLD_ORE,
                BEOBlocks.END_REDSTONE_ORE,
                BEOBlocks.END_SILVER_ORE,
                BEOBlocks.RAW_SILVER_BLOCK,
                BEOBlocks.SILVER_BLOCK,
                BEOBlocks.END_LEAD_ORE,
                BEOBlocks.RAW_LEAD_BLOCK,
                BEOBlocks.LEAD_BLOCK,
                BEOBlocks.END_NICKEL_ORE,
                BEOBlocks.RAW_NICKEL_BLOCK,
                BEOBlocks.NICKEL_BLOCK,
                BEOBlocks.END_URANIUM_ORE,
                BEOBlocks.RAW_URANIUM_BLOCK,
                BEOBlocks.URANIUM_BLOCK,
                BEOBlocks.END_ZINC_ORE,
                BEOBlocks.RAW_ZINC_BLOCK,
                BEOBlocks.ZINC_BLOCK
        );

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                BEOBlocks.END_IRON_ORE,
                BEOBlocks.END_LAPIS_ORE,
                BEOBlocks.END_COPPER_ORE,
                BEOBlocks.END_ALUMINUM_ORE,
                BEOBlocks.RAW_ALUMINUM_BLOCK,
                BEOBlocks.ALUMINUM_BLOCK,
                BEOBlocks.END_TIN_ORE,
                BEOBlocks.RAW_TIN_BLOCK,
                BEOBlocks.TIN_BLOCK,
                BEOBlocks.END_OSMIUM_ORE,
                BEOBlocks.RAW_OSMIUM_BLOCK,
                BEOBlocks.OSMIUM_BLOCK
        );
    }
}
