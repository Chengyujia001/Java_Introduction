package C7;

/**
 * (Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list.
 *
 *      public static int[] merge(int[] list1, int[] list2)
 *
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. Write a test program that prompts the user to enter two
 * sorted lists and displays the merged list. Here is a sample run. Note that the first
 * number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 *
 *      Enter list1: 5 1 5 16 61 111 (enter)
 *      Enter list2: 4 2 4 5 6 (enter)
 *      The merged list is 1 2 4 5 5 6 16 61 111
 *      
 *  
 */

import java.util.Scanner;



public class hw7_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}


		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] list3 = merge(list1, list2);

		System.out.println("The merged list is: ");
		for (int e: list3) {
			System.out.print(e + " ");
		}
		
	}

	public static int[] merge(int[] list1, int[] list2)  {
		int[] result = new int[list1.length + list2.length];
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		while (index1<list1.length && index2<list2.length) {
			if (list1[index1]<list2[index2]) {
				result[index3] = list1[index1];
				index3++;
				index1++;
			}
			else {
				result[index3] = list2[index2];
				index3++;
				index2++;
			}
		}
		
		
		while (index1<list1.length) {
			result[index3] = list1[index1];
			index3++;
			index1++;
		}
		
		while (index2<list2.length) {
			result[index3] = list2[index2];
			index3++;
			index2++;
		}
		
		
		return result;
	}
}
	
	