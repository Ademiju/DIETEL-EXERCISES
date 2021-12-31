package ChapterFive;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int count = 0;
        double total = 0;
        double minimum = Double.MIN_VALUE;
        double maximum = Double.MAX_VALUE;

        while (count <= 9) {
            System.out.println("Enter an integer");
            Scanner input = new Scanner(System.in);
            double userInput = input.nextInt();
            count++;

            if(userInput == minimum){

            }
            if(userInput == maximum){

            }
            total += userInput;


        }
        double average = total / 10.0;
        System.out.println("The average of the numbers entered is "+average);
        System.out.println("The minimum of the numbers is "+minimum);
        System.out.println("The maximum of the numbers is"+maximum);

    }

}
