public class SRM642 {

	public int minNumber(String ex) {

		int min = Integer.MAX_VALUE;

		for (int i = 1; i < ex.length(); i++) {
			String A = ex.substring(0, i);
			String B = ex.substring(i);
			int tm = Integer.parseInt(A) + Integer.parseInt(B);
			min = Math.min(tm, min);

		}
		return min;
	}

}
