package ChapterFive;

import java.util.Scanner;

public class SentinelCalculator {

    public static void main(String[] args) {

        System.out.println("Enter any number or Enter -42 to end the application");

        int count = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        while(userInput != -42){

            total += userInput;
            count++;
            System.out.println("Enter any number or Enter -42 to end the application");
            userInput = input.nextInt();

        }

            double average = (double)total / count;
        System.out.println("The sum of all the numbers you entered is "+total);
        System.out.println("The average of all the numbers you entered is "+average);
        System.out.println("The minimum of all the numbers you entered is "+min);
        System.out.println("The maximum of all the numbers you entered is "+max);
    }
}
