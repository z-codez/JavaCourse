package package2;

public class CheckingAccount extends BankAccount{
	
	private double overdraftLimit;
	
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		
		double newBalance = getBalance() + amount;
		
		setBalance(newBalance);
		
		System.out.println("Deposit successful. Balance: €"+ newBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= (overdraftLimit + getBalance())) {
			
			double newBalance = getBalance() - amount;
			
			setBalance(newBalance);
			
			System.out.println("Withdrawal successful. Balance: €"+ newBalance);
		} else {
			
			System.out.println("The amount you are trying to withdraw is too high.");
			
		}	
	}

	@Override
	public void displayAccountInfo() {
		
		System.out.println("\nChecking account info:");
		System.out.println("Account holder: " + getAccountHolder());
		System.out.println("Account balance: €" + getBalance());
		System.out.println("Overdraft Limit: €" + getOverdraftLimit());
		
	}
}
