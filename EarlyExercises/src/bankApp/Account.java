package bankApp;

public class Account {
    private String name;
    private String number;
    private Type accountType;

    Account(String name, String number, Type account){
        this.name = name;
        this.number = number;
        accountType = account;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Type getAccountType() {
        return accountType;
    }
}
