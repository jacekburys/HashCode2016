package com.unicorn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacek on 11/02/16.
 */
public class World {

    public List<Order> orders = new ArrayList<>();
    public List<Warehouse> warehouses = new ArrayList<>();
    public List<Drone> drones = new ArrayList<>();

    public World(List<Warehouse> warehouses, List<Drone> drones, List<Order> orders) {
        this.warehouses = warehouses;
        this.drones = drones;
        this.orders = orders;
    }

    public void schedule() {

    }
}
