package checked_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		
		BankAccount[] accs = {
				new BankAccount(121, 4512, 1234),
				new BankAccount(122, 6500, 1234),
				new BankAccount(123, 7_000_000, 1234)
		};
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to Online Banking\n");
			System.out.println("Enter your account number: ");
			int accNum = scanner.nextInt();
			System.out.println("Enter your pin: ");
			int pin = scanner.nextInt();
			
			BankAccount acc = accessAccount(accs, accNum, pin);
			
			System.out.println("Would you like to withraw?, true or false");
			boolean ans = scanner.nextBoolean();
			if(ans) {
				System.out.println("How much would you like to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				withdraw(acc, withdrawAmount);
			}
			System.out.println("Would you like to deposit?, true or false");
			ans = scanner.nextBoolean();
			if(ans) {
				System.out.println("How much would you like to deposit: ");
				double depAmount = scanner.nextDouble();
				deposit(acc, depAmount);
			}
			
		} catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("The input is invalid, try again");
		} catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Exiting...");

	}
	
	public static BankAccount accessAccount(
			BankAccount[] accs, int accNum ,int pin) throws InvalidPinException {
		for (BankAccount acc : accs ) {
			if (acc.accountNumber == accNum) {
				if (acc.pin == pin) {
					return acc;
				} else {
					throw new InvalidPinException("This pin is invalid");
				}
			}
		}
		throw new IllegalArgumentException("Invalid account number");
	}
	
	public static void withdraw(BankAccount acc, double amount) throws InsufficientFundsException {
		if (acc.balance >= amount) {
			System.out.println("Withdrawal succesful!!!");
			acc.balance -= amount;
			System.out.println("New balance: $" + acc.balance);
		} else {
	
			throw new InsufficientFundsException("Insufficient balance");
		}
	}
	
	public static void deposit(BankAccount acc, double amount) {
		acc.balance += amount;
		System.out.println("Deposit succesful!!!");
		System.out.println("New balance: $" + acc.balance);
	}

}

class BankAccount {
	
	int accountNumber;
	double balance;
	int pin;
	
	public BankAccount(int accountNumber, double balance, int pin) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}
	
	public String toString() {
		return "";
	}
}

class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message) {
		super(message);
	}
}

class InvalidPinException extends Exception {

	public InvalidPinException(String message) {
		super(message);
	}
	
}