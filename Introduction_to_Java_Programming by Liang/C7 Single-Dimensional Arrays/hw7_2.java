package C7;

/**
 * (Sort students) Write a program that prompts the user to enter the number of students,
 * the students’ names, and their scores, and prints student names in decreasing
 * order of their scores.
 * 
 * 
 * 
 * 
 * Enter number of students: 4
Enter student name: s1
Enter score: 234
Enter student name: s2
Enter score: 222
Enter student name: s3
Enter score: 555
Enter student name: s4
Enter score: 0
The students' ranking are: 
s1
s4
s2
s3
 */

import java.util.Scanner;
public class hw7_2 {
	public static void main(String[] args) {

		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter number of students: ");
	    
	    int size = input.nextInt();
		
	    String[] name = new String[size];
	    int[] score = new int[size];
	    
	    
	    for (int i = 0; i < size; i++) {
	      System.out.print("Enter student name: ");
	      name[i] = input.next();
	      System.out.print("Enter score: ");
	      score[i] = input.nextInt();
	    }
	    
	    
	    
	    
	    for (int i=0 ; i<size-1; i++) {
	    	int minS = score[i];
	    	String minN = name[i];
	    	int index = i;
	    	
	    	
	    	for (int j=i+1 ; j <size; j++) {
	    		if(minS>score[j]) {
	    			minS = score[j];
	    			minN = name[j];
	    			index = j;
	    		}
	    	}
	    	if (minS != i) {
	    		score[index]=score[i];
    			name[index]=name[i];
    			score[i] = minS;
    			name[i] = minN;
	    	}
	    	
	    }
	    System.out.println("The students' ranking are: ");
	    for (String e: name)
	    	System.out.println(e);
	 
	    

	}

}
