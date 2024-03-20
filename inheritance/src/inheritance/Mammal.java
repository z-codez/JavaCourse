package inheritance;

public class Mammal extends Animal {
	
	String furColor;
	
	public Mammal(String furColor) {
		this.furColor = furColor;
	}
	
	public void makeSound() {
		System.out.println("Mammal sound: mammal sound");
	}
}
