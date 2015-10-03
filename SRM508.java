public class SRM508 {

	public int countProbablePlaces(int[] X, int[] Y, int[] R) {

		int ans = 0;

		for (int x = -200; x <= 200; x++) {
			for (int y = -200; y <= 200; y++) {
				boolean test = true;
				for (int i = 0; i < R.length; i++) {
					if (Math.abs(x - X[i]) + Math.abs(y - Y[i]) > R[i]) {
						test = false;
						break;
					}
				}
				if (test)
					ans++;
			}
		}

		return ans;
	}

}
