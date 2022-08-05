package com.cscot.basicendores.data.models;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.world.level.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateGenerator extends BlockStateProvider
{
    String MODID = BasicEndOres.MODID;

    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BasicEndOres.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for (RegistryObject<Block> registryObject : ModBlocks.BLOCKS.getEntries()) {
            Block block = registryObject.get();

            if (block instanceof ModOreBlock)
                simpleOreBlock(block);

            if (block instanceof ModRedstoneOreBlock)
                simpleOreBlock(block);

            if (block instanceof ModMetalBlock)
                simpleBlock(block);

            if (block instanceof ModRawOreBlock)
                simpleBlock(block);
        }
    }

    public void simpleOreBlock(Block block)
    {
        ResourceLocation parentName = new ResourceLocation(MODID, "block/cube_overlay_all");
        String oreName = block.asItem().toString();

        simpleBlock(block, models().withExistingParent(block.asItem().toString(), parentName).texture("all", mcLoc("block/end_stone")).texture("overlay", modLoc("block/" + oreName)));
    }

    public ResourceLocation modLoc(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}
