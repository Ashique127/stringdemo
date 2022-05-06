package StringQueries;

public class FibonociNumT {

	public static void main(String[] args) {
		int N1 = 0, N2 = 1, Sum = 0;
		System.out.println(N1 + " " + N2);

		for (int i = 2; i < 10; i++) {
			Sum = N1 + N2;
			N1 = N2;
			N2 = Sum;
			System.out.print(" " + Sum);
		}

	}

}
