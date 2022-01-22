package chapterFour;

import java.util.Scanner;

public class EvenNumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer or -1 to Exit ");
        int userInput = input.nextInt();
        int maximum = Integer.MIN_VALUE;
        int evenNumber = 0;
        while (userInput != -1){
            if(userInput % 2==0){
                evenNumber++;
                if(userInput > maximum){
                maximum = userInput;
                }
            }
            System.out.println("Enter any integer or -1 to Exit");
            userInput = input.nextInt();
        }
        System.out.printf("You entered %d even numbers %nThe highest even number is %d",evenNumber,maximum);
    }
}
