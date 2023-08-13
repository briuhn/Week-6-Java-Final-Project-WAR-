package week06project;

public class Card { //card attributes "ace"
	String name;
	String suit;
	int value;
	
	Card(String name, String suit, int value){//contructor to create the card with attributes
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

  //getter and setters for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

  //getter and setters for suits
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}

  // getter and setters for values
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

  // describes the cards attributes
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	}
	
	
}
