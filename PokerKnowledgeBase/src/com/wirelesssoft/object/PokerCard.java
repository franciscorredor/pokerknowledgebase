package com.wirelesssoft.object;

public class PokerCard {
    private short rank, suit;

    private static String[] suitType = { "C", "P", "D", "T" };
    private static String[] rankValue  = { "A", "2", "3", "4", "5", "6", "7", 
                                       "8", "9", "10", "J", "Q", "K" };

    public static String rankAsString( int __rank ) {
        return rankValue[__rank];
    }

    public PokerCard(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

    public @Override String toString()
    {
          //return rankValue[rank] + " of " + suitType[suit];
    	return rankValue[rank] + "" + suitType[suit];
    }

    public short getRank() {
         return rank;
    }

    public short getSuit() {
        return suit;
    }
}
