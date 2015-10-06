public class SRM501 {

	public int theCount(int[] seq) {

		if (seq.length == 1)
			return -1;

		int c = 0;

		double a = seq[1] / seq[0];
		int b = seq[1] - seq[0];

		if (seq[1] % seq[0] != 0)
			a = 0;

		for (int i = 0; i < seq.length - 1; i++) {
			if (a != 0) {
				if ((double) seq[i + 1] / seq[i] != a)
					a = 0;
			}

			if (b != 0) {
				if (seq[i + 1] - seq[i] != b)
					b = 0;
			}
		}

		int ans = 0;

		if (a != 0)
			ans++;
		if (b != 0)
			ans++;

		return ans;
	}

}
