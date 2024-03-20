package enums;

public class Main {
	
	public static void main(String[] args) {
		
		Color color = Color.GREEN;
		
		for(Color colors : Color.values()) {
			System.out.println(colors.meaning);
		}
		
		
		switch(color) {
		case BLUE:
			break;
		case GREEN:
			break;
		default:
			break;
		}
	}
}
