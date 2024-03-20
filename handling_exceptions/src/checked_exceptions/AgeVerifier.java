package checked_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeVerifier {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("How old are you? ");
			int age = scanner.nextInt();
			
			verifyAge(age);
			
			System.out.println("You are an adult");
			
		} catch(UnderageException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Input is invalid, please type in a number");
		}

	}
	
	public static boolean verifyAge(int age) throws UnderageException {
		if (age < 18) {
			throw new UnderageException("User is underage");
		}
		return true;
	}

}

class UnderageException extends Exception {

	public UnderageException(String message) {
		super(message);
	}
}
