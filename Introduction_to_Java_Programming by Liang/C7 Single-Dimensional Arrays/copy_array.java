package C7;

public class copy_array {

	public static void main(String[] args) {


		int[] a = {3,5,33,5,6};
		int[] b = new int[5];
		
		System.arraycopy(a, 0, b, 0, 5);
		
		printArray(a);
		printArray(b);
		printArray(new int[]{54,0,2,88,10});
		
	}
	
	
	public static void printArray(int[] array) {
		for (int e:array) {
			System.out.print(e+ " ");
		}
		System.out.println();
		
	}

}
