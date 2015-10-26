public class SRM458 {

	public int desertArea(String[] island, int T) {

		int row = island.length;
		int col = island[0].length();

		char[][] c = new char[row][col];
		int desert = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = island[i].charAt(j);
				if (island[i].charAt(j) == 'D')
					desert++;
			}
		}

		int[] setX = { 0, -1, 0, 1, 0 };
		int[] setY = { 0, 0, 1, 0, -1 };

		for (int y = 0; y < T && desert > 0 && desert < row * col; y++) {
			char[][] next = new char[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					boolean test = false;
					for (int k = 0; k < 5; k++) {
						int plusX = i + setX[k];
						int plusY = j + setY[k];
						if (plusX >= 0 && plusX < row && plusY >= 0
								&& plusY < col && c[plusX][plusY] == 'D') {
							test = true;
							break;
						}
					}
					next[i][j] = test ? 'D' : 'F';
					if (c[i][j] != next[i][j])
						desert++;
				}
			}
			c = next;
		}

		return desert;
	}
}
