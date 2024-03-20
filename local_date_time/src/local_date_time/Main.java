package local_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		ZoneId myZone = ZoneId.of("Europe/Berlin");
		LocalDateTime currentDateTime = LocalDateTime.now(myZone);
		System.out.println("Before formatting: "+ currentDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern
				("dd-MM-yy HH:mm:ss.ns");
		
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("After formatting: " + formattedDateTime);
		

	}

}
