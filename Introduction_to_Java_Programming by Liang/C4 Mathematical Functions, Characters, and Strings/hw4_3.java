package c4;
/**
 * (Financial application: payroll) Write a program that reads the following information
 * and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 */
import java.util.Scanner;

public class hw4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hour = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		double gross = rate*hour;
		
		System.out.print("Enter federal tax withholding rate: ");
		double ftax = input.nextDouble();
		
		System.out.print("Enter state; tax withholding rate: ");
		double stax = input.nextDouble();
		
		System.out.printf("employee's name: " + name + "\n"
				+ "Hours worked: %4.2f\npay rate: %4.2f\nGross pay: %4.2f\n",hour,rate,gross); 
		System.out.printf( "Deductions: " + "\n"
				+ "	Federal  withholding(" + ftax*100 + "): $" + (gross*ftax) + "\n"
				+ "	State  withholding(" + stax*100 + "): $" + (gross*stax) + "\n"
				+ "	Total Deduction: " + (gross*ftax+gross*stax) + "\n"
				+ "Net Pay: " + (gross*(1-ftax-stax))
	
				);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
