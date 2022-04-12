package chapterForteen;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to convert to pigLatin");
        String userInput = input.nextLine();
//        printPigLatinWord(userInput);
        System.out.println(printPigLatinSentence(userInput));

        }

    public static String printPigLatinWord(String englishWord) {
        StringBuilder pigLatinWord = new StringBuilder(englishWord);
        char firstLetter = pigLatinWord.charAt(0);
        pigLatinWord.insert(pigLatinWord.length(), firstLetter);
        pigLatinWord.append("ay");
       return pigLatinWord.substring(1);
    }

    public static String printPigLatinSentence(String sentence) {
        String [] userInput = sentence.split(" ");
        String pigLatinSentence ="";
        for( String word: userInput ){
            pigLatinSentence += printPigLatinWord(word)+" ";
        }
       return pigLatinSentence;
    }
}
