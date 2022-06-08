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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

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
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(EmeraldOreTip.oreTip, ModConfig.emeraldMinHeight, ModConfig.emeraldMaxHeight));}
        else if (this == OreBlockLists.END_DIAMOND_ORE){
            if (!ModConfig.diamondGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(DiamondOreTip.oreTip, ModConfig.diamondMinHeight, ModConfig.diamondMaxHeight));}
        else if (this == OreBlockLists.END_REDSTONE_ORE){
            if (!ModConfig.redstoneGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(RedstoneOreTip.oreTip, ModConfig.redstoneMinHeight, ModConfig.redstoneMaxHeight));}
        else if (this == OreBlockLists.END_LAPIS_ORE){
            if (!ModConfig.lapisGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(LapisOreTip.oreTip, ModConfig.lapisMinHeight, ModConfig.lapisMaxHeight));}
        else if (this == OreBlockLists.END_COAL_ORE){
            if (!ModConfig.coalGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(CoalOreTip.oreTip, ModConfig.coalMinHeight, ModConfig.coalMaxHeight));}
        else if (this == OreBlockLists.END_GOLD_ORE){
            if (!ModConfig.goldGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(GoldOreTip.oreTip, ModConfig.goldMinHeight, ModConfig.goldMaxHeight));}
        else if (this == OreBlockLists.END_SILVER_ORE){
            if (!ModConfig.silverGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(SilverOreTip.oreTip, ModConfig.silverMinHeight, ModConfig.silverMaxHeight));}
        else if (this == OreBlockLists.END_IRON_ORE){
            if (!ModConfig.ironGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(IronOreTip.oreTip, ModConfig.ironMinHeight, ModConfig.ironMaxHeight));}
        else if (this == OreBlockLists.END_LEAD_ORE){
            if (!ModConfig.leadGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(LeadOreTip.oreTip, ModConfig.leadMinHeight, ModConfig.leadMaxHeight));}
        else if (this == OreBlockLists.END_NICKEL_ORE){
            if (!ModConfig.nickelGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(NickelOreTip.oreTip, ModConfig.nickelMinHeight, ModConfig.nickelMaxHeight));}
        else if (this == OreBlockLists.END_COPPER_ORE){
            if (!ModConfig.copperGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(CopperOreTip.oreTip, ModConfig.copperMinHeight, ModConfig.copperMaxHeight));}
        else if (this == OreBlockLists.END_ALUMINUM_ORE){
            if (!ModConfig.aluminumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(AluminumOreTip.oreTip, ModConfig.aluminumMinHeight, ModConfig.aluminumMaxHeight));}
        else if (this == OreBlockLists.END_TIN_ORE){
            if (!ModConfig.tinGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(TinOreTip.oreTip, ModConfig.tinMinHeight, ModConfig.tinMaxHeight));}
        else if (this == OreBlockLists.END_OSMIUM_ORE){
            if (!ModConfig.osmiumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(OsmiumOreTip.oreTip, ModConfig.osmiumMinHeight, ModConfig.osmiumMaxHeight));}
        else if (this == OreBlockLists.END_URANIUM_ORE){
            if (!ModConfig.uraniumGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(UraniumOreTip.oreTip, ModConfig.uraniumMinHeight, ModConfig.uraniumMaxHeight));}
        else if (this == OreBlockLists.END_ZINC_ORE){
            if (!ModConfig.zincGeneration){
                tooltip.add(new TranslatableText("tooltip.config.tip"));}
            else tooltip.add(new TranslatableText(ZincOreTip.oreTip, ModConfig.zincMinHeight, ModConfig.zincMaxHeight));}
    }

//    @Override  //Updated getExperience
//    protected int getExperienceWhenMined(Random random) {
//        if (this == OreBlockLists.END_COAL_ORE) {
//            return MathHelper.nextInt(random, 0, 2);
//        } else if (this == OreBlockLists.END_DIAMOND_ORE) {
//            return MathHelper.nextInt(random, 3, 7);
//        } else if (this == OreBlockLists.END_EMERALD_ORE) {
//            return MathHelper.nextInt(random, 3, 7);
//        } else if (this == OreBlockLists.END_LAPIS_ORE) {
//            return MathHelper.nextInt(random, 2, 5);
//        } else {
//            return this == OreBlockLists.END_REDSTONE_ORE ? MathHelper.nextInt(random, 2, 5) : 0;
//        }
//    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
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
