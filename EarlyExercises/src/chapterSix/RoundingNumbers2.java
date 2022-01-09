package chapterSix;

import java.util.Scanner;

public class RoundingNumbers2 {
    public static void main(String[] args) {
        System.out.println("Enter the number to round up");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.printf("Original number: %f%nnearest integer: %.0f%nnearest tenth: %.1f%nnearest hundreth: %.2f%nnearest thousandth: %.3f",number,roundToInteger(number),roundToTenths(number),roundToHundreths(number),roundToThousandths(number));
    }

    public static double roundToInteger(double number){
        double roundedNumber = Math.floor(number + 0.5);
        return roundedNumber;
    }
    public static double roundToTenths(double number){
        double roundedNumber = Math.floor(number * 10 + 0.5)/10;
        return roundedNumber;
    }
    public static double roundToHundreths(double number){
        double roundedNumber = Math.floor(number * 100 + 0.5)/100;
        return roundedNumber;
    }
    public static double roundToThousandths(double number){
        double roundedNumber = Math.floor(number * 1000 + 0.5)/1000;
        return roundedNumber;
    }
}
