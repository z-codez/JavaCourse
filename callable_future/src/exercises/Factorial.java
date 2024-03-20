package exercises;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Factorial {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type in a number:");
		
		int number = scanner.nextInt();
		if (number < 0) {
			System.err.println("Please enter a positive integer");
		} else {
			Future<Long> factorial = exec.submit(new Callable<Long>() {

				@Override
				public Long call() throws Exception {
					

					
					System.out.println("\nCalculating the factorial of " + number + " in progress...");

					Long factoredNumber = 1L;
					
					int num = number;
					
					while (num > 1) {
						factoredNumber *= num;
						num--;
					}
					return factoredNumber;

				}
			});

			try {
				long result = factorial.get();
				System.out.println("Factorial is: " + result);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			exec.shutdown();

			try {
				exec.awaitTermination(1, TimeUnit.HOURS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		scanner.close();
	}
}
