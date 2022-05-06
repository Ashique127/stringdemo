package StringQueries;

import java.util.Scanner;

public class MultiplicationsT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++)
			System.out.println(i + "X" + n + "=" + i * n);

	}

}
