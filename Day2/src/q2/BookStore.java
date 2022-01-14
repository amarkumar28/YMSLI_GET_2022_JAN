package q2;
import java.util.Scanner;

public class BookStore {
	Book books[]=new Book[10];
	private int bookCount;
	Scanner scanner=new Scanner(System.in);
	BookStore(){}
	
	public void sell(String bookTitle,int numOfCopies) {
		System.out.println("count :" + bookCount);
		for(int i=0;i<bookCount;i++) {
			if(books[i].getBookTitle().equals(bookTitle)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()-numOfCopies);
				return;
			}
		}
		System.out.println("Book not found !!");
	}
	public void order(String isbn, int numCopies) {
		for(int i=0;i<bookCount;i++) {
			if(books[i].getISBN().contentEquals(isbn)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()+numCopies);
				return;
			}
		}
		System.out.println("Book ISBN : "+ isbn);
		System.out.println("No. of copies : " + numCopies);
		System.out.print("Enter book title : ");
		String newBookTitle=scanner.next();
		System.out.print("Enter book author : ");
		String newAuthor=scanner.next();
		Book tempBook=new Book(newBookTitle,newAuthor,isbn,numCopies);
		books[bookCount++]=tempBook;
		System.out.println("Book added !!");
	}
	public void display() {
		for(int i=0;i<bookCount;i++) {
			System.out.println("---------");
			books[i].display();
			System.out.println("---------");
		}
		
	}
}
