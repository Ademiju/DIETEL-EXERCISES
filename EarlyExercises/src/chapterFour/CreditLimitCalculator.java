package chapterFour;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        CreditLimit customer = new CreditLimit(2001,0);
        customer.setAccountBalance(50000);
        customer.setCharges(10000);
        customer.setCredits(80000);
        System.out.println("Your Balance at the beginning of this month is "+customer.getAccountBalance());
        System.out.println("Your total item charged for this month is "+customer.getCharges());
        System.out.println("Credit limit is: "+customer.getCreditLimit());
        System.out.println("Total credits applied to your account this month is "+customer.getCredits());
        customer.newBalance();
        System.out.println("Your new account balance is "+customer.getAccountBalance());
    }
}
