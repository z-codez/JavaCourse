package local_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("Type in your birthdate, YYYY-MM-DD");
		
		Scanner scanner = new Scanner(System.in);
		
		String dateString = scanner.next();
		scanner.close();
		
		LocalDate birthDate = LocalDate.parse(dateString);
		System.out.println(LocalTime.now().getNano());
		int age = LocalDate.now().getYear() - birthDate.getYear();
		System.out.println(LocalTime.now().getNano());
		System.out.println("You are " + age + " years old.");
	}
}
