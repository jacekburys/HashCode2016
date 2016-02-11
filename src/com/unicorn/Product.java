package com.unicorn;

/**
 * Created by heiki on 11/02/16.
 */
public class Product {

    private int id;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int weight;

    public Product(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

}
