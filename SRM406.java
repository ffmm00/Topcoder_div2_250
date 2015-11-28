public class SRM406 {
	public static int[] getHappy(String[] grid) {
		int happy[] = new int[3];
		int row = grid.length;
		int col = grid[0].length();
		int stX[] = { -1, 0, 1, 0 };
		int stY[] = { 0, 1, 0, -1 };
		int diX[] = { -1, 1, 1, -1 };
		int diY[] = { 1, 1, -1, -1 };

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i].charAt(j) != '.')
					continue;

				boolean stEmpty = check(grid, row, col, i, j, stX, stY);
				boolean diEmpty = check(grid, row, col, i, j, diX, diY);

				if (!stEmpty && !diEmpty) {
					happy[0]++;
				} else if (!stEmpty) {
					happy[1]++;
				} else if (!diEmpty) {
					happy[2]++;
				}

			}
		}

		return happy;
	}

	static boolean check(String grid[], int row, int col, int x, int y,
			int X[], int Y[]) {

		for (int i = 0; i < X.length; i++) {
			int nextX = x + X[i];
			int nextY = y + Y[i];
			if (nextX >= 0 && nextY >= 0 && nextX < row && nextY < col
					&& grid[nextX].charAt(nextY) == '.')
				return true;
		}
		return false;
	}

}
