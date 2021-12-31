package ChapterSix;

public class Account {
    private String accountName;
    private int balance;

    public Account(String accountName){
        this.accountName = accountName;
    }

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String newName) {
        accountName = newName;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
        public int checkBalance(){
            return balance;

        }

    /* 1. cannot play
    1. public static void deposit(int amount){
        balance = balance + amount;
        setAccountName("Moji");
    }
    2 to 4 can play
    2.
    public static void staticMethodAndStaticVariable(){
        bankName = "Diamond Access";
    }
    3.
    public void instanceMethodAndStaticVariable(String newName){
        accountName = newName;
        bankName = "GT CO";
    }
    4.
    public String getAccount(){
        return accountName;
    }        */
}

