package com.wirelesssoft.evaluate;

import java.util.ArrayList;
import java.util.Arrays;

import com.wirelesssoft.object.PokerCard;

public class HandEvaluator implements Comparable<HandEvaluator>{
	
	private ArrayList<PokerCard> cards;
	private int value[];

	/**
	 * Init Class, constructor de la clase
	 * @param cards
	 */
	public HandEvaluator(ArrayList<PokerCard> cards) {
		this.cards = cards;
		value = new int[8];
		calculateValues();
	}
	
	/**
	 * Metodo encargado de calcular 
	 * y evaluar la Mano
	 * 
	 */
	private void calculateValues() {
		// To count how many of each card we have, in case of pairs/triple/quad
		int ranks[] = new int[14];
		Arrays.fill(ranks, 0);
		for (int i = 0; i < 7; i++) {
			ranks[cards.get(i).getRank()]++;
		}

		// Check if any pairs/etc or full house and to see what rank it is
		int sameCards = 1, sameCards2 = 1;
		int largeGroupRank = 0, smallGroupRank = 0;
		for (int x = 13; x >= 0; x--) {
			if (ranks[x] > sameCards) {
				if (sameCards != 1) {
					// This would mean we already found a pair/etc, so now we
					// have two pairs or full house
					sameCards2 = sameCards;
					smallGroupRank = largeGroupRank;
				}
				sameCards = ranks[x];
				largeGroupRank = x;
			} else if (ranks[x] > sameCards2) {
				sameCards2 = ranks[x];
				smallGroupRank = x;
			}
		}

		// Check for flush
		boolean flush = true;
		for (int i = 0; i < cards.size() - 1; i++) {
			flush = flush /* Becomes false when suits don't match = no flush */
					&& (cards.get(i).getSuit() == cards.get(i + 1).getSuit());
		}

		// Check for straight
		int topStraightValue = 0;
		boolean straight = false;
		for (int i = 1; i < 10; i++) {// lowest value in straight is a 9
			if (ranks[i] == 1 && ranks[i + 1] == 1 && ranks[i + 2] == 1
					&& ranks[i + 3] == 1 && ranks[i + 4] == 1) {
				straight = true;
				topStraightValue = i + 4; // 4 above bottom value
				//break;
			}
		}
		// Special case for ace high
		if (ranks[10] == 1 && ranks[11] == 1 && ranks[12] == 1
				&& ranks[13] == 1 && ranks[1] == 1) {
			straight = true;
			topStraightValue = 14;
		}

		// Check the rankings of cards outside of pairs/etc, to break ties
		int[] orderedRanks = new int[7];
		int index = 0;
		if (ranks[1] == 1) {// Ace is the highest value, so check for it first
			orderedRanks[index] = 14;
			index++; //
		}
		for (int x = 13; x >= 2; x--) {
			if (ranks[x] == 1) { // Multiple cards is already handled
				orderedRanks[index] = x;
				index++;
			}
		}

		// Finally the actual evaluation
		if (sameCards == 1) { // Nothing, just a high card
			value[0] = 1; // Lowest type of hand
			value[1] = orderedRanks[0];
			value[2] = orderedRanks[1];
			value[3] = orderedRanks[2];
			value[4] = orderedRanks[3];
			value[5] = orderedRanks[4];
			value[6] = orderedRanks[5];
			value[7] = orderedRanks[6];
		}

		if (sameCards == 2 && sameCards2 == 1) {// One pair
			value[0] = 2; // pair ranked higher than high card
			value[1] = largeGroupRank; // rank of pair
			value[2] = orderedRanks[0]; // next highest cards.
			value[3] = orderedRanks[1];
			value[4] = orderedRanks[2];
			value[5] = orderedRanks[3];
			value[6] = orderedRanks[4];
		}

		if (sameCards == 2 && sameCards2 == 2) { // Two pairs
			value[0] = 3;
			// rank of greater pair
			value[1] = largeGroupRank > smallGroupRank ? largeGroupRank
					: smallGroupRank;
			// rank of smaller pair
			value[2] = largeGroupRank < smallGroupRank ? largeGroupRank
					: smallGroupRank;
			value[3] = orderedRanks[0];
		}

		if (sameCards == 3 && sameCards2 != 2) { // Three of a kind
			value[0] = 4;
			value[1] = largeGroupRank;
			value[2] = orderedRanks[0];
			value[3] = orderedRanks[1];
		}

		if (straight) {
			value[0] = 5;
			value[1] = topStraightValue;
		}

		if (flush) {
			value[0] = 6;
			value[1] = orderedRanks[0]; // tie determined by ranks of cards
			value[2] = orderedRanks[1];
			value[3] = orderedRanks[2];
			value[4] = orderedRanks[3];
			value[5] = orderedRanks[4];
			value[6] = orderedRanks[5];
			value[7] = orderedRanks[6];
		}

		if (sameCards == 3 && sameCards2 == 2) { // Full house
			value[0] = 7;
			value[1] = largeGroupRank;
			value[2] = smallGroupRank;
		}

		if (sameCards == 4) { // Four of a kind
			value[0] = 8;
			value[1] = largeGroupRank;
			value[2] = orderedRanks[0];
		}

		if (straight && flush) { // Straight flush
			value[0] = 9;
			value[1] = topStraightValue;
		}
	}
	
	/**
	 * Metodo encargado de mostrar el resultado!
	 */
	public void display() {
		String s;
		switch (value[0]) {
		case 1:
			s = "high card";
			break;
		case 2:
			s = "pair of " + PokerCard.rankAsString(value[1]) + "\'s";
			break;
		case 3:
			s = "two pair " + PokerCard.rankAsString(value[1]) + " "
					+ PokerCard.rankAsString(value[2]);
			break;
		case 4:
			s = "three of a kind " + PokerCard.rankAsString(value[1]) + "\'s";
			break;
		case 5:
			s = PokerCard.rankAsString(value[1]) + " high straight";
			break;
		case 6:
			s = "flush";
			break;
		case 7:
			s = "full house " + PokerCard.rankAsString(value[1]) + " over "
					+ PokerCard.rankAsString(value[2]);
			break;
		case 8:
			s = "four of a kind " + PokerCard.rankAsString(value[1]);
			break;
		case 9:
			s = "straight flush " + PokerCard.rankAsString(value[1]) + " high";
			break;
		default:
			s = "error in Hand.display: value[0] contains invalid value";
		}
		s = " " + s;
		System.out.println(s);
	}
	
	

	@Override
	public int compareTo(HandEvaluator that) {

		for (int i = 0; i < 6; i++) // cycle through values
		{
			if (this.value[i] > that.value[i])
				return 1;
			else if (this.value[i] < that.value[i])
				return -1;
		}
		return 0; // if hands are equal

	}
	
	public ArrayList<PokerCard> getCards() {
		return cards;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<7; i++){
            sb.append(cards.get(i));
            if (i < 6) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
	public int getPrimaryValue() {
		return value[0];
	}

}
