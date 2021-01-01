package C6;
/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows:
 *
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 *
 * Your program acts as a single player. Here are some sample runs.
 *
 *      You rolled 5 + 6 = 11
 *      You win
 *
 *      You rolled 1 + 2 = 3
 *      You lose
 *
 *      You rolled 4 + 4 = 8
 *      point is 8
 *      You rolled 6 + 2 = 8
 *      You win
 *
 *      You rolled 3 + 2 = 5
 *      point is 5
 *      You rolled 2 + 5 = 7
 *      You lose
 */
public class hw6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roll(); 

	}
	
	
	public static int getDice() {
		return (int) (6*Math.random()+1);
	}
	
	
	public static void roll() {
		int n1 = getDice();
		int n2 = getDice();	
		int n3 = n1 +n2;
		System.out.println("You rolled "+n1+ "+" + n2 + "=" + n3 );
		
		if (n3 == 2 ||n3 == 3 ||n3 == 12 ) {
			System.out.println("You win");
			return;
		}
			
		
		if (n3 == 7 || n3 == 11 ) {
			System.out.println("You lose");
			return;
		}
		
		else
			System.out.println("point is "+ n3 );
			roll();
		
	}

}
