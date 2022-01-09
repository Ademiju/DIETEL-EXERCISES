package chapterSix;
import java.security.SecureRandom;
public class RollingADice {
    public static void main(String[] args) {
        System.out.println("20 Random dice rolls");
        SecureRandom diceValue = new SecureRandom();
        for(int diceRoll = 1; diceRoll <= 20; diceRoll++ ) {
            int diceFace =  1 +diceValue.nextInt(6);
            System.out.printf("%d ",diceFace);

            if(diceRoll%4==0){
                System.out.println();
            }

        }
    }
}
