package stringpractice;

public class StringNumSwap {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
//		int t = a;
//		a = b;
//		b = t;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of String" + a + "  " + b);

	}

}
