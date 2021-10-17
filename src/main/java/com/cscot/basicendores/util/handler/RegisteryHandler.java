package com.cscot.basicendores.util.handler;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.lists.BlockList;
import com.cscot.basicendores.lists.BlockOreList;
import com.cscot.basicendores.lists.IngotList;
import com.cscot.basicendores.lists.ItemList;
import com.cscot.basicendores.util.helpers.BlockListHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisteryHandler
{
    private static final Logger LOGGER = LogManager.getLogger(BasicEndOres.modid);


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onOreRegistry(final RegistryEvent.Register<Block> oreRegistryEvent)
        {
            //For loop to register the Array of the ore blocks
            for (Block block : BlockOreList.blockores)
            {
                oreRegistryEvent.getRegistry().register(block);
            }

            LOGGER.info("Ore Blocks Registered");

        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegisterEvent)
        {
            //For loop to register Array of the Items from Blocks
            for (Item item : ItemList.items)
            {
                itemRegisterEvent.getRegistry().register(item);
            }

            LOGGER.info("ItemBlocks Registered");
        }

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            for (Block block : BlockList.blocks) {

                blockRegistryEvent.getRegistry().register(block);
            }

            LOGGER.info("Blocks Registered");
        }

        @SubscribeEvent
        public static void onIngotRegistry(final RegistryEvent.Register<Item> ingotRegistryEvent)
        {
            ingotRegistryEvent.getRegistry().registerAll(

                    //Register Ingots
                    IngotList.aluminum_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("aluminum_ingot")),
                    IngotList.copper_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("copper_ingot")),
                    IngotList.lead_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("lead_ingot")),
                    IngotList.nickel_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("nickel_ingot")),
                    IngotList.silver_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("silver_ingot")),
                    IngotList.tin_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("tin_ingot")),
                    IngotList.osmium_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("osmium_ingot")),
                    IngotList.uranium_ingot = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("uranium_ingot")),

                    //Register Nuggets
                    IngotList.aluminum_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("aluminum_nugget")),
                    IngotList.copper_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("copper_nugget")),
                    IngotList.lead_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("lead_nugget")),
                    IngotList.nickel_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("nickel_nugget")),
                    IngotList.silver_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("silver_nugget")),
                    IngotList.tin_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("tin_nugget")),
                    IngotList.osmium_nugget = new Item(new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(location("osmium_nugget"))
            );

            LOGGER.info("Ingots Registered");
        }

        public static ResourceLocation location (String name)
        {
            return new ResourceLocation(BasicEndOres.modid, name);
        }
    }

    public static void ProtectedListInit()
    {
        //Loads the list of protected blocks
        BlockListHelper.initProtectedBlocks();
    }
}
