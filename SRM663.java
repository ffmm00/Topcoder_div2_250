import java.util.Arrays;
import java.util.Comparator;

public class SRM663 {

	private static final int LETTERS = 'z' - 'a' + 1;

	private static final Comparator<int[]> CMP = new Comparator<int[]>() {
		public int compare(int[] a, int[] b) {
			return a[1] - b[1];
		}

	};

	public int minimumChanges(String[] floor) {

		int x = floor.length;
		int[][] c1 = new int[LETTERS][2];
		int[][] c2 = new int[LETTERS][2];

		for (int c = 'a'; c <= 'z'; ++c) {
			c1[c - 'a'][0] = c;
			c1[c - 'a'][1] = ((x + 1) / 2) * ((x + 1) / 2) + (x / 2) * (x / 2);
			c2[c - 'a'][0] = c;
			c2[c - 'a'][1] = 2 * ((x + 1) / 2) * (x / 2);
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; ++j) {
				char c = floor[i].charAt(j);
				if (((i ^ j) & 1) == 0) {
					c1[c - 'a'][1]--;
				} else
					c2[c - 'a'][1]--;
			}
		}

		Arrays.sort(c1, CMP);
		Arrays.sort(c2, CMP);

		if (c1[0][0] != c2[0][0]) {
			return c1[0][1] + c2[0][1];
		}

		return Math.min(c1[0][1] + c2[1][1], c1[1][1] + c2[0][1]);
	}

}
