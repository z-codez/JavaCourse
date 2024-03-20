package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		ShoppingList list = new ShoppingList();
		
		System.out.println("Welcome to your Shopping List");
		
		String[] options = {"1. Add an item", "2. Remove an item", "3. Display the list", "4. Exit"};
		
		
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		
		do {
			System.out.println("Please select an option: 1, 2, 3 or 4");
			for(String option : options) System.out.println(option);
			ans = scanner.nextInt();
			
			if (ans == 1) list.addItem(shoppingList, scanner);
			if (ans ==2) list.removeItem(shoppingList, scanner);
			if (ans == 3) list.displayList(shoppingList);
			else {
				System.out.println("Wrong input! Try again");
				break;
			}
			
		} while(ans != 4);
		
		scanner.close();
		
		// ArrayLists can be resized while Arrays cannot be
		// ArrayList<Integer> arrList = new ArrayList<>();
		
		// arrList.add(9);
		// arrList.add(18);
		// arrList.add(27);
		// arrList.add(36);
		
		// arrList.remove(0);
		// arrList.clear();
		
		// System.out.println(arrList.get(0));
		
		//Prints all the elements in an ArrayList.
		/*
		for(Integer n : arrList) {
			System.out.println(n);
		}
		*/
		// Using ArrayList with custom Objects and Classes
		
		/*
		 * ArrayList<Car> cars = new ArrayList<>();
		 * 
		 * cars.add(new Car("Tesla")); cars.add(new Car("Volvo")); cars.add(new
		 * Car("Renault")); cars.add(new Car("Mercedes"));
		 * 
		 * System.out.println(cars.get(0));
		 * 
		 * for(Car car : cars) { System.out.println(car); }
		 */
	}

}
