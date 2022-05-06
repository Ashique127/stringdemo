package StringQueries;

public class ReverseandPal {

	public static void main(String[] args) {
		String str = "MADAM";
		String org_str = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println("Reverse value is:" + rev);
		if (org_str.equals(rev)) {
			System.out.println(org_str + "  This is a Palindome");
		} else {
			System.out.println(org_str + " This is not a Palindome");
		}
	}

}
