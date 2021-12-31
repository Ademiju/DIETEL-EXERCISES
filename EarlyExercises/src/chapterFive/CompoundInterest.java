package chapterFive;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        double amountOnDeposit;

        System.out.printf("%s%25s%n","Year","Amount on Deposit");

        for(int year = 1; year <= 10; year++){
            amountOnDeposit = principal*Math.pow(1.0 + rate, year);

            System.out.printf("%2d%,22.4f%n",year,amountOnDeposit);

        }
    }
}
