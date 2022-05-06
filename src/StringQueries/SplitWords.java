package StringQueries;

public class SplitWords {

	public static void main(String[] args) {
		String str = "Java, Selenium, TestNG, Maven";
		String parts[] = str.split(",");
		for (int i = 0; i < parts.length; i++) {
			System.out.println("-------> " + parts[i]);
		}
	}

}
