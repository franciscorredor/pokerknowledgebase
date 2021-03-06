package com.wirelesssoft.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author HP
 *
 */
public class Deck {

	private ArrayList<PokerCard> cards;

	/**
	* 
	*/
	public Deck() {
		cards = new ArrayList<PokerCard>();
		int index_1, index_2;
		Random generator = new Random();
		PokerCard temp;

		for (short a = 0; a <= 3; a++) {
			for (short b = 0; b <= 12; b++) {
				cards.add(new PokerCard(a, b));
			}
		}
		Collections.shuffle(cards);
		
		/*
		 * Iprime las cartas/ print the cards from deck
		 */
//		int incremental = 0;
//		for (PokerCard pokerCard : cards) {
//			System.out.println( (++incremental) +" > " + pokerCard.toString());
//		}

		int size = cards.size() - 1;

		for (short i = 0; i < 100; i++) {
			index_1 = generator.nextInt(size);
			index_2 = generator.nextInt(size);

			temp = (PokerCard) cards.get(index_2);
			cards.set(index_2, cards.get(index_1));
			cards.set(index_1, temp);
		}
	}

	public PokerCard drawFromDeck() {
		return cards.remove(cards.size() - 1);
	}

	public int getTotalCards() {
		return cards.size();
		// we could use this method when making
		// a complete poker game to see if we needed a new deck
	}

}
