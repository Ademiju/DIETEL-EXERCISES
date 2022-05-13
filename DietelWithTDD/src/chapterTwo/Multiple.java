package chapterTwo;

public class Multiple {

    public static int tripleFirstNumber(int firstNumber) {

        return firstNumber*3;
    }

    public static int doubleSecondNumber(int secondNumber) {
        return secondNumber*2 ;
    }

    public static boolean isAMultiple(int firstNumber, int secondNumber) {
        return (tripleFirstNumber(firstNumber)% doubleSecondNumber(secondNumber) == 0);

    }
}
