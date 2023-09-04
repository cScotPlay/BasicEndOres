package net.mcs3.basicendores;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mcs3.basicendores.client.ShippedResourcePack;
import net.mcs3.basicendores.client.renderer.BlockRenderLayers;

public class FabricBasicEndOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ShippedResourcePack.extractFiles("Basic End Ores 32x");
        BlockRenderLayers.registerRenderLayers(BlockRenderLayerMap.INSTANCE::putBlock);
    }


}
