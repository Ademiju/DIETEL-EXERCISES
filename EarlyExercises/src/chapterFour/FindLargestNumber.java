package chapterFour;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int largest = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        while (count < 10) {
            count++;
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            if(number > largest) {
                 largest = number;
            }
            System.out.println("The largest number found so far is " + largest);

            if(count == 10){
                System.out.println();
                System.out.println("The largest of the 10 numbers is "+largest);
            }
        }
    }
}