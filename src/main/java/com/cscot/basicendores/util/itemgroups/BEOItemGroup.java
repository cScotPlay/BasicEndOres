package com.cscot.basicendores.util.itemgroups;

import com.cscot.basicendores.world.level.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

//This class creates the ItemGroup(Creative Tab) for Basic Nether Ores
public class BEOItemGroup extends CreativeModeTab
{
    public BEOItemGroup()
    {
        super("basicendoreitemgroup");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Item.BY_BLOCK.get(ModBlocks.END_EMERALD_ORE.get()));
    }
}
