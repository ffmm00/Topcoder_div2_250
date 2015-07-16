public class SRM605 {

	public int getNumber(String S) {

		int c = 1;
		char[] s = S.toCharArray();

		for (int i = 0; i < S.length() - 1; i++) {
			if (s[i] != s[i + 1]) {
				c++;
			}
		}

		return c;
	}

}
