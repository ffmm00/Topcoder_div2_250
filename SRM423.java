public class SRM423 {
	public static int count(int n, int[] x, int[] y) {

		int c = 0;

		int[] dx = { 1, 1, n, n };
		int[] dy = { 1, n, 1, n };

		for (int i = 0; i < x.length; i++) {
			int move = Integer.MAX_VALUE;
			for (int j = 0; j < 4; j++) {
				int tmp = Math.abs(x[i] - dx[j]) + Math.abs(y[i] - dy[j]);
				move = Math.min(move, tmp);
			}
			c += move;
		}

		return c;
	}

}
