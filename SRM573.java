public class SRM573 {

	public int minCost(int[] altitude) {

		int ans = 0;

		for (int i = 0; i < altitude.length - 1; i++) {
			if (altitude[i] < altitude[i + 1]) {
				ans += altitude[i + 1] - altitude[i];
				altitude[i + 1] = altitude[i];
			}
		}

		return ans;
	}

}
