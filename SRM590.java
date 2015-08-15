public class SRM590 {

	public String win(String[] board) {

		int x = board.length;
		int y = board[0].length();
		int c = 0;
		int l = 0;
		int d = 0;

		for (int i = 0; i < x; i++) {
			c = 0;
			for (int k = 0; k < y; k++) {
				if (board[i].charAt(k) == 'o') {
					c++;
				} else {
					c = 0;
				}
				if (c == 5)
					return "found";
			}
		}

		for (int i = 0; i < y; i++) {
			l = 0;
			for (int k = 0; k < x; k++) {
				if (board[k].charAt(i) == 'o') {
					l++;
				} else {
					l = 0;
				}
			}
			if (l == 5)
				return "found";
		}

		for (int i = 0; i < x; i++) {
			for (int k = 0; k < y; k++) {
				if (board[i].charAt(k) == 'o') {
					d = 0;
					int a = i;
					int b = k;
					for (int m = 0; m < 5; m++) {
						if (a < x && b < y)
							if (board[a].charAt(b) == 'o') {
								d++;
								a++;
								b++;
							} else
								break;
					}
				}
				if (d == 5)
					return "found";

			}
		}

		for (int i = 0; i < x; i++) {
			for (int k = y - 1; k >= 0; k--) {
				if (board[i].charAt(k) == 'o') {
					d = 0;
					int a = i;
					int b = k;
					for (int m = 0; m < 5; m++) {
						if (a < x && b >= 0)
							if (board[a].charAt(b) == 'o') {
								d++;
								a++;
								b--;
							} else
								break;
					}
				}
				if (d == 5)
					return "found";

			}
		}

		return "not found";
	}
}
