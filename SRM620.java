public class SRM620 {

	public int[] sort(String[] score, int x) {

		int n = score.length;

		int[] res = new int[n];
		int p = 0;

		for (char c = 'A'; c <= 'Z'; c++)
			for (int i = 0; i < n; i++)
				if (score[i].charAt(x) == c)
					res[p++] = i;

		return res;
	}

}
