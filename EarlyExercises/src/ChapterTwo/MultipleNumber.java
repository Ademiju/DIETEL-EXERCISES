package chapterTwo;

import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.println("Enter a first integer");
 int firstNumber = input.nextInt();
        System.out.println("Enter a second integer");
int secondNumber = input.nextInt();

int firstNumberTriple = firstNumber*3;
int secondNumberDouble = secondNumber*2;
if(secondNumberDouble%firstNumberTriple==0){
    System.out.printf("First integer when tripled is %d%nSecond integer when doubled is %d%n%d is a multiple of %d", firstNumberTriple,secondNumberDouble,firstNumberTriple,secondNumberDouble);
}

if(secondNumberDouble%firstNumberTriple!=0){
    System.out.printf("First integer when tripled is %d%nSecond integer when doubled is %d%n%d is a multiple of %d", firstNumberTriple,secondNumberDouble,firstNumberTriple,secondNumberDouble);
}
    }
}
