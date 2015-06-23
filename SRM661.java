public class SRM661 {

	public String[] simulate(String[] board) {

		char[][] line = new char[board.length][];

		for (int i = 0; i < board.length; i++)
			line[i] = board[i].toCharArray();

		for (int i = line.length - 1; i >= 0; i--) {
			for (int j = 0; j < line.length; j++) {
				if (line[i][j] == '.') {
					for (int k = i - 1; k >= 0; k--) {
						if (line[k][j] == 'x')
							break;

						if (line[k][j] == 'o') {
							line[k][j] = '.';
							line[i][j] = 'o';
							break;
						}
					}
				}
			}
		}

		for (int i = 0; i < board.length; i++)
			board[i] = new String(line[i]);

		return board;
	}

}