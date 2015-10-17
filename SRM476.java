public class SRM476 {

	public int minimumShifts(String[] matrix, int value) {

		int minShift = -1;
		int row = matrix.length;
		int col = matrix[0].length();

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				if (matrix[i].charAt(j) - '0' == value) {
					int shift = Math.min(i, row - i) + Math.min(j, col - j);
					if (minShift < 0 || shift < minShift)
						minShift = shift;
				}
			}

		return minShift;
	}

}
