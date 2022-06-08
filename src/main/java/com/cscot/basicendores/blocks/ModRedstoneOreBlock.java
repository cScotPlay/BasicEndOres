package com.cscot.basicendores.blocks;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.ItemLists;
import com.cscot.basicendores.api.OreBlockLists;
import com.cscot.basicendores.config.ModConfig;
import com.cscot.basicendores.util.helpers.OreTooltipHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.ToIntFunction;

public class ModRedstoneOreBlock extends RedstoneOreBlock
{
    public ModRedstoneOreBlock(String oreName) {

        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .ticksRandomly()
                .luminance(createLightLevelFromLitBlockState())
                .nonOpaque()
                .strength(3.0f, 3.0f)
                .sounds(BlockSoundGroup.NETHER_GOLD_ORE));

        this.setDefaultState(this.getDefaultState().with(LIT, false));
        new Identifier(BasicEndOres.MOD_ID, oreName);

        ItemLists.add(oreName, new BlockItem(this, new Item.Settings().group(BasicEndOres.ITEMGROUP)));
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, BlockView worldIn, List<Text> tooltip, TooltipContext flagIn)
    {
        if (this == OreBlockLists.END_REDSTONE_ORE){
            if (!ModConfig.redstoneGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(OreTooltipHelper.RedstoneOreTip.oreTip, ModConfig.redstoneMinHeight, ModConfig.redstoneMaxHeight));}
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        world.syncWorldEvent(player, 2001, pos, getRawIdFromState(state));
        int isSilkTouching = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, player.getMainHandStack());

        if (state.isIn(BlockTags.GUARDED_BY_PIGLINS) && ModConfig.piglinGuard) {
            if (ModConfig.silkEffect) {
                if (isSilkTouching < 1) {
                    PiglinBrain.onGuardedBlockInteracted(player, false);
                }
            }else PiglinBrain.onGuardedBlockInteracted(player, false);
        }
    }

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState() {
        return (state) -> (Boolean)state.get(Properties.LIT) ? 9 : 0;
    }
}
