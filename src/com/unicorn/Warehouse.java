package com.unicorn;

import java.util.Map;

/**
 * Created by heiki on 11/02/16.
 */
public class Warehouse {

    private Location location;

    private Map<Product, Integer> store;

    public Warehouse(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void addProduct(Product product, int count) {
        store.put(product, count);
    }

    public int getProduct(Product product, int count) {
        int currentCount = store.get(product);
        int returnAmount = Math.max(currentCount, count);
        store.replace(product, currentCount - returnAmount);
        return returnAmount;
    }

    public int getProductCount(Product product) {
        return store.get(product);
    }
}
