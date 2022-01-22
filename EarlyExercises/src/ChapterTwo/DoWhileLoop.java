package chapterTwo;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        int score = 0;
        int total = 0;

        do {
            total = total + score;
            System.out.println("Enter a score: ");
            Scanner scanner = new Scanner(System.in);
            score = scanner.nextInt();
        }
        while(score >= 0 && score < 101);

        System.out.println("Total is "+total);
        }
    }



