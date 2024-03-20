package inheritance;

public class Vehicle {
	
	String brand;
	String model;
	int year;
	
	public void setBrand(String brand) {
		
		this.brand = brand;
		
	}
	
	public void setModel(String model) {
		
		this.model = model;
	}
	
	public void setYear(int year) {
		
		this.year = year;
	}
	
	public void displayInfo() {
		
		System.out.println("The vehicle brand is " + brand);
		System.out.println("The vehicle model is " + model);
		System.out.println("The vehicle year is " + year);
		
	}
}
