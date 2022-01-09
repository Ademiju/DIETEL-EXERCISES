package chapterFive;

public class ModifiedCompoundInterest2 {
    public static void main(String[] args) {
        int principal = 1000;

        int amountOnDeposit;

        System.out.printf("%s%10s%25s%n","Year","Rate","Amount on Deposit");

        for(int year = 1; year <= 10; year++){
            for(int rate = 5; rate <= 10; rate++ ) {
                double compoundInterest = (principal * Math.pow(1+(rate*0.01),year));
                amountOnDeposit =  (int)(compoundInterest*1000);
                int dollar= amountOnDeposit/1000;
                int cents = amountOnDeposit%1000;
                System.out.printf("%2d%10d%,22d.%d%n",year,rate,dollar,cents);

            }
        }
    }
}
