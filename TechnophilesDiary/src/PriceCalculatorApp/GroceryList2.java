package PriceCalculatorApp;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String confirmation= "yes";
        String item;
        double price;
        int quantity;
        double total;
        ArrayList<String>  items = new ArrayList<>();
while (confirmation.equals("Yes")){
    System.out.println("Enter item bought");
    scanner.next();
     item= scanner.nextLine();
    System.out.println("Enter price of items bought");
    price= scanner.nextDouble();
    System.out.println("Enter quantity of items");
    quantity= scanner.nextInt();
    total=quantity*price;
    System.out.println();
    System.out.println("Do you have more items: Enter Yes or No");
    confirmation=scanner.next();

    items.ad;


}

    }
}
