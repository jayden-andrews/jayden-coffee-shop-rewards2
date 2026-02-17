package org.codedifferently;

public class CoffeeItem {
    private String name;
    private final double price;

    public CoffeeItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
