package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    private  static int firstNumber;

    public static void setFirstUserInput(int firstNumber) {
        Arithmetic.firstNumber = firstNumber;
    }

    public static void setSecondUserInput(int secondNumber) {
        Arithmetic.secondNumber = secondNumber;
    }

    private static int secondNumber;


    public static String displayPrompt(String message) {
        return message;
    }

    public static int getFirstUserInput() {
        return firstNumber;
    }

    public static int getSecondUserInput() {
        return secondNumber;
    }

    public static int squareOfFirstInput() {
        return firstNumber*firstNumber;
    }


    public static int squareOfSecondInput() {
        return secondNumber*secondNumber;
    }

    public static int squareDifference() {
        return squareOfFirstInput()-squareOfSecondInput();
    }
}
