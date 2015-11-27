public class SRM411 {
	public static int getNumber(int low, int upp) {

		int ans = -1;
		int max = -1;

		for (int i = low; i <= upp; i++) {
			int score = score(i);
			if (score >= max) {
				max = score;
				ans = i;
			}
		}

		return ans;
	}

	static int score(int n) {

		int r = 0;

		for (int i = 0; 2 * i * i <= n; i++) {
			int tm = (int) Math.round(Math.sqrt(n - i * i));
			if (n == i * i + tm * tm)
				r++;
		}
		return r;

	}

}
