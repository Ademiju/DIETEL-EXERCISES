package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossingGame {
    private static int headCount = 0;
    private static  int tailCount = 0;

    public enum CoinTossOutcome {HEAD,TAIL};
    private static final SecureRandom coinToss = new SecureRandom();


    public static void menuDisplay(){
        String prompt = """
                         Choose an option from the Menu
                         1. Toss Coin
                         2. Flip
                         3. Exit""";
        System.out.println(prompt);

    }
    public static void playTossCoin(){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput){
            case 1:  tossACoinToYourWitcher();
            break;
            case 2: flip();
            break;
            case 3: coinTossResult();
            break;
            default:  System.out.println("Invalid input...Try Again");
                menuDisplay();
                playTossCoin();
        }
    }


    public static void tossACoinToYourWitcher(){

        int tossOutcome = coinToss.nextInt(2);

            if(tossOutcome == 0){
                headCount++;
        }else {
                tailCount++;
            }
            menuDisplay();
            playTossCoin();


    }
    public static void flip(){
        int tossOutcome = coinToss.nextInt(2);
            if(tossOutcome == 0){
                System.out.println("You flipped "+CoinTossOutcome.HEAD);
            }else {
                System.out.println("You flipped "+CoinTossOutcome.TAIL);
            }
            menuDisplay();
            playTossCoin();

    }
    private static void coinTossResult(){
        System.out.printf("Your Coin Toss Result \n"+CoinTossOutcome.TAIL+" = "+tailCount+"\n"+CoinTossOutcome.HEAD+" = "+headCount);
    }

    public static void main(String[] args) {
        menuDisplay();
        playTossCoin();
    }

}
