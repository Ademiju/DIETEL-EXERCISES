package chapterSeven;

public class DeckOfCard {
    private static final int NUMBER_OF_CARDS = 52;
    Card [] pokerCard = new Card[NUMBER_OF_CARDS];

    public DeckOfCard(){
        String [] faces ={"Ace","Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String [] suits = {"Heart","Spade","Club","Diamond"};

        int counter = 0;
            for(int count = 0; count < pokerCard.length; count++ ) {
                    Card deck = new Card(faces[count % 13], suits[count / 13]);
                System.out.printf("%-18s",deck);
                counter++;
                if(counter % 4 == 0){
                    System.out.println();
                }
                }
//        int count = 0;
//        for(int suit = 0; suit < 4; suit++ ) {
//            for (int face = 0; face < 13; face++) {
//                Card deck = new Card(faces[face], suits[suit]);
//                System.out.printf("%-18s",deck);
//                count++;
//                if(count % 4 == 0){
//                    System.out.println();
//                }
//            }
//            }

    }



    }

