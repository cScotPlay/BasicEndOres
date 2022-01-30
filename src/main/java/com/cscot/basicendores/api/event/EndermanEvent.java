package com.cscot.basicendores.api.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

import java.util.List;

@Cancelable
public class EndermanEvent extends Event
{
    private final Level world;
    private final BlockPos pos;
    private final LivingEntity thief;
    private List<EnderMan> guards;

    /**
     * This event fires within BlockOreBase#endermanGuards
     *
     * This event is {@link Cancelable}.
     * If this event is canceled no aggression against the thief occurs
     *
     * @param world world provided to BlockOreBase#pigmenGuards
     * @param pos BlockPos provided to BlockOreBase#pigmenGuards
     * @param thief LivingEntity that is being targeted
     */
    public EndermanEvent(Level world, BlockPos pos, LivingEntity thief, List<EnderMan> guards)
    {
        super();
        this.world = world;
        this.pos = pos;
        this.thief = thief;
        this.guards = guards;
    }

    public Level getWorld()
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

    public List<EnderMan> getGuards()
    {
        return guards;
    }
}