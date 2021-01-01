package C11;
/**
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was
 * defined to model a bank account. An account has the properties account number,
 * balance, annual interest rate, and date created, and methods to deposit and withdraw
 * funds. Create two subclasses for checking and saving accounts. A checking
 * account has an overdraft limit, but a savings account cannot be overdrawn.
 *
 * Draw the UML diagram for the classes and then implement them. Write
 * a test program that creates objects of Account, SavingsAccount, and
 * CheckingAccount and invokes their toString() methods.
 */
public class hw11_1 {

	public static void main(String[] args) {
		// test
		CheckingAccount a = new CheckingAccount();
		a.deposit(1000);
		a.setId(0001);
		a.setOverdrawnLimit(2000);
		CheckingAccount b = new CheckingAccount(0002, 2000.0, 0.09);
		
		System.out.print("account a: \nid: " + a.getId() + "\nOverdrawnLimit: " + a.getOverdrawnLimit());
		System.out.print("\n\naccount b: \nid: "+ b.getId() + "\nbalance: " + b.getBalance());
	}
}

class CheckingAccount extends Account{
	private int overdarawnLimit;
	
	public CheckingAccount() {
	}
	
	public CheckingAccount(int id, double balance, double annualInterestRate) {
		setId(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
	}
	
	public int getOverdrawnLimit() {
		return overdarawnLimit;
	}
	
	public void setOverdrawnLimit(int overdarawnLimit) {
		this.overdarawnLimit = overdarawnLimit;
	}
}

class SavingAccount extends Account{
	public SavingAccount() {}
	
	public SavingAccount(int id, double balance, double annualInterestRate) {
		setId(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
	}
	
}


class Account {
	  private int id;
	  private double balance;
	  private static double annualInterestRate;
	  private java.util.Date dateCreated;

	  public Account() {
	    dateCreated = new java.util.Date();
	  }

	  public Account(int newId, double newBalance) {
	    id = newId;
	    balance = newBalance;
	    dateCreated = new java.util.Date();
	  }

	  public int getId() {
	    return this.id;
	  }

	  public double getBalance() {
	    return balance;
	  }

	  public static double getAnnualInterestRate() {
	    return annualInterestRate;
	  }

	  public void setId(int newId) {
	    id = newId;
	  }

	  public void setBalance(double newBalance) {
	    balance = newBalance;
	  }

	  public static void setAnnualInterestRate(double newAnnualInterestRate) {
	    annualInterestRate = newAnnualInterestRate;
	  }

	  public double getMonthlyInterest() {
	    return balance * (annualInterestRate / 1200);
	  }

	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  public void withdraw(double amount) {
	    balance -= amount;
	  }

	  public void deposit(double amount) {
	    balance += amount;
	  }
	}
