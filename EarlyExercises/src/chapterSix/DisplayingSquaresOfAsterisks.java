package chapterSix;

import java.util.Scanner;

public class DisplayingSquaresOfAsterisks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the Square to display");
        int side = input.nextInt();
        squareOfAsterisks(side);
    }
    public static void squareOfAsterisks(int side){
        for(int row = 0; row < side; row++){
            for(int column = 0;column < side; column++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
