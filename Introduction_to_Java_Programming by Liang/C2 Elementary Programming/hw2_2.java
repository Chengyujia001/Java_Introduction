package C2;

//Calculate the distance of two points

import java.util.Scanner;

public class hw2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter X1 and Y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter X2 and Y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
		double d = Math.pow( Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
		
		System.out.print("The distance between the two points is " + d);
		
		
		
	}

}
