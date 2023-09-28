package package2;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount();
		CheckingAccount checking = new CheckingAccount();
		
		savings.setAccountHolder("Emma Murphy");
		savings.setBalance(20000);
		savings.setInterestRate(4.2);
		
		checking.setAccountHolder("Vita Lavrov");
		checking.setOverdraftLimit(5000);
		checking.setBalance(1000);
		
		savings.deposit(1500);
		checking.deposit(200);
		
		System.out.println();
		
		savings.withdraw(21500.1);
		checking.withdraw(6200);
		
		System.out.println();
		
		savings.displayAccountInfo();
		checking.displayAccountInfo();
	}
}
