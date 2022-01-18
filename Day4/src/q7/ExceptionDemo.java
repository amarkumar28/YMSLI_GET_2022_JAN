package q7;

import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionDemo {
	
	public static void throwException() {
		throw new InputMismatchException();
	}
	
	public static void main(String[] args) {
		throwException();
	}
}