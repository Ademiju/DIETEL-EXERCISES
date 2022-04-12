package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        int[] number = new int[10];
        Arrays.fill(number, -1);
        Scanner input = new Scanner(System.in);

        for (int index = 0; index < number.length; index++){
            System.out.println("Enter a numbers between 10 and 100");
            int userInput = input.nextInt();
            while(userInput < 10 || userInput > 100){
                System.out.println("Invalid number entered\nEnter a number between 10 and 100");
                userInput = input.nextInt();
            }
            number[index] = userInput;
        }
        System.out.println("Array as Inputted By User");
        System.out.println(Arrays.toString(number));

        for (int numberIndex = 0; numberIndex < number.length; numberIndex++){
            for(int index = numberIndex+1; index < number.length; index++){
                if(number[numberIndex] == number[index]){
                    number[index] = -1;
                }
            }
        }
        System.out.println("Array after duplicate values have been removed");
        for (int numbers : number ){
            if (numbers != -1){
                System.out.print(numbers+" ");
            }
        }
    }
}
