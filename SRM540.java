public class SRM540 {

	public int getCount(int maxR, int maxG, int maxB, int startR, int startG,
			int startB, int d1, int d2) {

		int ans = 0;

		for (int i = 0; i < maxR; i++) {
			if (Math.abs(i - startR) > d2) {
				continue;
			}
			for (int j = 0; j < maxG; j++) {
				if (Math.abs(j - startG) > d2)
					continue;

				for (int k = 0; k < maxB; k++) {
					if (Math.abs(k - startB) > d2)
						continue;

					if (Math.abs(i - startR) >= d1
							|| Math.abs(j - startG) >= d1
							|| Math.abs(k - startB) >= d1)
						ans++;
				}
			}

		}

		return ans;
	}

}
