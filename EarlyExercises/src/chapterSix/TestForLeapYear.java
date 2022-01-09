package chapterSix;

import java.util.Scanner;

public class TestForLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year to Test");
        int year = input.nextInt();
        System.out.print(isLeapYear(year));
    }

    public static boolean isLeapYear(int year){
       boolean leapYear ;
        if(year % 4 == 0){
            if(year % 100 != 0) {
                System.out.printf("%d is a Leap Year. It has 366 days: ",year);
                leapYear = true;
            }else if(year % 400 == 0){
                    System.out.printf("%d is a Leap Year. It has 366 days: ",year);
                    leapYear = true;
                }else{
                    System.out.printf("%d is a Leap Year. It has 366 days: ",year);
                    leapYear = false;
            }
            }else{
            System.out.printf("%d is a Leap Year. It has 366 days: ",year);
            leapYear = false;
        }
        return leapYear;
        }

    }


