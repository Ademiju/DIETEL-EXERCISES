package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int row = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base of the right-angled Triangle");
        int rowLength = input.nextInt();

        while(row <= rowLength){
            System.out.print("* ");
            int column = 1;
            while(column < row){
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
