package org.codedifferently;

import java.util.Scanner;

public class Purchase {

    public static void displayMenu(Customer patron, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Scanner sc) {
        System.out.println("What can I get for you today?\n");

        int input;
        StringBuilder receipt = new StringBuilder("Receipt\n");

        String item1Display = item1.getName() + ": $" + item1.getPrice();
        String item2Display = item2.getName() + ": $" + item2.getPrice();
        String item3Display = item3.getName() + ": $" + item3.getPrice();
        String item4Display = item4.getName() + ": $" + item4.getPrice();
        String item5Display = item5.getName() + ": $" + item5.getPrice();
        String item6Display = item6.getName() + ": $" + item6.getPrice();

        do {
            System.out.println("Menu");
            System.out.println("1. " + item1Display);
            System.out.println("2. " + item2Display);
            System.out.println("3. " + item3Display);
            System.out.println("4. " + item4Display);
            System.out.println("5. " + item5Display);
            System.out.println("6. " + item6Display);
            System.out.println("7. Checkout");
            System.out.print("Selection: ");

            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    itemConfirmation(patron, item1);
                    receipt.append(item1Display).append("\n");
                    break;
                case 2:
                    itemConfirmation(patron, item2);
                    receipt.append(item2Display);
                    break;
                case 3:
                    itemConfirmation(patron, item3);
                    receipt.append(item3Display);
                    break;
                case 4:
                    itemConfirmation(patron, item4);
                    receipt.append(item4Display);
                    break;
                case 5:
                    itemConfirmation(patron, item5);
                    receipt.append(item5Display);
                    break;
                case 6:
                    itemConfirmation(patron, item6);
                    receipt.append(item6Display);
                    break;
                case 7:
                    System.out.println("Would you like to redeem rewards? (y/n)");
                    break;
            }
        } while (input != 7);
        System.out.println(receipt);
    }

    public static void itemConfirmation(Customer patron, Item item) {
        System.out.println(item.getName() + " purchased for $" + item.getPrice());
        patron.setPoints(patron.getPoints() + item.getPoints());
        patron.setTab(patron.getTab() + item.getPrice());
    }
}
