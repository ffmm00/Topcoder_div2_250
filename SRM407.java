public class SRM407 {
	public static int totalPoints(String[] level) {

		int h = level.length;
		int w = level[0].length();
		int ans = 0, r = 0, c = 0, d = 0;
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		boolean[][] was = new boolean[h][w];
		boolean[][] bad = new boolean[h][w];
		int left = h * w - 1;

		while (left > 0) {
			was[r][c] = true;
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr >= 0 && nr < h && nc >= 0 && nc < w && !was[nr][nc]) {
				left--;
				r = nr;
				c = nc;
			} else {
				bad[r][c] = true;
				d = (d + 1) % 4;
			}
		}

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (!bad[i][j])
					ans += level[i].charAt(j) - '0';

		return ans;
	}
}
