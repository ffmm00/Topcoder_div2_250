public class SRM651 {

	public String isSafeCommand(String[] board, String S) {

		int X = 0;
		int Y = 0;

		for (int i = 0; i < board.length; i++)
			for (int m = 0; m < board[0].length(); m++) {
				if (board[i].charAt(m) == 'S') {
					Y = i;
					X = m;
					break;
				}
			}

		for (char ch : S.toCharArray()) {
			int nextX = X;
			int nextY = Y;
			switch (ch) {
			case 'U':
				nextY--;
				break;
			case 'D':
				nextY++;
				break;
			case 'L':
				nextX--;
				break;
			case 'R':
				nextX++;
				break;
			}
			if (nextX < 0 || nextY < 0 || board[0].length() <= nextX
					|| board.length <= nextY) {
				return "Dead";
			}
			if (board[nextY].charAt(nextX) != '#') {
				X = nextX;
				Y = nextY;
			}
		}

		return "Alive";
	}

}
