package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int triangles = 1; triangles<=3; triangles++){
            System.out.printf("Enter the two sides of triangle %d%n",triangles);
            double sideA = input.nextDouble();
            double sideB = input.nextDouble();
            double hypotenuse = calculateHypotenuse(sideA,sideB);
            System.out.printf("The hypotenuses of triangle %d is: %.2fm%n",triangles,hypotenuse);
            System.out.println();
        }

    }

    public static double calculateHypotenuse(double sideA,double sideB){
        double hypotenuse = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
        return hypotenuse;
    }
}
