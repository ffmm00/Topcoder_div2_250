public class SRM580 {

	public int count(int[] s, int[] t) {

		int c = 0;

		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (!(s[i] < s[j] && t[i] < s[j] || s[i] > t[j])) {
					c++;
				}
			}
		}

		return c;
	}

}
