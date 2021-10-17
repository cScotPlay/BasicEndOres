package com.cscot.basicendores.lists;

import net.minecraft.item.Item;

public class IngotList
{
    //Ingots List
    public static Item aluminum_ingot;
    public static Item copper_ingot;
    public static Item lead_ingot;
    public static Item nickel_ingot;    
    public static Item silver_ingot;
    public static Item tin_ingot;
    public static Item osmium_ingot;
    public static Item uranium_ingot;

    //Nugget List
    public static Item aluminum_nugget;
    public static Item copper_nugget;
    public static Item lead_nugget;
    public static Item nickel_nugget;
    public static Item silver_nugget;
    public static Item osmium_nugget;
    public static Item tin_nugget;

    public static void RegisterLists()
    {
        addIngots();
        addNuggets();
    }

    public static void addIngots()
    {
        ItemList.INGOTS.add(aluminum_ingot);
        ItemList.INGOTS.add(copper_ingot);
        ItemList.INGOTS.add(lead_ingot);
        ItemList.INGOTS.add(nickel_ingot);
        ItemList.INGOTS.add(silver_ingot);
        ItemList.INGOTS.add(tin_ingot);
        ItemList.INGOTS.add(osmium_ingot);
        ItemList.INGOTS.add(uranium_ingot);
    }

    public static void addNuggets()
    {
        ItemList.NUGGETS.add(aluminum_nugget);
        ItemList.NUGGETS.add(copper_nugget);
        ItemList.NUGGETS.add(lead_nugget);
        ItemList.NUGGETS.add(nickel_nugget);
        ItemList.NUGGETS.add(silver_nugget);
        ItemList.NUGGETS.add(osmium_nugget);
        ItemList.NUGGETS.add(tin_nugget);
    }
}
