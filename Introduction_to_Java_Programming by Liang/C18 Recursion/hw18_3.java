package C18;

// Teddy bears; see notes
//Starting number:500
//n= 500, return 250.	Now n=250
//n= 250, return 42.	Now n=208
//n= 208, return 104.	Now n=104
//n= 104, return 52.	Now n=52
//n= 52, return 10.	Now n=42

import java.util.*;

public class hw18_3 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for (int i = 50; i <= 500; i++) {
			System.out.println("\nStarting number:" + i);
			if (bears(stack, i))
				while (!stack.isEmpty())
					System.out.println(stack.pop());
			else
				System.out.println("No solution");
		}
	}

	static boolean bears(Stack<String> stack, int n) {
		int product;
		if (n == 42) {
			return true;
		} else if (n < 42) {
			return false;
		} else if ((n % 2 == 0) && bears(stack, n / 2)) {
			stack.push("n= " + n + ", return " + n/2 + ".	Now n=" + (n/2) );
			return true;
		} else if ((n % 5 == 0) && bears(stack, n - 42)) {
			stack.push("n= " + n + ", return 42" + ".	Now n=" + (n - 42) );
			return true;
		} else {
			product = ((n % 100) / 10) * (n % 10);
			if (product != 0 && (n % 3 == 0 || n%4 == 0 ) && bears(stack, n - product)) {
				stack.push("n= " + n + ", return " + product + ".	Now n=" + (n - product) );
				return true;
		}
		}
			return false;
	
	}
	
}
