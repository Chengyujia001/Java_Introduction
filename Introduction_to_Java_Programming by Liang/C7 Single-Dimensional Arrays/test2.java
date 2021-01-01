package C7;

import java.util.Scanner;

public class test2 {

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
	
	
	