package chapterThree;

import java.util.Scanner;

public class RemovingDuplicatedCode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000");
        System.out.println("I will return the sum of your integer");
        int userInput = input.nextInt();

        if(userInput>0&&userInput < 10){
            System.out.println("This integer doesn't require summing\nObviously your result is still the integer you entered: "+userInput);
        }
        if(userInput >10&&userInput<100){
            int lastNumber = userInput%10;
            int firstNumber = userInput/10;
            int sum = firstNumber+lastNumber;
            System.out.println("The sum of your integer is "+sum);

        }

        if(userInput>100&&userInput<1000){
            int lastNumber = userInput%10;
            int remainder = userInput/10;
            int secondNumber = remainder%10;
            int firstNumber =remainder/10;
            int sum = firstNumber+secondNumber+lastNumber;
            System.out.println("The sum of your integer is "+sum);

        }

        if(userInput<0){
            System.out.println("Negative input not allowed\nInstruction says integers between 0 and 1000\nYou must be daft");
        }

        if(userInput==0){
            System.out.println("Zero is not allowed\nInstruction says integers between 0 and 1000\nYou must be daft");
        }

        if(userInput==1000){
            System.out.println("1000 is not allowed\nInstruction says integers between 0 and 1000\nYou must be daft");
        }
        if(userInput>1000){
            System.out.println(userInput+ " is not within the integer range requested\nInstruction says integers between 0 and 1000\nYou must be daft");
        }
    }
}
