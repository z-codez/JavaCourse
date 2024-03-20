package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

	public void addItem(ArrayList<String> list, Scanner scanner) {

		System.out.println("What would you like to add to your shopping list?");

		list.add(scanner.next());

		System.out.println("Would you like to add more items? Yes or No");
		String ans = scanner.next();

		if (ans.equals("Yes")) {
			this.addItem(list, scanner);
		} else if (ans.equals("No")) {

			System.out.println("Your item was added successfully!!!");
			System.out.println();

		}

	}

	public void removeItem(ArrayList<String> list, Scanner scanner) {

		System.out.println("What would you like to remove from your shopping list?");

		if (list.remove(scanner.next())) {

			System.out.println("Would you like to remove more items? Yes or No");

			String ans = scanner.next();

			if (ans.equals("Yes")) {
				this.removeItem(list, scanner);
			} else if (ans.equals("No")) {

				System.out.println("The item is no longer in the list!!!");
				System.out.println();

			}
		} else {
			System.out.println("This item was not found, please try again");
		}
	}

	public void displayList(ArrayList<String> list) {
		System.out.println("Your Shopping List:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		System.out.println();
	}

}
