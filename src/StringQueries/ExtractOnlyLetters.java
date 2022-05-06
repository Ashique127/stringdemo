package StringQueries;

public class ExtractOnlyLetters {

	public static void main(String[] args) {
		String input = "aBd13$323dJek";
		System.out.println(input.replaceAll("[$, 0-9]", ""));

	}

}
