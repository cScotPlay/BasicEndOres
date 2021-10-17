package com.cscot.basicendores.objects;

import com.cscot.basicendores.BasicEndOres;
import com.cscot.basicendores.config.OreGenerationConfig;
import com.cscot.basicendores.config.OreProtectionConfig;
import com.cscot.basicendores.lists.BlockOreList;
import com.cscot.basicendores.api.EndermanEvent;
import com.cscot.basicendores.lists.ItemList;
import com.cscot.basicendores.util.handler.RegisteryHandler;
import com.cscot.basicendores.util.helpers.OreTooltipHelper.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockOreBase extends OreBlock
{
    private String oreName, tagName;
    private Block oreBlock;

    public BlockOreBase(String oreName)
    {
        super(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0f, 3.0f).sound(SoundType.NETHER_GOLD));
        setRegistryName(BasicEndOres.modid, oreName);

        ItemList.items.add(new BlockItem(this.getBlock(), new Item.Properties().group(BasicEndOres.beoItemGroup)).setRegistryName(RegisteryHandler.RegistryEvents.location(oreName)));
        BlockOreList.blockores.add(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        if(this == BlockOreList.end_emerald_ore){
            if (!OreGenerationConfig.emeraldGeneration.get()){
            tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(EmeraldOreTip.oreTip, OreGenerationConfig.emeraldMinHeight.get().toString(), OreGenerationConfig.emeraldMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_diamond_ore){
            if (!OreGenerationConfig.diamondGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(DiamondOreTip.oreTip, OreGenerationConfig.diamondMinHeight.get().toString(), OreGenerationConfig.diamondMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_redstone_ore){
            if (!OreGenerationConfig.redstoneGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(RedstoneOreTip.oreTip, OreGenerationConfig.redstoneMinHeight.get().toString(), OreGenerationConfig.redstoneMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_lapis_ore){
            if (!OreGenerationConfig.lapisGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(LapisOreTip.oreTip, OreGenerationConfig.lapisMinHeight.get().toString(), OreGenerationConfig.lapisMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_coal_ore){
            if (!OreGenerationConfig.coalGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(CoalOreTip.oreTip, OreGenerationConfig.coalMinHeight.get().toString(), OreGenerationConfig.coalMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_silver_ore){
            if (!OreGenerationConfig.silverGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(SilverOreTip.oreTip, OreGenerationConfig.silverMinHeight.get().toString(), OreGenerationConfig.silverMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_gold_ore){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(GoldOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_iron_ore){
            if (!OreGenerationConfig.ironGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(IronOreTip.oreTip, OreGenerationConfig.ironMinHeight.get().toString(), OreGenerationConfig.ironMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_lead_ore){
            if (!OreGenerationConfig.leadGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(LeadOreTip.oreTip, OreGenerationConfig.leadMinHeight.get().toString(), OreGenerationConfig.leadMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_nickel_ore){
            if (!OreGenerationConfig.nickelGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(NickelOreTip.oreTip, OreGenerationConfig.nickelMinHeight.get().toString(), OreGenerationConfig.nickelMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_copper_ore){
            if (!OreGenerationConfig.copperGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(CopperOreTip.oreTip, OreGenerationConfig.copperMinHeight.get().toString(), OreGenerationConfig.copperMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_aluminum_ore){
            if (!OreGenerationConfig.aluminumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(AluminumOreTip.oreTip, OreGenerationConfig.aluminumMinHeight.get().toString(), OreGenerationConfig.aluminumMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_tin_ore){
            if (!OreGenerationConfig.tinGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(TinOreTip.oreTip, OreGenerationConfig.tinMinHeight.get().toString(), OreGenerationConfig.tinMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_osmium_ore){
            if (!OreGenerationConfig.osmiumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(OsmiumOreTip.oreTip, OreGenerationConfig.osmiumMinHeight.get().toString(), OreGenerationConfig.osmiumMaxHeight.get().toString()));}
        else if (this == BlockOreList.end_uranium_ore){
            if (!OreGenerationConfig.uraniumGeneration.get()){
                tooltip.add(new TranslationTextComponent("tooltip.config.tip"));}
            else tooltip.add(new TranslationTextComponent(UraniumOreTip.oreTip, OreGenerationConfig.uraniumMinHeight.get().toString(), OreGenerationConfig.uraniumMaxHeight.get().toString()));}
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 2;
    }

    @Override  //Updated getExperience
    protected int getExperience(Random p_220281_1_) {
        if (this == BlockOreList.end_coal_ore) {
            return MathHelper.nextInt(p_220281_1_, 0, 2);
        } else if (this == BlockOreList.end_diamond_ore) {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        } else if (this == BlockOreList.end_emerald_ore) {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        } else if (this == BlockOreList.end_lapis_ore) {
            return MathHelper.nextInt(p_220281_1_, 2, 5);
        } else {
            return this == BlockOreList.end_redstone_ore ? MathHelper.nextInt(p_220281_1_, 2, 5) : 0;
        }
    }

    /**
     * Spawn additional block drops such as experience or other entities
     */
    @Override
    public void spawnAdditionalDrops(BlockState state, ServerWorld worldIn, BlockPos blockPos, ItemStack itemStack) {
        super.spawnAdditionalDrops(state, worldIn, blockPos, itemStack);
    }

    @Override  //New from 1.13 Upadated function now has SilkTouch as a variable
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch)
    {
        World world = reader instanceof World ? (World)reader : null;

        if (silktouch == 0)
        {
            int i = 0;
            if (this == BlockOreList.end_coal_ore) {
                i = MathHelper.nextInt(RANDOM, 1, 3);
            } else if (this == BlockOreList.end_diamond_ore) {
                i = MathHelper.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.end_emerald_ore) {
                i = MathHelper.nextInt(RANDOM, 4, 8);
            } else if (this == BlockOreList.end_lapis_ore) {
                i = MathHelper.nextInt(RANDOM, 3, 6);
            } else if (this == BlockOreList.end_redstone_ore) {
                i = MathHelper.nextInt(RANDOM, 2, 6);
            }
            return i;
        }
        return 0;
    }

    public static void endermenGuards(World worldIn, BlockPos pos, PlayerEntity thief) {

        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int rngProt;

        rngProt = OreProtectionConfig.protectionRange.get();

        List<EndermanEntity> list = worldIn.getEntitiesWithinAABB(EndermanEntity.class, new AxisAlignedBB(x - rngProt, y - rngProt, z - rngProt, x + rngProt, y + rngProt, z + rngProt));

        EndermanEvent event = new EndermanEvent(worldIn, pos, thief, list);
        if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event)) return;

        for(EndermanEntity guard : list)
        {
            guard.setAttackTarget(event.getThief());
        }
    }
}
