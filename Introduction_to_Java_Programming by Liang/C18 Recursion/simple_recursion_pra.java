package C18;

public class simple_recursion_pra {

	public static void main(String[] args) {
		nPrint("ok" ,5);
		
	}
	
	public static void nPrint(String messa, int times) {
		if (times >= 1) {
			System.out.println(messa);
			nPrint(messa, times-1);
		}
		
		
		
	}

}


