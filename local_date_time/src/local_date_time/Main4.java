package local_date_time;

import java.time.LocalDate;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
	
		System.out.println("Type in a date, YYYY-MM-DD");
		
		Scanner scanner = new Scanner(System.in);
		
		String dateString = scanner.next();
		scanner.close();
		
		LocalDate date = LocalDate.parse(dateString);
		
		int day = date.getDayOfWeek().getValue();
		
		if (day == 1) {System.out.println("Day of the week is Monday");}
		else if (day == 2) {System.out.println("Day of the week is Tuesday");}
		else if (day == 3) {System.out.println("Day of the week is Wednesday");}
		else if (day == 4) {System.out.println("Day of the week is Thursday");}
		else if (day == 5) {System.out.println("Day of the week is Friday");}
		else if (day == 6) {System.out.println("Day of the week is Saturday");}
		else if (day == 7) {System.out.println("Day of the week is Sunday");}
		else {System.out.println("Invalid input");}
	}
}
