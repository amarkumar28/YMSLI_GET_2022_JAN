package q3;

import java.util.List;

public class BookCollection {
	private String ownerName;
	private List<Book> arrayOfBooks;
	
	public BookCollection(String ownerName, List<Book> arrayOfBooks) {
		this.ownerName = ownerName;
		this.arrayOfBooks = arrayOfBooks;
	}
	
	@Override
	public String toString() {
		Book.printBook(arrayOfBooks);
		return "OwnerName=" + ownerName;
	}

	public boolean hasBook(Book b) {
		boolean present=false;
		for(Book book: arrayOfBooks) {
			if(book.getBookAuthor()==b.getBookAuthor() && book.getBookName() == b.getBookName()) {
				present=true;
			}
		}
		return present;
	}
}
