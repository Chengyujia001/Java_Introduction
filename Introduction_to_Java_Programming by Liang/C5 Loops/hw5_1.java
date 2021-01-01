package C5;
/**
 * (Find the factors of an integer) Write a program that reads an integer and displays
 * all its smallest factors in increasing order. For example, if the input integer is
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
import java.util.Scanner;

public class hw5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		int i = 2; 

	
		while (n / i != 1) {
			
			if (n % i  == 0) {
				System.out.print(i + ", ");
				n = n/i; 
			}
			else
				i++; 
		}
		System.out.println(n + ".");
	}
}