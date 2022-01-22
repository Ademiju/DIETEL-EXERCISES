package chapterFive;

import java.util.Scanner;

public class BarChartPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 30: ");
        int loopLength = 0;
        while(loopLength< 5) {
            int userInput = input.nextInt();
            int printValue = 1;
            if(userInput > 0 && userInput < 31 ){
            while(printValue <= userInput){
                System.out.print("* ");
                printValue++;
            }
                System.out.println();
                loopLength++;
                }else {
                System.out.println("The number entered is invalid, Try Again!!!");
                System.out.println("Enter a number between 1 and 30: ");
//
            }
        }
            System.out.println();
        System.out.println("Enter 5 numbers between 1 and 30: ");

        int firstUserInput = input.nextInt();
        int secondUserInput = input.nextInt();
        int thirdUserInput = input.nextInt();
        int fourthUserInput = input.nextInt();
        int fifthUserInput = input.nextInt();

        for(int printValue = 1; printValue <= firstUserInput; printValue++){
            if(firstUserInput > 0 && firstUserInput <=30) {
                System.out.print("* ");
            }

        }
        System.out.println();
        for(int printValue = 1; printValue <= secondUserInput; printValue++){
            if(secondUserInput > 0 && secondUserInput <=30) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for(int printValue = 1; printValue <= thirdUserInput; printValue++){
            if(thirdUserInput > 0 && thirdUserInput <=30) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for(int printValue = 1; printValue <= fourthUserInput; printValue++){
            if(firstUserInput > 0 && firstUserInput <=30) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for(int printValue = 1; printValue <= fifthUserInput; printValue++){
            if(firstUserInput > 0 && firstUserInput <=30) {
                System.out.print("* ");
            }
        }


        }
    }


