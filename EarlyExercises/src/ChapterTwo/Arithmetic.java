/*2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user
        and prints their sum, product, difference and quotient (division).
        Use the techniques shown in Fig. 2.7.

        ANSWER:*/


package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                sum,
                product,
                difference,
                division;
        System.out.println("Enter first integer:");
        number1 = input.nextInt();

        System.out.println("Enter second integer:");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = number1 / number2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Quotient is %d%n", division) ;

    }
}
