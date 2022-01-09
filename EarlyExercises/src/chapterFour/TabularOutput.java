package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%s%10s%9s%9s%n","N","N^2","N^3","N^4");
        int number = 1;
        while(number <=5){
            int power = 1;
            while(power < 5){
                int nPower = (int) Math.pow(number,power);
                power++;
                System.out.printf("%-9d",nPower);
            }
            System.out.println();
            number++;
        }
    }
}
