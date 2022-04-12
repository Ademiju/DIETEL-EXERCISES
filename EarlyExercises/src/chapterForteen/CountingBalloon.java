package chapterForteen;

import java.util.Arrays;
import java.util.Objects;

public class CountingBalloon {
    public static void main(String[] args) {
        System.out.println("Enter String characters of between 2 an 200,000 character");
        countNumberOfBalloon("sddfgtmortyoirrtvbnmmokkoiiyvsssrettroiiuacbvcvbnnvnbnkiuuughfdgfdsaavnmo");
    }
    public static void countNumberOfBalloon(String wordBank){
        String [] wordArray = wordBank.split("");
        int bCount = 0;
        int aCount = 0;
        int lCount = 0;
        int oCount = 0;
        int nCount = 0;
        for (String letters : wordArray){
            if(Objects.equals(letters, "b")){
                bCount++;
            }
            if(Objects.equals(letters, "a")){
                aCount++;
            }
            if(Objects.equals(letters, "l")) {
                lCount++;
            }
            if(Objects.equals(letters, "o")) {
                oCount++;
            }
            if (Objects.equals(letters, "n")) {
                nCount++;
            }

            }

        int numberOfO = oCount/2;
        int numberOfL = lCount/2;
        int minimum = Math.min(bCount,Math.min(aCount,Math.min(nCount,Math.min(numberOfL,numberOfO))));

        System.out.println("You can form balloon "+minimum+" times from your string characters");


        }

    }
