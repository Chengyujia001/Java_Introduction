package C11;
/**
 * (New Account class) An Account class was specified in Programming
 * Exercise 9.7. Design a new Account class as follows:
 *
 * - Add a new data field name of the String type to store the name of the
 *   customer.
 * - Add a new constructor that constructs an account with the specified name, id,
 *   and balance.
 * - Add a new data field named transactions whose type is ArrayList
 *   that stores the transaction for the accounts. Each transaction is an instance
 *   of the Transaction class. The Transaction class is defined as shown in
 *   Figure 11.6.
 *
 * FIGURE 11.6 (p. 446) The Transaction class describes a transaction for a bank account.
 *
 * - Modify the withdraw and deposit methods to add a transaction to the
 *   transactions array list.
 * - All other properties and methods are the same as in Programming Exercise 9.7.
 *
 * Write a test program that creates an Account with annual interest rate 1.5%,
 * balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
 * account and withdraw $5, $4, and $2 from the account. Print an account summary
 * that shows account holder name, interest rate, balance, and all transactions.
 */
import java.util.ArrayList;
import java.util.Date;

public class hw11_2 {

	public static void main(String[] args) {
		
		Account p1 = new Account("George", 1122, 1000.0);
		p1.setAnnualInterestRate(1.5);
		p1.deposit(30);
		p1.deposit(40);
		p1.deposit(50);
		p1.withdraw(5);
		p1.withdraw(4);
		p1.withdraw(3);
		
		printAccountSummary(p1);
	}
	
	private static void printAccountSummary(Account a) {
        System.out.println("ACCOUNT SUMMARY:");
        System.out.println("----------------------------------------");
        System.out.println("Name:          " + a.getName());
        System.out.println("Interest rate: " + a.getAnnualInterestRate() + "%");
        System.out.println("Balance:       $" + a.getBalance());
        System.out.println();
        System.out.println("TRANSACTIONS:");

    	for (int i = 0; i <a.getSize(); i++)
    		System.out.println(a.getTransactions(i));

        }
    }
	
	//new Class 
	static class Transaction{
		private Date date = new Date();
		private char type;
		private double amount;
        private double balance;
		private String description;
		
		public Transaction(){}
		public Transaction(char type, double amount, double balance, String description){
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description;
		}
    }

	 
	static class Account {
		protected double annualInterestRate;
        protected Date date = new Date();
        protected int id;
        protected double balance;
        
        
      //change start--------------------------------------------------	
        protected String name;
        protected ArrayList<Transaction> transactions = new ArrayList<>();
        
        public Account(String name, int id, double balance) {
        	this.name = name;
            this.id = id;
            this.balance = balance;
        }
        
        public String getName() {
            return name;
        }
        
        public int getSize() {
            return transactions.size();
        }
        
        public Transaction getTransactions(int a) {
            return transactions.get(a);
        }

        //change end----------------------------------------------------
        

        public Account() {
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Date getDate() {
            return date;
        }

        public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100.0);
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
              //add to transactions
                transactions.add(new Transaction('W', amount, balance, String.format("withdraw of $%.2f", amount)));
            }
        }

        public void deposit(double amount) {
            balance += amount;
          //add to transactions
            transactions.add(new Transaction('D', amount, balance, String.format("Deposit of $%.2f", amount)));
        }
    }

}
