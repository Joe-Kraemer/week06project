package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	String[] cardName = { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen",
			"king"};
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	String[] suits = { "hearts", "diamonds", "clubs", "spades" };

	public Deck() {

		for (String suit : suits) {
			int value = 2;
			if (value > 0 && value < 14) {
				for (int i = 0; i < cardName.length; i++) {
					cards.add(new Card(numbers[i], suit, cardName[i]));
					System.out.println(numbers[i]);
					System.out.println(suit);
					System.out.println(cardName[i]);
					value++;
				}
			
			}

		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println("shuffled cards");
	}

	public Card draw() {
		Card card4 = cards.remove(0);
		return card4;
	}

//	public void describe() {
//	for(Card card : cards) {
//		card.describe();
//	}
//	}
}

//b.     Deck
//
//i.     variables
//
//                1.     cards (List of Card)
//
//      ii.    Methods
//
//                1.     shuffle (randomizes the order of the cards)
//
//                2.     draw (removes and returns the top card of the Cards field)
//
//                3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
//
//
