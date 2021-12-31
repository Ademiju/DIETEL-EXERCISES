package WarmUp;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        int userInput = input.nextInt();

        int factorCount = 0;

        for (int divisor = 1; divisor <= userInput; divisor++) {
            int remainder;
            remainder = userInput % divisor;

            if (remainder == 0) {

                factorCount++;
            }
        }
                if (factorCount < 2) {
                    System.out.println(userInput + " is a prime number");
                }
                else {
                    System.out.println(userInput + " is not a prime number");
                }


        }

    }
