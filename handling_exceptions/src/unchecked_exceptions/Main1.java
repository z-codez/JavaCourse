package unchecked_exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
		books.add("Book1");
		books.add("Book2");
		books.add("Book3");
		books.add("Book4");
		books.add("Book5");
		
		
		LibraryCatalog lib = new LibraryCatalog(books);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the library");
		System.out.println("Please search for a book using index 1 - 5");
		
		int index = scanner.nextInt();
		lib.searchBook(index - 1);
		
		scanner.close();
		

	}
}

class LibraryCatalog {
	 ArrayList<String> bookTitles = new ArrayList<>();

	public LibraryCatalog(ArrayList<String> bookTitles) {
		
		this.bookTitles = bookTitles;
	}
	
	void searchBook(int index) {
		try {
			String title = bookTitles.get(index);
			System.out.println("The title is : " + title);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Try again, index exceeds the number of books available");
		}
	}	
}
