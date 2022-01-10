package util;

import java.util.Random;

public class Util {
    public static String createAccountNumber() {
        Random random = new Random();
        String accountNumber = String.format("%010d",Integer.parseInt(random.nextInt(999999999)+""));
        return accountNumber;
    }
}
