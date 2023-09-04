package net.mcs3.basicendores.worldgen.item;

import net.mcs3.basicendores.init.BEOBlocks;
import net.mcs3.basicendores.init.BEOItems;
import net.mcs3.basicendores.platform.services.IPlatformHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.mcs3.basicendores.util.helper.ResourceLocationHelper.prefix;

@SuppressWarnings("unused")
public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> BEO_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, prefix("basicendores"));

    public static final CreativeModeTab BEO_TAB = IPlatformHelper.INSTANCE.creativeTab()
            .icon(() -> new ItemStack(BEOBlocks.END_EMERALD_ORE.asItem()))
            .title(Component.translatable("itemGroup.beo.basicendores"))
            .displayItems((params, output) -> {
                output.accept(BEOBlocks.END_EMERALD_ORE.asItem());
                output.accept(BEOBlocks.END_DIAMOND_ORE.asItem());
                output.accept(BEOBlocks.END_GOLD_ORE.asItem());
                output.accept(BEOBlocks.END_REDSTONE_ORE.asItem());
                output.accept(BEOBlocks.END_LAPIS_ORE.asItem());
                output.accept(BEOBlocks.END_COAL_ORE.asItem());
                output.accept(BEOBlocks.END_SILVER_ORE.asItem());
                output.accept(BEOBlocks.END_IRON_ORE.asItem());
                output.accept(BEOBlocks.END_LEAD_ORE.asItem());
                output.accept(BEOBlocks.END_NICKEL_ORE.asItem());
                output.accept(BEOBlocks.END_COPPER_ORE.asItem());
                output.accept(BEOBlocks.END_ALUMINUM_ORE.asItem());
                output.accept(BEOBlocks.END_TIN_ORE.asItem());
                output.accept(BEOBlocks.END_OSMIUM_ORE.asItem());
                output.accept(BEOBlocks.END_URANIUM_ORE.asItem());
                output.accept(BEOBlocks.END_ZINC_ORE.asItem());

                output.accept(BEOBlocks.ALUMINUM_BLOCK.asItem());
                output.accept(BEOBlocks.LEAD_BLOCK.asItem());
                output.accept(BEOBlocks.NICKEL_BLOCK.asItem());
                output.accept(BEOBlocks.SILVER_BLOCK.asItem());
                output.accept(BEOBlocks.TIN_BLOCK.asItem());
                output.accept(BEOBlocks.OSMIUM_BLOCK.asItem());
                output.accept(BEOBlocks.URANIUM_BLOCK.asItem());
                output.accept(BEOBlocks.ZINC_BLOCK.asItem());

                output.accept(BEOItems.ALUMINUM_INGOT);
                output.accept(BEOItems.LEAD_INGOT);
                output.accept(BEOItems.NICKEL_INGOT);
                output.accept(BEOItems.SILVER_INGOT);
                output.accept(BEOItems.TIN_INGOT);
                output.accept(BEOItems.OSMIUM_INGOT);
                output.accept(BEOItems.URANIUM_INGOT);
                output.accept(BEOItems.ZINC_INGOT);

                output.accept(BEOItems.ALUMINUM_NUGGET);
                output.accept(BEOItems.COPPER_NUGGET);
                output.accept(BEOItems.LEAD_NUGGET);
                output.accept(BEOItems.NICKEL_NUGGET);
                output.accept(BEOItems.SILVER_NUGGET);
                output.accept(BEOItems.OSMIUM_NUGGET);
                output.accept(BEOItems.TIN_NUGGET);
                output.accept(BEOItems.ZINC_NUGGET);

                output.accept(BEOBlocks.RAW_ALUMINUM_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_LEAD_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_NICKEL_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_SILVER_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_TIN_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_OSMIUM_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_URANIUM_BLOCK.asItem());
                output.accept(BEOBlocks.RAW_ZINC_BLOCK.asItem());

                output.accept(BEOItems.RAW_ALUMINUM);
                output.accept(BEOItems.RAW_LEAD);
                output.accept(BEOItems.RAW_NICKEL);
                output.accept(BEOItems.RAW_SILVER);
                output.accept(BEOItems.RAW_TIN);
                output.accept(BEOItems.RAW_OSMIUM);
                output.accept(BEOItems.RAW_URANIUM);
                output.accept(BEOItems.RAW_ZINC);
            })
            .build();
}
