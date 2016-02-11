package com.unicorn;

import java.util.List;

public class Drone {
    final int id;
    final int maximumLoad;
    private Location location;
    private List<Product> products;

    public Drone(int id, int maximumLoad, List<Product> products, Location location) {
        this.id = id;
        this.maximumLoad = maximumLoad;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
