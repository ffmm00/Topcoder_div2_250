public class SRM558 {

	public int score(String[] cost, String[] benefit, String[] stone) {

		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int b = 0, s = 0, N = stone.length, M = stone[0].length();

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++) {
				if (stone[i].charAt(j) == 'o') {
					s += cost[i].charAt(j) - '0';
					b += benefit[i].charAt(j) - '0';
				} else {
					int check = 0, ok = 0;
					for (int k = 0; k < 4; k++) {
						int i2 = i + dx[k];
						int j2 = j + dy[k];
						if (i2 >= 0 && j2 >= 0 && i2 < N && j2 < M) {
							check += 1;
							if (stone[i2].charAt(j2) == 'o')
								ok += 1;
						}
					}
					if (check == ok)
						b += benefit[i].charAt(j) - '0';
				}

			}

		return b - s;
	}

}
