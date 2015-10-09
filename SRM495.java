public class SRM495 {

	public int theIndex(int[] carrots, int K) {

		int i = 1;
		boolean loop = true;

		while (loop) {
			int n = 0;
			for (int j = 0; j < carrots.length; j++) {
				if (carrots[j] > carrots[n])
					n = j;
			}

			carrots[n]--;
			if (i == K)
				return n;

			i++;

		}

		return 0;
	}

}
