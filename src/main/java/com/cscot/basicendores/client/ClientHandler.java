package com.cscot.basicendores.client;

import com.cscot.basicendores.api.OreBlockLists;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientHandler implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        registerRenderTypes();
    }

    private static void registerRenderTypes()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_EMERALD_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_DIAMOND_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_REDSTONE_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_LAPIS_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_COAL_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_GOLD_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_SILVER_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_IRON_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_LEAD_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_NICKEL_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_COPPER_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_ALUMINUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_TIN_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_OSMIUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_URANIUM_ORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OreBlockLists.END_ZINC_ORE, RenderLayer.getCutout());

    }
}
