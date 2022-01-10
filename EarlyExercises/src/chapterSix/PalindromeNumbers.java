package chapterSix;

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a five digit number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPalindrome(number));
    }
    public static boolean isPalindrome(int number) {
        boolean isNumberPalindrome;
        int firstNumber = number / 10000;
        int remainder = number % 10000;
        int secondNumber = remainder / 1000;
        int remainder2 = remainder % 1000;
        int thirdNumber = remainder2 / 100;
        int remainder3 = remainder2 % 100;
        int fourthNumber = remainder3 / 10;
        int fifthNumber = remainder % 10;

        if (firstNumber == fifthNumber) {
            if (secondNumber == fourthNumber) {
                System.out.printf("%d is a Palindrome: ",number);
                isNumberPalindrome = true;
            } else{
                System.out.printf("%d is a Palindrome: ",number);
                isNumberPalindrome = false;

            }
        } else {
            System.out.printf("%d is a Palindrome: ",number);
            isNumberPalindrome = false;
        }
        return isNumberPalindrome;
    }

}