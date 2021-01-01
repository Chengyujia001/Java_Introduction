package C11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// (1 point) step 0: Modify Cow class so that Cow objects can be compared and sorted (using their milk production) in an ArrayList.
class Cow {
	String name;
	int production;

	public Cow(String n, int p) {
		name = n;
		production = p;
	}

	void addMilk(int amount) {
		production += amount;
	}

	public String toString() {
		return name + ":" + production;
	}
}

public class test111 {
	public static void main(String[] args) {
		// (1 point) step 1: create an ArrayList, cows, of the 7 cows
		ArrayList<Cow> cows = new ArrayList<>();
		
//		cows.add(0, new Cow("Bessie", 0));
//		cows.add(1, new Cow("Elsie", 0));
//		0.addMilk(5)
		
		
		
//		double value;	
//		Account account = new Account(1122, 1000, "George");
//        Account.setAnnualInterestRate(1.5);
		Cow Bessie = new Cow("Bessie", 0);
		Cow Elsie = new Cow("Elsie", 0);
		
		
		
		
		
		
		
	}}