package q3;

import java.util.List;

public class Book {
	private String bookName;
	private int bookId;
	private String bookAuthor;

	public Book(String bookName, int bookId, String bookAuthor) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "bookName=" + bookName + ", bookId=" + bookId + ", bookAuthor=" + bookAuthor;
	}
	public static void printBook(List<Book> arrayOfBooks) {
		for(Book book:arrayOfBooks) {
			System.out.println(book);
		}
	}
	public String getBookName() {
		return bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}
}
