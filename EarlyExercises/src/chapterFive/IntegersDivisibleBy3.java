package chapterFive;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Numbers divisible by 3 between 1 and 30 are: ");
        for(int number = 1; number <= 30; number++ ){
            if(number % 3 ==0){
            total += number;
                System.out.print(number+" ");
            }

        }
        System.out.println();
        System.out.println("The sum of the integers between 1 and 30 divisible by 3 is :"+total);
    }
}
