package chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number to check for: ");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();

        displayPrimeNumbers(userInput);    }
    public static void displayPrimeNumbers(int number){
        int factor;
        int factorCount = 0;
        int divisor = 0;
        if(number % 2 != 0) {
            while (divisor <= number) {
                divisor++;
                if (number % divisor == 0) {
                    factor = divisor;

                    if (factor == 1) {
                        factorCount++;
                    }
                    if (factor == number) {
                        factorCount++;
                    }
                }

            }


        }else{
                System.out.printf("%d is not a prime number ", number);
            }

            if (factorCount ==2){
            System.out.printf("%d is a Prime number ",number);
        }else {
                System.out.printf("%d is not a prime number ", number);

            }
    }
}
