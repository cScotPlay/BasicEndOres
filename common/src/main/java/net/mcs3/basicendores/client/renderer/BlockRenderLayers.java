package net.mcs3.basicendores.client.renderer;

import net.mcs3.basicendores.init.BEOBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class BlockRenderLayers {

    public static void registerRenderLayers(BiConsumer<Block, RenderType> consumer) {

        consumer.accept(BEOBlocks.END_EMERALD_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_DIAMOND_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_GOLD_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_REDSTONE_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_LAPIS_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_COAL_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_SILVER_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_IRON_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_LEAD_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_NICKEL_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_COPPER_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_ALUMINUM_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_TIN_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_OSMIUM_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_URANIUM_ORE, RenderType.cutout());
        consumer.accept(BEOBlocks.END_ZINC_ORE, RenderType.cutout());
    }

    private BlockRenderLayers() {}
}
