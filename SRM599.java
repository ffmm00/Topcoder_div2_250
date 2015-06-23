import java.util.Arrays;

public class SRM599 {

	public int countReachableIslands(int[] positions, int L) {

		int c = 1;
		int[] J = new int[L + 1];
		int p = positions[0];

		Arrays.sort(positions);

		for (int i = 0; i < positions.length; i++) {
			if (positions[i] == p) {
				for (int k = i - 1; k >= 0
						&& positions[k + 1] - positions[k] <= L; k--)
					c++;

				for (int k = i + 1; k < positions.length
						&& positions[k] - positions[k - 1] <= L; k++)
					c++;
			}
		}

		return c;
	}
}
