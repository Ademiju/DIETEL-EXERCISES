package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

import static chapterSix.GameOfCraps.*;

public class GameOfCrapsModification {
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int CRAP1 = 2;
    private static final int CRAP2 = 3;
    private static final int CRAP3 = 12;
    private static double bankBalance = 1000;
    public enum GameStatus {WON,LOST,CONTINUE}

    public  double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }



    public static void chatter(){
        int chatterDisplay = 1 + diceRoll.nextInt(3);
       switch(chatterDisplay){
           case 1:
               System.out.println("Oh, you're going for broke, huh?" );
               break;
           case 2:
               System.out.println("Aw c'mon, take a chance!");
               break;
           case 3:
               System.out.println("You're up big. Now's the time to cash in your chips!");
       }

    }

    public static void playCrap() {
        System.out.println("Enter a Wager");
        Scanner input = new Scanner(System.in);
        double wagerAmount = input.nextDouble();
        if (bankBalance >= wagerAmount) {
            int dicePoint = 0;
            int sumOfDice = diceRoll();
            GameStatus status;
            switch (sumOfDice) {
                case SEVEN:
                case ELEVEN:
                    status = GameStatus.WON;
                    break;
                case CRAP1:
                case CRAP2:
                case CRAP3:
                    status = GameStatus.LOST;
                    break;
                default:
                    status = GameStatus.CONTINUE;
                    System.out.printf("You rolled a sum of %d on your first roll, Your point is %d%n", sumOfDice, sumOfDice);

            }
            if (status == GameStatus.WON) {
                System.out.printf("Congratulations!!!, You rolled a sum of %d on your first roll%nYOU WON!!!", sumOfDice);
                bankBalance += wagerAmount;
                System.out.println("Your account Balance is " + bankBalance);
                playCrap();


            } else if (status == GameStatus.LOST) {
                System.out.printf("Oops!!!, You rolled a sum of %d on your first roll%nYOU LOST!!!", sumOfDice);
                bankBalance -= wagerAmount;
                System.out.println("Your account Balance is " + bankBalance);
                chatter();
                if(bankBalance > 0.0) playCrap();
                else System.out.println("Sorry. You busted!");
            }
            while (status == GameStatus.CONTINUE) {
                System.out.println("Your account Balance is " + bankBalance);
                System.out.println("Continue to roll");
                dicePoint = diceRoll();
                if (dicePoint == sumOfDice) {
                    status = GameStatus.WON;
                    bankBalance += wagerAmount;
                    System.out.printf("Congratulations!!!, You rolled a sum of %d equal to your point%nYOU WON!!!", dicePoint);
                    System.out.println("Your account Balance is " + bankBalance);
                    playCrap();
                } else if (dicePoint == SEVEN) {
                    status = GameStatus.LOST;
                    bankBalance -= wagerAmount;
                    System.out.printf("Oops!!!, You rolled a sum of %d%nYOU LOST!!!", dicePoint);
                    System.out.println("Your account Balance is " + bankBalance);

                    if (bankBalance > 0.0) {
                        chatter();
                        playCrap();
                    } else {System.out.println("Sorry. You busted!");
                }
                }

            }

        }else{
            System.out.println("Invalid wager amount try Again");
            System.out.println("Your account Balance is " + bankBalance);
            playCrap();
        }
    }


    public static void main(String[] args) {
        playCrap();
    }
}

