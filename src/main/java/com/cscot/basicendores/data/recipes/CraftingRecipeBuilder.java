package com.cscot.basicendores.data.recipes;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.world.item.ModBlockItems;
import com.cscot.basicendores.world.item.ModItems;
import com.cscot.basicendores.world.level.block.ModBlocks;
import com.google.gson.JsonObject;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.nio.file.Path;
import java.util.function.Consumer;

public class CraftingRecipeBuilder extends RecipeProvider
{
    public static String MODID = BasicEndOres.MODID;

    public CraftingRecipeBuilder(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void saveAdvancement(CachedOutput p_236368_, JsonObject p_236369_, Path p_236370_) {
        //Overrides the writing of advancement for the recipes.
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        shapedMetalBlocks(consumer, ModBlocks.ALUMINUM_BLOCK.get(), ModItems.ALUMINUM_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.LEAD_BLOCK.get(), ModItems.LEAD_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.NICKEL_BLOCK.get(), ModItems.NICKEL_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.SILVER_BLOCK.get(), ModItems.SILVER_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.OSMIUM_BLOCK.get(), ModItems.OSMIUM_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM_INGOT.get());
        shapedMetalBlocks(consumer, ModBlocks.ZINC_BLOCK.get(), ModItems.ZINC_INGOT.get());

        shapedIngot(consumer, ModItems.ALUMINUM_INGOT.get(), ModItems.ALUMINUM_NUGGET.get());
        shapedIngot(consumer, Items.COPPER_INGOT, ModItems.COPPER_NUGGET.get());
        shapedIngot(consumer, ModItems.LEAD_INGOT.get(), ModItems.LEAD_NUGGET.get());
        shapedIngot(consumer, ModItems.NICKEL_INGOT.get(), ModItems.NICKEL_NUGGET.get());
        shapedIngot(consumer, ModItems.SILVER_INGOT.get(), ModItems.SILVER_NUGGET.get());
        shapedIngot(consumer, ModItems.TIN_INGOT.get(), ModItems.TIN_NUGGET.get());
        shapedIngot(consumer, ModItems.OSMIUM_INGOT.get(), ModItems.OSMIUM_NUGGET.get());
        shapedIngot(consumer, ModItems.ZINC_INGOT.get(), ModItems.ZINC_NUGGET.get());

        shapelessIngots(consumer, ModItems.ALUMINUM_INGOT.get(), ModBlocks.ALUMINUM_BLOCK.get());
        shapelessIngots(consumer, ModItems.LEAD_INGOT.get(), ModBlocks.LEAD_BLOCK.get());
        shapelessIngots(consumer, ModItems.NICKEL_INGOT.get(), ModBlocks.NICKEL_BLOCK.get());
        shapelessIngots(consumer, ModItems.SILVER_INGOT.get(), ModBlocks.SILVER_BLOCK.get());
        shapelessIngots(consumer, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get());
        shapelessIngots(consumer, ModItems.OSMIUM_INGOT.get(), ModBlocks.OSMIUM_BLOCK.get());
        shapelessIngots(consumer, ModItems.URANIUM_INGOT.get(), ModBlocks.URANIUM_BLOCK.get());
        shapelessIngots(consumer, ModItems.ZINC_INGOT.get(), ModBlocks.ZINC_BLOCK.get());

        shapelessNuggetsIngots(consumer, ModItems.ALUMINUM_NUGGET.get(), ModItems.ALUMINUM_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        shapelessNuggetsIngots(consumer, ModItems.LEAD_NUGGET.get(), ModItems.LEAD_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.NICKEL_NUGGET.get(), ModItems.NICKEL_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.SILVER_NUGGET.get(), ModItems.SILVER_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.TIN_NUGGET.get(), ModItems.TIN_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.OSMIUM_NUGGET.get(), ModItems.OSMIUM_INGOT.get());
        shapelessNuggetsIngots(consumer, ModItems.ZINC_NUGGET.get(), ModItems.ZINC_INGOT.get());

        smeltingOres(consumer, Items.EMERALD, ModBlockItems.END_EMERALD_ORE.get());
        smeltingOres(consumer, Items.DIAMOND, ModBlockItems.END_DIAMOND_ORE.get());
        smeltingOres(consumer, Items.REDSTONE, ModBlockItems.END_REDSTONE_ORE.get());
        smeltingOres(consumer, Items.LAPIS_LAZULI, ModBlockItems.END_LAPIS_ORE.get());
        smeltingOres(consumer, Items.COAL, ModBlockItems.END_COAL_ORE.get());
        smeltingOres(consumer, Items.GOLD_INGOT, ModBlockItems.END_GOLD_ORE.get());
        smeltingOres(consumer, ModItems.SILVER_INGOT.get(), ModBlockItems.END_SILVER_ORE.get());
        smeltingOres(consumer, Items.IRON_INGOT, ModBlockItems.END_IRON_ORE.get());
        smeltingOres(consumer, ModItems.LEAD_INGOT.get(), ModBlockItems.END_LEAD_ORE.get());
        smeltingOres(consumer, ModItems.NICKEL_INGOT.get(), ModBlockItems.END_NICKEL_ORE.get());
        smeltingOres(consumer, Items.COPPER_INGOT, ModBlockItems.END_COPPER_ORE.get());
        smeltingOres(consumer, ModItems.ALUMINUM_INGOT.get(), ModBlockItems.END_ALUMINUM_ORE.get());
        smeltingOres(consumer, ModItems.TIN_INGOT.get(), ModBlockItems.END_TIN_ORE.get());
        smeltingOres(consumer, ModItems.OSMIUM_INGOT.get(), ModBlockItems.END_OSMIUM_ORE.get());
        smeltingOres(consumer, ModItems.URANIUM_INGOT.get(), ModBlockItems.END_URANIUM_ORE.get());
        smeltingOres(consumer, ModItems.ZINC_INGOT.get(), ModBlockItems.END_ZINC_ORE.get());

        smeltingRawOre(consumer, ModItems.SILVER_INGOT.get(), ModItems.RAW_SILVER.get());
        smeltingRawOre(consumer, ModItems.LEAD_INGOT.get(), ModItems.RAW_LEAD.get());
        smeltingRawOre(consumer, ModItems.NICKEL_INGOT.get(), ModItems.RAW_NICKEL.get());
        smeltingRawOre(consumer, ModItems.ALUMINUM_INGOT.get(), ModItems.RAW_ALUMINUM.get());
        smeltingRawOre(consumer, ModItems.TIN_INGOT.get(), ModItems.RAW_TIN.get());
        smeltingRawOre(consumer, ModItems.OSMIUM_INGOT.get(), ModItems.RAW_OSMIUM.get());
        smeltingRawOre(consumer, ModItems.URANIUM_INGOT.get(), ModItems.RAW_URANIUM.get());
        smeltingRawOre(consumer, ModItems.ZINC_INGOT.get(), ModItems.RAW_ZINC.get());
    }

    private static void shapedIngot(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(ingotName)
                .unlockedBy("has_" + ingotName, has(inputItem))
                .save(consumer, new ResourceLocation(MODID, ingotName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapedMetalBlocks(Consumer<FinishedRecipe> consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.asItem().toString();

        ShapedRecipeBuilder.shaped(craftedItem)
                .define('#',inputItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(blockName)
                .unlockedBy("has_" + blockName, has(inputItem))
                .save(consumer, new ResourceLocation(MODID, blockName + "_from_" + inputItem.asItem().toString()));
    }

    private static void shapelessNuggetsIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(craftedItem, 9)
                .requires(inputItem)
                .unlockedBy(nuggetName + "_from_ingot", has(inputItem))
                .save(consumer);
    }

    private static void shapelessIngots(Consumer<FinishedRecipe> consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.asItem().toString();
        ShapelessRecipeBuilder.shapeless(craftedItem, 9)
                .requires(inputBlock)
                .unlockedBy(ingotName + "_from_block", has(inputBlock))
                .save(consumer);
    }

    private static void smeltingOres(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MODID, smeltedItem.asItem().toString() + "_from_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MODID, smeltedItem.asItem().toString() + "_from_blasting"));
    }

    private static void smeltingRawOre(Consumer<FinishedRecipe> consumer, Item smeltedItem, Item inputOre)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputOre), smeltedItem, 0.7F, 200)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MODID, smeltedItem.asItem().toString() + "_from_smelting_raw"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputOre), smeltedItem, 0.7F, 100)
                .unlockedBy("has_" + inputOre.asItem().toString(), has(inputOre.asItem()))
                .save(consumer, new ResourceLocation(MODID, smeltedItem.asItem().toString() + "_from_blasting_raw"));
    }
}
