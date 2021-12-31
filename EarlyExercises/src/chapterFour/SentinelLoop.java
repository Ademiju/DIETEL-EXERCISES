package chapterFour;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int grade;
        System.out.println("Enter your Score or -2 to quit ");
        grade = input.nextInt();
        while (grade != -2){
            total += grade;
            count++;
            System.out.println("Enter your Score or -2 to quit");
            grade = input.nextInt();
        }
        double average = total/(count*1.0);
        if(count <= 0){
            System.out.println("No scores entered");
        }else{
            System.out.printf("You entered %d scores and your total score is %d%nYour average score is %.2f", count,total, average);
        }

    }
}
