package chapterTwo;

import java.util.Scanner;

public class DivisibleByThreeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userInput = input.nextInt();

        if(userInput % 3 ==0){
            System.out.println(userInput+" is divisible by 3");
        }
        if(userInput % 3 !=0){
            System.out.println(userInput+" is divisible by 3");
        }
    }
}
