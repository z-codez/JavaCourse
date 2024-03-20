import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int random1 = random.nextInt(1, 11);
		int random2 = random.nextInt(1, 11);
		int correctAns = random1 * random2;
		
		System.out.println("Welcome to Multiplication Quiz");
		System.out.println();
		System.out.println("What is the product of " + random1 + " and " + random2 + " ?" );
		
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		scanner.close();
		
		if(correctAns == answer) {
			System.out.println();
			System.out.println("That is the correct answer. You won!!!");
		} else {
			System.out.println();
			System.out.println("That is incorrect. Please play again");
		}
	}
}
