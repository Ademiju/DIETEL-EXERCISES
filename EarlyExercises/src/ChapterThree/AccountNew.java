package chapterThree;

public class AccountNew {

/* 3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
            that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
    the Account’s balance. If it does, the balance should be left unchanged and the method should print
    a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
            (Fig. 3.9) to test method withdraw.

    ANSWER: */

    private String name;
    private double balance;
    private double withdraw;

    public AccountNew (String name, double balance ){
        this.name = name;

        if (balance > 0){
            this.balance = balance;
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalance(double newDeposit){
        if (balance > 0){
            balance = balance + newDeposit;
        }
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(double withdrawAmount){
        if(balance > withdrawAmount){
            balance  = balance - withdrawAmount;
        }
        if(withdrawAmount > balance){
            System.out.println("You do not have sufficient amount to withdraw");
        }

    }

    public double getWithdraw(){
        return balance;
    }





}
