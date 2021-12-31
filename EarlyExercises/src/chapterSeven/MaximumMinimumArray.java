package chapterSeven;

public class MaximumMinimumArray {
    public static void main(String[] args) {
        int [] numbers = {3,6,8,5,4};

        int total =  numbers[0] + numbers[1] + numbers[2]+ numbers[3]+ numbers[4];
        int total1 = numbers[1] + numbers[2]+ numbers[3]+ numbers[4];
        int total2 = numbers[0] + numbers[2]+ numbers[3]+ numbers[4];
        int total3 = numbers[0] + numbers[1]+ numbers[3]+ numbers[4];
        int total4 = numbers[0] + numbers[1]+ numbers[2]+ numbers[4];
        int total5 = numbers[0] + numbers[1]+ numbers[2]+ numbers[3];

        int minimum = Math.min(total,Math.min(total1,Math.min(total2,Math.min(total3,total4))));
        int maximum = Math.max(total,Math.max(total1,Math.max(total2,Math.max(total3,total4))));


        System.out.println("Minimum Addition of Array numbers is "+minimum);
        System.out.println("Maximum Addition of Array numbers is "+maximum);
    }
}
