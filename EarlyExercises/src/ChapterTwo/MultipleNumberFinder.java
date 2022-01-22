package chapterTwo;

import java.util.Scanner;

public class MultipleNumberFinder {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.println("Enter a first integer");
 int firstNumber = input.nextInt();
        System.out.println("Enter a second integer");
int secondNumber = input.nextInt();

int firstNumberTriple = firstNumber*3;
int secondNumberDouble = secondNumber*2;
boolean isMultiple = secondNumberDouble%firstNumberTriple==0;
if(isMultiple){
    System.out.printf("First integer when tripled is %d%nSecond integer when doubled is %d%n%d is a multiple of %d", firstNumberTriple,secondNumberDouble,firstNumberTriple,secondNumberDouble);
}
boolean isNotMultiple = secondNumberDouble%firstNumberTriple!=0;
if(isNotMultiple){
    System.out.printf("First integer when tripled is %d%nSecond integer when doubled is %d%n%d is a multiple of %d", firstNumberTriple,secondNumberDouble,firstNumberTriple,secondNumberDouble);
}
    }
}
