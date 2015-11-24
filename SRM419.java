public class SRM419 {
	public static int getPerimiter(int[] a) {

		int c = 0;

		c += a.length * 2 + a[0] + a[a.length - 1];

		for (int i = 0; i < a.length - 1; i++) {
			c += Math.abs(a[i + 1] - a[i]);
		}

		return c;
	}

}
