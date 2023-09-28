package package2;

abstract class BankAccount {
	
	private String accountNumber;
	
	private String accountHolder;
	
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public abstract void displayAccountInfo();

}
