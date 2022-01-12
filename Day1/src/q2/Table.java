package q2;

//2. Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown using 
//two nested for-loops

public class Table {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}			
	}
}
