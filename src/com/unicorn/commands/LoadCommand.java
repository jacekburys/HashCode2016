package com.unicorn.commands;

import com.unicorn.Drone;
import com.unicorn.Product;
import com.unicorn.Warehouse;

/**
 * Created by heiki on 11/02/16.
 */
public class LoadCommand implements Command {

    public LoadCommand(Drone drone, Warehouse warehouse, Product product, int count) {
        this.drone = drone;
        this.warehouse = warehouse;
        this.product = product;
        this.count = count;
    }

    private Drone drone;
    private CommandTag commandTag = CommandTag.LOAD;
    private Warehouse warehouse;
    private Product product;
    private int count;

    public void printCommand() {
        System.out.println(drone.getId() +  ' ' + commandTag.toString() + ' ' + warehouse.getId() + ' ' + product.getId() + count);
    }

}
