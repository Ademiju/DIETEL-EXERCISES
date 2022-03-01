package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    private static int input(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        try{
            return scan.nextInt();
        }
        catch(InputMismatchException error) {
            System.out.println("Wrong input\nEnter an integer");
        }
        return input(message);
    }

    private static int division (int firstNumber, int secondNumber){
       int result = 0;
        try {
            result = result+firstNumber / secondNumber;
       }
       catch (ArithmeticException error){
           System.out.println("Cannot divide by Zero");
           try {
               secondNumber = input("Enter second number again");
               result = firstNumber / secondNumber;
           }catch (ArithmeticException err){
               while(secondNumber == 0){
                   secondNumber = input("Cannot divide by Zero\nEnter second number again");
               }
               result = firstNumber / secondNumber;
           }
       }
        System.out.println(firstNumber+" / "+secondNumber+" = "+result );

      return result;
    }

    public static void main(String[] args) {
        int firstNumber = input("Enter first number");
        int secondNumber = input("Enter  second number");
//        division(firstNumber,secondNumber);
     try {
         int result = firstNumber / secondNumber;
     }
     catch (ArithmeticException error){
         input("Cannot divide by zero\nEnter second number again");
     }
    }
}
