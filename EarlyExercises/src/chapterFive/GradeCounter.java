package chapterFive;

import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {

        int total =0;
        int scoreInputCounter =0;
        int gradeACounter = 0;
        int gradeBcounter = 0;
        int gradeCCounter = 0;
        int gradeDCounter = 0;
        int gradeFCounter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Scores in the range 0 - 100 or Enter a negative to Exit");
        int score = input.nextInt();
        while(score >= 0 ){
            total +=score;
            scoreInputCounter++;
            System.out.println("Enter your Score in the range 0 - 100 or Enter a negative to Exit");
            score = input.nextInt();
            switch (score / 10){
                case 10:
                    gradeACounter++;
                    break;
                case 9:
                    gradeACounter++;
                    break;
                case 8:
                    gradeBcounter++;
                    break;
                case 7:
                    gradeCCounter++;
                    break;
                case 6:
                    gradeDCounter++;
                    break;
                default:
                    gradeFCounter++;
                    break;
            }
        }
        if(scoreInputCounter > 0){
            double average = total / (scoreInputCounter*1.0);
            System.out.println("GRADE REPORT: ");
            System.out.printf("The total of all %d scores inputted is %d%n",scoreInputCounter,total);
            System.out.printf("The Class average of all %d scores is %.2f%n",scoreInputCounter,average);
            System.out.println("The number of Students  with the different grades are : ");
            System.out.printf("Grade A: %d%nGrade B: %d%nGrade C: %d%nGrade D: %d%nGrade F: %d%n",gradeACounter,gradeBcounter,gradeCCounter,gradeDCounter,gradeFCounter);
        }else{
            System.out.println("No score was entered ");
        }
    }
}
