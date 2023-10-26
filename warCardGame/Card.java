package warCardGame;

public class Card {
	//variables
	int value;
	String name;
	String suit;

	Card (int value, String name, String suit){
		this.value = value;
		this.name = name;
		this.suit = suit;
	}
	

	//getters & setters
    public String getName() { 
    	return name; 
    	}
    public void setName(String name) {
    	this.name = name;
    }
    public int getValue() {
    	return value; 
    	}
	
    public void setValue(int value){
       
    	this.value = value;
    }
 
    
    //methods
	public void describe() {
		System.out.println("card: " + name + " of" + suit);
	}
	
}
//i.     variables
//
//        1.     value (contains a value from 2-14 representing cards 2-Ace)
//
//        2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//
//       Methods
//
//        1.     Getters and Setters
//
//        2.     describe (prints out information about a card)


