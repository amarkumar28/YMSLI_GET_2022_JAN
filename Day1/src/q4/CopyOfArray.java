package q4;

public class CopyOfArray {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		System.out.print("Array 1 :");
		for (int temp : array1) {
			System.out.print(temp + " ");
		}
		int array2[] = copyOf(array1);
		System.out.print("\nArray 2 :");
		for (int temp : array2) {
			System.out.print(temp + " ");
		}
	}

	private static int[] copyOf(int[] array1) {
		int array2[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		return array2;
	}
}
