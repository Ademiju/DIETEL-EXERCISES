package chapterSeven;

import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {

            int TOTAL_NUMBER_OF_SCORES = 10;
        int[] scores = new int[TOTAL_NUMBER_OF_SCORES];

        for (int count = 0; count < scores.length; count++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a score");
            int score = input.nextInt();
            scores[count] = score;
        }
        for(int count = 0; count<scores.length; count++) {
            System.out.print(scores[count] + " ");
            System.out.println();
        }
        int total = 0;
            for(int count = 0; count < scores.length; count++) {
                total = total + scores[count];
            }
        System.out.println("Your Total Score is "+ total);

                double average = total/(scores.length*1.0);

        System.out.println("Your Average Score is "+average);

        int maximumNumber = scores[0];
        for(int count = 0; count < scores.length; count++) {

             maximumNumber = Math.max(maximumNumber,scores[count] );
        }
        System.out.println("Your maximum score is "+maximumNumber);


        int minimumNumber = scores[0];
        for(int count = 0; count < scores.length; count++){
            minimumNumber = Math.min(scores[count], minimumNumber );
        }
        System.out.println("Your minimum score is "+minimumNumber);

    }



}