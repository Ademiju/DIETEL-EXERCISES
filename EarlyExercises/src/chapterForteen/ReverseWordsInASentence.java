package chapterForteen;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        System.out.println("Enter a Sentence ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        reverseWords(userInput);
    }
    public static void reverseWords(String userSentence){
        String [] words = userSentence.split(" ");
        StringBuilder reversedWord = new StringBuilder(70);
        for (String word : words){
            reversedWord.append(word).reverse().append(" ");
        }
        System.out.println(reversedWord);



    }
}
