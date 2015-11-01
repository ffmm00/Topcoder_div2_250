public class SRM444 {

	public int maxScore(String[] grid) {

		int f = 0;
		int i = 0;

		while (i < grid[0].length() - 1) {
			if (grid[0].charAt(i) == '.' && grid[0].charAt(i + 1) == '.'
					&& grid[1].charAt(i) == '.' && grid[1].charAt(i + 1) == '.') {
				f++;
				i += 2;
			} else
				i++;
		}

		return 12 * f + grid[0].length() * 2;
	}

}
