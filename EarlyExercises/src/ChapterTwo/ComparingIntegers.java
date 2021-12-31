package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int number = input.nextInt();
        int squareOfNumber = number*number;
        int fixedNumber = 100;

        if (number > 100) {
            System.out.printf("The number %d is greater than %d%n", number, 100);
            System.out.printf("%d > %d%n",number,fixedNumber);
        }
        if(squareOfNumber > 100) {
            System.out.printf("The square of your number is %d : it is greater than %d%n", squareOfNumber, 100);
            System.out.printf("%d > %d%n", squareOfNumber,fixedNumber);
            }
        if(number < 100) {
            System.out.printf("The number %d is less than %d%n", number, 100);
            System.out.printf("%d < %d%n",number,fixedNumber);
                }
        if(squareOfNumber < 100) {
            System.out.printf("The square of your number is %d: it is less than %d%n", squareOfNumber, 100);
            System.out.printf("%d < %d%n", squareOfNumber,fixedNumber);
                    }
        if (number == 100) {
            System.out.printf("The number %d is equal to %d%n", number, 100);
            System.out.printf("%d > %d%n",number,fixedNumber);
        }
        if(squareOfNumber == 100) {
            System.out.printf("The square of your number is %d : it is equal to %d%n", squareOfNumber, 100);
            System.out.printf("%d == %d%n", squareOfNumber,fixedNumber);
        }
        if (number != 100) {
            System.out.printf("The number %d is not equal to %d%n", number, 100);
            System.out.printf("%d != %d%n",number,fixedNumber);
        }
        if(squareOfNumber != 100) {
            System.out.printf("The square of your number is %d : it is not equal to %d%n", squareOfNumber, 100);
            System.out.printf("%d != %d%n", squareOfNumber,fixedNumber);
        }

                }
            }




