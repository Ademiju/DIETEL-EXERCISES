package chapterTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an Integer");
//        System.out.println("This is a Java Program");
//        System.out.printf("%s%n%s\n", "This is a Java","Program");
//        int userInput = input.nextInt();
//        if(userInput != 7){
//            System.out.println("The variable number is not equal to 7");
//        }
//        int largest = Math.max(3,4);
//        System.out.println(largest);

//        for(int i = 1; i <=10;i++){
//            for(int j =1; j<=10; j++)
//
//                    System.out.print((i*j)+"  ");
//            System.out.println();
//            }
//
//        for (int row = 1,printValue = 5; row <= 5; row++,printValue--){
//            for(int column = 1; column <= row; column++) {
//                if (column % 2 == 0) {
//                    System.out.print("$");
//                } else {
//                    System.out.print("#");
//                }
//                System.out.print(printValue);
//            }

        for (int row = 1; row <= 5; row++) {
            int printValue = 0;
            for (int column = 1; column <= row; column++) {

                System.out.print(++printValue);
            }
            System.out.println();
        }

    }
}
