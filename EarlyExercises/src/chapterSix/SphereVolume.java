package chapterSix;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the sphere");
        Scanner input = new Scanner(System.in);
        double userRadius = input.nextDouble();
//       double volume = sphereVolume(useRadius);
        System.out.printf("The volume of a sphere with radius %.2fm is: %fm^3",userRadius,sphereVolume(userRadius));
    }
    public static double sphereVolume(double radius){
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        return volume;
    }
}
