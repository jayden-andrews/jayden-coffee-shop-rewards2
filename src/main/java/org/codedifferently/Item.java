package org.codedifferently;

public class Item {
    private String name;
    private double price;
    private boolean isDrink;
    private int points;
    public Item(String name, double price, boolean isDrink, int points) {
        this.name = name;
        this.price = price;
        this.isDrink = isDrink;
        this.points = points;
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
