package library;

import java.util.Random;

public class Book {
	
	Random random = new Random();
	
	String title;
	String author;
	int ISBN = random.nextInt(1000, 1500);
	boolean isAvailable = true;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", isAvailable=" + isAvailable + "]";
	}
	
	
}
