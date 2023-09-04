package net.mcs3.basicendores.init;

import net.mcs3.basicendores.platform.services.IPlatformHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import static net.mcs3.basicendores.util.helper.ResourceLocationHelper.prefix;

public class BEOItems {
    public static final Map<ResourceLocation, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ALUMINUM_INGOT = make(prefix("aluminum_ingot"), new Item(defaultBuilder()));
    public static final Item LEAD_INGOT = make(prefix("lead_ingot"), new Item(defaultBuilder()));
    public static final Item NICKEL_INGOT = make(prefix("nickel_ingot"), new Item(defaultBuilder()));
    public static final Item SILVER_INGOT = make(prefix("silver_ingot"), new Item(defaultBuilder()));
    public static final Item TIN_INGOT = make(prefix("tin_ingot"), new Item(defaultBuilder()));
    public static final Item OSMIUM_INGOT = make(prefix("osmium_ingot"), new Item(defaultBuilder()));
    public static final Item URANIUM_INGOT = make(prefix("uranium_ingot"), new Item(defaultBuilder()));
    public static final Item ZINC_INGOT = make(prefix("zinc_ingot"), new Item(defaultBuilder()));

    public static final Item ALUMINUM_NUGGET = make(prefix("aluminum_nugget"), new Item(defaultBuilder()));
    public static final Item COPPER_NUGGET = make(prefix("copper_nugget"), new Item(defaultBuilder()));
    public static final Item LEAD_NUGGET = make(prefix("lead_nugget"), new Item(defaultBuilder()));
    public static final Item NICKEL_NUGGET = make(prefix("nickel_nugget"), new Item(defaultBuilder()));
    public static final Item SILVER_NUGGET = make(prefix("silver_nugget"), new Item(defaultBuilder()));
    public static final Item OSMIUM_NUGGET = make(prefix("osmium_nugget"), new Item(defaultBuilder()));
    public static final Item TIN_NUGGET = make(prefix("tin_nugget"), new Item(defaultBuilder()));
    public static final Item ZINC_NUGGET = make(prefix("zinc_nugget"), new Item(defaultBuilder()));

    public static final Item RAW_ALUMINUM = make(prefix("raw_aluminum"), new Item(defaultBuilder()));
    public static final Item RAW_LEAD = make(prefix("raw_lead"), new Item(defaultBuilder()));
    public static final Item RAW_NICKEL = make(prefix("raw_nickel"), new Item(defaultBuilder()));
    public static final Item RAW_SILVER = make(prefix("raw_silver"), new Item(defaultBuilder()));
    public static final Item RAW_TIN = make(prefix("raw_tin"), new Item(defaultBuilder()));
    public static final Item RAW_OSMIUM = make(prefix("raw_osmium"), new Item(defaultBuilder()));
    public static final Item RAW_URANIUM = make(prefix("raw_uranium"), new Item(defaultBuilder()));
    public static final Item RAW_ZINC = make(prefix("raw_zinc"), new Item(defaultBuilder()));

    public static Item.Properties defaultBuilder() {
        return IPlatformHelper.INSTANCE.defaultItemBuilder();
    }

    private static <T extends Item> T make(ResourceLocation id, T item) {
        var old = ITEMS.put(id, item);
        if (old != null) {
            throw new IllegalArgumentException("Typo? Duplicate id " + id);
        }
        return item;
    }

    public static void registerItems(BiConsumer<Item, ResourceLocation> r) {
        for (var e : ITEMS.entrySet()) {
            r.accept(e.getValue(), e.getKey());
        }
    }
}
