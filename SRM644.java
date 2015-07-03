public class SRM644 {

	public int count(int[] osize, int K) {

		int c = 0;

		for (int i = 0; i < osize.length - 1; i++)
			for (int m = i + 1; m < osize.length; m++) {
				int d = osize[i] - osize[m];
				if (d <= K && -K <= d)
					c++;
			}

		return c;
	}

}
