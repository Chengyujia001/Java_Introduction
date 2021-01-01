package C11;

/**
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * the most 1s.) Here is a sample run of the program:
 *
 *      Enter the array size n: 4 (enter)
 *      The random array is
 *      0011
 *      0011
 *      1101
 *      1010
 *      The largest row index: 2
 *      The largest column index: 2, 3
 *      
 *      
 *      
 *      
 *      Enter the array size n: 3
 *      The random array is
 *      1 1 0 
 *      1 0 0 
 *      0 1 0 
 *      The largest row index: [0]
 *      The largest column index: [0, 1]
 *      
 *      
 *      
 */
import java.util.ArrayList;
import java.util.Scanner;



public class hw11_3 {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        
        int[][] matrix = createMatrix(n);
        printMatrix(matrix);
        
//        ArrayList<Integer> = 
//        
//        System.out.println("The largest row index: " + getIndex(row));
//        System.out.println("The largest column index: " + getIndex(col));
    }
    
    
    public static int[][] createMatrix(int size){
    	int[][] matrix = new int[size][size];
    	for (int i = 0; i<size; i++) {
    		for (int j = 0; j<size; j++) {
    			matrix[i][j] = (int) (Math.random()*2);
    		}
    	}
    	return matrix;
    }
    
    public static void printMatrix(int[][] matrix) {
    	System.out.print("The random array is\n");
    	for (int[] row : matrix) {
    		for (int e: row) {
    			System.out.print(e + " ");
    		}
    		System.out.print("\n");
    	}
    }
    
    
    
    
    
    
    
    
}