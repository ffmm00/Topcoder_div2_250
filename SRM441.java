public class SRM441 {
	public int minimize(String A, String B) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= B.length() - A.length(); i++) {
			int t = 0;
			for (int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(i + j))
					t++;
			}
			min = Math.min(min, t);

		}
		return min;
	}

}
