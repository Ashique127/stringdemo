package javapracone;

public class SaturdayNovThirteenThree {

	public static void main(String[] args) {
		// 13. Armstrong Number
		int p = 153;
		int tempp = p;
		int r, summ = 0;
		while (p > 0) {
			r = p % 10;
			p = p / 10;
			summ = summ + r * r * r;
		}
		if (tempp == summ)
			System.out.println("It's a armstrong number");
		else
			System.out.println(" This is not a armstrong number");

	}

}
