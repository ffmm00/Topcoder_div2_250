public class SRM457 {

	public String[] solve(String[] board) {

		int n = board.length;
		int[] r = new int[n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (board[i].charAt(j) == 'C')
					r[i]++;
			}

		String[] place = new String[n];

		for (int i = 0; i < n; i++) {
			place[i] = "";
			for (int j = 0; j < n; j++) {
				if (i + r[j] >= n) {
					place[i] += 'C';
				} else {
					place[i] += '.';
				}
			}
		}

		return place;
	}

}
