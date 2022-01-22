package chapterThree;

import chapterThree.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //prompt user to create account or exit
        //if create account
        //prompt user to deposit

        // displayInitialPrompt();
        //int response = collectResponseFromIniialUser;
         displayInitialPrompt();
    }

    public static void displayInitialPrompt() {

        Scanner input = new Scanner(System.in);
        int response = 0;
        Account userAccount ;
        do {
            String prompt = """
                    Welcome to GTCO  Bank LTD
                    Here is Our Menu
                    Press 1 to create account
                    Press 2 to exit""";
            System.out.println(prompt);
            response = input.nextInt();

            switch (response) {
                case 1:
                    input.nextLine();
                    System.out.println("Enter Your Name to Open an Account");
                    String name = input.nextLine();
                    System.out.println("Enter Your Pin");
                    String pin = input.nextLine();
                    userAccount = new Account(name, pin);
                    System.out.println("Account has been Successfully Created");
                    //start of do while loop

                    do {
                        String newAccountPrompt = """ 
                                Press 1 to Deposit
                                Press 2 to Withdraw
                                Press 3 to Check Balance
                                Press 4 to go back 
                                Press 5 to EXIT
                                """;
                        System.out.println(newAccountPrompt);
                        int newResponse = input.nextInt();
                        switch ((newResponse)) {
                            case 1:
                                System.out.println("How much do you want to deposit");
                                int amount = input.nextInt();
                                userAccount.deposit(amount);
                                System.out.println("Your deposit has been Credited");
                                break;
                            case 2://todo withdraw
                                System.out.println(" How much do you want to withdraw");
                                int amountToWithdraw = input.nextInt();
                                input.nextLine();
                                System.out.println("Enter your PIN");
                                String providedPin = input.nextLine();
                                System.out.println("Your withdrawal has been successfully made");
                                break;
                            case 3:
                                //input.nextLine;
                                System.out.println("Enter your PIN");
                                String enterPin = input.nextLine();
                                int balance = userAccount.getBalance(enterPin);
                                System.out.println(balance);
                                //todo implement check balance

                                break;
                            case 4:
                                //todo
                                displayInitialPrompt();
                                break;                            case 5:
                                System.exit(0);
                        }
                    }
                    while (true);

//                    break;

                case 2:
                    System.exit(0);
                default:
                    System.out.println("invalid input!!! Try Again");

            }

        }
        while (response != 1 && response != 2);
    }
}
