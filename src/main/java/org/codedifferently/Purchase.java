package org.codedifferently;

import java.util.Scanner;

public class Purchase {

    public static void displayMenu(Customer patron, CoffeeItem item1, CoffeeItem item2, CoffeeItem item3, Scanner sc) {
        int input;

        String item1Display = item1.getName() + ": $" + item1.getPrice();
        String item2Display = item2.getName() + ": $" + item2.getPrice();
        String item3Display = item3.getName() + ": $" + item3.getPrice();

        StringBuilder receipt = new StringBuilder("\nReceipt\n");

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

            boolean rewardUsed;
            switch (input) {
                case 1:
                    rewardUsed = itemTransaction(patron, item1);
                    if (rewardUsed) {
                        receipt.append(item1.getName()).append(": $0.00 (REWARD)");
                    } else {
                        receipt.append(item1Display).append("\n");
                    }
                    break;
                case 2:
                    rewardUsed = itemTransaction(patron, item2);
                    if (rewardUsed) {
                        receipt.append(item2.getName()).append(": $0.00 (REWARD)");
                    } else {
                        receipt.append(item2Display).append("\n");
                    }
                    break;
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

        System.out.println(receipt);
        System.out.printf("Total: $%.2f%n\n", tab);

        if (tab > 20.00) {
            System.out.println("Congratulations! You've earned a voucher that can be redeemed for any drink at during your next visit!");
        }
        System.out.println("Thank you for shopping at Triple C's");
    }

    public static boolean itemTransaction(Customer patron, CoffeeItem item) {
        if (!patron.getRewardActive()) {
            System.out.println("\n" + patron.getName() + " purchased a " + item.getName() + ". ($" + item.getPrice() + ")");
            patron.setTab(item.getPrice());
            if (patron.isEligible()) {
                System.out.println("CONGRATS! Reward reached. Next drink is on us!\n");
                patron.setDrinksPurchased(0);
            } else {
                patron.setDrinksPurchased();
                System.out.println("Drinks toward reward: " + patron.getDrinksPurchased() + "\n");
            }
            return false;
        } else {
            System.out.println("\n" + patron.getName() + " redeemed their reward for " + item.getName() + ". ($0.00)\n");
            patron.setRewardActive(false);
        }
        return true;
    }
}
