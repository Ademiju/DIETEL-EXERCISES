package ChapterSix;

import java.util.Scanner;


public class Prime {
    public static int calculateFactorsOf(int userInput){
        int factors = 0;
        for(int number = 1; number <= userInput; number++){
            if(userInput % number == 0) {
                factors++;
            }

        }
        return factors;

    }
    public static void main(String[] args){
        calculatePrimeNumber();
        System.out.println("\n I don finish ");
    }
    public static void calculatePrimeNumber() {
        System.out.println("Enter a number to check for: ");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();
        int result = calculateFactorsOf(userInput);
        isEven(userInput);

        if (result < 2) {
            System.out.println(userInput + " is a prime number ");
        } else {
            System.out.println(userInput + " is not a prime number ");
        }


    }

    public static void isEven ( int number){
        if (number % 2 == 0) {
            System.out.println("Yes, "+number+"  is an Even number");
        } else {
            System.out.println("No, "+number+"is not an even number");
        }
    }
}

