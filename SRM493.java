public class SRM493 {

	public int count(String[] table, int K) {

		int ans = 0;

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length(); j++) {
				int c1 = 0;
				int c2 = 0;
				for (int k = 0; k < K; k++) {
					if (j + k < table[0].length()
							&& table[i].charAt(j + k) == 'A')
						c1++;
					if (i + k < table.length && table[i + k].charAt(j) == 'A')
						c2++;

					if (c1 == K)
						ans++;
					if (c2 == K)
						ans++;
				}
			}
		}

		if (K == 1)
			ans /= 2;

		return ans;
	}

}
