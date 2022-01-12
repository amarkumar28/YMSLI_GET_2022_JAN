package q5;

public class Pattern {

	public static void main(String[] args) {
		int num=8;
		pattern(num);
	}

	private static void pattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
