package chapterFive;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aGradeCounter= 0;
        int bGradeCounter = 0;
        int cGradeCounter = 0;
        int dGradeCounter = 0;

        for(int counter = 0; counter < 5; counter++){
            System.out.println("Enter your name");
            String name = input.nextLine();
            System.out.println("Enter your grade");
            String userInput = input.nextLine();
            switch (userInput){
                case "A":
                        aGradeCounter++;
                        break;
                case "B":
                    bGradeCounter++;
                    break;
                case "C":
                    cGradeCounter++;
                    break;
                default:
                    dGradeCounter++;
            }

        }
        System.out.printf("%d students got an A Grade in the test%n%d students got a B Grade in the test%n%d students got a C Grade in the test%n%d students got a D Grade in the test",aGradeCounter,bGradeCounter,cGradeCounter,dGradeCounter);


    }
}
