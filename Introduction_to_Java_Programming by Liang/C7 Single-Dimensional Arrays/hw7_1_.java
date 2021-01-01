package C7;

/**
 * (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
 * n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 * is found, n is not prime. A more efficient approach is to check whether any of the
 * prime numbers less than or equal to √n can divide n evenly. If not, n is prime.
 * Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 * You need to use an array to store the prime numbers and later use them to check
 * whether they are possible divisors for n.
 * 
 * The first 50 prime numbers are: 
2 3 5 7 11 13 17 19 23 29
31 37 41 43 47 53 59 61 67 71
73 79 83 89 97 101 103 107 109 113
127 131 137 139 149 151 157 163 167 173
179 181 191 193 197 199 211 223 227 229

 */

import java.util.Scanner;

public class hw7_1_ {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] primes = new int[50];
        primes(primes);
        System.out.println("The first 50 prime numbers are: ");
        

        
        for (int i = 1; i<=50; i++) {
        	if (i % 10 == 0) {
        		System.out.println(primes[i-1]);
    		     } 
        	else {
        		System.out.print(primes[i-1] + " ");
    		     }
        	}
        	
        
    }
    
    
    public static void primes(int[] primes){
        int count = 0;
        int number = 2;
        while(count < 50){
            if(isPrime(number)){
                primes[count] = number;
                count++;
            }
            number++;
        }
    }
    
    public static boolean isPrime(int number){
        boolean isPrime = true;
            for(int divisor = 2; divisor <= number / 2 && isPrime; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                }
            }
        return isPrime;
    }
    
}