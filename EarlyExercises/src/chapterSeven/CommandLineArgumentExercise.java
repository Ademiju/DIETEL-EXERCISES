package chapterSeven;

import java.util.Arrays;

public class CommandLineArgumentExercise {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Error in the entered command TryAgain!!!!\nCommand should be followed by three integer argument seperated by a comma\n For example CommandLineArgument 3 4 4");
        }
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int startingValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            int [] arrayNumbers = new int[arrayLength];

            for(int index = 0; index < arrayLength; index++){
                arrayNumbers[index] = startingValue + increment * index;
            }
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            for(int count = 0; count < arrayNumbers.length; count++){
                if(arrayNumbers[count] > maximum){
                    maximum = arrayNumbers[count];
                }
                if(arrayNumbers[count] < minimum){
                    minimum = arrayNumbers[count];
                }
            }
            double average = (maximum + minimum)/ 2.0;
            System.out.printf("Average is: %f",average);
        }
    }
}
