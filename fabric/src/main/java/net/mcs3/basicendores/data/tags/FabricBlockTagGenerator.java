package net.mcs3.basicendores.data.tags;

import net.mcs3.basicendores.init.BEOBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class FabricBlockTagGenerator extends VanillaBlockTagGenerator {

    public static final TagKey<Block> ORES = blockTag(new ResourceLocation("c", "ores"));

    public static final TagKey<Block> ORES_EMERALD = blockTag(new ResourceLocation("c", "emerald_ores"));
    public static final TagKey<Block> ORES_DIAMOND = blockTag(new ResourceLocation("c", "diamond_ores"));
    public static final TagKey<Block> ORES_GOLD = blockTag(new ResourceLocation("c", "gold_ores"));
    public static final TagKey<Block> ORES_REDSTONE = blockTag(new ResourceLocation("c", "redstone_ores"));
    public static final TagKey<Block> ORES_LAPIS = blockTag(new ResourceLocation("c", "lapis_ores"));
    public static final TagKey<Block> ORES_COAL = blockTag(new ResourceLocation("c", "coal_ores"));
    public static final TagKey<Block> ORES_IRON = blockTag(new ResourceLocation("c", "iron_ores"));
    public static final TagKey<Block> ORES_ALUMINUM = blockTag(new ResourceLocation("c", "aluminum_ores"));
    public static final TagKey<Block> ORES_SILVER = blockTag(new ResourceLocation("c", "silver_ores"));
    public static final TagKey<Block> ORES_LEAD = blockTag(new ResourceLocation("c", "lead_ores"));
    public static final TagKey<Block> ORES_NICKEL = blockTag(new ResourceLocation("c", "nickel_ores"));
    public static final TagKey<Block> ORES_COPPER = blockTag(new ResourceLocation("c", "copper_ores"));
    public static final TagKey<Block> ORES_TIN = blockTag(new ResourceLocation("c", "tin_ores"));
    public static final TagKey<Block> ORES_OSMIUM = blockTag(new ResourceLocation("c", "osmium_ores"));
    public static final TagKey<Block> ORES_URANIUM = blockTag(new ResourceLocation("c", "uranium_ores"));
    public static final TagKey<Block> ORES_ZINC = blockTag(new ResourceLocation("c", "zinc_ores"));

    public static final TagKey<Block> ALUMINUM_BLOCK = blockTag(new ResourceLocation("c", "aluminum_blocks"));
    public static final TagKey<Block> SILVER_BLOCK = blockTag(new ResourceLocation("c", "silver_blocks"));
    public static final TagKey<Block> LEAD_BLOCK = blockTag(new ResourceLocation("c", "lead_blocks"));
    public static final TagKey<Block> NICKEL_BLOCK = blockTag(new ResourceLocation("c", "nickel_blocks"));
    public static final TagKey<Block> TIN_BLOCK = blockTag(new ResourceLocation("c", "tin_blocks"));
    public static final TagKey<Block> OSMIUM_BLOCK = blockTag(new ResourceLocation("c", "osmium_blocks"));
    public static final TagKey<Block> URANIUM_BLOCK = blockTag(new ResourceLocation("c", "uranium_blocks"));
    public static final TagKey<Block> ZINC_BLOCK = blockTag(new ResourceLocation("c", "zinc_blocks"));

    public static final TagKey<Block> RAW_ALUMINUM_BLOCK = blockTag(new ResourceLocation("c", "raw_aluminum_blocks"));
    public static final TagKey<Block> RAW_SILVER_BLOCK = blockTag(new ResourceLocation("c", "raw_silver_blocks"));
    public static final TagKey<Block> RAW_LEAD_BLOCK = blockTag(new ResourceLocation("c", "raw_lead_blocks"));
    public static final TagKey<Block> RAW_NICKEL_BLOCK = blockTag(new ResourceLocation("c", "raw_nickel_blocks"));
    public static final TagKey<Block> RAW_TIN_BLOCK = blockTag(new ResourceLocation("c", "raw_tin_blocks"));
    public static final TagKey<Block> RAW_OSMIUM_BLOCK = blockTag(new ResourceLocation("c", "raw_osmium_blocks"));
    public static final TagKey<Block> RAW_URANIUM_BLOCK = blockTag(new ResourceLocation("c", "raw_uranium_blocks"));
    public static final TagKey<Block> RAW_ZINC_BLOCK = blockTag(new ResourceLocation("c", "raw_zinc_blocks"));

    public FabricBlockTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    private static TagKey<Block> blockTag(ResourceLocation location) {
        return TagKey.create(Registries.BLOCK, location);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        // ***************************************************************************** //
        //  Fabric Tags (Only Account for Fabric Tags Here)
        // ***************************************************************************** //

        tag(ORES).add(
                BEOBlocks.END_EMERALD_ORE,
                BEOBlocks.END_DIAMOND_ORE,
                BEOBlocks.END_GOLD_ORE,
                BEOBlocks.END_REDSTONE_ORE,
                BEOBlocks.END_LAPIS_ORE,
                BEOBlocks.END_COAL_ORE,
                BEOBlocks.END_SILVER_ORE,
                BEOBlocks.END_IRON_ORE,
                BEOBlocks.END_LEAD_ORE,
                BEOBlocks.END_NICKEL_ORE,
                BEOBlocks.END_COPPER_ORE,
                BEOBlocks.END_ALUMINUM_ORE,
                BEOBlocks.END_TIN_ORE,
                BEOBlocks.END_OSMIUM_ORE,
                BEOBlocks.END_URANIUM_ORE,
                BEOBlocks.END_ZINC_ORE
        );

        tag(ORES_COAL).add(BEOBlocks.END_COAL_ORE);
        tag(ORES_DIAMOND).add(BEOBlocks.END_DIAMOND_ORE);
        tag(ORES_GOLD).add(BEOBlocks.END_GOLD_ORE);
        tag(ORES_EMERALD).add(BEOBlocks.END_EMERALD_ORE);
        tag(ORES_IRON).add(BEOBlocks.END_IRON_ORE);
        tag(ORES_LAPIS).add(BEOBlocks.END_LAPIS_ORE);
        tag(ORES_REDSTONE).add(BEOBlocks.END_REDSTONE_ORE);

        tag(ORES_ALUMINUM).add(BEOBlocks.END_ALUMINUM_ORE);
        tag(ORES_SILVER).add(BEOBlocks.END_SILVER_ORE);
        tag(ORES_LEAD).add(BEOBlocks.END_LEAD_ORE);
        tag(ORES_NICKEL).add(BEOBlocks.END_NICKEL_ORE);
        tag(ORES_COPPER).add(BEOBlocks.END_COPPER_ORE);
        tag(ORES_TIN).add(BEOBlocks.END_TIN_ORE);
        tag(ORES_OSMIUM).add(BEOBlocks.END_OSMIUM_ORE);
        tag(ORES_URANIUM).add(BEOBlocks.END_URANIUM_ORE);
        tag(ORES_ZINC).add(BEOBlocks.END_ZINC_ORE);

        tag(ALUMINUM_BLOCK).add(BEOBlocks.ALUMINUM_BLOCK);
        tag(SILVER_BLOCK).add(BEOBlocks.SILVER_BLOCK);
        tag(LEAD_BLOCK).add(BEOBlocks.LEAD_BLOCK);
        tag(NICKEL_BLOCK).add(BEOBlocks.NICKEL_BLOCK);
        tag(TIN_BLOCK).add(BEOBlocks.TIN_BLOCK);
        tag(OSMIUM_BLOCK).add(BEOBlocks.OSMIUM_BLOCK);
        tag(URANIUM_BLOCK).add(BEOBlocks.URANIUM_BLOCK);
        tag(ZINC_BLOCK).add(BEOBlocks.ZINC_BLOCK);

        tag(RAW_ALUMINUM_BLOCK).add(BEOBlocks.RAW_ALUMINUM_BLOCK);
        tag(RAW_SILVER_BLOCK).add(BEOBlocks.RAW_SILVER_BLOCK);
        tag(RAW_LEAD_BLOCK).add(BEOBlocks.RAW_LEAD_BLOCK);
        tag(RAW_NICKEL_BLOCK).add(BEOBlocks.RAW_NICKEL_BLOCK);
        tag(RAW_TIN_BLOCK).add(BEOBlocks.RAW_TIN_BLOCK);
        tag(RAW_OSMIUM_BLOCK).add(BEOBlocks.RAW_OSMIUM_BLOCK);
        tag(RAW_URANIUM_BLOCK).add(BEOBlocks.RAW_URANIUM_BLOCK);
        tag(RAW_ZINC_BLOCK).add(BEOBlocks.RAW_ZINC_BLOCK);
    }
}
