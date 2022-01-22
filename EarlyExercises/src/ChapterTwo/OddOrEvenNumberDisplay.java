package chapterTwo;

import java.util.Scanner;

public class OddOrEvenNumberDisplay {
    /* 2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2.
Any multiple of 2 leaves a remainder of 0 when divided by 2.]

ANSWER:*/

    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);

        int number;


        System.out.println("Enter integer: ");
        number = input.nextInt();
        boolean isEven = number % 2 == 0;
        if (isEven)
            System.out.printf("%d is even%n", number);
        boolean isOdd = number % 2 != 0;
        if (isOdd)
            System.out.printf("%d is odd", number);

    }
}
