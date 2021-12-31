package chapterTwo;

public class PopulationCalculator {

    /*2.34 (World Population Growth Calculator) Use the web to determine the current world population and the annual world population growth rate.
    Write an application that inputs these values, then displays the estimated world population after one, two, three, four and five years.

            ANSWER: */

    public static void main(String[]args) {

        double worldPopulation = 7.9;
        double growthRate = 1.0;

        System.out.printf("The world population is currently %f billion %n ", worldPopulation);

        System.out.printf("Annual World population growth rate is %f percent %n ", growthRate);

        double growthEstimate = (worldPopulation * 0.1);

        double yearOne = worldPopulation + growthEstimate;
        double yearTwo = yearOne + growthEstimate;
        double yearThree = yearTwo + growthEstimate;
        double yearFour = yearThree + growthEstimate;
        double yearFive = yearFour + growthEstimate;

        System.out.printf("Estimated World population After one year will be %.2f billion %n ", yearOne);
        System.out.printf("Estimated World population After two years will be %.2f billion %n", yearTwo);
        System.out.printf("Estimated World population After three years will be %.2f billion %n ", yearThree);
        System.out.printf("Estimated World population After four years will be %.2f billion %n", yearFour);
        System.out.printf("Estimated World population After five years will be %.2f billion ", yearFive);
    }

    }
