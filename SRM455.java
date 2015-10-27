public class SRM455 {

	public int find(String[] A) {

		int row = A.length;
		int col = A[0].length();
		boolean[][] spi = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int x = i;
				int y = j;

				if (A[i].charAt(j) == 'N')
					x--;
				else if (A[i].charAt(j) == 'S')
					x++;
				else if (A[i].charAt(j) == 'E')
					y++;
				else
					y--;

				if (x < 0 || x >= row || y < 0 || y >= col)
					continue;

				spi[x][y] = true;
			}
		}

		int c = 0;

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (spi[i][j])
					c++;

		return row * col - c;
	}

}
