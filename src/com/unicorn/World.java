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

    private Warehouse getWarehouseWith(List<Product> products) {
        int m = 0;
        Warehouse res = warehouses.get(0);

        for(int i=0; i<warehouses.size(); i++) {
            int c = 0;
            for(int j=0; j<products.size(); j++) {
               // TODO
            }
            if(c > m) {
                res = warehouses.get(i);
                m = c;
            }
        }

        return res;
    }

    public void schedule() {

        if(orders.isEmpty()) return;
        if(drones.isEmpty()) return;

        Order order = orders.get(0);
        Drone drone = drones.get(0);

        Warehouse warehouse = getWarehouseWith(order.getProducts());

    }
}
