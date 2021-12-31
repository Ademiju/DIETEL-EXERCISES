package chapterTwo;

import java.util.Scanner;

public class NumberValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        System.out.println("Enter a number");
        int secondNumber = input.nextInt();
        System.out.println("Enter a number");
        int thirdNumber = input.nextInt();
        System.out.println("Enter a number");
        int fourthNumber = input.nextInt();
        System.out.println("Enter a number");
        int fifthNumber = input.nextInt();

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;

        if(firstNumber > 0){
            positiveNumber++;
        }
        if(firstNumber < 0){
            negativeNumber++;
        }
        if(firstNumber == 0){
            zeroNumber++;
        }
        if(secondNumber > 0){
            positiveNumber++;
        }
        if(secondNumber < 0){
            negativeNumber++;
        }
        if(secondNumber == 0){
            zeroNumber++;
        }
        if(thirdNumber > 0){
            positiveNumber++;
        }
        if(thirdNumber < 0){
            negativeNumber++;
        }
        if(thirdNumber == 0){
            zeroNumber++;
        }
        if(fourthNumber > 0){
            positiveNumber++;
        }
        if(fourthNumber < 0){
            negativeNumber++;
        }
        if(fourthNumber == 0){
            zeroNumber++;
        }
        if(fifthNumber > 0){
            positiveNumber++;
        }
        if(fifthNumber < 0){
            negativeNumber++;
        }
        if(fifthNumber == 0){
            zeroNumber++;
        }

        if(positiveNumber >1) {
            System.out.print("There are " + positiveNumber + " positive numbers ");
        }
        if(positiveNumber ==1) {
            System.out.print("There is " + positiveNumber + " positive number ");
        }
        if(negativeNumber >1) {
            System.out.print(negativeNumber+" negative numbers and ");
        }
        if(negativeNumber ==1) {
            System.out.print(negativeNumber+" negative number and ");
        }
        if(zeroNumber >1) {
            System.out.print(zeroNumber+" zeros");
        }
        if(zeroNumber ==1) {
            System.out.print(zeroNumber+" zero");
        }

    }
}