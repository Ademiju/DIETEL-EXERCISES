package chapterSeven;

import java.security.SecureRandom;

public class RollingDiceFrequency {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] diceFrequency = new int[7];

        for (int diceroll = 0; diceroll < 6_000_000; diceroll++ ) {
          diceFrequency [1 + random.nextInt(6)]++;
        }
        System.out.println("Face\tFrequency");
        for (int diceFace = 1; diceFace < diceFrequency.length; diceFace++){
            System.out.printf("%d%14d%n",diceFace,diceFrequency[diceFace]);
        }
    }
}
