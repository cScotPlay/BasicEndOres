package com.cscot.basicendores.world.item;

import com.cscot.basicendores.BasicEndOres;
import net.minecraft.world.item.Item;

public class ModItem extends Item
{
    public ModItem() {
        super(new Item.Properties().tab(BasicEndOres.beoItemGroup));
    }
}
