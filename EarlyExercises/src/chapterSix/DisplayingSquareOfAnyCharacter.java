package chapterSix;

import java.util.Scanner;

public class DisplayingSquareOfAnyCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the Square and a character to display");
        int side = input.nextInt();
        char fill = input.next().charAt(0);
        squareOfAnyCharacter(side,fill);
    }
    public static void squareOfAnyCharacter(int side, char fillCharacter){
        for(int row = 0; row < side; row++){
            for(int column = 0;column < side; column++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }

    }
}
