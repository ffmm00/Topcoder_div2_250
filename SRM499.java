public class SRM499 {

	public int getMaximum(int[] hints) {

		int ans = -1;

		for (int i = 0; i < hints.length; i++) {
			for (int j = 0; j < hints.length; j++) {
				int x = hints[i] + hints[j];
				int y = hints[i] - hints[j];
				if (x > 0 && y > 0 && x % 2 == 0 && y % 2 == 0)
					ans = Math.max(ans, x * y / 4);
			}
		}

		return ans;
	}

}
