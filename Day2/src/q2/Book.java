package q2;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
	public void display() {
		System.out.println("Book title : "+bookTitle);
		System.out.println("Book author : "+author);
		System.out.println("Book ISBN : "+ISBN);
		System.out.println("No. of copies : "+numOfCopies);
	}
}
