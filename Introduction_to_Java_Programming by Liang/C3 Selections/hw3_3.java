package c3;
/**
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * 
 * Output: The card you picked is 10 of Diamonds
 */
public class hw3_3 {

	public static void main(String[] args) {

		int a = (int)(52*Math.random());
		
		int b = a%13;
		int c = (int)(a/13);
		String suit = "default";
		String rank = "default";

		switch (b) {
		
		case 0:  rank = "Ace"; break; 
		case 1:  rank = "2"; break; 
		case 2:  rank = "3"; break; 
		case 3:  rank = "4"; break; 
		case 4:  rank = "5"; break;
		case 5:  rank = "6"; break;
		case 6:  rank = "7"; break;
		case 7:  rank = "8"; break;
		case 8:  rank = "9"; break;
		case 9:  rank = "10"; break;
		case 10:  rank = "Jack"; break;
		case 11:  rank = "Queen"; break;
		case 12:  rank = "King"; break;
		}
	
		
		switch (c) {
		
		case 0:  suit = "club"; break; 
		case 1:  suit = "Diamonds"; break; 
		case 2:  suit = "Hearts"; break; 
		case 3:  suit = "Spades"; break; 	
		}
		


		System.out.println("The card you picked is "+ rank + " of " + suit);	
		
	}

}
