package chapterSix;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your X and Y coordinates to calculate the distance between the Two points");
        System.out.println();
        System.out.println("Enter X1: ");
        double pointX1 = input.nextDouble();
        System.out.println("Enter X2: ");
        double pointX2 = input.nextDouble();
        System.out.println("Enter Y1: ");
        double pointY1 = input.nextDouble();
        System.out.println("Enter Y2: ");
        double pointY2 = input.nextDouble();
        calculateDistanceBetweenTwoPoint(pointX1,pointX2,pointY1,pointY2);

    }

    public static double calculateDistanceBetweenTwoPoint(double pointX1,double pointX2,double pointY1,double pointY2){
        double distance = Math.sqrt((Math.pow((pointX2-pointX1),2)) + (Math.pow((pointY2-pointY1),2)));
        System.out.println("distance = "+distance);
       return distance;
    }

}
