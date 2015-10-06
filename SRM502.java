import java.util.Arrays;

public class SRM502 {

	public int[] find(int T, int[] requiredTime) {

		Arrays.sort(requiredTime);

		int[] ans = { 0, 0 };
		int sum = 0;
		int c = 0;

		while (c < requiredTime.length) {
			sum += requiredTime[c];
			if (sum > T)
				break;
			ans[0]++;
			ans[1] += sum;
			c++;
		}

		return ans;
	}

}
