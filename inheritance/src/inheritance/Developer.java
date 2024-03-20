package inheritance;

public class Developer extends Employee{
	
	double hourlyRate;
	int hoursWorked;
	
	public Developer(double hourlyRate, int hoursWorked) {
		
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void calculateSalary() {
		
		double salary = hourlyRate * hoursWorked;
		System.out.println(name + "'s salary is: $" + salary); 
	}
}
