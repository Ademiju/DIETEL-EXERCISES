package bankApp;

import java.util.Objects;

public class Account {

    private String name;
    private String pin;
    private int balance = 50_000;
    public int deposit;

    public Account(String accountName, String accountPin) {
        name = accountName;
        pin = accountPin;
    }

    public String getAccountName() {
        return name;
    }

    public int getBalance(String accountPin) {
        if(accountPin == pin)
        return balance;
        return 0;
    }

    public int deposit(int amount) {
        if (amount > 0)
            balance += amount;
        return balance;
    }

    public int withdraw(int amount, String pin) {
        if (amount > 0) {
            if (balance > amount) {
                if (Objects.equals(pin, this.pin)) {
                    balance -= amount;
                    return balance;
                }

            }
        }

        return 0;
    }

//    public String toString(){
//        String stringToReturn = "";
//        stringToReturn += " Account Name: "+ getAccountName();
//        stringToReturn += "\nAccount Balance: "+ balance;
//        stringToReturn += "\nPin : Hidden";
//        return stringToReturn;
//    }

//    public String toString(){
//        return name + "\t" + balance + "\t" + pin;
//    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", deposit=" + deposit +
                '}';
    }
    //IDE generated method, hover on the toString method and generate it automatically
}


