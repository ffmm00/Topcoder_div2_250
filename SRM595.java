public class SRM595 {

	public int getNumber(String S) {

		int max = 0;
		int c = 1;

		for (int i = 0; i < S.length() - 1; i++) {
			if (S.charAt(i) == S.charAt(i + 1)) {
				c++;
			} else {
				max = Math.max(max, c);
				c = 1;
			}
		}

		max = Math.max(max, c);

		return S.length() - max;
	}

}
