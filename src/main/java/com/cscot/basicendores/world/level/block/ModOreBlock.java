package com.cscot.basicendores.world.level.block;

import com.cscot.basicendores.api.event.EndermanEvent;
import com.cscot.basicendores.client.renderer.IHelpRender;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.config.OreProtectionConfig;
import com.cscot.basicendores.util.helpers.OreTooltipHelper.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ModOreBlock extends OreBlock implements IHelpRender
{
    private final UniformInt xpRange;

    public ModOreBlock(Properties properties, UniformInt experienceDropped)
    {
        super(properties.noOcclusion());
        this.xpRange = experienceDropped;
    }

    public ModOreBlock(Properties properties)
    {
        this(properties, UniformInt.of(0, 0));
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(RANDOM) : 0;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        if(this == ModBlocks.END_EMERALD_ORE.get()){
            if (!OreGenerationConfig.emeraldGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(EmeraldOreTip.oreTip, OreGenerationConfig.emeraldMinHeight.get().toString(), OreGenerationConfig.emeraldMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_DIAMOND_ORE.get()){
            if (!OreGenerationConfig.diamondGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_LAPIS_ORE.get()){
            if (!OreGenerationConfig.lapisGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_COAL_ORE.get()){
            if (!OreGenerationConfig.coalGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_GOLD_ORE.get()){
            if (!OreGenerationConfig.goldGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(GoldOreTip.oreTip, OreGenerationConfig.goldMinHeight.get().toString(), OreGenerationConfig.goldMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_SILVER_ORE.get()){
            if (!OreGenerationConfig.silverGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_IRON_ORE.get()){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_LEAD_ORE.get()){
            if (!OreGenerationConfig.leadGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_NICKEL_ORE.get()){
            if (!OreGenerationConfig.nickelGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_COPPER_ORE.get()){
            if (!OreGenerationConfig.copperGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_ALUMINUM_ORE.get()){
            if (!OreGenerationConfig.aluminumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_TIN_ORE.get()){
            if (!OreGenerationConfig.tinGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_OSMIUM_ORE.get()){
            if (!OreGenerationConfig.osmiumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(OsmiumOreTip.oreTip, OreGenerationConfig.osmiumMinHeight.get().toString(), OreGenerationConfig.osmiumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_URANIUM_ORE.get()){
            if (!OreGenerationConfig.uraniumGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(UraniumOreTip.oreTip, OreGenerationConfig.uraniumMinHeight.get().toString(), OreGenerationConfig.uraniumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_ZINC_ORE.get()){
            if (!OreGenerationConfig.zincGeneration.get()){
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslatableComponent(ZincOreTip.oreTip, OreGenerationConfig.zincMinHeight.get().toString(), OreGenerationConfig.zincMaxHeight.get().toString()));}
    }

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel worldIn, BlockPos blockPos, ItemStack itemStack) {
        super.spawnAfterBreak(state, worldIn, blockPos, itemStack);
    }

    public static void endermenGuards(Level worldIn, BlockPos pos, Player thief)
    {
        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int rngProt;

        rngProt = OreProtectionConfig.protectionRange.get();

        List<EnderMan> list = worldIn.getEntitiesOfClass(EnderMan.class, new AABB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        EndermanEvent event = new EndermanEvent(worldIn, pos, thief, list);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;

        for(EnderMan guard : list)
        {
            guard.setTarget(event.getThief());
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public RenderType getRenderType() {
        return RenderType.cutout();
    }
}
