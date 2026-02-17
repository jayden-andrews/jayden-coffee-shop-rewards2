package org.codedifferently;

public class CoffeeItem {
    // Represents the name of the item.
    private String name;
    // Represents the price of the item
    private final double price;

    // Constructor
    public CoffeeItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Returns the name of the item.
    public String getName() {
        return name;
    }

    // Returns the price of the item.
    public double getPrice() {
        return price;
    }
}
