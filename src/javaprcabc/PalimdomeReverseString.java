package javaprcabc;

public class PalimdomeReverseString {

	public static void main(String[] args) {
		String Str = "MADAM";
		String org_str = Str;
		String rev = "";

		int len = Str.length();

		for (int i = len - 1; i >= 0; i--)
			rev = rev + Str.charAt(i);
		System.out.println("Reverse a string:" + rev);

		if (org_str.equals(rev)) {
			System.out.println(org_str + ": This a palimdome ");
		} else {
			System.out.println(org_str + ": This is not a palimdom");
		}

	}

}
