package chapterTwo;

public class NegativePositiveZeroNumber {

    private static int positiveNumber;
    private static int negativeNumber;
    private static int zeroNumber;

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

    public static void checkNumberValue(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        if(firstNumber > 0){
            positiveNumber++;
        }
        if(firstNumber < 0){
            negativeNumber++;
        }
        if(firstNumber == 0){
            zeroNumber++;
        }
        if(secondNumber > 0){
            positiveNumber++;
        }
        if(secondNumber < 0){
            negativeNumber++;
        }
        if(secondNumber == 0){
            zeroNumber++;
        }
        if(thirdNumber > 0){
            positiveNumber++;
        }
        if(thirdNumber < 0){
            negativeNumber++;
        }
        if(thirdNumber == 0){
            zeroNumber++;
        }
        if(fourthNumber > 0){
            positiveNumber++;
        }
        if(fourthNumber < 0){
            negativeNumber++;
        }
        if(fourthNumber == 0){
            zeroNumber++;
        }
        if(fifthNumber > 0){
            positiveNumber++;
        }
        if(fifthNumber < 0){
            negativeNumber++;
        }
        if(fifthNumber == 0){
            zeroNumber++;
        }
    }
    public static int getPositiveNumber() {
        return positiveNumber;
    }

    public static int getNegativeNumber() {
        return negativeNumber;
    }

    public static int getZeroNumber() {
        return zeroNumber;
    }
}
