package stringpractice;

public class StringRevereseValue {

	public static void main(String[] args) {
		String str = "ABCDE";
		String reverse = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		System.out.println("Reverse Value is:" + reverse);

	}

}
