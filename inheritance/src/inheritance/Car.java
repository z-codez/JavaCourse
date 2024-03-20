package inheritance;

public class Car extends Vehicle {
	
	int doors = 4;
	
	public void displayInfo() {
	
		System.out.println("\n----------------------------");
		System.out.println("The car's brand is " + brand);
		System.out.println("The car's model is " + model);
		System.out.println("The car's year is " + year);
		System.out.println("The car's doors are " + doors);
	}
}
