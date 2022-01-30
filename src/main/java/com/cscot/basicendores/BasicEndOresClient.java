package com.cscot.basicendores;

import com.cscot.basicendores.client.ClientHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class BasicEndOresClient
{
    public static void clientSetup(IEventBus modEventBus, IEventBus forgeEventBus)
    {
        modEventBus.addListener(BasicEndOresClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event)
    {
        ClientHandler.registerBlockRender(event);
    }
}
