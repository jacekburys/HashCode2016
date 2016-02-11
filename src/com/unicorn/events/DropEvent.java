package com.unicorn.events;

import com.unicorn.Drone;
import com.unicorn.Order;
import com.unicorn.Product;
import com.unicorn.World;

import java.util.List;

/**
 * Created by jacek on 11/02/16.
 */
public class DropEvent extends Event {

    private Drone drone;
    private Order order;
    private List<Product> products;

    @Override
    public void execute(World world) {
        world.drones.add(drone);
        // TODO : move the products to the order

    }
}
