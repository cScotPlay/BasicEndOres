package com.cscot.basicendores.data.recipes;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import com.cscot.basicendores.lists.IngotList;
import com.cscot.basicendores.lists.ItemList;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.nio.file.Path;
import java.util.function.Consumer;

public class CraftingRecipeBuilder extends RecipeProvider
{
    public CraftingRecipeBuilder(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void saveRecipeAdvancement(DirectoryCache cache, JsonObject cache2, Path advancementJson) {
        //Overrides the writing of advancement for the recipes.
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        shapedMetalBlocks(consumer, BlockList.aluminum_block, IngotList.aluminum_ingot);
        shapedMetalBlocks(consumer, BlockList.copper_block, IngotList.copper_ingot);
        shapedMetalBlocks(consumer, BlockList.lead_block, IngotList.lead_ingot);
        shapedMetalBlocks(consumer, BlockList.nickel_block, IngotList.nickel_ingot);
        shapedMetalBlocks(consumer, BlockList.silver_block, IngotList.silver_ingot);
        shapedMetalBlocks(consumer, BlockList.tin_block, IngotList.tin_ingot);
        shapedMetalBlocks(consumer, BlockList.osmium_block, IngotList.osmium_ingot);
        shapedMetalBlocks(consumer, BlockList.uranium_block, IngotList.uranium_ingot);

        shapedIngot(consumer, IngotList.aluminum_ingot, IngotList.aluminum_nugget);
        shapedIngot(consumer, IngotList.copper_ingot, IngotList.copper_nugget);
        shapedIngot(consumer, IngotList.lead_ingot, IngotList.lead_nugget);
        shapedIngot(consumer, IngotList.nickel_ingot, IngotList.nickel_nugget);
        shapedIngot(consumer, IngotList.silver_ingot, IngotList.silver_nugget);
        shapedIngot(consumer, IngotList.tin_ingot, IngotList.tin_nugget);
        shapedIngot(consumer, IngotList.osmium_ingot, IngotList.osmium_nugget);

        shapelessIngots(consumer, IngotList.aluminum_ingot, BlockList.aluminum_block);
        shapelessIngots(consumer, IngotList.copper_ingot, BlockList.copper_block);
        shapelessIngots(consumer, IngotList.lead_ingot, BlockList.lead_block);
        shapelessIngots(consumer, IngotList.nickel_ingot, BlockList.nickel_block);
        shapelessIngots(consumer, IngotList.silver_ingot, BlockList.silver_block);
        shapelessIngots(consumer, IngotList.tin_ingot, BlockList.tin_block);
        shapelessIngots(consumer, IngotList.osmium_ingot, BlockList.osmium_block);
        shapelessIngots(consumer, IngotList.uranium_ingot, BlockList.uranium_block);

        shapelessNuggetsIngots(consumer, IngotList.aluminum_nugget, IngotList.aluminum_ingot);
        shapelessNuggetsIngots(consumer, IngotList.copper_nugget, IngotList.copper_ingot);
        shapelessNuggetsIngots(consumer, IngotList.lead_nugget, IngotList.lead_ingot);
        shapelessNuggetsIngots(consumer, IngotList.nickel_nugget, IngotList.nickel_ingot);
        shapelessNuggetsIngots(consumer, IngotList.silver_nugget, IngotList.silver_ingot);
        shapelessNuggetsIngots(consumer, IngotList.tin_nugget, IngotList.tin_ingot);
        shapelessNuggetsIngots(consumer, IngotList.osmium_nugget, IngotList.osmium_ingot);

        smeltingOres(consumer, Items.EMERALD, BlockOreList.end_emerald_ore);
        smeltingOres(consumer, Items.DIAMOND, BlockOreList.end_diamond_ore);
        smeltingOres(consumer, Items.REDSTONE, BlockOreList.end_redstone_ore);
        smeltingOres(consumer, Items.LAPIS_LAZULI, BlockOreList.end_lapis_ore);
        smeltingOres(consumer, Items.COAL, BlockOreList.end_coal_ore);
        smeltingOres(consumer, IngotList.silver_ingot, BlockOreList.end_silver_ore);
        smeltingOres(consumer, Items.GOLD_INGOT, BlockOreList.end_gold_ore);
        smeltingOres(consumer, Items.IRON_INGOT, BlockOreList.end_iron_ore);
        smeltingOres(consumer, IngotList.lead_ingot, BlockOreList.end_lead_ore);
        smeltingOres(consumer, IngotList.nickel_ingot, BlockOreList.end_nickel_ore);
        smeltingOres(consumer, IngotList.copper_ingot, BlockOreList.end_copper_ore);
        smeltingOres(consumer, IngotList.aluminum_ingot, BlockOreList.end_aluminum_ore);
        smeltingOres(consumer, IngotList.tin_ingot, BlockOreList.end_tin_ore);
        smeltingOres(consumer, IngotList.osmium_ingot, BlockOreList.end_osmium_ore);
        smeltingOres(consumer, IngotList.uranium_ingot, BlockOreList.end_uranium_ore);




        //IngotList.aluminum_ingot.getRegistryName().getPath();
        //ShapedRecipeBuilder.shapedRecipe(Items.IRON_INGOT).key('#',Items.IRON_NUGGET).patternLine("###").patternLine("###").patternLine("###").setGroup("iron_ingot").addCriterion("has_iron_nugget",hasItem(Items.IRON_NUGGET)).build(consumer, "iron_ingot_from_nuggets");
    }

    private static void shapedIngot(Consumer<IFinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String ingotName = craftedItem.getRegistryName().getPath();

        ShapedRecipeBuilder.shapedRecipe(craftedItem)
                .key('#',inputItem)
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .setGroup(ingotName)
                .addCriterion("has_" + ingotName,hasItem(inputItem))
                .build(consumer, new ResourceLocation(BasicEndOres.modid, ingotName + "_from_" + inputItem.getRegistryName().getPath()));
    }

    private static void shapedMetalBlocks(Consumer<IFinishedRecipe> consumer, Block craftedItem, Item inputItem)
    {
        String blockName = craftedItem.getRegistryName().getPath();

        ShapedRecipeBuilder.shapedRecipe(craftedItem)
                .key('#',inputItem)
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .setGroup(blockName)
                .addCriterion("has_" + blockName,hasItem(inputItem))
                .build(consumer, new ResourceLocation(BasicEndOres.modid, blockName + "_from_" + inputItem.getRegistryName().getPath()));
    }

    private static void shapelessNuggetsIngots(Consumer<IFinishedRecipe> consumer, Item craftedItem, Item inputItem)
    {
        String nuggetName = craftedItem.getRegistryName().getPath();
        ShapelessRecipeBuilder.shapelessRecipe(craftedItem, 9)
                .addIngredient(inputItem)
                .addCriterion(nuggetName + "_from_ingot", hasItem(inputItem))
                .build(consumer);
    }

    private static void shapelessIngots(Consumer<IFinishedRecipe> consumer, Item craftedItem, Block inputBlock)
    {
        String ingotName = craftedItem.getRegistryName().getPath();
        ShapelessRecipeBuilder.shapelessRecipe(craftedItem, 9)
                .addIngredient(inputBlock)
                .addCriterion(ingotName + "_from_block", hasItem(inputBlock))
                .build(consumer);
    }

    private static void smeltingOres(Consumer<IFinishedRecipe> consumer, Item smeltedItem, Block inputOre)
    {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(inputOre.asItem()), smeltedItem, 0.7F, 200)
                .addCriterion("has_" + inputOre.getRegistryName().getPath(), hasItem(inputOre.asItem()))
                .build(consumer, new ResourceLocation(BasicEndOres.modid, smeltedItem.getRegistryName().getPath() + "_from_smelting"));

        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(inputOre.asItem()), smeltedItem, 0.7F, 100)
                .addCriterion("has_" + inputOre.getRegistryName().getPath(), hasItem(inputOre.asItem()))
                .build(consumer, new ResourceLocation(BasicEndOres.modid, smeltedItem.getRegistryName().getPath() + "_from_blasting"));
    }




}
