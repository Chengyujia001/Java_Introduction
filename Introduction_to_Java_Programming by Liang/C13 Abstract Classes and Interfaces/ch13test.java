package C13;

import java.math.BigInteger;

/**
 * (Use the Rational class) Write a program that computes the following summation
 * series using the Rational class:
 *
 *      1/2 + 2/3 + 3/4 + ... + 98/99 + 99/100
 *
 * You will discover that the output is incorrect because of integer overflow (too
 * large). To fix this problem, see Programming Exercise 13.15.
 */
public class ch13test {
    public static void main(String[] args) {
    	RationalUsingBigInteger sum = new RationalUsingBigInteger(BigInteger.ZERO, BigInteger.ONE);
        BigInteger max = new BigInteger("99");
        for (BigInteger i = BigInteger.ONE; i.compareTo(max) <= 0; i = i.add(BigInteger.ONE)) {
            sum = sum.add(new RationalUsingBigInteger(i, i.add(BigInteger.ONE)));
            System.out.println(i + ". " + sum);
        }
        System.out.println(sum);
    }
}