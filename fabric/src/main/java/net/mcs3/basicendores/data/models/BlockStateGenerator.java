package net.mcs3.basicendores.data.models;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcs3.basicendores.Constants;
import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Optional;


public class BlockStateGenerator extends FabricModelProvider {

    private static String MOD_ID = Constants.MOD_ID;

    public static final TextureSlot overlayTexture = TextureSlot.create("overlay");

    public static final ModelTemplate ORE_TEMPLATE = createModdedModel("cube_overlay_all", TextureSlot.ALL, overlayTexture);


    public BlockStateGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_EMERALD_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_DIAMOND_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_GOLD_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_REDSTONE_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_LAPIS_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_COAL_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_SILVER_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_IRON_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_LEAD_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_NICKEL_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_COPPER_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_ALUMINUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_TIN_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_OSMIUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_URANIUM_ORE);
        createSimpleOreBlocks(blockStateModelGenerator, BEOBlocks.END_ZINC_ORE);

        blockStateModelGenerator.createTrivialCube(BEOBlocks.ALUMINUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.LEAD_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.NICKEL_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.SILVER_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.TIN_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.OSMIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.ZINC_BLOCK);

        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_ALUMINUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_NICKEL_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_OSMIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_URANIUM_BLOCK);
        blockStateModelGenerator.createTrivialCube(BEOBlocks.RAW_ZINC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(BEOItems.ALUMINUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.LEAD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.NICKEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.SILVER_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.TIN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.OSMIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.URANIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.ZINC_INGOT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BEOItems.ALUMINUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.LEAD_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.NICKEL_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.SILVER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.TIN_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.OSMIUM_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.ZINC_NUGGET, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BEOItems.RAW_ALUMINUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_LEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_NICKEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_SILVER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_TIN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_OSMIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_URANIUM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BEOItems.RAW_ZINC, ModelTemplates.FLAT_ITEM);
    }

    public static void createSimpleOreBlocks(BlockModelGenerators modelGenerators, Block block) {
        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(Blocks.END_STONE)).put(overlayTexture, TextureMapping.getBlockTexture(block));

        ResourceLocation resourceLocation = ORE_TEMPLATE.create(block, textureMapping, modelGenerators.modelOutput);

        modelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
        modelGenerators.delegateItemModel(block, resourceLocation);
    }

    private static ModelTemplate createModdedModel(String parent, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation(Constants.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextures);
    }
}
