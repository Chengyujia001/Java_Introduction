package Hw18_2;


/*Cist 004B1, Java
2/15/2020
Mack

Output:
3 is a factor of 12
3 is not a factor of 16
3 and 12 has a Common Factor.
3 and 16 does not have a Common Factor.
*/







//Use a method reference to an instance method. 

//A functional interface for numeric predicates that operate 
//on integer values. 
interface IntPredicate {
	boolean test(int n);
}

//This class stores an int value and defines the instance
//method isFactor(), which returns true if its argument
//is a factor of the stored value.
class MyIntNum {
	private int v;

	MyIntNum(int x) {
		v = x;
	}

	int getNum() {
		return v;
	}

	// Return true if n is a factor of v.
	boolean isFactor(int n) {
		return (v % n) == 0;
	}

	boolean hasCommonFactor(int n) {
		int min;
		if (n>v) 
			min = v;
		else 
			min = n;
		
		
		for (int i = 2; i<=min; i++) {
			if (v%i == 0 && n%i == 0)
				return true;
		}
		return false;
		
		
	}
}


public class hw18_2 {


	public static void main(String args[]) {
		boolean result;

		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);

		// Here, a method reference to isFactor on myNum is created.
		IntPredicate ip = myNum::isFactor;

		// Now, it is used to call isFactor() via test().
		result = ip.test(3);
		if (result)
			System.out.println("3 is a factor of " + myNum.getNum());

		// This time, a method reference to isFactor on myNum2 is created.
		// and used to call isFactor() via test().
		ip = myNum2::isFactor;
		result = ip.test(3);
		if (!result)
			System.out.println("3 is not a factor of " + myNum2.getNum());
		
		// your work
		
		ip = myNum::hasCommonFactor;
		result = ip.test(3);
		if (result)
			System.out.println("3 and 12 has a Common Factor.");

		ip = myNum2::hasCommonFactor;
		result = ip.test(3);
		if (!result)
			System.out.println("3 and 16 does not have a Common Factor.");
		
		
		
		
		
		
	}
}

// 3 is a factor of 12
// 3 is not a factor of 16
		