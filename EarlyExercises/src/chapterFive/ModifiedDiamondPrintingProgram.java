package chapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Diamond Printing App\nEnter an odd integer between 1 and 19 for the number of rows in your Diamond: ");
        int rowLength = input.nextInt();
        if(rowLength > 0 &&rowLength < 20) {
            if(rowLength % 2 ==1){
            for (int row = 0; row < (rowLength - 1); row++) {
                for (int column = row; column < rowLength; column++) {
                    System.out.print(" ");
                }
                for (int column = 0; column <= row; column++) {
                    System.out.print("*");
                }
                for (int column = 0; column < row; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int row = 0; row < rowLength; row++) {
                for (int column = 0; column <= row; column++) {
                    System.out.print(" ");
                }
                for (int column = row; column < (rowLength - 1); column++) {
                    System.out.print("*");
                }
                for (int column = row; column < rowLength; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
                System.out.println("Invalid input!!!....Try Again");

            }
        }else{
            System.out.println("Invalid input!!!....Try Again");

        }
    }
}
