package chapterFive;

import java.util.Scanner;

public class ModifiedGlobalWarmingFactQuiz {
    public static void main(String[] args) {
        int correctAnswers = 0;
        System.out.println(" There are 5 questions for you: Enter 1 , 2 , 3 or 4 to choose your correct answers");
        Scanner input = new Scanner(System.in);
        for (int questions = 1; questions <= 5; questions++) {
            switch (questions) {
                case 1:
                    System.out.println("Question 1. This layer keeps us “not too hot in the summer” and “not too cold in the winter.” Scientists call this the ________ effect.\n1. greenhouse effect\n2. seasonal effect\n3. ocean effect\n4. lake effect");
                    System.out.println("Enter 1 , 2 , 3 or 4 to choose your correct answers");

                    int userAnswer1 = input.nextInt();
                    if (userAnswer1 == 1) {
                        correctAnswers++;
                    }
                    break;

                case 2:
                    System.out.println("Question 2. Earth’s temperatures are stable because we are surrounded by ________ which allows the right amount of sunlight in to warm the Earth.\n1. a cloud layer\n2. an atmosphere\n3. gravity\n4. water");
                    System.out.println("Enter 1 , 2 , 3 or 4 to choose your correct answers");

                    int userAnswer2 = input.nextInt();
                    if (userAnswer2 == 2) {
                        correctAnswers++;
                    }
                    break;
                case 3:
                    System.out.println("Question 3. Too many greenhouse gasses in the atmosphere may block heat from escaping into space and trap too much heat next to the Earth’s surface causing: ____________.\n1. another ice age\n2. earthquakes\n3. global warming\n4. volcanic eruptions");
                    System.out.println("Enter 1 , 2 , 3 or 4 to choose your correct answers");

                    int userAnswer3 = input.nextInt();
                    if (userAnswer3 == 3) {
                        correctAnswers++;
                    }
                    break;

                case 4:
                    System.out.println("Question 4. The solar radiation that bounces off the Earth back toward the atmosphere is mostly _____ (with a longer wavelength).\n1. gamma radiation\n2. x-ray radiation\n3. nuclear radiation\n4. infrared radiation");
                    System.out.println("Enter 1 , 2 , 3 or 4 to choose your correct answers");

                    int userAnswer4 = input.nextInt();
                    if (userAnswer4 == 4) {
                        correctAnswers++;
                    }
                    break;

                case 5:
                    System.out.println("Question 5. Something that might happen because of global warming is: __________.\n1. melting polar ice caps\n2. more reflected sunlight off the ice pack\n3. lower sea levels\n4. a sale on bathing suits");
                    System.out.println("Enter 1 , 2 , 3 or 4 to choose your correct answers");

                    int userAnswer5 = input.nextInt();
                    if (userAnswer5 == 1) {
                        correctAnswers++;
                    }
                    break;

            }
        }
        System.out.println();
        if (correctAnswers == 5) {
            System.out.println("Excellent\nYou got all questions correctly ");
        }
        if (correctAnswers == 4) {
            System.out.println("Very Good\nYou got 4 out of 5 questions correctly ");
        }
        if (correctAnswers <= 3) {
            System.out.printf("You got %d questions correctly\nTime to brush up on your global warming knowledge\nVisit: https://www.exploringnature.org/graphics/quiz/glocal_warm_MultipleChoice.pdf for more details", correctAnswers);
        }
    }
}
