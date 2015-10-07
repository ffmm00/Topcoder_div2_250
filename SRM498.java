public class SRM498 {

	public int getMaximumPoints(int A, int B, int C, int N) {

		int ans = 0;

		for (int i = 0; i < N; i++) {
			int max = Math.max(Math.max(B, C), A);

			if (max == 0)
				break;

			ans += max;

			if (A == max)
				A--;
			else if (B == max)
				B--;
			else if (C == max)
				C--;

		}

		return ans;
	}

}
