package inheritance;

public class Bicycle extends Vehicle{
	
	int wheels = 2;
	
	public void displayInfo() {
		
		System.out.println("The bicycle's brand is " + brand);
		System.out.println("The bicycle's model is " + model);
		System.out.println("The bicycle's year is " + year);
		System.out.println("The bicycle's wheels are " + wheels);
	}
}
