package C2;
import java.util.*;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter purchase amount: ");

	    double amount = input.nextDouble();
	    double tax = amount*0.06;
	    
	    System.out.println("Sales tax is " + tax);
	    
	    System.out.println("Sales tax is " + (int)(tax*100));
	    System.out.println("Sales tax is " + (int)(tax*100) /100.0);
	    
	    
	    System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
	    
	    
	    
	    
	    
	}

}
