public class SRM671 {

	public long maxArea(int W, int H, long M) {

		long ans = 0;

		for (int i = 1; i <= W; i++) {
			long temp = Math.min(M / i, H);
			ans = Math.max(ans, temp * i);
		}

		return ans;
	}

}
