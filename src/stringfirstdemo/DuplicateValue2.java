package stringfirstdemo;

public class DuplicateValue2 {

	public static void main(String[] args) {
		String str = new String("automation");
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate value in this word:" + ch[j]);
					count++;
				}

			}
		}
		System.out.println("Duplicate character in count:" + count);
	}

}
