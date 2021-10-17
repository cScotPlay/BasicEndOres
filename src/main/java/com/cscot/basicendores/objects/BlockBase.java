package com.cscot.basicendores.objects;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.ItemList;
import com.cscot.basicendores.util.handler.RegisteryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

//This class takes the BlockList blocks and creates them with specific properties
public class BlockBase extends Block
{
    private String name;

    public BlockBase(String name)
    {
        super(AbstractBlock.Properties.create(Material.IRON).setRequiresTool().hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL));

        setRegistryName(BasicEndOres.modid, name);

        ItemList.items.add(new BlockItem(this.getBlock(), new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(name)));

        BlockList.blocks.add(this);
    }
}
