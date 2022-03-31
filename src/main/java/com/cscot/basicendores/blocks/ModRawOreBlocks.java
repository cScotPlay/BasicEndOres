package com.cscot.basicendores.blocks;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.ItemLists;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModRawOreBlocks extends Block
{
    public ModRawOreBlocks(String rawBlockName) {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .strength(5.0f, 6.0f)
                .sounds(BlockSoundGroup.STONE));

        new Identifier(BasicEndOres.MOD_ID, rawBlockName);

        ItemLists.add(rawBlockName, new BlockItem(this, new Item.Settings().group(BasicEndOres.ITEMGROUP)));
    }
}
