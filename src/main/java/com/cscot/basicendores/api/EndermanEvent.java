package com.cscot.basicendores.api;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

@Cancelable
public class EndermanEvent extends Event
{
    private final World world;
    private final BlockPos pos;
    private final LivingEntity thief;
    private List<EndermanEntity> guards;

    /**
     * This event fires within BlockOreBase#piglinGuards
     *
     * This event is {@link Cancelable}.
     * If this event is canceled no aggression against the thief occurs
     *
     * @param world world provided to BlockOreBase#pigmenGuards
     * @param pos BlockPos provided to BlockOreBase#pigmenGuards
     * @param thief LivingEntity that is being targeted
     */
    public EndermanEvent(World world, BlockPos pos, LivingEntity thief, List<EndermanEntity> guards)
    {
        super();
        this.world = world;
        this.pos = pos;
        this.thief = thief;
        this.guards = guards;
    }

    public World getWorld()
    {
        return world;
    }

    public BlockPos getPos()
    {
        return pos;
    }

    public LivingEntity getThief()
    {
        return thief;
    }

    public List<EndermanEntity> getGuards()
    {
        return guards;
    }
}