package org.codedifferently;

import java.util.Scanner;

public class Purchase {

    public static void displayMenu(Customer patron, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, Scanner sc) {
        int input;

        String item1Display = item1.getName() + ": $" + item1.getPrice();
        String item2Display = item2.getName() + ": $" + item2.getPrice();
        String item3Display = item3.getName() + ": $" + item3.getPrice();

        System.out.println("\nAnd what can I get for you today?\n");
        do {
            System.out.println("Menu");
            System.out.println("1. " + item1Display);
            System.out.println("2. " + item2Display);
            System.out.println("3. " + item3Display);
            System.out.println("4. Checkout");
            System.out.print("Selection: ");

            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    itemConfirmation(patron, item1);
                    break;
                case 2:
                    itemConfirmation(patron, item2);
                    break;
                case 3:
                    itemConfirmation(patron, item3);
                    break;
                case 4:
                    System.out.println("Thank you for shopping at Triple C's");
                    break;
            }
        } while (input != 4);
    }

    public static void itemConfirmation(Customer patron, CoffeeItem item) {
        if (!patron.getRewardActive()) {
            System.out.println("\n" + patron.getName() + " purchased a " + item.getName() + ". ($" + item.getPrice() + ").");
            if (patron.isEligible()) {
                System.out.println("CONGRATS! Reward reached. Next drink is on us!\n");
                patron.setDrinksPurchased(0);
            } else {
                patron.setDrinksPurchased();
                System.out.println("Drinks toward reward: " + patron.getDrinksPurchased() + "\n");
            }
        } else {
            System.out.println(patron.getName() + " redeemed their reward for " + item.getName() + ". ($0.00).\n");
            patron.setRewardActive(false);
        }
    }
}
