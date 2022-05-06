package stringfirstdemo;

public class Equal_EqualIgnoreCase {

	public static void main(String[] args) {
		String actual = "I love Bangladesh";
		String expected = "I love Bangladesh";
		boolean y = actual.equals(expected);
		System.out.println(y);

		String actual1 = "I love selenium";
		String expected1 = "I love Selenium";
		boolean t1 = actual1.equalsIgnoreCase(expected1);

		System.out.println(t1);
	}

}
