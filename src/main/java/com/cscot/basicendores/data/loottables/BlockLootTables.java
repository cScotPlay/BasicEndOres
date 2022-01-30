package com.cscot.basicendores.data.loottables;

import com.cscot.basicendores.world.item.ModItems;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.HashSet;
import java.util.Set;

public class BlockLootTables extends BlockLoot
{
    private final Set<Block> knownBlocks = new HashSet<>();

    @Override
    protected void add(Block block, LootTable.Builder builder) {
        super.add(block, builder);
        knownBlocks.add(block);
    }

    @Override
    protected void addTables()
    {
        dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_BLOCK.get());
        dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.URANIUM_BLOCK.get());
        dropSelf(ModBlocks.ZINC_BLOCK.get());

        dropSelf(ModBlocks.RAW_ALUMINUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_NICKEL_BLOCK.get());
        dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());

        add(ModBlocks.END_EMERALD_ORE.get(), (emerald) -> createOreDrop(emerald, Items.EMERALD));
        add(ModBlocks.END_DIAMOND_ORE.get(), (diamond) -> createOreDrop(diamond, Items.DIAMOND));
        add(ModBlocks.END_REDSTONE_ORE.get(), BlockLoot::createRedstoneOreDrops);
        add(ModBlocks.END_LAPIS_ORE.get(), (lapis) -> createSilkTouchDispatchTable(lapis, applyExplosionDecay(lapis, LootItem.lootTableItem(Items.LAPIS_LAZULI).apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.END_COAL_ORE.get(), (coal) -> createOreDrop(coal, Items.COAL));

        add(ModBlocks.END_GOLD_ORE.get(),(iron) -> createOreDrop(iron, Items.RAW_GOLD));
        add(ModBlocks.END_SILVER_ORE.get(), (silver) -> createOreDrop(silver, ModItems.RAW_SILVER.get()));
        add(ModBlocks.END_IRON_ORE.get(),(iron) -> createOreDrop(iron, Items.RAW_IRON));
        add(ModBlocks.END_LEAD_ORE.get(), (lead) -> createOreDrop(lead, ModItems.RAW_LEAD.get()));
        add(ModBlocks.END_NICKEL_ORE.get(), (nickel) -> createOreDrop(nickel, ModItems.RAW_NICKEL.get()));
        add(ModBlocks.END_COPPER_ORE.get(), BlockLoot::createCopperOreDrops);
        add(ModBlocks.END_ALUMINUM_ORE.get(), (aluminum) -> createOreDrop(aluminum, ModItems.RAW_ALUMINUM.get()));
        add(ModBlocks.END_TIN_ORE.get(), (tin) -> createOreDrop(tin, ModItems.RAW_TIN.get()));
        add(ModBlocks.END_OSMIUM_ORE.get(), (osmium) -> createOreDrop(osmium, ModItems.RAW_OSMIUM.get()));
        add(ModBlocks.END_URANIUM_ORE.get(), (uranium) -> createOreDrop(uranium, ModItems.RAW_URANIUM.get()));
        add(ModBlocks.END_ZINC_ORE.get(), (zinc) -> createOreDrop(zinc, ModItems.RAW_ZINC.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return knownBlocks;
    }
}
