package C8;
/**
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 * face up and some face down. You can represent the state of the coins using a
 * 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
 *
 *      0 0 0   1 0 1   1 1 0   1 0 1   1 0 0
 *      0 1 0   0 0 1   1 0 0   1 1 0   1 1 1
 *      0 0 0   1 0 0   0 0 1   1 0 0   1 1 0
 *
 * Each state can also be represented using a binary number. For example, the preceding
 * matrices correspond to the numbers
 *
 *      000010000 101001100 110100001 101110100 100111110
 *
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 * . . . , and 511 to represent all states of the matrix. Write a program that prompts
 * the user to enter a number between 0 and 511 and displays the corresponding
 * matrix with the characters H and T. Here is a sample run:
 *
 *      Enter a number between 0 and 511: 7 (enter)
 *      H H H
 *      H H H
 *      T T T
 */
import java.util.Scanner;

public class hw8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("eneter a number between 0 and 511: ");
		short num = input.nextShort();
		char[] a = toBinaryChars(num);
		
		for(int i=0 ; i<9 ; i++) {
			if (i%3 != 0) {
				System.out.print(a[i] + " ");
			}
			else
				System.out.print("\n" + a[i] + " ");
		}
	
	}

	public static char[] toBinaryChars(short j) {
		char[] result =  new char[9];
		
		int i =result.length-1;
		
		while (j!= 0) {
			if (j%2 == 0) {
				result[i--] = 'H';
			}
			else {
				result[i--] = 'T';
			}
			
			j /= 2;
		}
		
	
		for (int k = i; k >= 0 ; k--) {
			result[k] = 'H';
		}
		
		return result;
	
	}
	
	
	
}
