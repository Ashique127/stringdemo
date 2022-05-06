package StringQueries;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 9 };
//		System.out.println("Even number is.........");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.println(a[i]);
//			}

		System.out.println("Odd num is................");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}
	}
}
