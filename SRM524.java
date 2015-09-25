public class SRM524 {

	public int minimalCost(int N) {

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= 200; i++)
			for (int j = 0; j <= 200; j++)
				for (int k = 0; k <= 200; k++) {
					if (i * j * k == N) {
						ans = Math.min(i + j + k, ans);
					}
				}

		return ans;
	}

}
