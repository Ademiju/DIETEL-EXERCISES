package chapterFive;

import java.util.Scanner;

public class GradeCounter2 {
    public static void main(String[] args) {
        int total =0;
        int scoreInputCounter =0;
        int gradeACounter = 0;
        int gradeBcounter = 0;
        int gradeCCounter = 0;
        int gradeDCounter = 0;
        int gradeFCounter = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while(input.hasNext()){
            int score = input.nextInt();
            total +=score;
            scoreInputCounter++;

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
            System.out.printf("The total of all %d scores inputted is %d%n",scoreInputCounter,total);
            System.out.printf("The Class average of all %d scores is %.2f%n",scoreInputCounter,average);
            System.out.println("The number of Students  with their different grades is listed below: ");
            System.out.printf("Grade A: %d%nGrade B: %d%nGrade C: %d%nGrade D: %d%nGrade F: %d%n",gradeACounter,gradeBcounter,gradeCCounter,gradeDCounter,gradeFCounter);
        }else{
            System.out.println("No score was entered ");
        }
    }
}



