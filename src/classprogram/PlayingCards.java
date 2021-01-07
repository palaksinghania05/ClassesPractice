package classprogram;
/*
Write a class whose instances(objects) represent a single playing card from a deck of cards
(52 cards).
Playing cards have two distinguishing properties :
1. Rank (1 to 13)
2. Suit (Spade,Heart,Club,Diamond)
 */
public class PlayingCards {
    //instance variables
    private int rank;
    private String suit;
    //parameterized constructor
    //method 1 - here name of local variables and instance variables are different
   /*
    public PlayingCards(int rank1, String suit1) {
        rank = rank1;
        suit = suit1;
    }
*/
    //method 2 - here name of local and instance variables are same
    public PlayingCards(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //no need of no argument constructor and setter method

    //getter for rank
    public int getRank() {
        return rank;
    }
    //getter for suit
    public String getSuit() {
        return suit;
    }
}
