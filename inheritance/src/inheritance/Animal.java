package inheritance;

public class Animal {
	
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void makeSound() {
		
		System.out.println("Animal's sound: Animal sound");
	}
	
	public void displayInfo() {
		System.out.println("The animal's info: -----------" + this.getClass());
		System.out.println("The animal's name is: "+ name);
		System.out.println("The animal's age is: "+ age);
		this.makeSound();
	}
}
