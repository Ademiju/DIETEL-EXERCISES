package chapterSix;

import java.security.SecureRandom;

public class RollingDiceFrequency {
    public static void main(String[] args) {
        SecureRandom diceValue = new SecureRandom();
        System.out.println("Dice Face\tFrequency");
        int diceFace1 = 0;
        int diceFace2 = 0;
        int diceFace3 = 0;
        int diceFace4 = 0;
        int diceFace5 = 0;
        int diceFace6 = 0;
        for(int diceRolls = 0; diceRolls<60_000_000;diceRolls++){
            int diceFace = 1 + diceValue.nextInt(6);
            switch(diceFace){
                case 1:
                    diceFace1++;
                    break;
                case  2:
                    diceFace2++;
                    break;
                case 3:
                    diceFace3++;
                    break;
                case 4:
                    diceFace4++;
                    break;
                case 5:
                    diceFace5++;
                    break;
                case 6:
                    diceFace6++;
                    break;
            }

        }

        System.out.println("\t1\t\t\t"+diceFace1);
        System.out.println("\t2\t\t\t"+diceFace2);
        System.out.println("\t3\t\t\t"+diceFace3);
        System.out.println("\t4\t\t\t"+diceFace4);
        System.out.println("\t5\t\t\t"+diceFace5);
        System.out.println("\t6\t\t\t"+diceFace6);

    }
}
