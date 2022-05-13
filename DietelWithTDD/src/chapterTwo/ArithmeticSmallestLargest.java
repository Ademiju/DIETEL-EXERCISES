package chapterTwo;

public class ArithmeticSmallestLargest {
    public static int sumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static int averageOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = sumOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        return sum/3;
    }

    public static int productOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber * secondNumber * thirdNumber;
    }

    public static int smallestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.min(firstNumber,Math.max(secondNumber,thirdNumber));
    }

    public static int largestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.max(firstNumber,Math.max(secondNumber,thirdNumber));
    }
}
