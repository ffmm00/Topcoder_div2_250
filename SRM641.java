public class SRM641 {

	public int meet(int T, int[] Q, int[] P) {

		int n = Q.length;
		int[] a = new int[n];
		int[] b = new int[n];
		int X = 0;
		int Y = 0;
		int c = 0;

		for (int i = 0; i < n; i++) {
			X += Q[i];
			if (X >= T) {
				X %= T;
				a[i]++;
			}

			Y += P[i];
			if (Y >= T) {
				Y %= T;
				b[i]++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (a[i] > 0 && b[i] > 0)
				c++;
		}

		return c;
	}

}
