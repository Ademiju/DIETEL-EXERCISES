package chapterThree;

import chapterThree.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    //private Account increaseAccount = new Account("Increase Eve","1342");


    @Test
    public void accountCanBeCreatedTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        String accountName = increaseAccount.getAccountName();
        assertEquals("Increase Eve", accountName);
        // String increaseAccountName = increaseAccount.getAccountName();

    }

    @Test
    public void accountBalanceIs50kAfterOpeningTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.getBalance("8736");
        assertEquals(50_000, balance);

    }

    @Test
    public void deposit5KToAccountTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.deposit(5_000);
        assertEquals(55_000, balance);

    }

    @Test
    public void negativeDepositDoesNotAffectBalanceTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.deposit(-5_000);
        assertEquals(50_000, balance);
    }

    @Test
    public void withdrawFromAccountTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.withdraw(10_000, "8736");
        assertEquals(40_000, balance);

    }

    @Test
    public void negativeWithdrawalDoesNotWorkTest() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.withdraw(-10_000, "8736");
        assertEquals(0, balance);
    }

    @Test
    public void withdrawMoreThanBalanceIsNotPossible() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.withdraw(90_000, "8736");
        assertEquals(0, balance);
    }

    @Test
    public void withdrawWithWrongPinDoesNotWork() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.withdraw(20_000, "8763");
        assertEquals(0, balance);
    }


    @Test
    public void checkBalanceWithWrongPinDoesNotWork() {
        Account increaseAccount = new Account("Increase Eve", "8736");
        int balance = increaseAccount.getBalance("8736");
        assertEquals(50000, balance);
    }

}