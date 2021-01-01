package C7;

import java.util.Scanner;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of items: ");
		int n = input.nextInt();
		
		double[] a = new double[n];
		System.out.println("enter the numbers, end with 0: ");
		double sum = 0; 
		int above = 0;
		
		for (int i = 0; i<n; i++) {
			a[i]=input.nextDouble();
			sum += a[i];
		}
		
		
		for(double e: a) {
			if (e>(sum/n))
				above ++;
		}
			
		
		System.out.println("The average is: " + sum/n );
		System.out.println("number of elments above the ave is "+ above);
		
		
		

	}

	}


