package chapterSeven;

import java.util.Scanner;

public class SevenSegmentDisplay {
    static int arr[][] = new int[7][6];

    public static void setA() {
        for (int row = 0; row <= 0; row++) {
            for (int column = 1; column < arr[row].length - 1; column++) {
                arr[row][column] = 1;
            }
        }
//        arr[0][1] = 1;
//        arr[0][2] = 1;
//        arr[0][3] = 1;
//        arr[0][4] = 1;
    }

    public static void setB() {
        for (int row = 1; row < arr.length / 2; row++) {
            for (int column = arr[row].length - 1; column < arr[row].length; column++) {
                arr[row][column] = 1;
            }
//        arr[1][5] = 1;
//        arr[2][5] = 1;
        }
    }

    public static void setC() {
        for (int row = arr.length/2 ; row <= arr.length/2; row++){
        for(int column = 1; column < arr[row].length-1; column++){
            arr[row][column] = 1;
//        arr[3][1] = 1;
//        arr[3][2] = 1;
//        arr[3][3] = 1;
//        arr[3][4] = 1;
    }
}
    }
    public static void setD() {
        for (int row = (arr.length/2)+1; row < arr.length-1; row++) {
            for (int column = arr[row].length - 1; column < arr[row].length; column++) {
                arr[row][column] = 1;
            }
        }
//        arr[4][5] = 1;
//        arr[5][5] = 1;
    }
    public static void setE() {
        for (int row = arr.length-1;  row < arr.length; row++) {
            for (int column = 1; column < arr[row].length - 1; column++) {
                arr[row][column] = 1;
//        arr[6][1] = 1;
//        arr[6][2] = 1;
//        arr[6][3] = 1;
//        arr[6][4] = 1;
            }
        }
}
    public static void setF() {
        for (int row = (arr.length/2)+1; row < arr.length-1; row++) {
            for (int column = 0; column <= 0; column++) {
            arr[row][column] = 1;
//        arr[4][0] = 1;
//        arr[5][0] = 1;
            }
       }
    }
    public static void setG() {
        for (int row = 1; row < arr.length / 2; row++) {
            for (int column = 0; column <= 0; column++) {
                arr[row][column] = 1;
            }
        }
//        arr[1][0] = 1;
//        arr[2][0] = 1;
    }

    public static void setSegmentsToOnAndOff(){
        System.out.println("Enter an 8 digit number containing 1s and 0s only");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        String validateInput = userInput + "";

        if(validateInput.length() == 8) {
            int invalidNumber = 0;
            for (int i = 0; i < validateInput.length(); i++) {
                if (validateInput.charAt(i) != '1' && validateInput.charAt(i) != '0') {
                    invalidNumber++;
                    System.out.println(validateInput.charAt(i)+" is invalid");
                }
            }
            if (invalidNumber > 1) {
                System.out.println(invalidNumber+" invalid numbers entered\nTry Again\n");
                setSegmentsToOnAndOff();
            }else if(invalidNumber == 1){
                System.out.println("1 invalid number entered\nTry Again\n");
                setSegmentsToOnAndOff();
            }
            int onOff = userInput % 10;
            int remainder = userInput / 10;
            int seventhNumber = remainder % 10;
            int remainder2 = remainder / 10;
            int sixthNumber = remainder2 % 10;
            int remainder3 = remainder2 / 10;
            int fifthNumber = remainder3 % 10;
            int remainder4 = remainder3 / 10;
            int fourthNumber = remainder4 % 10;
            int remainder5 = remainder4 / 10;
            int thirdNumber = remainder5 % 10;
            int remainder6 = remainder5 / 10;
            int secondNumber = remainder6 % 10;
            int firstNumber = remainder6 / 10;

            if (onOff == 1) {
                if (firstNumber == 1) {
                    setA();
                }
                if (secondNumber == 1) {
                    setB();
                }
                if (thirdNumber == 1) {
                    setC();
                }
                if (fourthNumber == 1) {
                    setD();
                }
                if (fifthNumber == 1) {
                    setE();
                }
                if (sixthNumber == 1) {
                    setF();
                }
                if (seventhNumber == 1) {
                    setG();
                }
            } else {
                System.out.println("LED is OFF\nNothing to display\nLet your last digit be '1' to put LED on\n");
                System.exit(0);
            }

        } else if(validateInput.length() < 8){
                System.out.println("Input not up to eight digits");
                setSegmentsToOnAndOff();
            }else  {
                System.out.println("Input more than eight digits");
                setSegmentsToOnAndOff();
            }
    }
    public static void displayLED(){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
       setSegmentsToOnAndOff();
       displayLED();

    }

}
