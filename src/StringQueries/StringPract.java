package StringQueries;

public class StringPract {

	public static void main(String[] args) {
		// 1.
		int a = 10;
		int b = 5;
		int t = a;
		a = b;
		b = t;
		System.out.println("After swap:" + a + " " + b);
		// 2.
		String str = "madam";
		String org_str = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println("Reverse value:" + rev);
		if (org_str.equals(rev)) {
			System.out.println("This is a palindome:" + org_str);
		} else {
			System.out.println("This is not:" + org_str);
		}
		// 3.
		String sstr = "institute";
		int count = 0;
		char[] ch = sstr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Dup:" + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Total Dup:" + count);
		// 4.
		String sr = "125";
		int num = Integer.parseInt(sr);
		System.out.println("number:" + num);

	}
}
