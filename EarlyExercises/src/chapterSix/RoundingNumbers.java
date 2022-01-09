package chapterSix;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number to round up");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double roundedNumber = Math.floor(number + 0.5);
        System.out.printf("Original number: %.2f%nRounded number: %.0f",number,roundedNumber);
    }
}
