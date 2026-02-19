package org.codedifferently;

import java.util.Scanner;

public class Purchase {

    // Method to print the menu to the console.
    public static void displayMenu(Customer patron, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, Scanner sc) {
        int input;

        // Builds the menu display
        String item1Display = item1.getName() + ": $" + item1.getPrice();
        String item2Display = item2.getName() + ": $" + item2.getPrice();
        String item3Display = item3.getName() + ": $" + item3.getPrice();

        // Object that we will use to build the menu.
        StringBuilder receipt = new StringBuilder("\nReceipt\n");

        System.out.println("\nAnd what can I get for you today? (Select a number)\n");

        // Loop to keep displaying the menu while the customer chooses not to checkout.
        do {
            // Prints the menu.
            System.out.println("Menu");
            System.out.println("1. " + item1Display);
            System.out.println("2. " + item2Display);
            System.out.println("3. " + item3Display);
            System.out.println("4. Checkout");
            System.out.print("Selection: ");


            // Validates the input.
            if (sc.hasNextInt()) {
                input = sc.nextInt();
            } else {
                input = -1; // force default case
            }
            sc.nextLine();

            // Represents whether a reward was just redeemed or not.
            boolean rewardUsed;
            switch (input) {
                // The customer buys the first item.
                case 1:
                    rewardUsed = itemTransaction(patron, item1);
                    if (rewardUsed) {
                        receipt.append(item1.getName()).append(": $0.00 (REWARD)");
                    } else {
                        receipt.append(item1Display).append("\n");
                    }
                    break;
                // The customer buys the second item.
                case 2:
                    rewardUsed = itemTransaction(patron, item2);
                    if (rewardUsed) {
                        receipt.append(item2.getName()).append(": $0.00 (REWARD)");
                    } else {
                        receipt.append(item2Display).append("\n");
                    }
                    break;
                // The customer buys the 3rd item
                case 3:
                    rewardUsed = itemTransaction(patron, item3);
                    if (rewardUsed) {
                        receipt.append(item3.getName()).append(": $0.00 (REWARD)\n");
                    } else {
                        receipt.append(item3Display).append("\n");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nI'm sorry, we don't carry that drink.\n");
            }
        } while (input != 4);
        double tab = patron.getTab();

        // Prints the receipt out to the console.
        System.out.println(receipt);
        System.out.printf("Total: $%.2f%n\n", tab);

        // Gives the customer an additional coupon if the just spent $20 or more.
        if (tab > 20.00) {
            System.out.println("Congratulations! You've earned a voucher that can be redeemed for any drink at during your next visit!");
        }
        System.out.println("Thank you for shopping at Triple C's!");
    }

    // A method that processes a transaction.
    public static boolean itemTransaction(Customer patron, CoffeeItem item) {
        // If the customer did not activate a reward process the purchase normally.
        if (!patron.getRewardActive()) {
            System.out.println("\n" + patron.getName() + " purchased a " + item.getName() + ". ($" + item.getPrice() + ")");
            patron.setTab(item.getPrice());
            /* If the customer is eligible for a reward, notify them that there next drink is free and set their
             drinksPurchased back to 0
             */
            if (patron.isEligible()) {
                System.out.println("CONGRATS! Reward reached. Next drink is on us!\n");
                patron.setDrinksPurchased(0);
            // The customer is not eligible for a reward, so increment their drinks purchased by 1.
            } else {
                patron.setDrinksPurchased();
                System.out.println("Drinks toward reward: " + patron.getDrinksPurchased() + "\n");
            }
            return false;
        // The customer just redeemed a reward, so they are not charged for a drink.
        } else {
            System.out.println("\n" + patron.getName() + " redeemed their reward for " + item.getName() + ". ($0.00)\n");
            patron.setRewardActive(false);
        }
        return true;
    }
}
