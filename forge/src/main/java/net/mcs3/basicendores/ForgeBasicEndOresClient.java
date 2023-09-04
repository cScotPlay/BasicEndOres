package net.mcs3.basicendores;

import net.mcs3.basicendores.client.ShippedResourcePack;
import net.mcs3.basicendores.client.renderer.BlockRenderLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgeBasicEndOresClient {

    @SubscribeEvent
    public static void clientInit(FMLClientSetupEvent evt) {
        ShippedResourcePack.extractFiles("Basic End Ores 32x");
        BlockRenderLayers.registerRenderLayers(ItemBlockRenderTypes::setRenderLayer);
    }
}
