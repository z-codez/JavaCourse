package unchecked_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int input = 0;
		int[] arr = { 1, 2, 3, 4, 5 };

		do {
			try {
				System.out.println("Enter a number greater than 0");
				input = scanner.nextInt();
				int num = input / 1;
				System.out.println("Divided : " + num);
				System.out.println("Retrieve an element from this array");
				System.out.println("Enter a num btw 1 and 5");
				input = scanner.nextInt();

				System.out.println("Element from Array: " + arr[input - 1]);

			} catch (InputMismatchException ime) {
				System.out.println("Please enter a number");
			} catch (ArithmeticException ae) {
				System.out.println(ae);
				// input = 0;
			} catch (ArrayIndexOutOfBoundsException aioobe) {
				System.out.println(aioobe);
				System.out.println("Please enter a number between 1 and 5");
				input = 0;
			} finally {
				// To consume the scanner.
				scanner.nextLine();
			}

		} while (input <= 0);

		scanner.close();
	}
}
