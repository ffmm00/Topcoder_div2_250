public class SRM639 {

	public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {

		int[] a = new int[t1];
		int[] b = new int[t2];

		a[0] = st1;
		b[0] = st2;

		for (int i = 1; i < t1; i++) {
			st1 += p1;
			a[i] = st1;
		}

		for (int i = 1; i < t2; i++) {
			st2 += p2;
			b[i] = st2;
		}

		for (int i = 0; i < t1; i++)
			for (int m = 0; m < t2; m++) {
				if (a[i] == b[m])
					return "Difficult";
			}

		return "Easy";
	}

}
