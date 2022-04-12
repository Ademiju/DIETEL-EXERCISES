package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class BestScoreChallenge {
    public static void main(String[] args) {
        int [] score = new int[20];
        System.out.println("Main Array");
        for(int index = 0; index < score.length; index++){
            SecureRandom random = new SecureRandom();
            int number = 1 + random.nextInt(270);
            score[index] = number;
        }
        System.out.println(Arrays.toString(score));

        int [] count;
        count = score;
        System.out.println("Count Array");
        for(int index = 10; index < count.length; index++){
            count[index] = 0;
        }
        System.out.println(Arrays.toString(count));

        int [] bonus;
        bonus = count;
        System.out.println("Bonus Array");
        for(int index = 0; index < bonus.length; index++){
            bonus[index]*=2;
        }
        System.out.println(Arrays.toString(bonus));

        int [] bestScore = new int[11];
        System.out.println("BestScore Array");
        for(int index = 0; index < bestScore.length; index++){
            bestScore[index] = bonus[index];
            System.out.println(bestScore[index]);
        }
    }
}
