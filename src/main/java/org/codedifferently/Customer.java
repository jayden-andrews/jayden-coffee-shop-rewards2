package org.codedifferently;

public class Customer {
    // Represents the customer's name.
    private String name;
    // Represents the customer's email address.
    private String email;
    // Represents the total number of drinks that the customer has purchased.
    private int drinksPurchased;
    // Represents whether the customer has a reward active
    private boolean rewardActive;
    // Represents the customer's tab.
    private double tab;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.drinksPurchased = 0;
        this.rewardActive = false;
    }

    // Returns the current customer's name.
    public String getName() {
        return name;
    }

    // Returns the current customer's email.
    public String getEmail() {
        return email;
    }

    // Sets the current customer's name.
    public void setName(String name) {
        this.name = name;
    }

    // Sets the current customer's email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Increments drinksPurchased by 1.
    public void setDrinksPurchased() {
        this.drinksPurchased++;
    }

    // Sets the amount of drinks that the customer's bought to 0.
    public void setDrinksPurchased(int num) {
        this.drinksPurchased = 0;
    }

    // Returns a boolean representing whether the current customer has a reward active.
    public boolean getRewardActive() {
        return this.rewardActive;
    }

    // Returns the total number of drinks that the current customer has purchased.
    public int getDrinksPurchased() {
        return this.drinksPurchased;
    }

    // Sets whether the current customer has a reward active.
    public void setRewardActive(boolean status) {
        this.rewardActive = status;
    }

    // A method that returns a boolean representing whether the current customer is eligible for a reward.
    public boolean isEligible() {
        if (this.drinksPurchased == 4) {
            setRewardActive(true);
            return true;
        } else {
            return false;
        }
    }

    // Gets the current customer's tab.
    public double getTab() {
        return tab;
    }

    // Sets the current customer's tab.
    public void setTab(double tab) {
        this.tab += tab;
    }
}
