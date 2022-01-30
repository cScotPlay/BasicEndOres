package com.cscot.basicendores.client.renderer;

public interface IHelpRender
{
    /**
     * @return state.getMaterial() == Material.GLASS ? RenderType.getTranslucent() : RenderType.getCutout();
     */
    net.minecraft.client.renderer.RenderType getRenderType();
}
