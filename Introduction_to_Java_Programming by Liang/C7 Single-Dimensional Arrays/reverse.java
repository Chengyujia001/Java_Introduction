package C7;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 3, 5, 9};
		for(int c: a) {
			System.out.print(c);
		}

		System.out.println();
		int[] b= reverse(a);
		for(int c: b) {
			System.out.print(c);
		}
	}
	
	
	public static int[] reverse(int[] list) {
		int[] temp = new int[list.length];
		
		for(int i=0, j = temp.length - 1; j>=0 ; i++, j--) {
			temp[j]= list[i];		
		}
		
		return temp;
	}
	
	
	
	
	

}
