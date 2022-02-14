/**
 * models a playing card
 */
public class Card {

    public final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public final String DEFAULT_SUIT = "Spades";


    private int rank; // self.__rank
    private String suit;  // self.__suit

    /**
     * constructor with rank and suit
     * @param newRank  integer from 2-14 (14 = Ace)
     * @param newSuit  "Hearts", "Clubs", "Spades", "Diamonds"
     */
    public Card(int newRank, String newSuit) {
        rank = newRank;
        suit = newSuit;
    }

    public Card() {
        rank = DEFAULT_RANK;
        suit = DEFAULT_SUIT;
    }

    /**
     * constructor with int rank and suit
     * @param newRank 2-14
     * @param newSuit 0-3
     */
    public Card(int newRank, String newSuit) {
        rank = newRank;
        suit = SUITS[newSuit];

    }

    /**
     * getter for rank
     * @return in between 2-14
     */
    public int getRank(){
        return rank;
    }

    /**
     * getter for the suit
     * @return fully written string like "Hearts", "Clubs", "Spades", "Diamonds"
     */
    public String getSuit(){
        return suit;
    }

    /**
     * returns the card a printable string like "Jack fo Clubs"
     * @return printable string
     */
    public String toString() {
        return convertFace(getRank()) + " of " + getSuit();
    }

    /**
     * take the numeric rank and turn it into a printable string where 11-14 are turned into face card
     */
    private String convertFace (int rank) {
        if (rank == 11){
            return "Jack";
        }
        else if (rank == 12){
            return "Queen";
        }
        else if (rank == 13){
            return "King";
        }
        else if (rank == 14){
            return "Ace"
        }
        else { // whole -- just change type
            return "" + rank
        }

    }

}

