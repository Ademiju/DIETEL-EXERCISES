package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String prompt = """
                Let us Play a game of Guessing Numbers
                I have a number in mind, I want you to Guess the number
                The number is between 1 and 1000  
                               
                Enter your Guess
                """;
        System.out.println(prompt);

        int userInput = input.nextInt();
        int myGuess = random.nextInt(1000);
        int guessCounter = 0;
        while (userInput != myGuess) {
            if (userInput < myGuess) {
                System.out.println("Too Low..Try again ");
                guessCounter++;
                System.out.println(prompt);
                userInput = input.nextInt();

            }

            if (userInput > myGuess) {
                System.out.println("Too High..Try again ");
                guessCounter++;
                System.out.println(prompt);
                userInput = input.nextInt();


            }

        }
        if (userInput == myGuess) {
            guessCounter++;
            if(guessCounter == 10) {
                System.out.println("Aha! you know the secret!");
            }
            else if(guessCounter <= 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                }else{
                System.out.println("You should be able to do better!");
            }
            System.out.println("Congratulations!!!!!!!! You guessed the number with "+guessCounter+" guesses");
            }

        }
    }

