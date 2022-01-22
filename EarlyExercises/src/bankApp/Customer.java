package bankApp;

public class Customer {
    private String  name;
    private Account account ;

    Customer (String name, Account account){
        this.account = account;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
