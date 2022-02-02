package PriceCalculatorApp;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = {"Bread", "Milk", "Flakes", "Sweet"};
        int[] price = {20, 30, 40, 60};

        String confirmation = "yes";
        String itemName;
        int quantity;
        while (confirmation.equals("yes")) {
            confirmation = scanner.next();
            itemName = scanner.next();
            quantity = scanner.nextInt();

        }
    }

    public static void calculatePrice(String itemN){}
}
