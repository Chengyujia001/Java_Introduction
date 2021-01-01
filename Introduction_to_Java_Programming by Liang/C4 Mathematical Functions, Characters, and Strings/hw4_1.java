package c4;
/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 */
import java.util.Scanner;

public class hw4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a decimal value (0 to 15): ");
		
		int n = input.nextInt();
		

		if (n>=0 && n<=15) {
			String m = Integer.toHexString(n);
			System.out.println("The hex value is : "+ m);
			
		}
		
		else { 
			System.out.println(n + " is  an invalid input");
		}
		

		
		
		
	}

}
