package inheritance;

public class Employee {
	
	String name;
	int employeeID;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public void calculateSalary() {}
	
	public void displayInfo() {
		System.out.println(name + " has employee Id no: " + employeeID);
		calculateSalary();
		
	}

}
