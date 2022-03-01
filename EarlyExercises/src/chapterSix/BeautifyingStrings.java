package chapterSix;

public class BeautifyingStrings {

    public static void capitalizeFirstLetter(String word) {
        if(word.startsWith(word.toLowerCase())){
            word.toUpperCase();
        }
        System.out.println(word);
        }

    public static void main(String[] args) {
        capitalizeFirstLetter("daniel");
    }
    }





