package javapracticeone;

public class StringFiveD {

	public static void main(String[] args) {
		// prime num
		int num = 7;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("This is a prime num");

			} else {
				System.out.println("This is not a prime");
			}

		}
	}

}
