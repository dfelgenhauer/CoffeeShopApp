package com.dylanfelgenhauer.coffeeshop;

public class Product {
    private String name = "";
    private Double cost = 0.0;
    private int quantity = 0;

    public Product() {
        this.name = "None";
        this.cost = 0.0;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
