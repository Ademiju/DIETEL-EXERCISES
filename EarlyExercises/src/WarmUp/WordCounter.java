package WarmUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static int countTheWordsInASentence(HashMap<Integer,String> sentences){
        List<String> words = new ArrayList<>();
        String [] arrayOfWords;
        for (Map.Entry<Integer, String> sentence: sentences.entrySet()) {
            arrayOfWords = sentence.getValue().split(" ");
            for (String word : arrayOfWords) {
                words.add(word);
            }
        }
        return words.size();
    }

    public static void main(String[] args) {
        HashMap<Integer,String> sentences = new HashMap<>();
        sentences.put(1,"It's a beautiful day");
        sentences.put(2,"I am a gem");
        sentences.put(3, "courage must come from the soul within");
        System.out.println("number of words in the HashMap = "+countTheWordsInASentence(sentences));
    }
}
