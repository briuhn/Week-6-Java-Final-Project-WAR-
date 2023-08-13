package week06project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	  //list to store each players hand
		List<Card> hand = new ArrayList<>();
		int score = 0;
		String name;

	  //constructer to create player with the name
		public Player(String name) {
			this.name = name;
		}
		
		//removes and returns the first card from the hand
		public Card flip() {
			if(!hand.isEmpty()) {
				return hand.remove(0);
			}
			return null;
		}

	  //draws a card form the deck and adds it to the players hand
		public void draw(Deck deck) {
			Card drawnCard = deck.draw();
			if (drawnCard != null) {
				hand.add(drawnCard);
			}
		}

	  //adds the score by 1
		public void addScore() {
			score++;
		}

	  //returns the score
		public int getScore() {
			return score;
		}
		
	}
