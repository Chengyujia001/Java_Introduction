package C11;
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> a = new ArrayList<>();
		double value;
		
		Scanner input = new Scanner(System.in);
		System.out.print("input numbers(end with 0): \n");
		
		do {
			value = input.nextDouble();
			if ( !a.contains(value))
				a.add(value);
		}while (value != 0 );
		
		for (int i = 0; i <a.size(); i++)
			System.out.println(a.get(i));

	}

}
