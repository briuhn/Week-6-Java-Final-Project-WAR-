package week06project;

public class App {

	public static void main(String[] args) {
		// Create a new deck and shuffle it
		Deck deck = new Deck();
		deck.shuffle();

    //create two players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");


    //draw 26 cards for each player from the deck
		for (int i = 0; i <= 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
    



    //playing 26 rounds of the game
		for(int i = 0; i <= 26; i++) {
        //flip a card for each player
  			Card card1 = player1.flip();
  			Card card2 = player2.flip();

        //print current scores
        System.out.println("Score so far: ");
        System.out.println(player1.name + " : " + player1.getScore());
        System.out.println(player2.name + " : " + player2.getScore());
        System.out.println("-------------------");

        // print cards for each round
        System.out.println("New Round: ");
        System.out.println("P1 got: ");
        card1.describe();
        System.out.println("P2 got: ");
        card2.describe();
        System.out.println("===================");

  			//compare values and add scores
  			if (card1 != null && card2 != null) {
  				if(card1.getValue()> card2.getValue()) {
  					player1.addScore();
  				}else if (card2.getValue() > card1.getValue()) {
  					player2.addScore();
  				}
  			}
		}
		

		//print final scores
		System.out.println("Final Score: ");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());

	}

}
