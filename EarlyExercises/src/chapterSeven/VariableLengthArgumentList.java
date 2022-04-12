package chapterSeven;

public class VariableLengthArgumentList {
    public static void main(String[] args) {
        System.out.println(findAverageOfIntegerSeries(1,4,5,6,3));
        System.out.println(findAverageOfIntegerSeries(12,12,3));
        System.out.println(findAverageOfIntegerSeries(12,12,3,2,45,54,23,34,23,43));
    }
    public static int findAverageOfIntegerSeries(int...numbers){
        int total = 0;
        for(int number : numbers)
        total += number;
        System.out.print("Average is ");
        return total / numbers.length;

    }
}
