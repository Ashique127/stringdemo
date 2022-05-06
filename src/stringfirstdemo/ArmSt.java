package stringfirstdemo;

public class ArmSt {

	public static void main(String[] args) {
		int t = 153;
		int temp = t;
		int r, sum = 0;
		while (t > 0) {
			r = t % 10;
			t = t / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("This is a armstorm num");

		} else {
			System.out.println("This is not a arm strong num");
		}

	}

}
