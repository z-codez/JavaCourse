package library;

public class LibraryMember extends Person{
	
	int libraryID;

	public LibraryMember(String name, String email, int libraryID) {
		super(name, email);
		this.libraryID = libraryID;
	}

	@Override
	public String toString() {
		return "LibraryMember [libraryID=" + libraryID + "]";
	}
	
	
}
