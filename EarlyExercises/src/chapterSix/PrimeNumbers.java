package chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number to check for: ");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();
        determinePrimeNumbers(userInput);
        System.out.println();

        System.out.println("Prime numbers between 1 and 1000 :");
        for (int number = 1; number <= 1000; number++) {
            displayPrimeNumbers(number);
        }
    }


    public static void determinePrimeNumbers(int number) {
        int nonPrimeNumberCounter = 0;
        for (int divisor = 2; divisor <= (Math.sqrt(number)); divisor++) {
            if (number % divisor == 0) {
                nonPrimeNumberCounter++;
            }
        }

        if (number == 1) {
            System.out.printf("%d is not a Prime number", number);
        } else if (nonPrimeNumberCounter == 0) {
            System.out.printf("%d is a Prime number ", number);

        } else {
            System.out.printf("%d is not a prime number ", number);
        }
    }

    public static void displayPrimeNumbers(int number) {
        int factorCounter = 0;
        for (int divisor = 2; divisor <= (Math.sqrt(number)); divisor++) {

            if (number % divisor == 0) {
                factorCounter++;
            }
        }
            if(number == 1){
                System.out.printf("Note that %d is not a Prime number%n", number);

            }
            else if (factorCounter == 0) {
                System.out.printf("%4d ", number);

            }

        }
    }




