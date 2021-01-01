package C9;
/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 *
 *      ax + by = e
 *      cx + dy = f
 *      x = (ed - bf) / (ad - bc)
 *      y = (af - ec) / (ad - bc)
 *
 * The class contains:
 *
 * - Private data fields a, b, c, d, e, and f.
 * - A constructor with the arguments for a, b, c, d, e, and f.
 * - Six getter methods for a, b, c, d, e, and f.
 * - A method named isSolvable() that returns true if ad - bc is not 0.
 * - Methods getX() and getY() that return the solution for the equation.
 *
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” Here are some sample runs:
 *
 *      Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0 (enter)
 *      x is -2.0 and y is 3.0
 *
 *      Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 (enter)
 *      The equation has no solution
 *      
 *      
 *      Enter a, b, c, d, e, f: 			4
 *			2
 *			3
 *			6
 *			5
 *			4
 *			x is 1.17 and y is 0.08
 *      
 */
import java.util.Scanner;



public class hw9_3 {
    public static void main(String[] args) {
    	
        double[] a = inputValues();
        LinearEquation linearEquation = new LinearEquation(
                a[0], a[1], a[2], a[3], a[4], a[5]);
        printOut(linearEquation);
    }

    private static double[] inputValues() {
    	Scanner input = new Scanner(System.in);
    	
        double[] values = new double[6];
        
        System.out.print("Enter a, b, c, d, e, f: \n");
        
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        return values;
        
    }

    private static void printOut(LinearEquation linearEquation) {
        System.out.printf(linearEquation.isSolvable()? "x is %.2f and y is %.2f" : "The equation has no solution.", linearEquation.getX(), linearEquation.getY());
    }

    private static class LinearEquation {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        LinearEquation(double x1, double x2, double x3, double x4, double x5, double x6) {
        	a = x1;
        	b= x1;
            c = x3;
            d = x4;
            e = x5;
            f = x6;
        }

        double getA() {
            return a;
        }

        double getB() {
            return b;
        }

        double getC() {
            return c;
        }

        double getD() {
            return d;
        }

        double getE() {
            return e;
        }

        double getF() {
            return f;
        }

        boolean isSolvable() {
            return a * d - b * c != 0;
        }

        double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }
}


