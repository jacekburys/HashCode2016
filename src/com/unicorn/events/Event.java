package com.unicorn.events;

import com.unicorn.World;

/**
 * Created by jacek on 11/02/16.
 */
public abstract class Event {
    public abstract void execute(World world);
}
