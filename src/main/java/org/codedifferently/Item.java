package org.codedifferently;

public class Item {
    private String name;
    private double price;
    private boolean isDrink;
    private int points;
    public Item(String name, double price, boolean isDrink) {
        this.name = name;
        this.price = price;
        this.isDrink = isDrink;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsDrink() {
        return isDrink;
    }

    public int getPoints() {
        return points;
    }
}
