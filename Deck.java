package week06project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	  // List to store the cards in the deck
		List<Card> cards = new ArrayList<Card>();

	  //contructor to start the deck with all cards
		Deck(){
			String[] suits = {"Clubs" , "Diamonds" , "Hearts" , "Spades"};
			String[] numbers = {"Two", "Three", "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten", "Jack" , "Queen" , "King" , "Ace" };
			
			for (String suit : suits) {
				int count = 2; //deck starts at 2 
				for (String number : numbers) {
					Card card = new Card (number, suit, count); //creating card with given number, suit, and value
					this.cards.add(card); // add the card to the deck
					count++;
				}
			}
			
			}
		
		public void shuffle() { //shuffles cards
			Collections.shuffle(cards);
		}
		
		//draws card from the top and returns it
		public Card draw() {
			if(cards.isEmpty()) {
				return null;
			}
			return cards.remove(0);
		}
		
	}
