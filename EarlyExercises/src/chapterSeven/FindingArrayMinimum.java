package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class FindingArrayMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer for the length of your array");
        int count = input.nextInt();
        int minimum = findMin(readIntegers(count));
        System.out.println("The minimum integer in the array is: "+minimum);

    }
    public static int[] readIntegers(int count){
        int[] intArray = new int [count];
        for(int arrayLoop = 0; arrayLoop < intArray.length; arrayLoop++ ){
            System.out.println("Enter a number");
            Scanner input = new Scanner(System.in);
            int arrayContent = input.nextInt();
          intArray[arrayLoop] = arrayContent;
        }
        System.out.printf("The array = %s%n",Arrays.toString(intArray));
         return intArray;
    }
    public static int findMin(int[] intArray){
        int minimum = Integer.MAX_VALUE;
        for(int index = 0; index < intArray.length; index++) {
            if (intArray[index] < minimum) {
                minimum = intArray[index];
            }
        }

        return minimum;
    }

}
