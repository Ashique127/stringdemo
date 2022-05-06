package StringQueries;

public class StartAndEnds {

	public static void main(String[] args) {
		String myname = "Ashequr Rahman";
		boolean t = myname.startsWith("Ashequr");
		System.out.println("If my name start with Ashequr test case passed:" + t);
		String name = "Ashequr Rahman";
		boolean t1 = myname.endsWith("Ashequr");
		System.out.println("If my endsWith: " + t1);
	}

}
