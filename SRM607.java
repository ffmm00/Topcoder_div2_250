public class SRM607 {

	public int smallestArea(int[] X, int[] Y) {

		int R = -101;
		int L = 101;
		int w = 0;
		int h = 0;

		for (int i = 0; i < X.length; i++) {
			L = Math.min(X[i], L);
			R = Math.max(X[i], R);
		}

		if (L >= 0 && R >= 0)
			w = R - L;
		else if (L <= 0 && R <= 0)
			w = R - L;
		else
			w = R + -1 * (L);

		R = -101;
		L = 101;

		for (int i = 0; i < Y.length; i++) {
			L = Math.min(Y[i], L);
			R = Math.max(Y[i], R);
		}

		if (L >= 0 && R >= 0)
			h = R - L;
		else if (L <= 0 && R <= 0)
			h = R - L;
		else
			h = R + -1 * (L);

		return Math.abs(w * h);
	}

}
