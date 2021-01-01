package C5;
/**
 * (Compute Pi) You can approximate p by using the following series:
 * Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1)^(i + 1)/(2i - 1))
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 */
import java.util.Scanner;

public class Hw5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int i;
		int sum = 0;
		
		do {
			System.out.println("Enter your number: ");
			i = input.nextInt();
			
			sum += i;
			
		}while(i != 0);
		
		System.out.print("sum is: " + sum);
		
		
		
		
		
		
		
		
		

	}
}