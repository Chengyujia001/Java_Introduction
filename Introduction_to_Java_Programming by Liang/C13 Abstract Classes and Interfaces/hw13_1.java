package C13;
//Rational class, see notes
import java.math.*;
import java.util.Scanner;

public class hw13_1 {

  public static void main(String[] args) {

    //Question 1
    RationalUsingBigInteger sum = new RationalUsingBigInteger(BigInteger.ZERO, BigInteger.ONE);
    BigInteger q1 = new BigInteger("19");
    for (BigInteger i = BigInteger.ONE; i.compareTo(q1) <= 0; i = i.add(BigInteger.ONE)) {
        sum = sum.add(new RationalUsingBigInteger(i, i.add(BigInteger.ONE)));
    }
    System.out.println("The sum of 1/2+ ...+ 19/20 is: " +  sum);
    
    //Question 2
    BigInteger q2 = new BigInteger("25");
    for (BigInteger i = BigInteger.ONE; i.compareTo(q2) <= 0; i = i.add(BigInteger.ONE)) {
        sum = sum.add(new RationalUsingBigInteger(i, i.add(BigInteger.ONE)));
    }
    System.out.println("The sum of 1/2+ ...+ 25/26 is: " +  sum);
  }
}

class RationalUsingBigInteger extends Number implements Comparable<RationalUsingBigInteger> {
  // Data fields for numerator and denominator
  private BigInteger numerator = BigInteger.ZERO;
  private BigInteger denominator = BigInteger.ONE;

  /** Construct a rational with default properties */
  public RationalUsingBigInteger() {
    this(BigInteger.ZERO, BigInteger.ONE);
  }

  /** Construct a rational with specified numerator and denominator */
  public RationalUsingBigInteger(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);
    
    if (denominator.compareTo(BigInteger.ZERO) < 0) 
      this.numerator = numerator.multiply(new BigInteger("-1")).divide(gcd);
    else
      this.numerator = numerator.divide(gcd);  
    this.denominator = denominator.abs().divide(gcd);
  }

  /** Find GCD of two numbers */
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 = n.abs();
    BigInteger n2 = d.abs();
    BigInteger gcd = BigInteger.ONE;
    
    for (BigInteger k = BigInteger.ONE; 
         k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; 
         k = k.add(BigInteger.ONE)) {
      if (n1.remainder(k).equals(BigInteger.ZERO) && 
          n2.remainder(k).equals(BigInteger.ZERO)) 
        gcd = k;
    }

    return gcd;
  }

  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }

  /** Add a rational number to this rational */
  public RationalUsingBigInteger add(RationalUsingBigInteger secondRationalUsingBigInteger) {
    BigInteger n = numerator.multiply(secondRationalUsingBigInteger.getDenominator()).add(
      denominator.multiply(secondRationalUsingBigInteger.getNumerator()));
    BigInteger d = denominator.multiply(secondRationalUsingBigInteger.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Subtract a rational number from this rational */
  public RationalUsingBigInteger subtract(RationalUsingBigInteger secondRationalUsingBigInteger) {
    BigInteger n = numerator.multiply(secondRationalUsingBigInteger.getDenominator()).subtract(
      denominator.multiply(secondRationalUsingBigInteger.getNumerator()));
    BigInteger d = denominator.multiply(secondRationalUsingBigInteger.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Multiply a rational number to this rational */
  public RationalUsingBigInteger multiply(RationalUsingBigInteger secondRationalUsingBigInteger) {
    BigInteger n = numerator.multiply(secondRationalUsingBigInteger.getNumerator());
    BigInteger d = denominator.multiply(secondRationalUsingBigInteger.getDenominator());
    return new RationalUsingBigInteger(n, d);
  }

  /** Divide a rational number from this rational */
  public RationalUsingBigInteger divide(RationalUsingBigInteger secondRationalUsingBigInteger) {
    BigInteger n = numerator.multiply(secondRationalUsingBigInteger.getDenominator());
    BigInteger d = denominator.multiply(secondRationalUsingBigInteger.numerator);
    return new RationalUsingBigInteger(n, d);
  }

  @Override
  public String toString() {
    if (denominator.equals(BigInteger.ONE))
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }

  @Override /** Override the equals method in the Object class */
  public boolean equals(Object parm1) {
    if ((this.subtract((RationalUsingBigInteger)(parm1))).getNumerator().equals(BigInteger.ONE))
      return true;
    else
      return false;
  }

  @Override /** Override the hashCode method in the Object class */
  public int hashCode() {
    return new Double(this.doubleValue()).hashCode();
  }

  @Override /** Override the abstract intValue method in java.lang.Number */
  public int intValue() {
    return (int)doubleValue();
  }

  @Override /** Override the abstract floatValue method in java.lang.Number */
  public float floatValue() {
    return (float)doubleValue();
  }

  @Override /** Override the doubleValue method in java.lang.Number */
  public double doubleValue() {
    return numerator.doubleValue() / denominator.doubleValue();
  }

  @Override /** Override the abstract longValue method in java.lang.Number */
  public long longValue() {
    return (long)doubleValue();
  }

  @Override
  public int compareTo(RationalUsingBigInteger o) {
    if ((this.subtract((RationalUsingBigInteger)o)).getNumerator().compareTo(BigInteger.ZERO) > 0)
      return 1;
    else if ((this.subtract((RationalUsingBigInteger)o)).getNumerator().compareTo(BigInteger.ZERO) < 0)
      return -1;
    else
      return 0;
  }
}