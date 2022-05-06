package javapracticeone;

public class StringTwoD {

	public static void main(String[] args) {
		// 1. Swap
		int a = 10;
		int b = 5;
		int t = a;
		a = b;
		b = t;
		System.out.println("Swap number:" + a + "  " + b);
		// 2. duplicate value
		String str = new String("institute");
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Dup Value:" + ch[j]);
					count++;
				}
			}
		}
		System.out.println("String dup count:" + count);
		// 3. Palindome
		String ss = "madam";
		String org_ss = ss;
		String rev = "";
		int len = ss.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + ss.charAt(i);
		}
		System.out.println("Reverse value is:" + rev);
		if (org_ss.equals(rev)) {
			System.out.println("This is a palindome");
		} else {
			System.out.println("This is not a palindome");
		}
		// 4. String to int
		String srt = "125";
		int num = Integer.parseInt(srt);
		System.out.println(num);
		// 5. Fibonacci num
		int N1 = 0, N2 = 1, Sum = 0;
		System.out.println(N1 + " " + N2);
		for (int i = 2; i < 10; i++) {
			Sum = N1 + N2;
			N1 = N2;
			N2 = Sum;
			System.out.print(" " + Sum);
			// 6.
			String mynumm = "Ashequr Rahman";
			boolean t1 = mynumm.startsWith("Ashequr");
			// System.out.println("Startswith:" + t1);
			// 7. Summary array
			int x[] = { 3, 5, 7, 8, 9 };
			int sume = 0;
			for (int j = 0; j <= x.length - 1; j++) {
				sume = sume + x[j];
			}
			System.out.println("Sum of array:" + sume);

		}

	}

}
