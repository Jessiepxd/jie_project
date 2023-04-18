package jieproject;

public class Card {

    private final Suit suit;
    private final Rank rank;

    public enum Suit {
        HEART_RED(1), CLUB_BLACK(2), SPADE_BLACK(2), DIAMOND_RED(1);
        private final int suitValue;

        Suit(int suitValue) {
            this.suitValue = suitValue;
        }
    }

    public enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4),
        FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
        NINE(9), TEN(10), JACK(11), QUEEN(12),
        KING(13);
        private final int rankValue;

        Rank(int rankValue) {
            this.rankValue = rankValue;
        }
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getRankValue() {
        return rank.rankValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getSuitValue() {
        return suit.suitValue;
    }
}
