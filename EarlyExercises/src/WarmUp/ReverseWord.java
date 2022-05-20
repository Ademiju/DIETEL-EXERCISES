package WarmUp;

import java.util.Arrays;

public class ReverseWord {
    public static void reverseWordCharacters(String word){
        String [] wordArray= new String [word.length()];
            wordArray = word.split("");
        for (int i = word.length()-1; i > -1 ; i--) {
            System.out.print(wordArray[i]);
        }
    }
    public static void main(String[] args) {
        reverseWordCharacters("mall");
    }
}
