package com.cscot.basicendores.world.item;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasicEndOres.MODID);

    public static final RegistryObject<Item> END_EMERALD_ORE = ITEMS.register("end_emerald_ore", () -> new BlockItem(ModBlocks.END_EMERALD_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_DIAMOND_ORE = ITEMS.register("end_diamond_ore", () -> new BlockItem(ModBlocks.END_DIAMOND_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_REDSTONE_ORE = ITEMS.register("end_redstone_ore", () -> new BlockItem(ModBlocks.END_REDSTONE_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_LAPIS_ORE = ITEMS.register("end_lapis_ore", () -> new BlockItem(ModBlocks.END_LAPIS_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_COAL_ORE = ITEMS.register("end_coal_ore", () -> new BlockItem(ModBlocks.END_COAL_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_GOLD_ORE = ITEMS.register("end_gold_ore", () -> new BlockItem(ModBlocks.END_GOLD_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_SILVER_ORE = ITEMS.register("end_silver_ore", () -> new BlockItem(ModBlocks.END_SILVER_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_IRON_ORE = ITEMS.register("end_iron_ore", () -> new BlockItem(ModBlocks.END_IRON_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_LEAD_ORE = ITEMS.register("end_lead_ore", () -> new BlockItem(ModBlocks.END_LEAD_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_NICKEL_ORE = ITEMS.register("end_nickel_ore", () -> new BlockItem(ModBlocks.END_NICKEL_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_COPPER_ORE = ITEMS.register("end_copper_ore", () -> new BlockItem(ModBlocks.END_COPPER_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_ALUMINUM_ORE = ITEMS.register("end_aluminum_ore", () -> new BlockItem(ModBlocks.END_ALUMINUM_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_TIN_ORE = ITEMS.register("end_tin_ore", () -> new BlockItem(ModBlocks.END_TIN_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_OSMIUM_ORE = ITEMS.register("end_osmium_ore", () -> new BlockItem(ModBlocks.END_OSMIUM_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_URANIUM_ORE = ITEMS.register("end_uranium_ore", () -> new BlockItem(ModBlocks.END_URANIUM_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> END_ZINC_ORE = ITEMS.register("end_zinc_ore", () -> new BlockItem(ModBlocks.END_ZINC_ORE.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));

    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(ModBlocks.LEAD_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(ModBlocks.NICKEL_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> ALUMINUM_BLOCK = ITEMS.register("aluminum_block", () -> new BlockItem(ModBlocks.ALUMINUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> OSMIUM_BLOCK = ITEMS.register("osmium_block", () -> new BlockItem(ModBlocks.OSMIUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(ModBlocks.URANIUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> ZINC_BLOCK = ITEMS.register("zinc_block", () -> new BlockItem(ModBlocks.ZINC_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));

    public static final RegistryObject<Item> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(ModBlocks.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = ITEMS.register("raw_lead_block", () -> new BlockItem(ModBlocks.RAW_LEAD_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_NICKEL_BLOCK = ITEMS.register("raw_nickel_block", () -> new BlockItem(ModBlocks.RAW_NICKEL_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_ALUMINUM_BLOCK = ITEMS.register("raw_aluminum_block", () -> new BlockItem(ModBlocks.RAW_ALUMINUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_OSMIUM_BLOCK = ITEMS.register("raw_osmium_block", () -> new BlockItem(ModBlocks.RAW_OSMIUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_URANIUM_BLOCK = ITEMS.register("raw_uranium_block", () -> new BlockItem(ModBlocks.RAW_URANIUM_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
    public static final RegistryObject<Item> RAW_ZINC_BLOCK = ITEMS.register("raw_zinc_block", () -> new BlockItem(ModBlocks.RAW_ZINC_BLOCK.get(), new Item.Properties().tab(BasicEndOres.beoItemGroup)));
}
