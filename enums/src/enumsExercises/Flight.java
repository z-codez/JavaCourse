package enumsExercises;

import java.util.ArrayList;
import java.util.List;

public class Flight {
	
	private List<Passenger> passengers = new ArrayList<>();
	
	public void reserveSeat(String name, SeatClass seatClass) {
		
		switch(seatClass) {
		case FIRST_CLASS:
			passengers.add(new Passenger(name, seatClass, 999.5));
			break;
		case BUSINESS_CLASS:
			passengers.add(new Passenger(name, seatClass, 750.99));
			break;
		case ECONOMY_CLASS:
			passengers.add(new Passenger(name, seatClass, 450.53));
			break;	
		default:
			System.out.println("This seat class is not found.");
			break;
		}
		
		System.out.println("Seat has been reserved successfully");
	}
	
	public void cancelReservation(String name) {
		
		for(Passenger passenger: passengers) {
			if(passenger.getName().equalsIgnoreCase(name)) {
				passengers.remove(passenger);
				System.out.println("Your reservation has been cancelled!!!");
				return;
			}
		}
		
		System.out.println("No reservation with this name found");
	}
	
	public void displayPassengers() {
		passengers.forEach(System.out::println);
	}
	
	public double totalRevenue() {
		
		return passengers.stream()
		.mapToDouble(p -> p.getPrice())
		.sum();	
	}
}








