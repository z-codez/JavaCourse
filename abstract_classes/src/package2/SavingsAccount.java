package package2;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		
		double newBalance = getBalance() + amount;
		
		setBalance(newBalance);
		
		System.out.println("Deposit successful. Balance: €"+ newBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		
		double balance = getBalance();
		
		if (amount <= balance) {
			
			double newBalance = balance - amount;
			
			setBalance(newBalance);
			
			System.out.println("Withdrawal successful. Balance: €"+ newBalance);
			
		} else {
			System.out.println("Insufficient funds for this transaction.");
		}

	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Savings account info:");
		System.out.println("Account holder: " + getAccountHolder());
		System.out.println("Account balance: €" + getBalance());
		System.out.println("Interest rate: " + getInterestRate() + "% per annum");
	}

}
