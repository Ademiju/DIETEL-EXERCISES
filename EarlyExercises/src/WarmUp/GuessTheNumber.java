package WarmUp;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
                Let us Play a game of Guessing Numbers
                I have a number in mind, I want you to Guess the number
                The number is between 1 and 1000  
               
                Enter your Guess
                """;
        System.out.println(prompt);

        int userInput = input.nextInt();
        int myGuess = 377;
        switch (userInput){
            case 1:
                if(userInput == myGuess) {
                    System.out.println("Congratulations!!!!!!!! You guessed the number  ");
                }
                break;
            case 2 :
                if(userInput < myGuess) {
                    System.out.println("Too Low..Try again ");
                }
                    int tryAgain = input.nextInt();
                    switch (tryAgain) {
                        case 1 :
                            if(tryAgain == myGuess){
                                System.out.println("Congratulations!!!!!!!! You guessed the number  ");
                            }
                            break;
                        case 2:
                            if(tryAgain < myGuess){
                                System.out.println("Too Low..Try again ");

                            }
                            break;
                        case 3:
                            if(tryAgain > myGuess) {
                                System.out.println("Too High..Try again ");
                            }
                             break;

                }
                break;

            case 3:
                if(userInput > myGuess)
                System.out.println("Too High..Try again ");


        }
    }

}
