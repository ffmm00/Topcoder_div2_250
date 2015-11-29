public class SRM403 {
	public static int find(int n) {

		for (int i = n; i >= 0; i--) {
			if (test(i))
				return i;
		}

		return 0;
	}

	public static boolean test(int n) {

		String s = "" + n;
		int k = Integer.toString(n).length();

		for (int i = 0; i < k; i++) {
			if ((s.charAt(i) - '0') != 4 && (s.charAt(i) - '0') != 7)
				return false;
		}

		return true;
	}
}
