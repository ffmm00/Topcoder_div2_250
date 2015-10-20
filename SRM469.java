public class SRM469 {

	public int find(int n, int m, int[] row, int[] seat) {

		boolean test[][] = new boolean[n][m];

		for (int i = 0; i < row.length; i++)
			test[row[i] - 1][seat[i] - 1] = true;

		int num = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m - 1; j++) {
				if (!test[i][j] && !test[i][j + 1])
					num++;
			}

		return num;
	}

}
