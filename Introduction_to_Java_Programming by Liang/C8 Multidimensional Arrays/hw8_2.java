package C8;

/**
 * (Column sorting) Implement the following method to sort the columns in a two-dimensional
 * array. A new array is returned and the original array is intact.
 *
 *      public static double[][] sortColumns(double[][] m)
 *
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new column-sorted matrix. Here is a sample run:
 *
 *      Enter a 3-by-3 matrix row by row:
 *      0.15 0.875 0.375 (enter)
 *      0.55 0.005 0.225 (enter)
 *      0.30 0.12 0.4 (enter)
 *
 *      The column-sorted array is
 *      0.15 0.0050 0.225
 *      0.3 0.12 0.375
 *      0.55 0.875 0.4
 */
import java.util.Scanner;

public class hw8_2 {

	public static void main(String[] args) {

		System.out.println("Eneter a 3-by-3 matrix row by row: ");
		
		double[][] a = inputArray();
		double[][] b = sortColumns(a);
		
		System.out.print("The column-sorted array is:");
		for(int i=0 ; i<3 ; i++) {
			System.out.println("\nRow "+ (i+1));
			for(int j=0 ; j<3 ; j++) {
				System.out.print(b[i][j] + " ") ;
			}
		}
	}
	
	public static double[][] inputArray(){
		
		Scanner input = new Scanner(System.in);

		double[][] mat = new double[3][3];
		
		for(int i=0 ; i<3 ; i++) {
			System.out.println("Row "+ (i+1));
			for(int j=0 ; j<3 ; j++) {
				mat[i][j] = input.nextDouble();
			}
		}
		
		
		return mat;
		
	}
	
	public static double[][] sortColumns(double[][] m){
		
		double[][] result = new double[3][3];
		
		
		for(int j=0 ; j<m[0].length ; j++) {
			double[] temp = new double[3];
			
			for(int i=0 ; i<temp.length ; i++) 
				temp[i] += m[i][j];
			java.util.Arrays.parallelSort(temp);
			for(int i=0 ; i<temp.length ; i++)
				result[i][j]=temp[i];
		}
		
		return result;
	}

	
}