package org.codedifferently;

public class Customer {
    private String name;
    private String phoneNumber;
    private double tab;
    private int points;

    public Customer() {
        this.name = "John Doe";
        this.phoneNumber = "000-000-0000";
        this.points = 0;
    }

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getTab() {
        return tab;
    }

    public void setTab(double tab) {
        this.tab = tab;
    }
}
