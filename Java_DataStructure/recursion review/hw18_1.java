package Hw18_2;

/*Cist 004B1, Java
2/15/2020
Mack

output
The factoral of 3 is 6
The factoral of 5 is 120
The factoral of 9 is 362880
*/


interface NumericFunc {
	int func(int n);
}

class hw18_1 {
	public static void main(String args[]) {

		// This block lambda computes the factorial of an int value.

		NumericFunc factorial = (n) -> {
			 
			int result = 1;
			for (int i = 1; i <= n; i++)
				result *= i;
			return result;
		};

		System.out.println("The factoral of 3 is " + factorial.func(3));
		System.out.println("The factoral of 5 is " + factorial.func(5));
		System.out.println("The factoral of 9 is " + factorial.func(9));
		 
	}
}