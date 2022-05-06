package javapracone;

public class SaturdayNovThirteenFour {

	public static void main(String[] args) {

		// 14. Prime Number
		int num = 7;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a prime number");
			}
		}
		// 15. Equals and Equal Ignore Case
		String actual = "I love LA";
		String expected = "I Love LA";
		boolean y = actual.equalsIgnoreCase(expected);
		System.out.println(y);
		String actual1 = "I am here";
		String expected1 = "I am here";
		boolean x = actual1.equals(expected1);
		System.out.println(x);

	}

}
