package model;

import data.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Util;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private LocalDateTime time;

    @BeforeEach
    void setUp(){
        time=null;
    }

    @Test
    void testCanCreateAccount(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 0.0, getCreationTime());
        assertNotNull(account);
        assertEquals("mj_alao@gmail.com",account.getUserId());
        assertEquals(accountNumber,account.getAccountNumber());
        assertEquals(0.0,account.getBalance());
        assertEquals(time,account.getCreationTime());
    }

    @Test
    void testCanWithdraw(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(10000,"2894");
        assertEquals(90000.0, account.getBalance());
    }

    @Test
    void testCannotWithdrawMoreThanAccountBalance(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(110_000, "2894");
        assertEquals(100_000.0, account.getBalance());
    }

    @Test
    void testCannotWithdrawNegativeAmount(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(-10000, "2894");
        assertEquals(100_000.0, account.getBalance());
    }

    @Test
    void testCannotWithdrawZeroAmount(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(0, "2894");
        assertEquals(100_000.0, account.getBalance());
    }

    @Test
    void testCannotWithdrawWithoutAValidPin(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(10000, "2894");
        assertEquals(90_000.0, account.getBalance());
    }

    @Test
    void testCannotWithdrawWithAnInvalidPin(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.setAccountPin("2894");
        account.withdraw(10000, "1234");
        assertEquals(100_000.0, account.getBalance());
    }

    @Test
    void testCanDeposit(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.deposit(100000.0);
        assertEquals(200000, account.getBalance());
    }

    @Test
    void testCannotDepositNegativeAmount(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.deposit(-100000.0);
        assertEquals(100000, account.getBalance());
    }
    @Test
    void testCannotDepositZeroAmount(){
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 100_000.0, getCreationTime());
        account.deposit(0);
        assertEquals(100000, account.getBalance());
    }

    private LocalDateTime getCreationTime() {
        time = LocalDateTime.now();
        return time;
    }

}