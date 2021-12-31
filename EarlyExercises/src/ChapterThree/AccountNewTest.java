package chapterThree;

public class AccountNewTest {
    public static void main(String[]args){

        AccountNew firstdeposit = new AccountNew("Ademiju", 20);

        System.out.println(" ");
        System.out.printf("Your account name is %s and your account balance is $%.2f%n ",firstdeposit.getName(), firstdeposit.getBalance());

        firstdeposit.setBalance(45);

        System.out.println(" ");
        System.out.printf("Dear %s, you just received a deposit of $45", firstdeposit.getName());
        System.out.println(" ");
        System.out.printf("Your new account balance is $%.2f%n ", firstdeposit.getBalance());
        System.out.println(" ");

        System.out.printf("Dear %s you just made a withdrawal of $54.23 \n", firstdeposit.getName());
        firstdeposit.withdraw(54.23);

        System.out.println(" ");
        System.out.printf("Your new account balance is $%.2f ", firstdeposit.getWithdraw());
    }
}
