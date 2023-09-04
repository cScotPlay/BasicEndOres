package net.mcs3.basicendores.init;

import net.mcs3.basicendores.Constants;
import net.mcs3.basicendores.worldgen.level.block.ModOreBlock;
import net.mcs3.basicendores.worldgen.level.block.ModRedstoneOreBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.BiConsumer;
import java.util.function.ToIntFunction;

import static net.mcs3.basicendores.util.helper.ResourceLocationHelper.prefix;

public class BEOBlocks {

    public static final BlockBehaviour.Properties END_ORES_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 9.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties REDSTONE_ORE_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 9.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties METAL_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL);
    public static final BlockBehaviour.Properties RAW_ORE_BLOCKS = BlockBehaviour.Properties.of().mapColor(MapColor.RAW_IRON).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F);

    public static final Block END_EMERALD_ORE = new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(3, 7));
    public static final Block END_DIAMOND_ORE = new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(3,7));
    public static final Block END_GOLD_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_REDSTONE_ORE = new ModRedstoneOreBlock(REDSTONE_ORE_PROPERTIES);
    public static final Block END_LAPIS_ORE = new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(2,5));
    public static final Block END_COAL_ORE = new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(0,2));
    public static final Block END_SILVER_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_IRON_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_LEAD_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_NICKEL_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_COPPER_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_ALUMINUM_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_TIN_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_OSMIUM_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_URANIUM_ORE = new ModOreBlock(END_ORES_PROPERTIES);
    public static final Block END_ZINC_ORE = new ModOreBlock(END_ORES_PROPERTIES);

    public static final Block ALUMINUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block LEAD_BLOCK = new Block(METAL_BLOCKS);
    public static final Block NICKEL_BLOCK = new Block(METAL_BLOCKS);
    public static final Block SILVER_BLOCK = new Block(METAL_BLOCKS);
    public static final Block TIN_BLOCK = new Block(METAL_BLOCKS);
    public static final Block OSMIUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block URANIUM_BLOCK = new Block(METAL_BLOCKS);
    public static final Block ZINC_BLOCK = new Block(METAL_BLOCKS);

    public static final Block RAW_ALUMINUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_LEAD_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_NICKEL_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_TIN_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_OSMIUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_URANIUM_BLOCK = new Block(RAW_ORE_BLOCKS);
    public static final Block RAW_ZINC_BLOCK = new Block(RAW_ORE_BLOCKS);

    public static void registerBlocks(BiConsumer<Block, ResourceLocation> r) {

        r.accept(END_EMERALD_ORE, prefix("end_emerald_ore"));
        r.accept(END_DIAMOND_ORE, prefix("end_diamond_ore"));
        r.accept(END_GOLD_ORE, prefix("end_gold_ore"));
        r.accept(END_REDSTONE_ORE, prefix("end_redstone_ore"));
        r.accept(END_LAPIS_ORE, prefix("end_lapis_ore"));
        r.accept(END_COAL_ORE, prefix("end_coal_ore"));
        r.accept(END_SILVER_ORE, prefix("end_silver_ore"));
        r.accept(END_IRON_ORE, prefix("end_iron_ore"));
        r.accept(END_LEAD_ORE, prefix("end_lead_ore"));
        r.accept(END_NICKEL_ORE, prefix("end_nickel_ore"));
        r.accept(END_COPPER_ORE, prefix("end_copper_ore"));
        r.accept(END_ALUMINUM_ORE, prefix("end_aluminum_ore"));
        r.accept(END_TIN_ORE, prefix("end_tin_ore"));
        r.accept(END_OSMIUM_ORE, prefix("end_osmium_ore"));
        r.accept(END_URANIUM_ORE, prefix("end_uranium_ore"));
        r.accept(END_ZINC_ORE, prefix("end_zinc_ore"));

        r.accept(ALUMINUM_BLOCK, prefix("aluminum_block"));
        r.accept(LEAD_BLOCK, prefix("lead_block"));
        r.accept(NICKEL_BLOCK, prefix("nickel_block"));
        r.accept(SILVER_BLOCK, prefix("silver_block"));
        r.accept(TIN_BLOCK, prefix("tin_block"));
        r.accept(OSMIUM_BLOCK, prefix("osmium_block"));
        r.accept(URANIUM_BLOCK, prefix("uranium_block"));
        r.accept(ZINC_BLOCK, prefix("zinc_block"));

        r.accept(RAW_ALUMINUM_BLOCK, prefix("raw_aluminum_block"));
        r.accept(RAW_LEAD_BLOCK, prefix("raw_lead_block"));
        r.accept(RAW_NICKEL_BLOCK, prefix("raw_nickel_block"));
        r.accept(RAW_SILVER_BLOCK, prefix("raw_silver_block"));
        r.accept(RAW_TIN_BLOCK, prefix("raw_tin_block"));
        r.accept(RAW_OSMIUM_BLOCK, prefix("raw_osmium_block"));
        r.accept(RAW_URANIUM_BLOCK, prefix("raw_uranium_block"));
        r.accept(RAW_ZINC_BLOCK, prefix("raw_zinc_block"));

        Constants.LOGGER.info("BEO - Block Registered");
    }

    public static void registerItemBlocks(BiConsumer<Item, ResourceLocation> r) {
        Item.Properties properties = BEOItems.defaultBuilder();

        r.accept(new BlockItem(END_EMERALD_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_EMERALD_ORE));
        r.accept(new BlockItem(END_DIAMOND_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_DIAMOND_ORE));
        r.accept(new BlockItem(END_GOLD_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_GOLD_ORE));
        r.accept(new BlockItem(END_REDSTONE_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_REDSTONE_ORE));
        r.accept(new BlockItem(END_LAPIS_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_LAPIS_ORE));
        r.accept(new BlockItem(END_COAL_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_COAL_ORE));
        r.accept(new BlockItem(END_SILVER_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_SILVER_ORE));
        r.accept(new BlockItem(END_IRON_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_IRON_ORE));
        r.accept(new BlockItem(END_LEAD_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_LEAD_ORE));
        r.accept(new BlockItem(END_NICKEL_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_NICKEL_ORE));
        r.accept(new BlockItem(END_COPPER_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_COPPER_ORE));
        r.accept(new BlockItem(END_ALUMINUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_ALUMINUM_ORE));
        r.accept(new BlockItem(END_TIN_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_TIN_ORE));
        r.accept(new BlockItem(END_OSMIUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_OSMIUM_ORE));
        r.accept(new BlockItem(END_URANIUM_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_URANIUM_ORE));
        r.accept(new BlockItem(END_ZINC_ORE, properties), BuiltInRegistries.BLOCK.getKey(END_ZINC_ORE));

        r.accept(new BlockItem(ALUMINUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(ALUMINUM_BLOCK));
        r.accept(new BlockItem(LEAD_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(LEAD_BLOCK));
        r.accept(new BlockItem(NICKEL_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(NICKEL_BLOCK));
        r.accept(new BlockItem(SILVER_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(SILVER_BLOCK));
        r.accept(new BlockItem(TIN_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(TIN_BLOCK));
        r.accept(new BlockItem(OSMIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(OSMIUM_BLOCK));
        r.accept(new BlockItem(URANIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(URANIUM_BLOCK));
        r.accept(new BlockItem(ZINC_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(ZINC_BLOCK));

        r.accept(new BlockItem(RAW_ALUMINUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_ALUMINUM_BLOCK));
        r.accept(new BlockItem(RAW_LEAD_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_LEAD_BLOCK));
        r.accept(new BlockItem(RAW_NICKEL_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_NICKEL_BLOCK));
        r.accept(new BlockItem(RAW_SILVER_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_SILVER_BLOCK));
        r.accept(new BlockItem(RAW_TIN_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_TIN_BLOCK));
        r.accept(new BlockItem(RAW_OSMIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_OSMIUM_BLOCK));
        r.accept(new BlockItem(RAW_URANIUM_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_URANIUM_BLOCK));
        r.accept(new BlockItem(RAW_ZINC_BLOCK, properties), BuiltInRegistries.BLOCK.getKey(RAW_ZINC_BLOCK));

        Constants.LOGGER.info("BEO - Block Items Registered");
    }

    private static ToIntFunction<BlockState> litBlockEmission(int $$0) {
        return ($$1) -> $$1.getValue(BlockStateProperties.LIT) ? $$0 : 0;
    }
}
