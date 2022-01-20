package q3;

import java.util.Comparator;

public class SortByAuthorName implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return arg0.getBookAuthor().compareTo(arg1.getBookAuthor());
	}

}
