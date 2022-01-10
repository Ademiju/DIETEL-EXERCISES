package chapterSix;

import java.util.Scanner;

public class CalculatingSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any four digit number");
        int number = input.nextInt();
        System.out.println( calculateSumOfDigit(number));
    }

    public  static int calculateSumOfDigit(int number){
        int lastNumber = number%10;
        int remainder = number/10;
        int thirdNumber = remainder%10;
        int remainder2 =remainder/10;
        int secondNumber = remainder2%10;
        int firstNumber = remainder2/10;
        int sum = firstNumber+secondNumber+thirdNumber+lastNumber;

        System.out.print("The sum of your number is : ");
        return sum;
    }

}
