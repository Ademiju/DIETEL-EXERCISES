package chapterSix;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int userInput = 1; userInput<= 5; userInput++){
            System.out.println("Enter a pair of integer to check if they are a multiple ");
            int firstNumber = input.nextInt();
            int secondNumber = input.nextInt();
            System.out.println( isMultiple(firstNumber,secondNumber));
            System.out.println();
        }
    }

    private static boolean isMultiple(int firstNumber,int secondNumber){
        boolean multiple;
        if (secondNumber % firstNumber ==0){
            System.out.printf("%d is a multiple of %d is: ", secondNumber,firstNumber);
            multiple = true ;
        }else{
            System.out.printf("%d is a multiple of %d is: ", secondNumber,firstNumber);
            multiple = false;
        }
        return multiple;
    }
}
