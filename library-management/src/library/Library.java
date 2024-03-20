package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books = new ArrayList<>();
	
	private ArrayList<LibraryMember> members = new ArrayList<>();
	
	// methods to adds members to the Library
	public void addMember(LibraryMember member) {
		members.add(member);
		
	}
	
	// overloaded method to add an array of members
	public void addMember(LibraryMember[] membersToAdd) {
		
		for (LibraryMember mem : membersToAdd) {
			members.add(mem);
		}
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println(book.title + " has been added to the library successfully\n");
	}
	
	public void checkoutBook(String bookTitle, int memberID) {
		
		for(LibraryMember member : members ) {
			if (memberID == member.libraryID) {
				for(Book book : books) {
					if(bookTitle.equals(book.title)) {
						if(book.isAvailable) {
							System.out.println("Book is available. You can check it out");
							book.isAvailable = false;
						} else {
							System.out.println("Book is not available, please try again later");
						}
						return;
					} 
				}
				throw new WrongIDException("This is an invalid ID!! try again");
			}
		}
		throw new WrongTitleException("This book cannot be found. Check the title and try again");
		
	}
	
	public void returnBook(String bookTitle) {
		for(Book book : books) {
			if(bookTitle.equals(book.title)) {
				book.isAvailable = true;
				break;
			}
		}
		System.out.println("Book has been returned successfully");
	}
	
	public void displayAvailableBooks() {
		int countAvailableBooks = 0;
		for(Book book : books) {
			if(book.isAvailable) {
				countAvailableBooks++;
				System.out.println(book);
			}
		}
		if (countAvailableBooks == 0) {
			System.out.println("Unfortunately, there are no books "
					+ "available at the moment. Try again later.");
		}
	}
	
}

class WrongIDException extends RuntimeException {

	public WrongIDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class WrongTitleException extends RuntimeException {

	public WrongTitleException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}