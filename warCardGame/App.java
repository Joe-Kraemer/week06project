package warCardGame;

public class App {
	static Player playerOne = new Player(0, "Joe");
	static  Player playerTwo = new Player(0, "Sean");
	  
	public static void main(String[] args) {
		 
		Deck deck1 = new Deck();
		  deck1.shuffle(); 

		for(int i = 0; i < 52; i++) {
			  	if(i % 2 == 0) {
			  		playerOne.draw(deck1);
			  	}else {
			  		playerTwo.draw(deck1);
			  	}
		  }
		  
		  System.out.println("Cards have been dealt");
		  for(int i = 0; i < 26; i++) {
			  Card card1 = playerOne.flip();
			  Card card2 = playerTwo.flip();
//			  System.out.println(card1.value);
//			  System.out.println(card2.value);
			  if(card1.value > card2.value) {
				  playerOne.incrementScore();
				  System.out.println(playerOne.name + " scored a point!");
			  }else if (card2.value > card1.value) {
				  playerTwo.incrementScore();
				  System.out.println(playerTwo.name + " scored a point!");
			  }else {
				  System.out.println("it was a tie no points awarded");
			  }
			  System.out.println("current score is " +  playerOne.name + " " + playerOne.score + " " + playerTwo.name + " " + playerTwo.score );
		  } 
		System.out.println();
		  System.out.println("Final score is " +  playerOne.name + " " + playerOne.score + " " + playerTwo.name + " " + playerTwo.score );
		  	if(playerOne.score > playerTwo.score) {
				  System.out.println(playerOne.name + " wins! With a score of: " + playerOne.score);
			  }else if(playerTwo.score > playerOne.score) {
				  System.out.println(playerTwo.name + " wins! With a score of: " + playerTwo.score);
			  }else {
				  System.out.println("It was a draw! both players have " + playerOne.score + " points");
			  }
		}
}





//a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
//
//b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//
//c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
//
//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
//Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
//d.      After the loop, compare the final score from each player.
//
//e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
//
// 
//
//3.  Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
//
//a.  Using the Card describe() method when each card is flipped illustrates the game play.
//
//b.  Printing the winner of each turn adds interest -- or a message indicating a tie.
//
//c.  Printing the updated score after each turn shows game progression.
//
//d.  At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.
//
 