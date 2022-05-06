package javapracone;

import java.util.Scanner;

public class SaturdayNovThirteenTwo {

	public static void main(String[] args) {

		// 8. Summing Array
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Summing of Array:" + sum);

		// 9. Trim
		String Name = "   Rahman   ";
		String x = Name.trim();
		System.out.println(x);

		// 10. Reverse a Number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number and see the magic:");
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse a number is:" + rev);
		// 11. CharAt
		String ch = "ASHEQUR";
		char t = ch.charAt(5);
		System.out.println(t);
		// 12. Multiplication
		Scanner ssc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = ssc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "X" + n + "=" + i * n);
		}
	}
}
