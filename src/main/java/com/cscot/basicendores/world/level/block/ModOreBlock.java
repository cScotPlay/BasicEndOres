package com.cscot.basicendores.world.level.block;

import com.cscot.basicendores.api.event.EndermanEvent;
import com.cscot.basicendores.client.renderer.IHelpRender;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.config.OreProtectionConfig;
import com.cscot.basicendores.util.helpers.OreTooltipHelper.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ModOreBlock extends DropExperienceBlock implements IHelpRender
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
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(randomSource) : 0;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        if(this == ModBlocks.END_EMERALD_ORE.get()){
            if (!OreGenerationConfig.emeraldGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(EmeraldOreTip.oreTip, OreGenerationConfig.emeraldMinHeight.get().toString(), OreGenerationConfig.emeraldMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_DIAMOND_ORE.get()){
            if (!OreGenerationConfig.diamondGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_LAPIS_ORE.get()){
            if (!OreGenerationConfig.lapisGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_COAL_ORE.get()){
            if (!OreGenerationConfig.coalGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_GOLD_ORE.get()){
            if (!OreGenerationConfig.goldGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(GoldOreTip.oreTip, OreGenerationConfig.goldMinHeight.get().toString(), OreGenerationConfig.goldMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_SILVER_ORE.get()){
            if (!OreGenerationConfig.silverGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_IRON_ORE.get()){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_LEAD_ORE.get()){
            if (!OreGenerationConfig.leadGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_NICKEL_ORE.get()){
            if (!OreGenerationConfig.nickelGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_COPPER_ORE.get()){
            if (!OreGenerationConfig.copperGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_ALUMINUM_ORE.get()){
            if (!OreGenerationConfig.aluminumGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_TIN_ORE.get()){
            if (!OreGenerationConfig.tinGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_OSMIUM_ORE.get()){
            if (!OreGenerationConfig.osmiumGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(OsmiumOreTip.oreTip, OreGenerationConfig.osmiumMinHeight.get().toString(), OreGenerationConfig.osmiumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_URANIUM_ORE.get()){
            if (!OreGenerationConfig.uraniumGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(UraniumOreTip.oreTip, OreGenerationConfig.uraniumMinHeight.get().toString(), OreGenerationConfig.uraniumMaxHeight.get().toString()));}
        else if (this == ModBlocks.END_ZINC_ORE.get()){
            if (!OreGenerationConfig.zincGeneration.get()){
                tooltip.add(Component.translatable("tooltip.config.tip"));}
            else tooltip.add(Component.translatable(ZincOreTip.oreTip, OreGenerationConfig.zincMinHeight.get().toString(), OreGenerationConfig.zincMaxHeight.get().toString()));}
    }

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel worldIn, BlockPos blockPos, ItemStack itemStack, boolean dropXP) {
        super.spawnAfterBreak(state, worldIn, blockPos, itemStack, dropXP);
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
