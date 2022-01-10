package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void createAccountNumber() {
        String accountNumber = Util.createAccountNumber();
        System.out.println(accountNumber);
        assertEquals(10, accountNumber.length());
    }
}