package chapterTwo;

import java.util.Scanner;

public class SmallestLargestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNumber = input.nextInt();
        System.out.println("Enter an integer");
        int secondNumber = input.nextInt();
        System.out.println("Enter an integer");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.println(sum+" is the sum of your three integers");
        System.out.println(average+" is the average of your three integers");
        System.out.println(product+" is the product of your three integers");



        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println(firstNumber + " is the largest number");

            }
        }
        if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                System.out.println(secondNumber + " is the largest number");
            }
        }
        if (thirdNumber > firstNumber) {
            if (thirdNumber > secondNumber) {
                System.out.println(thirdNumber + " is the largest number");
            }
        }
        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                System.out.println(firstNumber + " is the smallest number");
            }
        }
        if (secondNumber < firstNumber) {
            if (secondNumber < thirdNumber) {
                System.out.println(secondNumber + " is the smallest number");
            }
        }
        if (thirdNumber < firstNumber) {
            if (thirdNumber < secondNumber) {
                System.out.println(thirdNumber + " is the smallest number");
            }
        }
    }
}