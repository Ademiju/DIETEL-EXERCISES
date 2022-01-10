package data.model;

import java.time.LocalDateTime;

public class Account {
    private LocalDateTime creationTime;
    private double balance;
    private String accountNumber;
    private String userId;
    private String pin;

    public Account(String userId, String accountNumber, double balance, LocalDateTime creationTime) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creationTime = creationTime;

    }

    public void setAccountPin(String pin) {
        if (pin.length() == 4){
            for (int i = 0; i < pin.length(); i++) {
                char ch = pin.charAt(i);
                if(!Character.isDigit(ch)){
                    System.out.println("Invalid pin");
                    return;
                }
            }
            this.pin = pin;
        }
        else{
            System.out.println("Invalid pin");
        }
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void withdraw(int withdrawalAmount, String pin) {
        if (withdrawalAmount <= 0.0){
            System.out.println("Invalid withdraw amount");
            return;
        }
        if (withdrawalAmount > balance){
            System.out.println("Error message : insufficient funds!");
            return;
        }
        if (!this.pin.equals(pin)){
            System.out.println("Invalid pin");
            return;
        }
        balance -= withdrawalAmount;
        System.out.println("Withdrawal successfully");
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
}