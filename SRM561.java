import java.util.Arrays;

public class SRM561 {

	public int maxCities(int total, int[] d) {

		Arrays.sort(d);
		int ans = 0;

		for (int i = 0; i < d.length; i++) {
			total -= d[i];
			if (total < 0) {
				ans = i;
				break;
			}
			if (i == d.length - 1)
				ans = d.length;
		}

		return ans;
	}

}
