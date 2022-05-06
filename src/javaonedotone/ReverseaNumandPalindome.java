package javaonedotone;

public class ReverseaNumandPalindome {

	public static void main(String[] args) {

		String str = "Kamal";
		String org_str = str;
		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println("Rev:" + rev);
		if (org_str.equals(rev)) {
			System.out.println(org_str + ": This is a palindome");
		} else {
			System.out.println(org_str + ": This is a not palindome");
		}

	}

}
