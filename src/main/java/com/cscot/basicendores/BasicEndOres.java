package com.cscot.basicendores;

import com.cscot.basicendores.api.OreBlockLists;
import com.cscot.basicendores.config.ModConfig;
import com.cscot.basicendores.util.handlers.ConfigHandler;
import com.cscot.basicendores.util.handlers.RegistryHandler;
import com.cscot.basicendores.world.gen.feature.ModOreConfiguredFeatures;
import com.cscot.basicendores.world.gen.feature.ModOrePlacedFeature;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicEndOres implements ModInitializer {

	public static final String MOD_ID = "beo";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static BasicEndOres INSTANCE;

	public static ItemGroup ITEMGROUP = FabricItemGroupBuilder.build(
			new Identifier("basicendore", "item_group"),
			() -> new ItemStack(Item.BLOCK_ITEMS.get(OreBlockLists.END_EMERALD_ORE)));

	public static ConfigHandler BEO_CONFIGS = new ConfigHandler(ModConfig.class, MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		INSTANCE = this;

		RegistryHandler.onOreRegistry();
		RegistryHandler.onBlockRegistry();
		RegistryHandler.onItemRegistry();
		RegistryHandler.onIngotRegistry();

		ModOreConfiguredFeatures.initModOreConfiguredFeatures();
		ModOrePlacedFeature.initOrePlacedFeatures();

		LOGGER.info("Basic End Ores setup done!");
	}
}
