package javapracticeone;

import java.util.Scanner;

public class StringThreeP {
	public static void main(String[] args) {
		// Reverse a num
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num and see magic:");
		int num = sc.nextInt();
		StringBuffer stbf = new StringBuffer(String.valueOf(num));
		StringBuffer rev = stbf.reverse();
		System.out.println("Reverse a number is:" + rev);
		// Char
		String ch = "Ashequr";
		char t = ch.charAt(3);
		System.out.println("Char at is:" + t);
		// Multiplication
		Scanner scc = new Scanner(System.in);
		System.out.println("Enetr any num and see magic:");
		int n = scc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "X" + n + "=" + i * n);
			// Aramstrong num
			int b = 407;
			int temp = b;
			int r, sut = 0;
			while (b > 0) {
				r = b % 10;
				b = b / 10;
				sut = sut + r * r * r;
			}
			if (temp == sut)
				System.out.println("This is an Armstrong num");
			else
				System.out.println("This is not an Armstrong num");
		}

	}
}
