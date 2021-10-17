package com.cscot.basicendores.lists;

import java.util.ArrayList;
import java.util.List;

import com.cscot.basicendores.objects.BlockOreBase;
import net.minecraft.block.Block;


public class BlockOreList {

	//Ore Blocks are added to this list for registration
	public static List<Block> blockores = new ArrayList<Block>();

	//This is all of the Ore Blocks that will be defined
	public static Block end_emerald_ore = new BlockOreBase("end_emerald_ore");
	public static Block end_diamond_ore = new BlockOreBase("end_diamond_ore");
	public static Block end_redstone_ore = new BlockOreBase("end_redstone_ore");
	public static Block end_lapis_ore = new BlockOreBase("end_lapis_ore");
	public static Block end_coal_ore = new BlockOreBase("end_coal_ore");
	public static Block end_silver_ore = new BlockOreBase("end_silver_ore");
	public static Block end_gold_ore = new BlockOreBase("end_gold_ore");
	public static Block end_iron_ore = new BlockOreBase("end_iron_ore");
	public static Block end_lead_ore = new BlockOreBase("end_lead_ore");
	public static Block end_nickel_ore = new BlockOreBase("end_nickel_ore");
	public static Block end_copper_ore = new BlockOreBase("end_copper_ore");
	public static Block end_aluminum_ore = new BlockOreBase("end_aluminum_ore");
	public static Block end_tin_ore = new BlockOreBase("end_tin_ore");
	public static Block end_osmium_ore = new BlockOreBase("end_osmium_ore");
	public static Block end_uranium_ore = new BlockOreBase("end_uranium_ore");
}


