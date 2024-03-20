package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager(7000.0, 1200.0);
		Developer developer = new Developer(15.20, 161);
		
		manager.setID(100001);
		manager.setName("Vita");
		
		developer.setID(100010);
		developer.setName("Emmanuel");
		
		manager.displayInfo();
		System.out.println();
		developer.displayInfo();
		
	}
}

