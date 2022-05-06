package StringQueries;

public class EvenOddEnhanceForLoop {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
//		System.out.println("Even num.................");
//		for (int value : a) {
//			if (value % 2 == 0) {
//				System.out.println(value);
		System.out.println("Odd num.................");
		for (int value : a) {
			if (value % 2 != 0) {
				System.out.println(value);
			}
		}

	}

}
