package org.codedifferently;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creates a customer object for the menu
        Customer patron = Welcome.greet(sc);

        // Instantiates 3 new items to be sold on the menu
        CoffeeItem cappuccino = new CoffeeItem("Cappuccino", 4.75);
        CoffeeItem ICL = new CoffeeItem("Iced Caramel Latte", 5.95);
        CoffeeItem coldBrew = new CoffeeItem("Cold Brew Latte", 4.25);

        // Displays the menu.
        Purchase.displayMenu(patron, cappuccino, ICL, coldBrew, sc);
    }
}