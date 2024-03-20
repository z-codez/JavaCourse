package inheritance;

public class Manager extends Employee {
	
	double baseSalary;
	double bonus;
	
	public Manager(double baseSalary, double bonus) {
		
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	
	@Override
	public void calculateSalary() {
		
		double salary = baseSalary + bonus;
		System.out.println(name + "'s salary is: $" + salary);
		
	}
}
