package chapterFour;

public class CreditLimit {

    private int accountNumber;
    private int accountBalance;
    private int charges;
    private int credits;
    private int creditLimit = 1000;

    public CreditLimit(int accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;

    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountBalance(int beginningBalance) {

        accountBalance = beginningBalance;
    }

    public int getAccountBalance() {

        return accountBalance;
    }

    public void setCharges(int charges) {

        this.charges = charges;
    }

    public int getCharges() {

        return charges;
    }

    public void setCredits(int credits) {

        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void newBalance(){
        accountBalance = accountBalance + charges -credits;
        if(accountBalance < creditLimit){
            System.out.println("Credit limit exceeded ");
        }
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}

