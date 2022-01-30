package com.cscot.basicendores.world.level.block;

import com.cscot.basicendores.BasicEndOres;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public class ModBlocks
{
    public static final BlockBehaviour.Properties END_ORES_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties REDSTONE_ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE);
    public static final BlockBehaviour.Properties METAL_BLOCKS = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL);
    public static final BlockBehaviour.Properties RAW_ORE_BLOCKS = BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.STONE);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BasicEndOres.MODID);

    public static final RegistryObject<ModOreBlock> END_EMERALD_ORE = BLOCKS.register("end_emerald_ore", () -> new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(3,7)));
    public static final RegistryObject<ModOreBlock> END_DIAMOND_ORE = BLOCKS.register("end_diamond_ore", () -> new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(3,7)));
    public static final RegistryObject<ModRedstoneOreBlock> END_REDSTONE_ORE = BLOCKS.register("end_redstone_ore", () -> new ModRedstoneOreBlock(REDSTONE_ORE_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_LAPIS_ORE = BLOCKS.register("end_lapis_ore", () -> new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(2,5)));
    public static final RegistryObject<ModOreBlock> END_COAL_ORE = BLOCKS.register("end_coal_ore", () -> new ModOreBlock(END_ORES_PROPERTIES, UniformInt.of(0,2)));
    public static final RegistryObject<ModOreBlock> END_GOLD_ORE = BLOCKS.register("end_gold_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_SILVER_ORE = BLOCKS.register("end_silver_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_IRON_ORE = BLOCKS.register("end_iron_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_LEAD_ORE = BLOCKS.register("end_lead_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_NICKEL_ORE = BLOCKS.register("end_nickel_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_COPPER_ORE = BLOCKS.register("end_copper_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_ALUMINUM_ORE = BLOCKS.register("end_aluminum_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_TIN_ORE = BLOCKS.register("end_tin_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_OSMIUM_ORE = BLOCKS.register("end_osmium_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_URANIUM_ORE = BLOCKS.register("end_uranium_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));
    public static final RegistryObject<ModOreBlock> END_ZINC_ORE = BLOCKS.register("end_zinc_ore", () -> new ModOreBlock(END_ORES_PROPERTIES));

    public static final RegistryObject<ModMetalBlock> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> TIN_BLOCK = BLOCKS.register("tin_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new ModMetalBlock(METAL_BLOCKS));
    public static final RegistryObject<ModMetalBlock> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new ModMetalBlock(METAL_BLOCKS));

    public static final RegistryObject<ModRawOreBlock> RAW_ALUMINUM_BLOCK = BLOCKS.register("raw_aluminum_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_OSMIUM_BLOCK = BLOCKS.register("raw_osmium_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_URANIUM_BLOCK = BLOCKS.register("raw_uranium_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));
    public static final RegistryObject<ModRawOreBlock> RAW_ZINC_BLOCK = BLOCKS.register("raw_zinc_block", () -> new ModRawOreBlock(RAW_ORE_BLOCKS));

    private static ToIntFunction<BlockState> litBlockEmission(int lightLevel)
    {
        return (blockState) -> {
            return blockState.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
        };
    }
}
