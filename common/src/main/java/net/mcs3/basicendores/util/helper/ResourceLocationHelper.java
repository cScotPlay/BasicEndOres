package net.mcs3.basicendores.util.helper;

import net.mcs3.basicendores.Constants;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationHelper {
    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(Constants.MOD_ID, path);
    }
}
