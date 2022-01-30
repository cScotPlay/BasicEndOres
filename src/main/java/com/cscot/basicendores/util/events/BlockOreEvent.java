package com.cscot.basicendores.util.events;

import com.cscot.basicendores.config.OreProtectionConfig;
import com.cscot.basicendores.util.helpers.BlockListHelper;
import com.cscot.basicendores.world.level.block.ModOreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockOreEvent
{

    /** Reference to the Player who broke the block. If no player is available, use a EntityFakePlayer */

    @SubscribeEvent (priority = EventPriority.HIGH, receiveCanceled = true)
    public static void BreakEvent(BlockEvent.BreakEvent event)
    {
        Player player = event.getPlayer();
        int isSilkTouching = EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, player);
        Level world = player.level;
        BlockPos pos = event.getPos();
        Block block = event.getState().getBlock();

        if(OreProtectionConfig.endermenGuard.get()) {

            //Checks if the Config file is set to true
            if (OreProtectionConfig.silkEffect.get()) {

                if(isSilkTouching < 1){

                    guardOres(block, world, pos, player);
                }
            }else guardOres(block, world, pos, player);
        }
    }

    private static void guardOres(Block block, Level world, BlockPos pos, Player player)
    {
        if(BlockListHelper.protectedOres(block))
        {
            ModOreBlock.endermenGuards(world, pos, player);
        }
    }
}
