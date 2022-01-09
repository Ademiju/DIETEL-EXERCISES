package chapterFive;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Ten numbers");
        for(int userInputCounter =0; userInputCounter < 4; userInputCounter++){
           int userInput = input.nextInt();
            if(userInput > maximum){
                 maximum = userInput;
            }
            if(userInput < minimum){
                 minimum = userInput ;
            }

        }
        System.out.println("The maximum of the Ten number entered is: "+maximum);
        System.out.println("The minimum of the Ten number entered is: "+minimum);

        int sumOfExtremes = maximum + minimum;
        System.out.println("The sum of the minimum and maximum value is: "+sumOfExtremes);
    }
}
