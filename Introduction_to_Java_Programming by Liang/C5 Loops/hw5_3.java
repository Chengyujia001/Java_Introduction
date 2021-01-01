package C5;
/**
 * (Display calendars) Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year, as follows:
 *
 *             January 2013
 *      Sun Mon Tue Wed Thu Fri Sat
 *               1   2   3   4   5
 *       6   7   8   9  10  11  12
 *      13  14  15  16  17  18  19
 *      20  21  22  23  24  25  26
 *      27  28  29  30  31
 *
 *             December 2013
 *      Sun Mon Tue Wed Thu Fri Sat
 *       1   2   3   4   5   6   7
 *       8   9  10  11  12  13  14
 *      15  16  17  18  19  20  21
 *      22  23  24  25  26  27  28
 *      29  30  31
 */
import java.util.Scanner;

public class hw5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		int day, year, month;
		
		System.out.println("Enter year and first day of year: ");
		year = input.nextInt();
		day = input.nextInt();
		
		for (month = 1; month<13; month++){
			System.out.print("             ");
			switch(month) {
			case 1: 
				System.out.println("Januanry " + year);
				break;
			case 2: 
				System.out.println("February " + year);
				break;
			case 3: 
				System.out.println("March " + year);
				break;
			case 4: 
				System.out.println("April " + year);
				break;
			case 5: 
				System.out.println("May " + year);
				break;
			case 6: 
				System.out.println("June " + year);
				break;
			case 7: 
				System.out.println("July " + year);
				break;
			case 8: 
				System.out.println("August " + year);
				break;
			case 9: 
				System.out.println("September " + year);
				break;
			case 10: 
				System.out.println("October " + year);
				break;
			case 11: 
				System.out.println("November " + year);
				break;
			case 12: 
				System.out.println("December " + year);
				break;
		
			}
			
			System.out.println("----------------------------------------------");
			System.out.println(" Sun   Mon    Tue     Wed    Thu    Fri    Sat ");
			
			day = day %7;
			for (int b = 0; b <= day * 7; b++) {
				System.out.print(" ");
			}
			
			int lastDay = 0;
			if ( month == 1 || month == 3  || month == 5 || month == 7 ||
				  month == 8 || month == 10 ||month == 12)
				lastDay += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				lastDay += 30;
			else { 
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					lastDay += 29;
				else
					lastDay += 28;
			}
			
			for (int d = 1; d <= lastDay; d++) {
				
				if (d < 10) 
					System.out.print(" ");
				
				if (day % 7 == 6)
					System.out.print(d + "\n ");
				else {
					System.out.print(d + "     ");
					
					if (d == lastDay) 
						System.out.println();
				}
				day++; 

			}
			System.out.println();
			
		
			
		}
		
	

	}

}
