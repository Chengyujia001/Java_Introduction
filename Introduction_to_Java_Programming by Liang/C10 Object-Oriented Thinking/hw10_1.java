package C10;

/**
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order. For
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * retrieve and display them in reverse order.
 */


import java.util.Scanner;
public class hw10_1 {

    public static void main(String[] args) {
        int number = inputInteger();
        StackOfIntegers primeFactors = getFactors(number);
        printFactors(primeFactors);
    }

    private static void printFactors(StackOfIntegers primeFactors) {
        System.out.print(primeFactors.pop());
        while (primeFactors.getSize() > 0) {
            System.out.printf(", %d", primeFactors.pop());
        }
    }

    public static int inputInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        return input.nextInt();
    }

    public static StackOfIntegers getFactors(int number) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        while(number > 1){
            int i = 2;
            while (number % i != 0) 
            	i++;
            stackOfIntegers.push(i);
            number /= i;
        }
        return stackOfIntegers;
    }
}

//from the textbook
class StackOfIntegers {
	  private int[] elements;
	  private int size;
	  public static final int DEFAULT_CAPACITY = 16;

	  /** Construct a stack with the default capacity 16 */
	  public StackOfIntegers() {
	    this(DEFAULT_CAPACITY);
	  }

	  /** Construct a stack with the specified maximum capacity */
	  public StackOfIntegers(int capacity) {
	    elements = new int[capacity];
	  }

	  /** Push a new integer into the top of the stack */
	  public void push(int value) {
	    if (size >= elements.length) {
	      int[] temp = new int[elements.length * 2];
	      System.arraycopy(elements, 0, temp, 0, elements.length);
	      elements = temp;
	    }

	    elements[size++] = value;
	  }

	  /** Return and remove the top element from the stack */
	  public int pop() {
	    return elements[--size];
	  }

	  /** Return the top element from the stack */
	  public int peek() {
	    return elements[size - 1];
	  }

	  /** Test whether the stack is empty */
	  public boolean empty() {
	    return size == 0;
	  }

	  /** Return the number of elements in the stack */
	  public int getSize() {
	    return size;
	  }
	}
