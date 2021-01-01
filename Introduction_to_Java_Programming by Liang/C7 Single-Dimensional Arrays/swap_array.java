package C7;

import java.util.Scanner;

public class swap_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 5};
		printArray(a);
		
		swap(a,0,2);
		printArray(a);
	}
	
	
	
	public static void swap(int[] array, int n1, int n2) {
		int temp = array[n1];
		array[n1] = array[n2];
		array[n2] = temp;
	}
	
	
	public static void printArray(int[] array) {
		for (int e: array) {
			System.out.print(e+ " ");
		}
		System.out.println();
	}
	
	

	

}
