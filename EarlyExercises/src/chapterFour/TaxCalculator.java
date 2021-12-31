package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double totalTax = 0;
        while(count < 3){
            System.out.println("Welcome to Your Tax Calculator: Press Enter to proceed");
            input.nextLine();
            System.out.println("Enter your FullName ");
            String name = input.nextLine();
            System.out.println("Enter your Earning in USD for Year 2020");
            double earnings = input.nextDouble();
            System.out.println(
            );
            if(earnings <= 30000.0){
                totalTax = earnings*0.15;
                System.out.printf("Dear %s,%nyour earning for the year 2020 is $%.3f and%nyour total tax is $%.3f",name,earnings,totalTax);
                System.out.println();
            }else{
                totalTax = earnings*0.20;
                System.out.printf("Dear %s,%nyour earning for the year 2020 is $%.3f and%nyour total tax is $%.3f",name,earnings,totalTax);
                System.out.println();
            }
            count++;
            System.out.println();

        }
    }
}
