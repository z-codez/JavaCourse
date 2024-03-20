package local_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.minusDays(1));
		System.out.println(date.plusDays(1));
		
		LocalDate date1 = LocalDate.of(2023, 2, 24);
		System.out.println(date1.isLeapYear());
		
		boolean b = LocalDate.of(2020, 7, 16).isLeapYear();
		System.out.println(b);
		
		LocalDate date3 = LocalDate.of(2023, 9, 1);
		
		LocalDateTime dateTime = date3.atTime(1, 43, 8); // available only in LocalDateTime class
		System.out.println(dateTime);
		
		//Converting LocalDate object into String
		LocalDate date4 = LocalDate.now();
		String convertedToString = date4.format(DateTimeFormatter.ISO_DATE);
		System.out.println(convertedToString);
		
		
		//Converting a String to LocalDate
		
		String stringDate = "2020-12-12";
		LocalDate date5 = LocalDate.parse(stringDate);
		System.out.println(date5);
	}

}
