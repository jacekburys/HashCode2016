package com.unicorn.commands;

import com.unicorn.Drone;
import com.unicorn.Product;
import com.unicorn.Warehouse;

/**
 * Created by heiki on 11/02/16.
 */
public class DeliverCommand {

    public DeliverCommand(Drone drone, int customerId, Product product, int count) {
        this.drone = drone;
        this.customerId = customerId;
        this.product = product;
        this.count = count;
    }

    private Drone drone;
    private CommandTag commandTag = CommandTag.DELIVER;
    private int customerId;
    private Product product;
    private int count;

    public void printCommand() {
        System.out.println(drone.getId() +  ' ' + commandTag.toString() + ' ' + customerId + ' ' + product.getId() + count);
    }
}
