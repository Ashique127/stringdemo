package StringQueries;

public class SwapNumO {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int t = a;

		a = b;
		b = t;
//		a = a + b; // Sum=10+20=30
//		b = a - b; // 30-20=10;
//		a = a - b; // 30-10=20

		System.out.println("After swaping values:" + a + "  " + b);
	}

}
