package unchecked_exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantOrderSystem {

	public static void main(String[] args) {
		ArrayList<OrderedItem> orders = new ArrayList<>();
		
		ArrayList<MenuItem> menu = new ArrayList<>();
		menu.add(new MenuItem("Lasagna", 10.99));
		menu.add(new MenuItem("Tiramisu", 7.89));
		menu.add(new MenuItem("Magarita", 11.59));
		menu.add(new MenuItem("Bolognese", 7.89));
		menu.add(new MenuItem("Pizza Hawaii", 12));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Menu");

		int input = 0;

		do {
			
			System.out.println("Choose an option from 1 - 4\n");
			System.out.println("1. View the menu and prices");
			System.out.println("2. Place an order");
			System.out.println("3. Calculate and display the total bill");
			System.out.println("4. EXIT");
			try {
				input = scanner.nextInt();
				
			} catch(Exception e) {
				System.out.println("Please enter a number");
				break;
			}
			
			menuControl(scanner, input, orders, menu);

		} while (input != 4);
		scanner.close();
		System.out.println("Exiting..");
	}

	public static void menuControl(Scanner scanner, int input,
			ArrayList<OrderedItem> orders, ArrayList<MenuItem> menu ) {
		try {
			if (input == 1) {
				int n = 1;
				for (MenuItem item : menu) {
					System.out.println(n + ". " + item);
					n++;
				}
			}
			if (input == 2) {
				
				boolean ans = true;
				
				while(ans) {
					System.out.println("What would you like to order? (1-5)");
					int item = scanner.nextInt();
					if (item > 5 || item < 1) {
						throw new Exception("Menu item not found");
					}
					System.out.println("Quantity?");
					int quantity = scanner.nextInt();
					
					MenuItem menuItem = menu.get(item-1);
					orders.add(new OrderedItem(menuItem, quantity));
					System.out.println(orders.get(0));
					
					System.out.println("\nOrder again, (true or false)");
					ans = scanner.nextBoolean();
					
				}
				System.out.println("\nOrder placed successfully");
			}

			if (input == 3) {
				if(orders.isEmpty()) {System.out.println("Empty");}
				double totalOrderPrice = 0.0;
				for(OrderedItem item : orders) {
					System.out.println(item);
					totalOrderPrice += item.totalPrice;
				}
				System.out.println("Total price :" + totalOrderPrice);
			}

		} catch (InputMismatchException e) {
			System.out.println("The input is invalid. Please type in a valid option");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.nextLine();
		}
	}
	
}

class MenuItem {

	String name;
	double price;

	public MenuItem(String name, double price) {

		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ": €" + price;
	}
}

class OrderedItem {
	String name;
	double totalPrice;
	int quantity;
	
	public OrderedItem(MenuItem item, int quantity) {
		this.name = item.name;
		this.quantity = quantity;
		this.totalPrice = item.price * quantity;
	}
	
	@Override
	public String toString() {
		return quantity + " "+ name +" totals: $" + totalPrice;
	}
}
