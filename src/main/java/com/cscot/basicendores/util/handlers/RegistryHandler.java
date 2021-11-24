package com.cscot.basicendores.util.handlers;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.BlockLists;
import com.cscot.basicendores.api.ItemLists;
import com.cscot.basicendores.api.OreBlockLists;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistryHandler
{
    private static final Logger LOGGER = LogManager.getLogger(BasicEndOres.MOD_ID);

    //TODO Clean up registery of blocks and items to sequentially load

    public static void onOreRegistry()
    {
        //For loop to register the Array of the ore blocks
        for (Identifier id : OreBlockLists.OREBLOCKS.keySet())
        {
            Registry.register(Registry.BLOCK, id, OreBlockLists.OREBLOCKS.get(id));
        }
        LOGGER.info("BEO Ore Blocks Registered");
    }

    public static void onBlockRegistry()
    {
        for (Identifier id : BlockLists.BLOCKS.keySet())
        {
            Registry.register(Registry.BLOCK, id, BlockLists.BLOCKS.get(id));
        }
        LOGGER.info("BEO Blocks Registered");
    }

    public static void onItemRegistry()
    {
        for (Identifier id : ItemLists.ITEMS.keySet())
        {
            Registry.register(Registry.ITEM, id, ItemLists.ITEMS.get(id));
        }
        LOGGER.info("BEO Items Registered");
    }

    public static void onIngotRegistry()
    {
        for (Identifier id : ItemLists.INGOTS.keySet())
        {
            Registry.register(Registry.ITEM, id, ItemLists.INGOTS.get(id));
        }
        LOGGER.info("BEO Ingots & Nuggets Registered");

    }
}
