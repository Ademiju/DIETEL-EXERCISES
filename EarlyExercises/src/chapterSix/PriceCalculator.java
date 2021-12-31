package chapterSix;

import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Test Driller:");
        System.out.println(" ");
        System.out.println("Kindly enter how many CBT Softwares you would like to purchase");

        int totalPurchase = input.nextInt();

        if(totalPurchase >= 1){
            if(totalPurchase <= 4){

                int price = totalPurchase * 2000;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 5){
            if(totalPurchase <= 9){

                int price = totalPurchase * 1800;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 10){
            if(totalPurchase <= 29){

                int price = totalPurchase * 1600;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 30){
            if(totalPurchase <= 49){

                int price = totalPurchase * 1500;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 50){
            if(totalPurchase <= 99){

                int price = totalPurchase * 1300;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 100){
            if(totalPurchase <= 199){

                int price = totalPurchase * 1200;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 200){
            if(totalPurchase <= 499){

                int price = totalPurchase * 1100;
                System.out.println("Thank you for your order");
                System.out.println("Your total price is "+price);
            }
        }

        if(totalPurchase >= 500){

            int price = totalPurchase * 1000;
            System.out.println("Thank you for your order");
            System.out.println("Your total price is "+price);
        }


    }

}
