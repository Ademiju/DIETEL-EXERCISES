package chapterSeven;

import java.security.SecureRandom;

public class SumOfDiceFrequency {
    private static int rollSum;
    public static void rollDice() {
        SecureRandom random = new SecureRandom();
        int firstDiceRoll = 1 + random.nextInt(6);
        int secondDiceRoll = 1 + random.nextInt(6);
         rollSum = firstDiceRoll + secondDiceRoll;
    }

    public static void multipleDiceRoll(){
        int [] diceRollSumFrequency = new int[13];
        for(int roll = 0; roll < 36_000_000; roll++ ){
            rollDice();
            diceRollSumFrequency[rollSum]++;
        }
        displayDiceRollFrequency(diceRollSumFrequency);
    }
    public static void displayDiceRollFrequency(int[] array){
        System.out.printf("%11s%10s%n","DiceRollSum","Frequency");
        for(int index = 2; index < array.length; index++){
            System.out.printf("%8d%11d%n",index,array[index]);
        }

    }

    public static void main(String[] args) {
        multipleDiceRoll();
    }

    }

