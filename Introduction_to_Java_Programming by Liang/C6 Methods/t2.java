package C6;

import java.util.Scanner;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    
		System.out.println("input number: ");
		
		
	    int n = (int)((int)'a' + Math.random() * ((int)'z' - (int)'a' + 1));
		char b = (char)('a'+Math.random()*(26));
		
		
		System.out.println(n + " and " + b);
		System.out.println("'z'- 'a' is : " + ('z'+0));
	}

}
