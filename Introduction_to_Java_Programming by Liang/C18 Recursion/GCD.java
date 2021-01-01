package C18;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(gcd(5,1325));
	}
	
	
	public static int gcd(int m , int n ) {
		if (m%n == 0)
			return n;
		else
			return gcd(n,m%n);
		
	}

}
