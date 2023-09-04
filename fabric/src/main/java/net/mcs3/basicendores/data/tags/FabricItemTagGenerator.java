package net.mcs3.basicendores.data.tags;

import net.mcs3.basicendores.init.BEOItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;



public class FabricItemTagGenerator extends VanillaItemTagGenerator {

    public static final TagKey<Item> ORES = itemTag(new ResourceLocation("c", "ores"));

    public static final TagKey<Item> ORES_EMERALD = itemTag(new ResourceLocation("c", "emerald_ores"));
    public static final TagKey<Item> ORES_DIAMOND = itemTag(new ResourceLocation("c", "diamond_ores"));
    public static final TagKey<Item> ORES_GOLD = itemTag(new ResourceLocation("c", "gold_ores"));
    public static final TagKey<Item> ORES_REDSTONE = itemTag(new ResourceLocation("c", "redstone_ores"));
    public static final TagKey<Item> ORES_LAPIS = itemTag(new ResourceLocation("c", "lapis_ores"));
    public static final TagKey<Item> ORES_COAL = itemTag(new ResourceLocation("c", "coal_ores"));
    public static final TagKey<Item> ORES_IRON = itemTag(new ResourceLocation("c", "iron_ores"));
    public static final TagKey<Item> ORES_ALUMINUM = itemTag(new ResourceLocation("c", "aluminum_ores"));
    public static final TagKey<Item> ORES_SILVER = itemTag(new ResourceLocation("c", "silver_ores"));
    public static final TagKey<Item> ORES_LEAD = itemTag(new ResourceLocation("c", "lead_ores"));
    public static final TagKey<Item> ORES_NICKEL = itemTag(new ResourceLocation("c", "nickel_ores"));
    public static final TagKey<Item> ORES_COPPER = itemTag(new ResourceLocation("c", "copper_ores"));
    public static final TagKey<Item> ORES_TIN = itemTag(new ResourceLocation("c", "tin_ores"));
    public static final TagKey<Item> ORES_OSMIUM = itemTag(new ResourceLocation("c", "osmium_ores"));
    public static final TagKey<Item> ORES_URANIUM = itemTag(new ResourceLocation("c", "uranium_ores"));
    public static final TagKey<Item> ORES_ZINC = itemTag(new ResourceLocation("c", "zinc_ores"));

    public static final TagKey<Item> ALUMINUM_BLOCK = itemTag(new ResourceLocation("c", "aluminum_blocks"));
    public static final TagKey<Item> SILVER_BLOCK = itemTag(new ResourceLocation("c", "silver_blocks"));
    public static final TagKey<Item> LEAD_BLOCK = itemTag(new ResourceLocation("c", "lead_blocks"));
    public static final TagKey<Item> NICKEL_BLOCK = itemTag(new ResourceLocation("c", "nickel_blocks"));
    public static final TagKey<Item> TIN_BLOCK = itemTag(new ResourceLocation("c", "tin_blocks"));
    public static final TagKey<Item> OSMIUM_BLOCK = itemTag(new ResourceLocation("c", "osmium_blocks"));
    public static final TagKey<Item> URANIUM_BLOCK = itemTag(new ResourceLocation("c", "uranium_blocks"));
    public static final TagKey<Item> ZINC_BLOCK = itemTag(new ResourceLocation("c", "zinc_blocks"));

    public static final TagKey<Item> RAW_ALUMINUM_BLOCK = itemTag(new ResourceLocation("c", "raw_aluminum_blocks"));
    public static final TagKey<Item> RAW_SILVER_BLOCK = itemTag(new ResourceLocation("c", "raw_silver_blocks"));
    public static final TagKey<Item> RAW_LEAD_BLOCK = itemTag(new ResourceLocation("c", "raw_lead_blocks"));
    public static final TagKey<Item> RAW_NICKEL_BLOCK = itemTag(new ResourceLocation("c", "raw_nickel_blocks"));
    public static final TagKey<Item> RAW_TIN_BLOCK = itemTag(new ResourceLocation("c", "raw_tin_blocks"));
    public static final TagKey<Item> RAW_OSMIUM_BLOCK = itemTag(new ResourceLocation("c", "raw_osmium_blocks"));
    public static final TagKey<Item> RAW_URANIUM_BLOCK = itemTag(new ResourceLocation("c", "raw_uranium_blocks"));
    public static final TagKey<Item> RAW_ZINC_BLOCK = itemTag(new ResourceLocation("c", "raw_zinc_blocks"));

    public static final TagKey<Item> INGOTS = itemTag(new ResourceLocation("c", "ingots"));

    public static final TagKey<Item> INGOT_ALUMINUM = itemTag(new ResourceLocation("c", "aluminum_ingots"));
    public static final TagKey<Item> INGOT_SILVER = itemTag(new ResourceLocation("c", "silver_ingots"));
    public static final TagKey<Item> INGOT_LEAD = itemTag(new ResourceLocation("c", "lead_ingots"));
    public static final TagKey<Item> INGOT_NICKEL = itemTag(new ResourceLocation("c", "nickel_ingots"));
    public static final TagKey<Item> INGOT_TIN = itemTag(new ResourceLocation("c", "tin_ingots"));
    public static final TagKey<Item> INGOT_OSMIUM = itemTag(new ResourceLocation("c", "osmium_ingots"));
    public static final TagKey<Item> INGOT_URANIUM = itemTag(new ResourceLocation("c", "uranium_ingots"));
    public static final TagKey<Item> INGOT_ZINC = itemTag(new ResourceLocation("c", "zinc_ingots"));

    public static final TagKey<Item> NUGGETS = itemTag(new ResourceLocation("c", "nuggets"));

    public static final TagKey<Item> NUGGET_ALUMINUM = itemTag(new ResourceLocation("c", "aluminum_nuggets"));
    public static final TagKey<Item> NUGGET_SILVER = itemTag(new ResourceLocation("c", "silver_nuggets"));
    public static final TagKey<Item> NUGGET_LEAD = itemTag(new ResourceLocation("c", "lead_nuggets"));
    public static final TagKey<Item> NUGGET_NICKEL = itemTag(new ResourceLocation("c", "nickel_nuggets"));
    public static final TagKey<Item> NUGGET_COPPER = itemTag(new ResourceLocation("c", "copper_nuggets"));
    public static final TagKey<Item> NUGGET_TIN = itemTag(new ResourceLocation("c", "tin_nuggets"));
    public static final TagKey<Item> NUGGET_OSMIUM = itemTag(new ResourceLocation("c", "osmium_nuggets"));
    public static final TagKey<Item> NUGGET_ZINC = itemTag(new ResourceLocation("c", "zinc_nuggets"));

    public static final TagKey<Item> RAW_MATERIALS = itemTag(new ResourceLocation("c", "raw_materials"));

    public static final TagKey<Item> RAW_ALUMINUM = itemTag(new ResourceLocation("c", "raw_aluminum"));
    public static final TagKey<Item> RAW_SILVER = itemTag(new ResourceLocation("c", "raw_silver"));
    public static final TagKey<Item> RAW_LEAD = itemTag(new ResourceLocation("c", "raw_lead"));
    public static final TagKey<Item> RAW_NICKEL = itemTag(new ResourceLocation("c", "raw_nickel"));
    public static final TagKey<Item> RAW_TIN = itemTag(new ResourceLocation("c", "raw_tin"));
    public static final TagKey<Item> RAW_OSMIUM = itemTag(new ResourceLocation("c", "raw_osmium"));
    public static final TagKey<Item> RAW_URANIUM = itemTag(new ResourceLocation("c", "raw_uranium"));
    public static final TagKey<Item> RAW_ZINC = itemTag(new ResourceLocation("c", "raw_zinc"));

    public FabricItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagProvider) {
        super(packOutput, lookupProvider, blockTagProvider);
    }

    private static TagKey<Item> itemTag(ResourceLocation location) {
        return TagKey.create(Registries.ITEM, location);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //
        copy(FabricBlockTagGenerator.ORES, ORES);

        copy(FabricBlockTagGenerator.ORES_EMERALD, ORES_EMERALD);
        copy(FabricBlockTagGenerator.ORES_DIAMOND, ORES_DIAMOND);
        copy(FabricBlockTagGenerator.ORES_GOLD, ORES_DIAMOND);
        copy(FabricBlockTagGenerator.ORES_REDSTONE, ORES_REDSTONE);
        copy(FabricBlockTagGenerator.ORES_LAPIS, ORES_LAPIS);
        copy(FabricBlockTagGenerator.ORES_COAL, ORES_COAL);
        copy(FabricBlockTagGenerator.ORES_IRON, ORES_IRON);
        copy(FabricBlockTagGenerator.ORES_ALUMINUM, ORES_ALUMINUM);
        copy(FabricBlockTagGenerator.ORES_SILVER, ORES_SILVER);
        copy(FabricBlockTagGenerator.ORES_LEAD, ORES_LEAD);
        copy(FabricBlockTagGenerator.ORES_NICKEL, ORES_NICKEL);
        copy(FabricBlockTagGenerator.ORES_COPPER, ORES_COPPER);
        copy(FabricBlockTagGenerator.ORES_TIN, ORES_TIN);
        copy(FabricBlockTagGenerator.ORES_OSMIUM, ORES_OSMIUM);
        copy(FabricBlockTagGenerator.ORES_URANIUM, ORES_URANIUM);
        copy(FabricBlockTagGenerator.ORES_ZINC, ORES_ZINC);

        copy(FabricBlockTagGenerator.ALUMINUM_BLOCK, ALUMINUM_BLOCK);
        copy(FabricBlockTagGenerator.SILVER_BLOCK, SILVER_BLOCK);
        copy(FabricBlockTagGenerator.LEAD_BLOCK, LEAD_BLOCK);
        copy(FabricBlockTagGenerator.NICKEL_BLOCK, NICKEL_BLOCK);
        copy(FabricBlockTagGenerator.TIN_BLOCK, TIN_BLOCK);
        copy(FabricBlockTagGenerator.OSMIUM_BLOCK, OSMIUM_BLOCK);
        copy(FabricBlockTagGenerator.URANIUM_BLOCK, URANIUM_BLOCK);
        copy(FabricBlockTagGenerator.ZINC_BLOCK, ZINC_BLOCK);

        copy(FabricBlockTagGenerator.RAW_ALUMINUM_BLOCK, RAW_ALUMINUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_SILVER_BLOCK, RAW_SILVER_BLOCK);
        copy(FabricBlockTagGenerator.RAW_LEAD_BLOCK, RAW_LEAD_BLOCK);
        copy(FabricBlockTagGenerator.RAW_NICKEL_BLOCK, RAW_NICKEL_BLOCK);
        copy(FabricBlockTagGenerator.RAW_TIN_BLOCK, RAW_TIN_BLOCK);
        copy(FabricBlockTagGenerator.RAW_OSMIUM_BLOCK, RAW_OSMIUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_URANIUM_BLOCK, RAW_URANIUM_BLOCK);
        copy(FabricBlockTagGenerator.RAW_ZINC_BLOCK, RAW_ZINC_BLOCK);

        tag(INGOTS).add(
                BEOItems.ALUMINUM_INGOT,
                BEOItems.SILVER_INGOT,
                BEOItems.LEAD_INGOT,
                BEOItems.NICKEL_INGOT,
                BEOItems.TIN_INGOT,
                BEOItems.OSMIUM_INGOT,
                BEOItems.URANIUM_INGOT,
                BEOItems.ZINC_INGOT
        );

        tag(INGOT_ALUMINUM).add(BEOItems.ALUMINUM_INGOT);
        tag(INGOT_SILVER).add(BEOItems.SILVER_INGOT);
        tag(INGOT_LEAD).add(BEOItems.LEAD_INGOT);
        tag(INGOT_NICKEL).add(BEOItems.NICKEL_INGOT);
        tag(INGOT_TIN).add(BEOItems.TIN_INGOT);
        tag(INGOT_OSMIUM).add(BEOItems.OSMIUM_INGOT);
        tag(INGOT_URANIUM).add(BEOItems.URANIUM_INGOT);
        tag(INGOT_ZINC).add(BEOItems.ZINC_INGOT);

        tag(NUGGETS).add(
                BEOItems.ALUMINUM_NUGGET,
                BEOItems.SILVER_NUGGET,
                BEOItems.LEAD_NUGGET,
                BEOItems.NICKEL_NUGGET,
                BEOItems.TIN_NUGGET,
                BEOItems.OSMIUM_NUGGET,
                BEOItems.ZINC_NUGGET
        );

        tag(NUGGET_ALUMINUM).add(BEOItems.ALUMINUM_NUGGET);
        tag(NUGGET_SILVER).add(BEOItems.SILVER_NUGGET);
        tag(NUGGET_LEAD).add(BEOItems.LEAD_NUGGET);
        tag(NUGGET_NICKEL).add(BEOItems.NICKEL_NUGGET);
        tag(NUGGET_COPPER).add(BEOItems.COPPER_NUGGET);
        tag(NUGGET_TIN).add(BEOItems.TIN_NUGGET);
        tag(NUGGET_OSMIUM).add(BEOItems.OSMIUM_NUGGET);
        tag(NUGGET_ZINC).add(BEOItems.ZINC_NUGGET);

        tag(RAW_MATERIALS).add(
                BEOItems.RAW_ALUMINUM,
                BEOItems.RAW_SILVER,
                BEOItems.RAW_LEAD,
                BEOItems.RAW_NICKEL,
                BEOItems.RAW_TIN,
                BEOItems.RAW_OSMIUM,
                BEOItems.RAW_URANIUM,
                BEOItems.RAW_ZINC
        );

        tag(RAW_ALUMINUM).add(BEOItems.RAW_ALUMINUM);
        tag(RAW_SILVER).add(BEOItems.RAW_SILVER);
        tag(RAW_LEAD).add(BEOItems.RAW_LEAD);
        tag(RAW_NICKEL).add(BEOItems.RAW_NICKEL);
        tag(RAW_TIN).add(BEOItems.RAW_TIN);
        tag(RAW_OSMIUM).add(BEOItems.RAW_OSMIUM);
        tag(RAW_URANIUM).add(BEOItems.RAW_URANIUM);
        tag(RAW_ZINC).add(BEOItems.RAW_ZINC);
    }
}
