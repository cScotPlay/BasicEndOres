package com.cscot.basicendores.data.models;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGenerator extends BlockStateProvider
{
    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BasicEndOres.modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for (Block block : BlockOreList.blockores)
        {
            simpleBlock(block);
        }

        for (Block block : BlockList.blocks)
        {
            simpleBlock(block);
        }
    }
}
