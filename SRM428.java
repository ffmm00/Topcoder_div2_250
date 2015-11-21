public class SRM428 {
	public static int find(String S) {

		for (int i = 0;; i++) {
			if (palid(S.substring(i))) {
				return S.length() + i;
			}
		}

	}

	static boolean palid(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}

}
