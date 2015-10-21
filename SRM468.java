import java.util.Arrays;

public class SRM468 {

	public int minTime(int N, int[] roadTime, int[] flightTime, int K) {

		int ans = 0;
		int[] n = new int[N];

		for (int i = 0; i < N; i++) {
			ans += roadTime[i];
			n[i] = flightTime[i] - roadTime[i];
		}

		Arrays.sort(n);

		for (int i = 0; i < K && n[i] < 0; i++) {
			ans += n[i];
		}

		return ans;

	}

}
