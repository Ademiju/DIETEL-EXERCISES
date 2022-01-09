package chapterSix;

import java.util.Scanner;

public class DivisibleBy5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int userInput = 1; userInput<= 10; userInput++){
            System.out.println("Enter an integer to check if they are divisible by 5 ");
            int number = input.nextInt();
            System.out.println( isDivisible(number));
            System.out.println();
        }
    }



    public static boolean isDivisible(int number){
        boolean divisible ;
        if(number % 5== 0){
            System.out.printf("%d is divisible by 5 is: ",number);
            divisible = true;
        }else{
            System.out.printf("%d is divisible by 5 is: ",number);
            divisible = false;
        }
        return divisible;
    }
}
