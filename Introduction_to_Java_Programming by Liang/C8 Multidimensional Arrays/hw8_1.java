package C8;
/**
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * in the major diagonal in an n * n matrix of double values using the following
 * header:
 *
 *      public static double sumMajorDiagonal(double[][] m)
 *
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * elements on the major diagonal. Here is a sample run:
 *
 *      Enter a 4-by-4 matrix row by row:
 *      1 2 3 4.0 (enter)
 *      5 6.5 7 8 (enter)
 *      9 10 11 12 (enter)
 *      13 14 15 16 (enter)
 *      Sum of the elements in the major diagonal is 34.5
 */
import java.util.Scanner;

public class hw8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("!!Matrix Sum Calculator!! ");
		
		double[][] a = inputArray();
		System.out.println("the sum is: " + getSum(a));
		

	}
	
	public static double[][] inputArray(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eneter a 4-by-4 matrix row by row: ");

		double[][] mat = new double[4][4];
		
		for(int i=0 ; i<4 ; i++) {
			System.out.println("Row "+ (i+1));
			for(int j=0 ; j<4 ; j++) {
				mat[i][j] = input.nextDouble();
			}
		}
		
		
		return mat;
		
	}
	
	public static double getSum(double[][] a){
		
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				sum += a[i][j];
			}
		}
		
		return sum;
	}

}