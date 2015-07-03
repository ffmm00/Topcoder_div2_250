public class SRM645 {

	public int[] performTheExperiment(int[] col) {

		boolean tes = true;

		while (tes) {
			tes = false;
			int[] b = col.clone();
			for (int i = 1; i < col.length - 1; i++) {
				if (col[i - 1] < col[i] && col[i + 1] < col[i]) {
					b[i]--;
					tes = true;
				}

				if (col[i - 1] > col[i] && col[i + 1] > col[i]) {
					b[i]++;
					tes = true;
				}
			}
			col = b;
		}

		return col;

	}

}
