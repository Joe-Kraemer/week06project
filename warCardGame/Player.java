package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();

	public Player(int score, String name){
		this.score = score;
		this.name = name;
		this.hand = hand;
	}
	public Card flip() {
	Card card3 = hand.remove(0); 
		return card3;
		}
	
	public void incrementScore(){
			score += 1; 
		}
	
	public void describe() {
		System.out.println("Player name: " + name + " score: " + score);
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public void draw(Deck deck) {
		Card newCard = deck.draw();
//		System.out.println(newCard.value);
//		System.out.println(newCard.name + newCard.suit);
		hand.add(newCard);
	}
}

//c.      Player
//
//i.     variables
//
//                1.     hand (List of Card)
//
//                 2.     score (set to 0 in the constructor)
//
//                 3.     name
//
//ii.    Methods
//
//                1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
//
//                2.     flip (removes and returns the top card of the Hand)
//
//                3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//
//               4.     incrementScore (adds 1 to the Player’s score field)