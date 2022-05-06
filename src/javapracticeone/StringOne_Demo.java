package javapracticeone;

public class StringOne_Demo {

	public static void main(String[] args) {
//1. Swap
		int a = 10;
		int b = 5;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap value:" + a + "    " + b);
//2. Dup

		String str = new String("institute");
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate value:" + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Duplicate count is:" + count);
		// 3. Reverse and palindome
		String ss = "madam";
		String rev = "";
		String org_ss = ss;
		int len = ss.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + ss.charAt(i);
		}
		System.out.println("Reverse value is:" + rev);
		if (org_ss.equals(rev)) {
			System.out.println("This is a palindome:" + org_ss);
		} else {
			System.out.println("This is not a palindoem:" + org_ss);
		}
		// 4. String to int
		String srtt = "125";
		int num = Integer.parseInt(srtt);
		System.out.println(num);
		// 5. Starts with and ends with
		String ttt = "Rakib Kab";
		boolean numm = ttt.startsWith("Rakib");
		System.out.println("Starts with:" + numm);
		boolean ew = ttt.endsWith("Kab");
		System.out.println("Ends with:" + ew);

	}
}
