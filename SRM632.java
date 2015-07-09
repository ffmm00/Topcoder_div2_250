public class SRM632 {

	public int numberOfLap(int N, int[] d) {

		int c = 1;

		for (int i = 1; i < d.length; i++) {
			if (d[i] <= d[i - 1])
				c++;
		}

		return c;
	}

}
