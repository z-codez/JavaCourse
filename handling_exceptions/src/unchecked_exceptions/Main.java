package unchecked_exceptions;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Add a product to the list.....");

		boolean ans = false;

		do {
			// Get product id
			System.out.println("What is the product id?");
			int id = scanner.nextInt();

			// get productName
			System.out.println("What is the name of the product?");
			String name = scanner.next();

			// get price
			System.out.println("How much does " + name + " cost?");
			double price = scanner.nextDouble();

			// put product into inventory
			inventory.addProduct(new Product(id, name, price));
			System.out.println("You would like to add more items, (true or false)");

			try {
				ans = scanner.nextBoolean();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input\n");
				ans = true;
				// This is used to consume previous unconsumed input
				scanner.nextLine();
			}

		} while (ans);

		boolean answer = false;

		do {
			System.out.println("Which product would you like to see?");
			System.out.println("What is the product id?");

			inventory.getProduct(scanner.nextInt());
			System.out.println("\nWould you like to see more products, (true or false)");
			answer = scanner.nextBoolean();

		} while (answer);

		scanner.close();
	}

}

class Product {
	int productId;
	String productName;
	double productPrice;

	// Public constructor to initialize Product attributes
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [Id: " + productId + ", Name: " + productName + ", Price: €" + productPrice + "]";
	}
}

class Inventory {
	HashMap<Integer, Product> inventoryMap = new HashMap<>();

	void addProduct(Product product) {
		inventoryMap.put(product.productId, product);
		System.out.println("The product has been added successfully\n");
	}

	void getProduct(int productId) {
		Product product = inventoryMap.get(productId);

		try {
			if (product == null) {
				throw new NullPointerException("Product not found. Please add the product..");
			}

			System.out.println(product.productId);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	void getInventory() {
		for (Product product : inventoryMap.values()) {
			System.out.println(product);
		}
	}
}
