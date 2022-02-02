package chapterSeven;

import java.util.Scanner;

public class AnalyzingSurvey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] surveyResponses = new int[6];
        for(int participant = 0; participant < 20; participant++) {
            try {
                System.out.println("On a scale of 1 - 5, with 1 being “awful” and 5 being “excellent.”Rate the Cafeteria food");
                surveyResponses[input.nextInt()]++;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);


            }
        }
        System.out.println("Responses\tFrequency");
        for(int frequency = 1; frequency < surveyResponses.length; frequency++){
            System.out.printf("%d%14d%n",frequency,surveyResponses[frequency]);
        }
    }
}
