package enumsExercises;

public class Main {

	public static void main(String[] args) {
		
		var flight1 = new Flight();
		
		flight1.reserveSeat("Emmanuel Ez", SeatClass.BUSINESS_CLASS);
		flight1.reserveSeat("Leto Atreides", SeatClass.FIRST_CLASS);
		flight1.reserveSeat("Paul Letoson", SeatClass.BUSINESS_CLASS);
		flight1.reserveSeat("Vitaliya Parkomenkho", SeatClass.FIRST_CLASS);
		flight1.reserveSeat("Beatrice Johnson", SeatClass.ECONOMY_CLASS);
		flight1.reserveSeat("Vince Jameson", SeatClass.ECONOMY_CLASS);
		flight1.reserveSeat("Leanne Jameson", SeatClass.ECONOMY_CLASS);
		
		System.out.println(flight1.totalRevenue());
		
		flight1.cancelReservation("leanne jameson");
		
		flight1.displayPassengers();
		System.out.println();
		
		System.out.println(flight1.totalRevenue());
	}

}
