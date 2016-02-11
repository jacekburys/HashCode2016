package com.unicorn;

import java.util.List;

/**
 * Created by heiki on 11/02/16.
 */
public class Order {

    private List<Product> products;

    private Location location;

    public Order(List<Product> products, Location location) {
        this.products = products;
        this.location = location;
    }

}
