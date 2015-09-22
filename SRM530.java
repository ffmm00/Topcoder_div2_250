public class SRM530 {

	public int solve(int[] T) {

		int ans = 0;

		for (int i = 0, j = T.length - 1; i < j; i++, j--)
			ans += T[j] - T[i];

		return ans;
	}

}
