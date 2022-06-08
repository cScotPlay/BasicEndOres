package com.cscot.basicendores.blocks;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.api.ItemLists;
import com.cscot.basicendores.api.OreBlockLists;
import com.cscot.basicendores.config.ModConfig;
import com.cscot.basicendores.util.helpers.OreTooltipHelper.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class ModOreBlock extends OreBlock
{
    private final UniformIntProvider experienceDropped;

    public ModOreBlock(String oreName, UniformIntProvider experienceDropped, Integer pickaxeLevel)
    {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .strength(3.0f, 3.0f)
                .nonOpaque()
                .sounds(BlockSoundGroup.NETHER_GOLD_ORE));
        this.experienceDropped = experienceDropped;
        new Identifier(BasicEndOres.MOD_ID, oreName);

        ItemLists.add(oreName, new BlockItem(this, new Item.Settings().group(BasicEndOres.ITEMGROUP)));
    }

    public ModOreBlock(String oreName, Integer pickaxeLevel)
    {
        this(oreName, UniformIntProvider.create(0, 0), pickaxeLevel);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, BlockView worldIn, List<Text> tooltip, TooltipContext flagIn)
    {
        if(this == OreBlockLists.END_EMERALD_ORE){
            if (!ModConfig.emeraldGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(EmeraldOreTip.oreTip, ModConfig.emeraldMinHeight, ModConfig.emeraldMaxHeight));}
        else if (this == OreBlockLists.END_DIAMOND_ORE){
            if (!ModConfig.diamondGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(DiamondOreTip.oreTip, ModConfig.diamondMinHeight, ModConfig.diamondMaxHeight));}
        else if (this == OreBlockLists.END_REDSTONE_ORE){
            if (!ModConfig.redstoneGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(RedstoneOreTip.oreTip, ModConfig.redstoneMinHeight, ModConfig.redstoneMaxHeight));}
        else if (this == OreBlockLists.END_LAPIS_ORE){
            if (!ModConfig.lapisGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(LapisOreTip.oreTip, ModConfig.lapisMinHeight, ModConfig.lapisMaxHeight));}
        else if (this == OreBlockLists.END_COAL_ORE){
            if (!ModConfig.coalGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(CoalOreTip.oreTip, ModConfig.coalMinHeight, ModConfig.coalMaxHeight));}
        else if (this == OreBlockLists.END_GOLD_ORE){
            if (!ModConfig.goldGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(GoldOreTip.oreTip, ModConfig.goldMinHeight, ModConfig.goldMaxHeight));}
        else if (this == OreBlockLists.END_SILVER_ORE){
            if (!ModConfig.silverGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(SilverOreTip.oreTip, ModConfig.silverMinHeight, ModConfig.silverMaxHeight));}
        else if (this == OreBlockLists.END_IRON_ORE){
            if (!ModConfig.ironGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(IronOreTip.oreTip, ModConfig.ironMinHeight, ModConfig.ironMaxHeight));}
        else if (this == OreBlockLists.END_LEAD_ORE){
            if (!ModConfig.leadGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(LeadOreTip.oreTip, ModConfig.leadMinHeight, ModConfig.leadMaxHeight));}
        else if (this == OreBlockLists.END_NICKEL_ORE){
            if (!ModConfig.nickelGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(NickelOreTip.oreTip, ModConfig.nickelMinHeight, ModConfig.nickelMaxHeight));}
        else if (this == OreBlockLists.END_COPPER_ORE){
            if (!ModConfig.copperGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(CopperOreTip.oreTip, ModConfig.copperMinHeight, ModConfig.copperMaxHeight));}
        else if (this == OreBlockLists.END_ALUMINUM_ORE){
            if (!ModConfig.aluminumGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(AluminumOreTip.oreTip, ModConfig.aluminumMinHeight, ModConfig.aluminumMaxHeight));}
        else if (this == OreBlockLists.END_TIN_ORE){
            if (!ModConfig.tinGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(TinOreTip.oreTip, ModConfig.tinMinHeight, ModConfig.tinMaxHeight));}
        else if (this == OreBlockLists.END_OSMIUM_ORE){
            if (!ModConfig.osmiumGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(OsmiumOreTip.oreTip, ModConfig.osmiumMinHeight, ModConfig.osmiumMaxHeight));}
        else if (this == OreBlockLists.END_URANIUM_ORE){
            if (!ModConfig.uraniumGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(UraniumOreTip.oreTip, ModConfig.uraniumMinHeight, ModConfig.uraniumMaxHeight));}
        else if (this == OreBlockLists.END_ZINC_ORE){
            if (!ModConfig.zincGeneration){
                tooltip.add(Text.translatable("tooltip.config.tip"));}
            else tooltip.add(Text.translatable(ZincOreTip.oreTip, ModConfig.zincMinHeight, ModConfig.zincMaxHeight));}
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, stack, dropExperience);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.experienceDropped.get(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }
    }

    @Override
    public void onBreak(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        /*int x = pos.getX(), y = pos.getY(), z = pos.getZ();  TODO Update with Endermen Attacking Options

        int rngProt;

        rngProt = ModConfig.protectionRange;

        List<EndermanEntity> list = worldIn.getEntitiesByClass(EndermanEntity.class, new Box(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt), null);

        if (ModConfig.protectedBlocks.stream().toArray(this.getName().asString())){
            for(EndermanEntity guard : list)
            {
                guard.setTarget(player);
            }
        }


        world.syncWorldEvent(player, 2001, pos, getRawIdFromState(state));
        int isSilkTouching = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, player.getMainHandStack());

        if (this.isIn(BlockTags.GUARDED_BY_PIGLINS) && ModConfig.piglinGuard) {
            if (ModConfig.silkEffect) {
                if (isSilkTouching < 1) {
                    PiglinBrain.onGuardedBlockInteracted(player, false);
                }
            }else PiglinBrain.onGuardedBlockInteracted(player, false);
        }*/
    }
}
