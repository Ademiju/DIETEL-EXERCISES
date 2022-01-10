package chapterSix;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in celsius ");
        double celsius = input.nextDouble();
        System.out.printf("%.2f celsius is %.2f kelvin%n", celsius,kelvin(celsius));

        System.out.println("Enter a temperature in celsius ");
        double kelvin = input.nextDouble();
        System.out.printf("%.2f kelvin is %.2f celsius", kelvin,(celsius(kelvin)));

    }

    public static double kelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    public static double celsius(double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }
}
