package com.cscot.basicendores.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Arrays;
import java.util.List;

public class OreProtectionConfig
{

    //Variables for Ore Protection

    public static ForgeConfigSpec.BooleanValue endermenGuard;
    public static ForgeConfigSpec.BooleanValue silkEffect;
    public static ForgeConfigSpec.IntValue protectionRange;
    public static ForgeConfigSpec.ConfigValue<List<? extends String>> protectedBlocks;

    public static void Init(ForgeConfigSpec.Builder builder) {
        //builder.pop();
        builder.comment("Piglin Projection Settings");
        //builder.push(protName);

        endermenGuard = builder
                .comment("If set to 'true' Endermen will protect Nether Ores")
                .define("ore_protector.endermenGuard", true);
        silkEffect = builder
                .comment("Set to false if you want the Endermen to attack when using Silk Touch Tools")
                .define("ore_protector.silkEffect", true);
        protectionRange = builder
                .comment("Set range that Endermen will aggro when mining ores(Default = 8)")
                .defineInRange("ore_protector.protectionRange", 8, 0, 64);
        protectedBlocks = builder
                .comment("Add Blocks to be protected by Endermen (Example: 'minecraft:end_stone')")
                .defineList("ore_protector.protectedBlocks", Arrays.asList(new String[]
                        {
                                "beo:end_emerald_ore",
                                "beo:end_diamond_ore",
                                "beo:end_lapis_ore",
                                "beo:end_redstone_ore",
                                "beo:end_gold_ore",
                                "beo:end_silver_ore",
                                "beo:end_iron_ore",
                                "beo:end_lead_ore",
                                "beo:end_nickel_ore",
                                "beo:end_coal_ore",
                                "beo:end_copper_ore",
                                "beo:end_aluminum_ore",
                                "beo:end_tin_ore",
                                "beo:end_osmium_ore",
                                "beo:end_uranium_ore"
                        }), (obj) -> obj instanceof String ? true : false);
    }

}
