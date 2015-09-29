public class SRM517 {

	public int theMin(String[] board) {

		int x = board.length;
		int y = board[0].length();
		int c = 0;

		for (int i = 0; i < x; i++) {
			boolean B = true;
			for (int j = 0; j < y; j++)
				if (board[i].charAt(j) == 'W')
					B = false;
			if (B)
				c++;

		}

		for (int i = 0; i < y; i++) {
			boolean B = true;
			for (int j = 0; j < x; j++)
				if (board[j].charAt(i) == 'W')
					B = false;
			if (B)
				c++;
		}

		if (x + y == c)
			return Math.min(x, y);

		return c;
	}

}
