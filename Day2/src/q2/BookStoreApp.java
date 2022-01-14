package q2;

public class BookStoreApp {

	public static void main(String[] args) {
		BookStore bookStore=new BookStore();
		bookStore.display();
		bookStore.order("A123", 5);
		bookStore.order("A153", 5);
		bookStore.sell("King", 5);
		bookStore.display();
	}
}
