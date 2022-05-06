import java.util.HashSet;

public class MissingNum {

	public int solution(int[] A) {

		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i <= A.length + 1; i++) {
			nums.add(i);
		}

		for (int a : A) {
			nums.remove(new Integer(a));
		}
		return nums.iterator().next();
	}

	public static void main(String[] args) {

		MissingNum mi = new MissingNum();
		System.out.println(mi.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
	}

}
