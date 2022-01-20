package q3;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		List<Book> arrayBook=new ArrayList<>();
		arrayBook.add(new Book("Java Programming", 1234 , "Rajeev Gupta"));
		arrayBook.add(new Book("Java Coding", 134 , "Amar kumar"));
		arrayBook.add(new Book("C Coding", 234 , "Naresh kumar"));
		arrayBook.add(new Book("Python Coding", 12334 , "Japanese kumar"));
		
		BookCollection bookCollection=new BookCollection("Abhijeet",arrayBook);
		System.out.println(bookCollection);
		System.out.println("-----------------");
		
		System.out.println("Sort By Author Name : ");
		Collections.sort(arrayBook, new SortByAuthorName());
		System.out.println(bookCollection);
		System.out.println("-----------------");
		
		System.out.println("Sort By Book Name : ");
		Collections.sort(arrayBook, new SortByTitle());
		System.out.println(bookCollection);
		System.out.println("-----------------");
		
		System.out.println("\nIs abhijeet has Java Coding book : ?");
		System.out.println("Answer is : " + bookCollection.hasBook(new Book("Java Coding", 1234 , "Amar kumar")));
		
	}
}
