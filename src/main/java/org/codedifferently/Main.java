package org.codedifferently;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer patron = Welcome.greet(sc);

        Item cappuccino = new Item("cappuccino", 4.75, true, 10);
        Item ICL = new Item("Iced Caramel Latte", 5.95, true, 12);
        Item coldBrew = new Item("Cold Brew Latte", 4.25, true, 8);
        Item muffin = new Item("Blueberry Muffin", 3.50, false, 7);
        Item BEC = new Item("Bacon, Egg & Cheese Sandwich", 6.95, false, 15);
        Item avocadoToast = new Item("Avocado Toast", 7.50, false, 18);

        Purchase.displayMenu(patron, cappuccino, ICL, coldBrew, muffin, BEC, avocadoToast, sc);
    }
}