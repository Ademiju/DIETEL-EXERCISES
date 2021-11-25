package ChapterTwo;

import java.util.Scanner;

public class SavingsCalculator {
    /* 2.35 (Car-Pool Savings Calculator) Research several car-pooling websites.
Create an application that calculates your daily driving cost, so that you can estimate how much money could be saved by car pooling,
which also has other advantages such as reducing carbon emissions and reducing traffic congestion.
The application should input the following information and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.

ANSWER:  */

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total miles you drive per day");
        double totalMile = input.nextDouble();

        System.out.println("Enter the cost of a gallon of gasoline");
        double gasolineCost = input.nextDouble();

        System.out.println("Enter the average miles you drive using a gallon of gasoline");
        double averageMile = input.nextDouble();

        System.out.println("Enter how much you spend on Parking fees");
        double parkingFee = input.nextDouble();

        System.out.println("Enter the amount you pay on tolls per day");
        double tollFees = input.nextDouble();
        System.out.println(" " );

        double totalGasolineUsed = totalMile / averageMile;
        double totalCostOfGasoline = totalGasolineUsed * gasolineCost;
        double totalCostPerDay = totalCostOfGasoline + parkingFee + tollFees;

        System.out.printf("Your total cost on Gasoline per day is $%.2f%n ",totalCostOfGasoline);
        System.out.printf("Your total Cost on driving to work daily including your Parking fees and Toll fees is $%.2f ", totalCostPerDay);

    }

}
