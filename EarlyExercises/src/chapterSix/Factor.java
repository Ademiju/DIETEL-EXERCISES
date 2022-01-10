package chapterSix;

import java.util.Scanner;

public class Factor {
    public static int calculateFactorsOf(int userInput) {
        int factors = 0;
        for (int number = 1; number <= userInput; number++) {
            if (userInput % number == 0) {
                factors++;
            }
        }
            return factors;


    }
    public static void main(String[] args) {
        System.out.println("Enter a number to check for: ");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();

        int result = calculateFactorsOf(userInput);

        if(result <= 2) {
            System.out.println(userInput + " is a prime number ");
        }
        else{
            System.out.println(userInput+" is not a prime number ");
        }
    }
}
