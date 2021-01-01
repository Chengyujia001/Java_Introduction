package C6;
/**
 * (Palindrome integer) Write the methods with the following headers
 *
 *      // Return the reversal of an integer, i.e., reverse(456) returns 654
 *      public static int reverse(int number)
 *
 *      // Return true if number is a palindrome
 *      public static boolean isPalindrome(int number)
 *
 * Use the reverse method to implement isPalindrome. A number is a palindrome
 * if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;

public class hw6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		    
		System.out.print("input number: ");
		int n = input.nextInt();
		    
		System.out.println("reserved number is: " + reverse(n) );
		if (ispalindrome(n)) 
			System.out.print("is palindrome");
		else
			System.out.print("not palindrome ");

		}
		  
		
	
		
		
	public static int reverse(int number) {
	  String a = number+ "";
	  String b = "";
			  
	  for (int i = a.length()-1; i >= 0; i--) {
		  b += a.charAt(i);		  
	  	}
		  
		  return Integer.parseInt(b);
	  }
	    
    
	
	public static boolean ispalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}
	


}
