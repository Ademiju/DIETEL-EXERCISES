package chapterSix;

import java.security.SecureRandom;

public class GameOfCraps {
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int CRAP1 = 2;
    private static final int CRAP2 = 3;
    private static final int CRAP3 = 12;

    public enum GameStatus {WON,LOST,CONTINUE}


    public static SecureRandom diceRoll = new SecureRandom();

    public static void main(String[] args) {
        int dicePoint = 0;
        int sumOfDice = diceRoll();
        GameStatus status ;
        switch(sumOfDice) {
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
                if(status == GameStatus.WON){
                    System.out.printf("Congratulations!!!, You rolled a sum of %d on your first roll%nYOU WON!!!",sumOfDice);

                }else if(status ==GameStatus.LOST){
                    System.out.printf("Oops!!!, You rolled a sum of %d on your first roll%nYOU LOST!!!",sumOfDice);
                }
                while(status == GameStatus.CONTINUE){
                    System.out.println("Continue to roll");
                    dicePoint = diceRoll();
                    if (dicePoint == sumOfDice){
                        status = GameStatus.WON;
                        System.out.printf("Congratulations!!!, You rolled a sum of %d equal to your point%nYOU WON!!!",dicePoint);
                    }  else if(dicePoint == SEVEN){
                        status = GameStatus.LOST;
                        System.out.printf("Oops!!!, You rolled a sum of %d%nYOU LOST!!!",dicePoint);

                    }

                }

        }


    public static int diceRoll(){
        int firstDiceRoll = 1 + diceRoll.nextInt(6);
        int secondDiceRoll = 1 + diceRoll.nextInt(6);
        int sum = firstDiceRoll + secondDiceRoll;
        System.out.printf("Player rolled %d and %d%nSum of player's two rolls is %d%n ",firstDiceRoll,secondDiceRoll,sum);
    return sum;
    }
}
