package net.mcs3.basicendores.data.loottables;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.minecraft.world.item.Items;

import java.util.stream.Stream;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        Stream.of(
                BEOBlocks.ALUMINUM_BLOCK,
                BEOBlocks.LEAD_BLOCK,
                BEOBlocks.NICKEL_BLOCK,
                BEOBlocks.OSMIUM_BLOCK,
                BEOBlocks.SILVER_BLOCK,
                BEOBlocks.TIN_BLOCK,
                BEOBlocks.URANIUM_BLOCK,
                BEOBlocks.ZINC_BLOCK,

                BEOBlocks.RAW_ALUMINUM_BLOCK,
                BEOBlocks.RAW_LEAD_BLOCK,
                BEOBlocks.RAW_NICKEL_BLOCK,
                BEOBlocks.RAW_OSMIUM_BLOCK,
                BEOBlocks.RAW_SILVER_BLOCK,
                BEOBlocks.RAW_TIN_BLOCK,
                BEOBlocks.RAW_URANIUM_BLOCK,
                BEOBlocks.RAW_ZINC_BLOCK

        ).forEach(this::dropSelf);

        add(BEOBlocks.END_EMERALD_ORE, (block -> createOreDrop(block, Items.EMERALD)));
        add(BEOBlocks.END_DIAMOND_ORE, (block -> createOreDrop(block, Items.DIAMOND)));
        add(BEOBlocks.END_REDSTONE_ORE, (this::createRedstoneOreDrops));
        add(BEOBlocks.END_LAPIS_ORE, (this::createLapisOreDrops));
        add(BEOBlocks.END_COAL_ORE, (block -> createOreDrop(block, Items.COAL)));
        add(BEOBlocks.END_SILVER_ORE, (block -> createOreDrop(block, BEOItems.RAW_SILVER)));
        add(BEOBlocks.END_IRON_ORE, (block -> createOreDrop(block, Items.RAW_IRON)));
        add(BEOBlocks.END_LEAD_ORE, (block -> createOreDrop(block, BEOItems.RAW_LEAD)));
        add(BEOBlocks.END_NICKEL_ORE, (block -> createOreDrop(block, BEOItems.RAW_NICKEL)));
        add(BEOBlocks.END_COPPER_ORE, (this::createCopperOreDrops));
        add(BEOBlocks.END_ALUMINUM_ORE, (block -> createOreDrop(block, BEOItems.RAW_ALUMINUM)));
        add(BEOBlocks.END_TIN_ORE, (block -> createOreDrop(block, BEOItems.RAW_TIN)));
        add(BEOBlocks.END_OSMIUM_ORE, (block -> createOreDrop(block, BEOItems.RAW_OSMIUM)));
        add(BEOBlocks.END_URANIUM_ORE, (block -> createOreDrop(block, BEOItems.RAW_URANIUM)));
        add(BEOBlocks.END_ZINC_ORE, (block -> createOreDrop(block, BEOItems.RAW_ZINC)));
    }
}
