package chapterFour;

import java.util.Scanner;

public class TwoLargestLargest {
    public static void main(String[] args) {

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers");
        int userInput;
        int counter = 0;
        while(counter<10){
           userInput = input.nextInt();
           if(userInput > largestNumber){
               secondLargestNumber = largestNumber;
               largestNumber = userInput;

           }

            else if( userInput >  secondLargestNumber){
                secondLargestNumber = userInput;

            }
            counter++;
        }
        System.out.printf("Largest Number is: %d%nSecond Largest Number is: %d",largestNumber,secondLargestNumber);

    }
}
