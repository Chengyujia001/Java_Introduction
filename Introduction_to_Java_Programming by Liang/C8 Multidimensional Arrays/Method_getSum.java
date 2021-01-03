package C8;

import java.util.Scanner;

public class Method_getSum {

	public static void main(String[] args) {
		
		System.out.println("!!Matrix Sum Calculator!! ");
		
		int[][] a = inputArray();
		System.out.println("the sum is: " + getSum(a));
		

	}
	
	public static int[][] inputArray(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eneter the number of rows and columns: ");
		int m =input.nextInt();
		int n = input.nextInt();
		
		System.out.println("Eneter elements: ");
		int[][] mat = new int[m][n];
		
		for(int i=0 ; i<m ; i++) {
			System.out.println("Row "+ (i+1));
			for(int j=0 ; j<n ; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		
		return mat;
		
	}
	
	public static int getSum(int[][] a){
		
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				sum += a[i][j];
			}
		}
		
		return sum;
	}

}
