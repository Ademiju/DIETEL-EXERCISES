package chapterForteen;

import java.util.Scanner;

public class Turing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol = input.nextLine();

        System.out.println(isValid(symbol));

    }
    public static boolean isValid(String symbol){
        boolean result = false;
        for(int i = 0; i < symbol.length()-1;i++) {
            if (symbol.charAt(i) =='(' && symbol.charAt(i + 1)==')'){
                result = true;
            }
            if (symbol.charAt(i) =='{' && symbol.charAt(i + 1)=='}'){
                result = true;
            }
            if (symbol.charAt(i) =='[' && symbol.charAt(i + 1)==']'){
                result = true;
            }
        }
        return result;
    }

}
