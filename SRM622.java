public class SRM622 {

	public int find(int N) {

		int a = 0;
		int b = 1;
		int c = 0;

		while (b < N) {
			c = a + b;
			a = b;
			b = c;
		}

		return Math.min(b - N, N - a);

	}

}
