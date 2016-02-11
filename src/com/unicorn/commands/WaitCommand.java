package com.unicorn.commands;

import com.unicorn.Drone;

/**
 * Created by heiki on 11/02/16.
 */
public class WaitCommand implements Command {

    public WaitCommand(Drone drone, int turns) {
        this.drone = drone;
        this.turns = turns;
    }

    private Drone drone;
    private CommandTag commandTag = CommandTag.WAIT;
    private int turns;

    public void printCommand() {
        System.out.println(drone.getId() +  ' ' + commandTag.toString() + ' ' + turns);
    }

}
