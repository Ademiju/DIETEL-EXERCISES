package chapterFour;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultCounter =0;
        int passCounter=0;
        int failCounter=0;
        while(resultCounter <10) {
            System.out.println("Enter result: \n1 for a pass\n2 for a fail");
            int result = input.nextInt();
            if (result == 1) {
                passCounter++;
            } else{
                failCounter++;
        }
            resultCounter++;

        }

        System.out.println((passCounter+" students passed the test"));
        System.out.println((failCounter+" student failed the test"));
        if(passCounter >=8){
            System.out.println("Bonus to Instructor");
        }



//        factorial calculator
//        int num = 5;
//        int product = 1;
//        while (num>1){
//            product*=num;
//            num--;
//        }
//        System.out.println("5! = "+product);
    }
}
