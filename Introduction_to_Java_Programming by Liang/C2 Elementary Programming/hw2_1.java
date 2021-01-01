package C2;


//Celcius Fahrenheit transfer


import java.util.Scanner;

public class hw2_1 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a degree in Celcius: ");
		int t = input.nextInt();
		
		System.out.print(t + " Celcius is " + (int)(100*(t*9.0/5+32))/100.0 + " Fahrenheit" );
		
	
		
		
		
		
		
		
		
	}

}
