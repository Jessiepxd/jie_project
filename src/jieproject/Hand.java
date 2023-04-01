package jieproject;

import java.util.ArrayList;
import java.util.Random;

public class Hand {
    public static ArrayList<Card> generateHand(int handSize){
        ArrayList<Card> hand = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < handSize; i++) {
            Card.Rank rank = Card.Rank.values()[random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card card = new Card(rank,suit);
            hand.add(i,card);
        }

        return hand;
    }
}
