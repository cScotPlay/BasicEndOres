package net.mcs3.basicendores.data.recipes;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcs3.basicendores.Constants;
import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class CraftingRecipeBuilder extends FabricRecipeProvider {
    public CraftingRecipeBuilder(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {

        shapedMetalBlocks(exporter, BEOBlocks.ALUMINUM_BLOCK, BEOItems.ALUMINUM_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.LEAD_BLOCK, BEOItems.LEAD_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.NICKEL_BLOCK, BEOItems.NICKEL_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.SILVER_BLOCK, BEOItems.SILVER_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.TIN_BLOCK, BEOItems.TIN_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.OSMIUM_BLOCK, BEOItems.OSMIUM_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.URANIUM_BLOCK, BEOItems.URANIUM_INGOT);
        shapedMetalBlocks(exporter, BEOBlocks.ZINC_BLOCK, BEOItems.ZINC_INGOT);

        shapedIngot(exporter, BEOItems.ALUMINUM_INGOT, BEOItems.ALUMINUM_NUGGET);
        shapedIngot(exporter, Items.COPPER_INGOT, BEOItems.COPPER_NUGGET);
        shapedIngot(exporter, BEOItems.LEAD_INGOT, BEOItems.LEAD_NUGGET);
        shapedIngot(exporter, BEOItems.NICKEL_INGOT, BEOItems.NICKEL_NUGGET);
        shapedIngot(exporter, BEOItems.SILVER_INGOT, BEOItems.SILVER_NUGGET);
        shapedIngot(exporter, BEOItems.TIN_INGOT, BEOItems.TIN_NUGGET);
        shapedIngot(exporter, BEOItems.OSMIUM_INGOT, BEOItems.OSMIUM_NUGGET);
        shapedIngot(exporter, BEOItems.ZINC_INGOT, BEOItems.ZINC_NUGGET);

        shapelessIngots(exporter, BEOItems.ALUMINUM_INGOT, BEOBlocks.ALUMINUM_BLOCK);
        shapelessIngots(exporter, BEOItems.LEAD_INGOT, BEOBlocks.LEAD_BLOCK);
        shapelessIngots(exporter, BEOItems.NICKEL_INGOT, BEOBlocks.NICKEL_BLOCK);
        shapelessIngots(exporter, BEOItems.SILVER_INGOT, BEOBlocks.SILVER_BLOCK);
        shapelessIngots(exporter, BEOItems.TIN_INGOT, BEOBlocks.TIN_BLOCK);
        shapelessIngots(exporter, BEOItems.OSMIUM_INGOT, BEOBlocks.OSMIUM_BLOCK);
        shapelessIngots(exporter, BEOItems.URANIUM_INGOT, BEOBlocks.URANIUM_BLOCK);
        shapelessIngots(exporter, BEOItems.ZINC_INGOT, BEOBlocks.ZINC_BLOCK);

        shapelessNuggetsIngots(exporter, BEOItems.ALUMINUM_NUGGET, BEOItems.ALUMINUM_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.COPPER_NUGGET, Items.COPPER_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.LEAD_NUGGET, BEOItems.LEAD_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.NICKEL_NUGGET, BEOItems.NICKEL_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.SILVER_NUGGET, BEOItems.SILVER_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.TIN_NUGGET, BEOItems.TIN_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.OSMIUM_NUGGET, BEOItems.OSMIUM_INGOT);
        shapelessNuggetsIngots(exporter, BEOItems.ZINC_NUGGET, BEOItems.ZINC_INGOT);

        smeltingOres(exporter, Items.EMERALD, BEOBlocks.END_EMERALD_ORE.asItem());
        smeltingOres(exporter, Items.DIAMOND, BEOBlocks.END_DIAMOND_ORE.asItem());
        smeltingOres(exporter, Items.GOLD_INGOT, BEOBlocks.END_GOLD_ORE.asItem());
        smeltingOres(exporter, Items.REDSTONE, BEOBlocks.END_REDSTONE_ORE.asItem());
        smeltingOres(exporter, Items.LAPIS_LAZULI, BEOBlocks.END_LAPIS_ORE.asItem());
        smeltingOres(exporter, Items.COAL, BEOBlocks.END_COAL_ORE.asItem());
        smeltingOres(exporter, BEOItems.SILVER_INGOT, BEOBlocks.END_SILVER_ORE.asItem());
        smeltingOres(exporter, Items.IRON_INGOT, BEOBlocks.END_IRON_ORE.asItem());
        smeltingOres(exporter, BEOItems.LEAD_INGOT, BEOBlocks.END_LEAD_ORE.asItem());
        smeltingOres(exporter, BEOItems.NICKEL_INGOT, BEOBlocks.END_NICKEL_ORE.asItem());
        smeltingOres(exporter, Items.COPPER_INGOT, BEOBlocks.END_COPPER_ORE.asItem());
        smeltingOres(exporter, BEOItems.ALUMINUM_INGOT, BEOBlocks.END_ALUMINUM_ORE.asItem());
        smeltingOres(exporter, BEOItems.TIN_INGOT, BEOBlocks.END_TIN_ORE.asItem());
        smeltingOres(exporter, BEOItems.OSMIUM_INGOT, BEOBlocks.END_OSMIUM_ORE.asItem());
        smeltingOres(exporter, BEOItems.URANIUM_INGOT, BEOBlocks.END_URANIUM_ORE.asItem());
        smeltingOres(exporter, BEOItems.ZINC_INGOT, BEOBlocks.END_ZINC_ORE.asItem());

        shapedMetalBlocks(exporter, BEOBlocks.RAW_ALUMINUM_BLOCK, BEOItems.RAW_ALUMINUM);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_LEAD_BLOCK, BEOItems.RAW_LEAD);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_NICKEL_BLOCK, BEOItems.RAW_NICKEL);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_SILVER_BLOCK, BEOItems.RAW_SILVER);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_TIN_BLOCK, BEOItems.RAW_TIN);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_OSMIUM_BLOCK, BEOItems.RAW_OSMIUM);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_URANIUM_BLOCK, BEOItems.RAW_URANIUM);
        shapedMetalBlocks(exporter, BEOBlocks.RAW_ZINC_BLOCK, BEOItems.RAW_ZINC);

        shapelessIngots(exporter, BEOItems.RAW_ALUMINUM, BEOBlocks.RAW_ALUMINUM_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_LEAD, BEOBlocks.RAW_LEAD_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_NICKEL, BEOBlocks.RAW_NICKEL_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_SILVER, BEOBlocks.RAW_SILVER_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_TIN, BEOBlocks.RAW_TIN_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_OSMIUM, BEOBlocks.RAW_OSMIUM_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_URANIUM, BEOBlocks.RAW_URANIUM_BLOCK);
        shapelessIngots(exporter, BEOItems.RAW_ZINC, BEOBlocks.RAW_ZINC_BLOCK);

        smeltingRawOre(exporter, BEOItems.SILVER_INGOT, BEOItems.RAW_SILVER);
        smeltingRawOre(exporter, BEOItems.LEAD_INGOT, BEOItems.RAW_LEAD);
        smeltingRawOre(exporter, BEOItems.NICKEL_INGOT, BEOItems.RAW_NICKEL);
        smeltingRawOre(exporter, BEOItems.ALUMINUM_INGOT, BEOItems.RAW_ALUMINUM);
        smeltingRawOre(exporter, BEOItems.TIN_INGOT, BEOItems.RAW_TIN);
        smeltingRawOre(exporter, BEOItems.OSMIUM_INGOT, BEOItems.RAW_OSMIUM);
        smeltingRawOre(exporter, BEOItems.URANIUM_INGOT, BEOItems.RAW_URANIUM);
        smeltingRawOre(exporter, BEOItems.ZINC_INGOT, BEOItems.RAW_ZINC);
    }

    private static void shapedMetalBlocks(Consumer<FinishedRecipe> consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, blockName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapedIngot(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, ingotName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapelessIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputBlock)
                .unlockedBy(ingotName + "_from_block", has(inputBlock))
                .save(consumer);
    }

    private static void shapelessNuggetsIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, craftedItem, 9)
                .requires(inputItem)
                .unlockedBy(nuggetName + "_from_ingot", has(inputItem))
                .save(consumer);
    }

    private static void smeltingOres(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting"));
    }

    private static void smeltingRawOre(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), RecipeCategory.MISC, smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(Constants.MOD_ID, smeltedItem.asItem().toString() + "_from_blasting_raw"));
    }


}
