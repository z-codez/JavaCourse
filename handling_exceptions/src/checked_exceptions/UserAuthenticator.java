package checked_exceptions;

import java.util.Scanner;

public class UserAuthenticator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
		try {

            boolean isAuthenticated = validate(username, password);
            if (isAuthenticated) {
                System.out.println("Authentication successful.");
            } else {
                System.out.println("Authentication failed.");
            }
		} catch(AuthenticationException e) {
			System.out.println("AuthenticationException: " + e.getMessage());
			
		} finally {
			scanner.close();
		}
	}
	
	public static boolean validate(String username, String password)
		throws AuthenticationException{
		if (username.equals("Admin") && password.equals("1234")) {
			return true;
		} else {
			throw new AuthenticationException("Invalid Username or password");
		}
	}
}

class AuthenticationException extends Exception{
	
	public AuthenticationException(String message) {
		super(message);
	}
}
