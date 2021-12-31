package WarmUp;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number");

        int userInput = input.nextInt();

        int firstNumber = userInput / 1000;
        int remainder = userInput % 1000;
        int secondNumber = remainder / 100;
        int remainder2 = remainder % 100;
        int thirdNumber = remainder2 / 10;
        int fourthNumber = remainder2 % 10;


        int newFirstNumber = (firstNumber + 7)%10;
        int newSecondNumber = (secondNumber + 7)%10;
        int newThirdNumber = (thirdNumber + 7)%10;
        int newFourthNumber = (fourthNumber + 7)%10;


        System.out.println("Your encrypted digit is "+newThirdNumber+ ""+newFourthNumber+""+newFirstNumber+""+newSecondNumber);

    }
}
