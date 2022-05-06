package StringQueries;

public class ReverseStringOne {

	public static void main(String[] args) {
		String str = "ABCDE";// ?
		String reverse = "";// Ans

		int len = str.length();// 5
		// System.out.println(str.length());

		for (int i = len - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		System.out.println("Reverse value is:" + reverse);
	}

}
