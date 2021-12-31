package chapterTwo;

public class EvenOdd {
    public static void main(String[]args){

        int num = 100;

        System.out.println("Even numbers from 100 to 1: ");
        while(num > 2){
            num = num - 2;
            System.out.print(num+" ");
        }
        System.out.println(" ");
        System.out.println("Odd numbers from 100 to 1: ");

        int num2 = 99;
        while(num2 >=1){
            System.out.print(num2+" ");
            num2 = num2 - 2;
        }

    }
}
