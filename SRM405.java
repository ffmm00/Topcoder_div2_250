public class SRM405 {
	public static double compute(int n, int k) {

		double ans = 1;

		if (k > 0) {
			while (k != 0) {
				ans *= n;
				n--;
				k--;
			}
		} else if (k < 0) {
			for (int i = n - k; i > n; i--)
				ans /= i;
		}

		return ans;
	}

}
