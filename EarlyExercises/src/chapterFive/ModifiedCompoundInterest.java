package chapterFive;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        double amountOnDeposit;

        System.out.printf("%s%10s%25s%n","Year","Rate","Amount on Deposit");

        for(int year = 1; year <= 10; year++){
            for(int rate = 5; rate <= 10; rate++ ) {
                amountOnDeposit = principal * Math.pow(1.0 + (rate*0.01), year);
                System.out.printf("%2d%10d%,22.4f%n",year,rate,amountOnDeposit);
            }


        }
    }
    }

