package com.cscot.basicendores.api;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.blocks.ModOreBlock;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class OreBlockLists
{
    //Ore Blocks are added to this list for registration
    public static final Map<Identifier, Block> OREBLOCKS = new HashMap<>();

    //This is all of the Ore Blocks that will be defined
    public static Block END_EMERALD_ORE = add("end_emerald_ore", new ModOreBlock("end_emerald_ore"));
    public static Block END_DIAMOND_ORE = add("end_diamond_ore", new ModOreBlock("end_diamond_ore"));
    public static Block END_REDSTONE_ORE = add("end_redstone_ore", new ModOreBlock("end_redstone_ore"));
    public static Block END_LAPIS_ORE = add("end_lapis_ore", new ModOreBlock("end_lapis_ore"));
    public static Block END_COAL_ORE = add("end_coal_ore", new ModOreBlock("end_coal_ore"));
    public static Block END_GOLD_ORE = add("end_gold_ore", new ModOreBlock("end_gold_ore"));
    public static Block END_SILVER_ORE = add("end_silver_ore", new ModOreBlock("end_silver_ore"));
    public static Block END_IRON_ORE = add("end_iron_ore", new ModOreBlock("end_iron_ore"));
    public static Block END_LEAD_ORE = add("end_lead_ore", new ModOreBlock("end_lead_ore"));
    public static Block END_NICKEL_ORE = add("end_nickel_ore", new ModOreBlock("end_nickel_ore"));
    public static Block END_COPPER_ORE = add("end_copper_ore", new ModOreBlock("end_copper_ore"));
    public static Block END_ALUMINUM_ORE = add("end_aluminum_ore", new ModOreBlock("end_aluminum_ore"));
    public static Block END_TIN_ORE = add("end_tin_ore", new ModOreBlock("end_tin_ore"));
    public static Block END_OSMIUM_ORE = add("end_osmium_ore", new ModOreBlock("end_osmium_ore"));
    public static Block END_URANIUM_ORE = add("end_uranium_ore", new ModOreBlock("end_uranium_ore"));


    private static <oreBlock extends Block> oreBlock add(String name, oreBlock block) {
        OREBLOCKS.put(new Identifier(BasicEndOres.MOD_ID, name), block);
        return block;
    }

}
