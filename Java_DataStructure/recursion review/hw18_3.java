package Hw18_2;


/*Cist 004B1, Java
2/16/2020
Mack

Recursion Review: binomial coefficient in Recursive Iterative method

Output:
Recursively, c(5,1) = 5
Iteratively, c(5,2) = 10
Iteratively, c(6,2) = 15
*/






public class hw18_3 {
	//Recursive method
	public static int Recursive(int n) {
		n=n==1? 1: n*Recursive(n-1);
		return n;
	}
	
	
	
	public static int cr(int n, int k) {
		return Recursive(n)/(Recursive(k)*Recursive(n-k));
	}

	
	//Iterative method
	public static int Iterative(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}

	public static int ci(int n, int k) {
		return Iterative(n)/(Iterative(k)*Iterative(n-k));
	}

	
	
	
	
	public static void main(String args[]) {
		System.out.println("Recursively, c(5,1) = " + cr(5,1));
		System.out.println("Iteratively, c(5,2) = " + ci(5,2));
		System.out.println("Iteratively, c(6,2) = " + ci(6,2));
	}
}
	
	
	
	
	
	
	
	

