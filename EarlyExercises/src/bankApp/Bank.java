package bankApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String sortCode;
    private ArrayList<Customer> customers;

 Bank(String name, String sortCode, ArrayList<Customer> customers){
    this.name = name;
    this.sortCode = sortCode;
    this.customers = customers;
}

    public String getName() {
        return name;
    }

    public String getSortCode() {
        return sortCode;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
