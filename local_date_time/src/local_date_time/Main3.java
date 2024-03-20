package local_date_time;

import java.time.LocalDate;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Get a date in the future...\n");
		
		System.out.println("Type in a starting date, YYYY-MM-DD");
		LocalDate startDate = LocalDate.parse(scanner.next());
		
		System.out.println("Type in number of days in figures");
		
		LocalDate futureDate = startDate.plusDays(scanner.nextInt());
		
		System.out.println("The future date is: " +futureDate);
		
		scanner.close();
	}
}
