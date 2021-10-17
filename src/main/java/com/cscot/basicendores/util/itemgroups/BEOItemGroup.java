package com.cscot.basicendores.util.itemgroups;

import com.cscot.basicendores.lists.BlockOreList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

//This class creates the ItemGroup(Creative Tab) for Basic Nether Ores
public class BEOItemGroup extends ItemGroup
{
    public BEOItemGroup()
    {
        super("basicendoreitemgroup");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockOreList.end_emerald_ore));
    }
}
