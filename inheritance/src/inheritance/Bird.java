package inheritance;

public class Bird extends Animal{
	
	String featherColor;
	
	public Bird(String featherColor) {
		this.featherColor = featherColor;
	}
	
	public void makeSound() {
		System.out.println("Bird sound is Bird sound");
	}

}
