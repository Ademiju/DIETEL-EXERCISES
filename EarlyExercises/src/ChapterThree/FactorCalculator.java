package chapterThree;

import java.util.Scanner;

public class FactorCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");

        int userInput = input.nextInt();


        int factorCount = 0;

        for(int divisor = 1; divisor <= userInput; divisor++ ) {
            int remainder;
            remainder = userInput % divisor;

            if(remainder == 0){

                System.out.println(divisor);

                factorCount++;
        }

          }

        System.out.print("The above are the factors of " +userInput );
        System.out.println();
        System.out.println(userInput+" has "+ factorCount+" factors");
    }
}