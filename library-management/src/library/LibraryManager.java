package library;

import java.util.Scanner;

public class LibraryManager {

	public static void main(String[] args) {
		LibraryManager libMan = new LibraryManager();
		Library lib = new Library();
		
		Scanner scanner = new Scanner(System.in);
		
		LibraryMember[] members = {
				new LibraryMember("Emma", "e.yahoo.com", 1001),
				new LibraryMember("Vita", "v.yahoo.com", 1002),
				new LibraryMember("Precious", "p.yahoo.com", 1003),
				new LibraryMember("David", "d.yahoo.com", 1004),
				new LibraryMember("Christian", "c.yahoo.com", 1005),
				new LibraryMember("Michael", "m.yahoo.com", 1006),
				new LibraryMember("Sergey", "s.yahoo.com", 1007),
				new LibraryMember("Svetlana", "svet.yahoo.com", 1008),
				new LibraryMember("Ariana", "ari.yahoo.com", 1009),
				new LibraryMember("Nina", "nina.yahoo.com", 1010)
		};
		
		lib.addMember(members);
		
		libMan.menu(scanner, lib);
		
		
		
		

	}
	
	public void menu(Scanner scanner, Library lib)  {
		
		System.out.println("Welcome to the library ------\n");
		
		while(true) {
			System.out.println("\nType in a number to use the library");
			System.out.println("1. Add a book");
			System.out.println("2. Checkout a book");
			System.out.println("3. Return a book");
			System.out.println("4. View available books");
			System.out.println("5. Exit\n");
			
			int option = scanner.nextInt();
			// This consumes the rest of the line.
			scanner.nextLine();
			
			if(option == 1) {
				System.out.println("What is the title?");
				String title = scanner.nextLine();

				System.out.println("Who is the author of the book?");
				String author = scanner.nextLine();
				
				lib.addBook(new Book(title, author));
			}
			else if (option == 2) {
				System.out.println("Please type in your memberID");
				int id = scanner.nextInt();
				// This consumes the rest of the line.
				scanner.nextLine();
				
				System.out.println("Which book would you like to read?");
				String title = scanner.nextLine();
				System.out.println(id);
				
				lib.checkoutBook(title, id);
			}
			
			else if (option == 3) {
				System.out.println("Which book would you like to return?");
				String title = scanner.nextLine();
				
				lib.returnBook(title);
			}
			
			else if (option == 4) {
				lib.displayAvailableBooks();
			}
			
			else {
				System.out.println("Exiting.....");
				scanner.close();
				return;
			}
		}
		
	}

}

