public class SRM477 {

	public int bestSchedule(int N, int K, int[] workingDays) {

		int ans = 10000;

		for (int i = 1; i + K - 1 <= N; i++) {
			int c = 0;
			int j = i + K - 1;
			for (int k = 0; k < workingDays.length; k++) {
				if (workingDays[k] >= i && workingDays[k] <= j)
					c++;
			}
			ans = Math.min(ans, c);
		}

		return ans;
	}

}
