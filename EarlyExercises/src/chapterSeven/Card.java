package chapterSeven;

public class Card {
    private String suit;
    private String face;

    public Card (String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }
    public String toString(){
        return face+ " of "+suit;
    }
}
