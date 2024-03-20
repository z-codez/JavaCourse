package package3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		InventoryManager manager = new InventoryManager();
		Product product = new Product();
		Equipment equipment = new Equipment();
		
		manager.addItem(1800, equipment);
		manager.addItem(1800, product);
		
		manager.removeItem(800, product);
		
		manager.displayInventory();

	}
}
interface InventoryItem {
	void addToInventory(int quantity);
	void removeFromInventory(int quantity);
	void display();
}

class Product implements InventoryItem {
	private int quantity;
	private final String NAME = "Bugatti";
	private final double UNIT_PRICE = 2000000;
	@Override
	public void addToInventory(int quantity) {
		this.quantity += quantity;
		
	}
	@Override
	public void removeFromInventory(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public void display() {
		System.out.println("\nEquipment name: " + NAME);
		System.out.println("Price per unit: €" + UNIT_PRICE);
		System.out.println("Available quantity: "+ this.quantity);
	}
}

class Equipment implements InventoryItem {
	private int quantity;
	private final String NAME = "Cup holder";
	private final double UNIT_PRICE = 1000;
	@Override
	public void addToInventory(int quantity) {
		this.quantity += quantity;
		
	}
	@Override
	public void removeFromInventory(int quantity) {
		this.quantity -= quantity;
		
	}

	public void display() {
		System.out.println("\nProduct name: " + NAME);
		System.out.println("Price per unit: €" + UNIT_PRICE);
		System.out.println("Available quantity: "+ this.quantity);
	}
}

class InventoryManager {
	private final ArrayList<InventoryItem> totalInventory = new ArrayList<>();
	
	void addItem(int quantity, InventoryItem item) {
		item.addToInventory(quantity);
		totalInventory.add(item);
	}
	void removeItem(int quantity, InventoryItem item) {
		item.removeFromInventory(quantity);
	}
	
	void displayInventory() {
		for (InventoryItem item: totalInventory) {
			item.display();
		}
	}
}
