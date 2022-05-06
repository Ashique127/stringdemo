package javapracone;

public class SaturdayNovThirteen {

	public static void main(String[] args) {

		// 1. Swap num
		int a = 10;
		int b = 5;
		int t = a;
		a = b;
		b = t;
		System.out.println("After:" + a + " " + b);
		// 2. Even Odd
		for (int i = 1; i < 20; i = i + 2)
			System.out.println(i);
		// 3. Reverse & Palindome
		String str = "nitin";
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
		// 4. Duplicate String
		String sstr = new String("automation");
		int count = 0;
		char[] ch = sstr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate value is:" + ch[j]);
					count++;
				}
			}
		}
		System.out.println("Total Dup:" + count);
		// 5. String to int conversion
		String STR = "125";
		int number = Integer.parseInt(STR);
		System.out.println("Converted number:" + number);

		// 6. Fibonoci Number
		int N1 = 0, N2 = 1, Sum = 0;
		System.out.println(N1 + " " + N2);
		for (int i = 2; i < 10; i++) {
			Sum = N1 + N2;
			N1 = N2;
			N2 = Sum;
			System.out.println(" " + Sum);
		}
		// 7. Starts with and Endswith
		String mynum = "Ashequr Rahman";
		boolean tttt = mynum.startsWith("Ashequr");
		System.out.println("Startswith:" + tttt);
		boolean ew = mynum.endsWith("Rahman");
		System.out.println("Endswith:" + ew);

	}

}
