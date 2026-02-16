package org.codedifferently;
import java.util.Scanner;

public class Welcome {
    public static Customer greet(Scanner sc) {
        System.out.println("Welcome to Coffee. Code. Consistency!");
        System.out.println("Patrons must signup for our rewards program to shop and become eligible for rewards!\n");
        System.out.print("Enter your name: \n");
        String name = sc.nextLine();
        System.out.print("Enter your phone number: \n");
        String phoneNumber = sc.nextLine();
        return new Customer(name, phoneNumber);
    }
}
