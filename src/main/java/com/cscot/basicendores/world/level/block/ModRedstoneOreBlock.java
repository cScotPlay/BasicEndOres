package com.cscot.basicendores.world.level.block;

import com.cscot.basicendores.api.event.EndermanEvent;
import com.cscot.basicendores.client.renderer.IHelpRender;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.config.OreProtectionConfig;
import com.cscot.basicendores.util.helpers.OreTooltipHelper;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ModRedstoneOreBlock extends RedStoneOreBlock implements IHelpRender
{
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public ModRedstoneOreBlock(Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        if (this == ModBlocks.END_REDSTONE_ORE.get()) {
            if (!OreGenerationConfig.redstoneGeneration.get()) {
                tooltip.add(new TranslatableComponent("tooltip.config.tip"));
            } else
                tooltip.add(new TranslatableComponent(OreTooltipHelper.RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));
        }
    }

    public static void endermenGuards(Level worldIn, BlockPos pos, Player thief) {

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
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + RANDOM.nextInt(5) : 0;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public RenderType getRenderType() {
        return RenderType.cutout();
    }
}
