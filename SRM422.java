public class SRM422 {
	public static String check(int n) {

		String s = "" + n;
		int q = 1;
		int p = 1;
		int k = Integer.toString(n).length();

		if (k == 1)
			return "NO";

		for (int i = 0; i < k; i++) {
			q *= s.charAt(i) - '0';
			for (int j = i + 1; j < k; j++) {
				p *= s.charAt(j) - '0';
			}
			if (q == p)
				return "YES";
			p = 1;
		}

		return "NO";
	}

}
