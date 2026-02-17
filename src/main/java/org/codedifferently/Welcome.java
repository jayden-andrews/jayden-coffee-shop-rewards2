package org.codedifferently;
import java.util.Scanner;

public class Welcome {
    public static Customer greet(Scanner sc) {
        System.out.println("Welcome to Triple Cs!");
        String name, email;

        // Prompts the user for a valid name for the order. Will launch an error if it is invalid.
        while (true) {
            System.out.print("Can I get a name for the order?: ");
            name = sc.nextLine();
            try {
                if (!name.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("\nInvalid input. Please use letters only.\n");
            }
        }

        // Prompts the user for a valid email address for the order. Will launch an error if it is invalid.
        while (true) {
            System.out.print("And your email address?: ");
            email = sc.nextLine();
            try {
                if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("\nInvalid email address. Try again.\n");
            }
        }

        System.out.println("\nThanks! Reminder that you get a free drink for every 5 drinks that you buy! :)");

        // Returns an object representing the current customer.
        return new Customer(name, email);
    }
}
