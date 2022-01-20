package q3;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return arg0.getBookName().compareTo(arg1.getBookName());
	}

}
