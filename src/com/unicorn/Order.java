package com.unicorn;

import java.util.List;

/**
 * Created by heiki on 11/02/16.
 */
public class Order {

    private List<Product> products;

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

    private Location location;

    public Order(List<Product> products, Location location) {
        this.products = products;
        this.location = location;
    }

    public void giveProduct(Product product) {
        products.remove(product);
    }

    public void giveProducts(List<Product> list) {
        for(Product p : list) {
            products.remove(p);
        }
    }

}
