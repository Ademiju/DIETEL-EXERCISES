package chapterSeven;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] t = new int[2][3];


        Scanner input = new Scanner(System.in);
        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                t[row][column] = input.nextInt();
            }
        }
        int smallestNumber = t[0][0];
        for (int element[] : t) {
            for (int content : element) {
                if (content < smallestNumber) {
                    content = smallestNumber;
                }
                System.out.print(content + " ");
            }
            System.out.println();
        }
        System.out.println("The smallest number in the array is " + smallestNumber);

    }
}