package stringfirstdemo;

public class SummingArray {

	public static void main(String[] args) {
		int a[] = { 3, 2, 8, 7, 6 };
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of array elements:" + sum);
	}

}
