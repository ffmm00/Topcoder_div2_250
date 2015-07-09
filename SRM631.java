public class SRM631 {

	public int getNumber(String[] grid) {
		int c = 1;
		int A = 1;

		for (int i = 0; i < grid.length; i++) {
			c = 1;
			for (int m = 0; m < grid.length - 1; m++) {
				if (grid[m].charAt(i) != grid[m + 1].charAt(i)) {
					c = 1;
				} else {
					c++;
					A = Math.max(A, c);
				}
			}
		}

		return A;

	}
}
