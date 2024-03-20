package enumsExercises;

import java.io.Serializable;

public class Passenger implements Serializable{
	
	
	private String passengerName;
	private SeatClass seatClass;
	private double ticketPrice;
	
	public Passenger(String passengerName, SeatClass seatClass, double ticketPrice) {
		this.passengerName = passengerName;
		this.seatClass = seatClass;
		this.ticketPrice = ticketPrice;
	}
	
	public String getName() {
		return passengerName;
	}
	
	public double getPrice() {
		return ticketPrice;
	}

	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", seatClass=" + seatClass + ", ticketPrice=" + ticketPrice
				+ "]";
	}	
}