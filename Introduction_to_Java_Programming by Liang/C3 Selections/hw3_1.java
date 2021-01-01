package c3;
/**
*Cist 004 Java
*
*Enter a,b,c ,display roots.
*
*Date:9/13/2020
**/

import java.util.Scanner;



public class hw3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double d = Math.pow(b*b-4*a*c, 0.5);
		
		if (d>0)
			System.out.print("The equation has two roots " + (-b+d)/(2*a) +" and " + (-b-d)/(2*a));
		
		else if (d==0)
			System.out.print("The equation has one roots " + (-b+d)/(2*a));
			
		else
			System.out.print("The equation has no real roots ");
		
		
	}

}
