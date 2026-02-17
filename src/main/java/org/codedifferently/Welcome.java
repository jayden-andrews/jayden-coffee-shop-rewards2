package org.codedifferently;
import java.util.Scanner;

public class Welcome {
    public static Customer greet(Scanner sc) {
        System.out.println("Welcome to Triple Cs!");
        System.out.print("Can I get a name for the order?: ");
        String name = sc.nextLine();
        System.out.print("And your email address?: ");
        String email = sc.nextLine();
        return new Customer(name, email);
    }
}
