package chapterSix;

import chapterSix.Account;

public class Bank {
    public static void main(String[] args) {
        Account increaseAccount = new Account("Increase Lois");
        Account adeAccount = new Account("Ademiju Taiwo");

        System.out.println("Increase's initial balance is "+ increaseAccount.checkBalance());
        System.out.println("Ade's  initial balance is "+ adeAccount.checkBalance());
        System.out.println("Increase's Account name is "+increaseAccount.getAccountName());
        System.out.println("Ade's Account name is "+adeAccount.getAccountName());

        increaseAccount.withdraw(50_000);
        increaseAccount.deposit(5_000);
        adeAccount.deposit(3_000_000);
        increaseAccount.setAccountName("Increase Baby");
        adeAccount.setAccountName("Baba olowo");


        System.out.println("Increase's balance is "+increaseAccount.checkBalance());
        System.out.println("Ade's balance is "+adeAccount.checkBalance());
        System.out.println("Increase's new Account name is "+increaseAccount.getAccountName());
        System.out.println("Ade's new Account name is "+adeAccount.getAccountName());


    }

}


