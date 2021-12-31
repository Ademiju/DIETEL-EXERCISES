package chapterFour;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total=0;
        int count= 0;
        while(count <10){
            System.out.println("Enter you grade: ");
            int grade = input.nextInt();
            total+=grade;
            count++;
        }
        double average = total/10.0;

        System.out.println("Your total score is "+total);
        System.out.println("Your average score is "+average);
    }
}
