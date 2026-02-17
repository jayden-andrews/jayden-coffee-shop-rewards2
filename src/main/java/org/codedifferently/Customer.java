package org.codedifferently;

public class Customer {
    private String name;
    private String email;
    private int drinksPurchased;
    private boolean rewardActive;
    private double tab;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.drinksPurchased = 0;
        this.rewardActive = false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDrinksPurchased() {
        this.drinksPurchased++;
    }

    public void setDrinksPurchased(int num) {
        this.drinksPurchased = 0;
    }

    public boolean getRewardActive() {
        return this.rewardActive;
    }

    public int getDrinksPurchased() {
        return this.drinksPurchased;
    }

    public void setRewardActive(boolean status) {
        this.rewardActive = status;
    }

    public boolean isEligible() {
        if (this.drinksPurchased == 4) {
            setRewardActive(true);
            return true;
        } else {
            return false;
        }
    }

    public double getTab() {
        return tab;
    }

    public void setTab(double tab) {
        this.tab += tab;
    }
}
