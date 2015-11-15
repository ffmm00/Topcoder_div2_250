public class SRM439 {
	public int getMax(String[] date) {
		int row = date.length;
		int col = date[0].length();

		for (int size = Math.min(row, col);; size--) {
			for (int i = 0; i + size <= row; i++) {
				for (int j = 0; j + size <= col; j++) {
					if (date[i].charAt(j) == date[i].charAt(j + size - 1)
							&& date[i].charAt(j) == date[i + size - 1]
									.charAt(j)
							&& date[i].charAt(j) == date[i + size - 1].charAt(j
									+ size - 1))
						return size * size;

				}
			}

		}
	}

}
