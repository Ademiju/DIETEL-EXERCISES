package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargestCalculator {
    /* 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user
    and displays the sum, average, product, smallest and largest of the numbers.
    Use the techniques shown in Fig. 2.15.
            [Note: The calculation of the average in this exercise should result in an integer representation of the average.
    So, if the sum of the values is 7, the average should be 2, not 2.3333….]

    ANSWER: */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int average;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = sum / 3;

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The average is %d%n", average);
    }
}

