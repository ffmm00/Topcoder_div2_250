public class SRM555 {

	public int theMax(String[] board) {

		int a = board.length;
		int b = board[0].length();
		int ans = 0;

		for (int r = 0; r < a; r++)
			for (int c = 0; c < b; c++) {
				int cnt = 0;
				for (int i = 0; i < a; i++)
					for (int j = 0; j < b; j++) {
						int x = board[i].charAt(j) - '0';
						if (r == i)
							x = 1 - x;
						if (j == c)
							x = 1 - x;
						cnt += x;
					}
				ans = Math.max(ans, cnt);
			}

		return ans;
	}

}
