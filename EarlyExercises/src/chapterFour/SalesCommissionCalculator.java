package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        double totalSales = 0;
        int weeklyEarnings = 200;
        int item1Counter=0;
        int item2Counter=0;
        int item3Counter=0;
        int item4Counter=0;

        int salesCounter= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item number sold for the week or enter 5 to exit: ");
        int itemValue = input.nextInt();


        while(itemValue != 5) {
            if (itemValue == 1) {
                totalSales += 239.99;
                item1Counter++;
            }
            if (itemValue == 2) {
                totalSales += 129.75;
                item2Counter++;
            }
            if (itemValue == 3) {
                totalSales += 99.95;
                item3Counter++;
            }
            if (itemValue == 4) {
                totalSales += 350.89;
                item4Counter++;
            }
            salesCounter++;

            System.out.println();
            System.out.println("Enter item number sold for the week or enter 5 to exit: ");
            itemValue=input.nextInt();

        }
        double commissionEarnedForTheWeek = totalSales * 0.09;
        double totalEarnings = weeklyEarnings + commissionEarnedForTheWeek;
        System.out.println();
        System.out.println("Your item sales for the week is: "+item1Counter+ " item1 , "+item2Counter+ " item2, "+item3Counter+ " item3, "+item4Counter+ " item4 ");
        System.out.println("Your total item sales for the week is: "+salesCounter+" items");
        System.out.println("The total value of your sales for the week is $"+totalSales);
        System.out.println("Your total commission earned for the week is $"+commissionEarnedForTheWeek);

        if(salesCounter == 0){
            System.out.println("Your total earning for the week is $"+weeklyEarnings);
        }else{
        System.out.printf("Your weekly earning for the week is $%.3f",totalEarnings);


        }

    }
}
