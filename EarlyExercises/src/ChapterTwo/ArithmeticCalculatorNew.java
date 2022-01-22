package chapterTwo;

import java.util.Scanner;

public class ArithmeticCalculatorNew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNumber = input.nextInt();

        System.out.println("Enter an integer");
        int secondNumber = input.nextInt();

        int squareOfFirstNumber = firstNumber*firstNumber;
        int squareOfSecondNumber = secondNumber*secondNumber;

        int sumOfSquare = squareOfFirstNumber+squareOfSecondNumber;
        int differenceOfSquare = squareOfFirstNumber-squareOfSecondNumber;

        System.out.printf("The square of your first integer is %d%n The square of your second integer is %d%n The sum of the squares of your integers are %d%n The difference of the sum of your integers are %d%n",squareOfFirstNumber,squareOfSecondNumber,sumOfSquare,differenceOfSquare);

    }
}
