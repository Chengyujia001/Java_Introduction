package C9;

/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 *
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the
 *   stopwatch in milliseconds.
 *
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 * 
 * 
 * 		The execution time of sorting 100,000 numbers are 48 milliseconds
 */
import java.util.Random;

public class hw9_1 { 

	public static void main(String[] args) {
		final int numbers = 100_000;
		int[] data = new int[numbers];
		StopWatch stopWatch = new StopWatch();

		Random rand = new Random();
		for (int i = 0; i < numbers; i++) {
			data[i] = rand.nextInt();
		}
		
		stopWatch.start();
		java.util.Arrays.sort(data);
		stopWatch.stop();	
		
		System.out.println("The execution time of sorting 100,000 numbers are " + stopWatch.getElapsedTime()+ " milliseconds.");
	}

}

class StopWatch {
	private long startTime;
	private long endTime;

	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	void start() {
		startTime = System.currentTimeMillis();
	}

	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long getElapsedTime() {
		return endTime - startTime;
	}
	
}

