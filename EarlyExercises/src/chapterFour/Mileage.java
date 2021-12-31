package chapterFour;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles travelled for this trip Or enter -1 to exit: ");
        int mile = input.nextInt();
        System.out.println("Enter the gallons used for this trip Or enter -1 to exit: ");
        int gallon = input.nextInt();

        double sumMilePerGallon = 0;
        int count = 0;

        while (mile != -1 && gallon != -1) {
            double milePerGallon = mile / (gallon * 1.0);
            sumMilePerGallon += milePerGallon;
            count++;
            System.out.println("Miles per Gallon travelled for this trip is: \n" + milePerGallon);
            System.out.println();
            System.out.println("Enter the miles travelled for this trip Or enter -1 to exit: ");
            mile = input.nextInt();
            System.out.println("Enter the gallons used Or -1 to exit: ");
            gallon = input.nextInt();
            milePerGallon = mile / (gallon * 1.0);

        }
        System.out.println();
        if (count == 0) {
            System.out.println("No data entered");
        }
        if (count == 1) {
            System.out.printf("Total Miles per Gallon travelled for your trip is %.2f miles ", sumMilePerGallon);

        } else {
            System.out.printf("Total Miles per Gallon travelled for all %d trips is %.2f miles ", count, sumMilePerGallon);
        }
    }
}
