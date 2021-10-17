package com.cscot.basicendores.data.loottables;

import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;

import java.util.HashSet;
import java.util.Set;

public class BlockLootTables extends net.minecraft.data.loot.BlockLootTables
{
    private final Set<Block> knownBlocks = new HashSet<>();

    @Override
    protected void registerLootTable(Block block, LootTable.Builder builder) {
        super.registerLootTable(block, builder);
        knownBlocks.add(block);
    }

    @Override
    protected void addTables()
    {
        registerDropSelfLootTable(BlockList.aluminum_block);
        registerDropSelfLootTable(BlockList.copper_block);
        registerDropSelfLootTable(BlockList.lead_block);
        registerDropSelfLootTable(BlockList.nickel_block);
        registerDropSelfLootTable(BlockList.osmium_block);
        registerDropSelfLootTable(BlockList.silver_block);
        registerDropSelfLootTable(BlockList.tin_block);
        registerDropSelfLootTable(BlockList.uranium_block);

        registerLootTable(BlockOreList.end_emerald_ore, (emerald) -> droppingItemWithFortune(emerald, Items.EMERALD));
        registerLootTable(BlockOreList.end_diamond_ore, (diamond) -> droppingItemWithFortune(diamond, Items.DIAMOND));
        registerLootTable(BlockOreList.end_redstone_ore, (redstoneOre) -> droppingWithSilkTouch(redstoneOre, withExplosionDecay(redstoneOre, ItemLootEntry.builder(Items.REDSTONE).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 5.0F))).acceptFunction(ApplyBonus.uniformBonusCount(Enchantments.FORTUNE)))));
        registerLootTable(BlockOreList.end_lapis_ore, (lapis) -> droppingWithSilkTouch(lapis, withExplosionDecay(lapis, ItemLootEntry.builder(Items.LAPIS_LAZULI).acceptFunction(SetCount.builder(RandomValueRange.of(4.0F, 9.0F))).acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE)))));
        registerLootTable(BlockOreList.end_coal_ore, (coal) -> droppingItemWithFortune(coal, Items.COAL));

        registerDropSelfLootTable(BlockOreList.end_silver_ore);
        registerDropSelfLootTable(BlockOreList.end_iron_ore);
        registerDropSelfLootTable(BlockOreList.end_gold_ore);
        registerDropSelfLootTable(BlockOreList.end_lead_ore);
        registerDropSelfLootTable(BlockOreList.end_nickel_ore);
        registerDropSelfLootTable(BlockOreList.end_copper_ore);
        registerDropSelfLootTable(BlockOreList.end_aluminum_ore);
        registerDropSelfLootTable(BlockOreList.end_tin_ore);
        registerDropSelfLootTable(BlockOreList.end_osmium_ore);
        registerDropSelfLootTable(BlockOreList.end_uranium_ore);
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return knownBlocks;
    }
}
