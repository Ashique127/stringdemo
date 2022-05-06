package javapracticeone;

public class StringFour {

	public static void main(String[] args) {
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