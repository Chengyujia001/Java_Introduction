package c3;
/**
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 *
 *      c(w) =
 *      {
 *          3.5, if 0 < w <= 1
 *          5.5, if 1 < w <= 3
 *          8.5, if 3 < w <= 10
 *          10.5, if 10 < w <= 20
 *      }
 *
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 20, display a message “the
 * package cannot be shipped.”
 */

import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the weight(pounds): ");
		double w = input.nextDouble();

		
		if (0<w&&w<=1)
			System.out.print("The shipping cost is: " + 3.5*w);
		
		else if (1<w&&w<=3)
			System.out.print("The shipping cost is: " + 5.5*w);
		
		else if (3<w&&w<=10)
			System.out.print("The shipping cost is: " + 8.5*w);

		else if (10<w&&w<=20)
			System.out.print("The shipping cost is: " + 10.5*w);
			
		else
			System.out.print("The package cannot be shipped. ");
		
		
		
	}

}
