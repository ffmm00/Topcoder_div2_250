public class SRM653 {

	public int solve(int[] a) {

		int C = 0;

		for (int i = 0; i < a.length; i++) {
			C++;
			for (int m = 1; m < a[i]; m++) {
				i++;
				if (i >= a.length || a[i] != a[i - 1])
					return -1;
			}
		}

		return C;

	}
}
