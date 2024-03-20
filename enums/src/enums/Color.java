package enums;

public enum Color {
	RED("Love"),
	GREEN("Health"),
	ORANGE,
	BLUE("Calm");
	
	String meaning;
	
	Color() {}
	
	Color(String meaning) {
		this.meaning = meaning;
	}
}
