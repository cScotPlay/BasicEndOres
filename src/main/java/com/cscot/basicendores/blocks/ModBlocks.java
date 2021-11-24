package com.cscot.basicendores.blocks;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.ItemLists;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks extends Block
{
    public ModBlocks(String name)
    {
        super(Settings.of(Material.METAL).strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL));
        new Identifier(BasicEndOres.MOD_ID, name);

        ItemLists.add(name, new BlockItem(this, new Item.Settings().group(BasicEndOres.ITEMGROUP)));
    }
}
