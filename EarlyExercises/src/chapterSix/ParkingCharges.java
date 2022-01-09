package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    private static final int MAXIMUM_PARKING_HOUR = 3;
    private  static final double MINIMUM_PARKING_CHARGE = 2.00;
    private static final double MAXIMUM_PARKING_CHARGE = 10.00;
    private static final double EXTRA_PARKING_HOUR_CHARGE = 0.50;

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        System.out.println("Enter the number of hours parked for each customers ");

        Scanner input = new Scanner(System.in);
        double hoursParked = input.nextDouble();
        if(hoursParked > 24) {
            System.out.println("Hours parked cannot be over 24hours");
        }
        while(hoursParked != 0 && hoursParked <= 24 ){
           double customerCharge =  calculateCharges(hoursParked);
            sum += customerCharge;
            count++;
            System.out.printf("Customer %d: Your parking charge for %.2f hour(s) : $%.2f%n",count,hoursParked,customerCharge);
            hoursParked = input.nextDouble();
            if(hoursParked > 24) {
                System.out.println("Hours parked cannot be over 24hours");
            }
        }
        if(count == 0){
            System.out.println("No Parking Receipts for Yesterday");
        }else {
            System.out.printf("Yesterday's total customer(s): %d%nYesterday's total parking receipts : $%f",count,sum);
        }
    }

    public static double calculateCharges(double hoursParked){
        double parkingCharges;
        if(hoursParked > 3&&hoursParked<24 ){
           double extraHoursParked =  hoursParked - MAXIMUM_PARKING_HOUR;
           parkingCharges = extraHoursParked * EXTRA_PARKING_HOUR_CHARGE;

        }else if(hoursParked >= 19 && hoursParked <=24){
            parkingCharges = MAXIMUM_PARKING_CHARGE;
        }else{
            parkingCharges = MINIMUM_PARKING_CHARGE;
        }

    return parkingCharges;
    }
}
