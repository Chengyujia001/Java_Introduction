package Hw18_2;
import java.lang.Math;


/*Cist 004B1, Java
2/16/2020
Mack

Write a program to calculate sine/cosine by using Recursion 

Input:
from sin(0) to sin(1)

Output:
Program: sin(0.0) = 0.0000	Calculator: sin(0.0) = 0.0000
Program: sin(0.1) = 0.0998	Calculator: sin(0.1) = 0.0998
Program: sin(0.2) = 0.1987	Calculator: sin(0.2) = 0.1987
Program: sin(0.3) = 0.2955	Calculator: sin(0.3) = 0.2955
Program: sin(0.4) = 0.3894	Calculator: sin(0.4) = 0.3894
Program: sin(0.5) = 0.4794	Calculator: sin(0.5) = 0.4794
Program: sin(0.6) = 0.5646	Calculator: sin(0.6) = 0.5646
Program: sin(0.7) = 0.6442	Calculator: sin(0.7) = 0.6442
Program: sin(0.8) = 0.7174	Calculator: sin(0.8) = 0.7174
Program: sin(0.9) = 0.7833	Calculator: sin(0.9) = 0.7833
Program: sin(1.0) = 0.8415	Calculator: sin(1.0) = 0.8415
*/


public class hw18_4 {

	//sine function: 
	//for  -0.005<x<0.005, sin(x) = x - (x^3)/6
	//otherwise, sin(x) = 2*sin(x/2)*cos(x/2)
	public static double s(double x){
		x= -0.005<x  &&  x<0.005 
				?x-Math.pow(x, 3)/6
				:2*s(x/2)*c(x/2);
		return x;
	}

	//cosine function: 
	//for  -0.005<x<0.005, cos(x) = 1 - (x^2)/2
	//otherwise, cos(x) = 1 - 2*(sin(x))^2
	public static double c(double x) {
		x= -0.005<x  &&  x<0.005 
				?1-Math.pow(x, 2)/2
				:1-2*Math.pow(s(x/2), 2);
		return x;
	}
	
	//compare the program with Math.sin(x)
	public static void main(String args[]) {
		for (double i = 0; i < 1; i += 0.1) {
			System.out.printf("Program: sin(%.1f) = %.4f	Calculator: sin(%.1f) = %.4f\n"
					,i, s(i), i, Math.sin(i));
		}
	}
}