package chapterSix;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPerfect(number));    }
    public static boolean isPerfect(int number) {
        boolean perfectNumber;
        int factorSum = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            int factor;
            if (number % divisor == 0) {
                factor = divisor;
                factorSum += factor;
                System.out.println();
                System.out.printf("%3d is a factor of %d, ", factor, number);
            }
        }
        System.out.println();
        System.out.printf("Sum of the factors is: %d%n",factorSum);
            if(factorSum == number){
                System.out.printf("%d is a PerfectNumber: ",number);
                perfectNumber = true;
            }else {
                System.out.printf("%d is a PerfectNumber: ",number);
                perfectNumber = false;
            }
        return perfectNumber;
    }

    }
