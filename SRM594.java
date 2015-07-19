public class SRM594 {

	public String ableTo(int n, int m) {

		boolean[][] A = new boolean[n][m];

		int total = 0;
		int r = 0;
		int c = 0;

		for (int i = 0; i < n * m; i++) {
			if (A[r][c] == false) {
				total++;
				A[r][c] = true;
			}
			r = (r + 1) % n;
			c = (c + 1) % m;

		}

		if (total == n * m)
			return "Possible";

		return "Impossible";
	}

}
