public class SRM443 {

	public int[] points(String[] matches) {

		int[] ans = new int[matches.length];

		for (int i = 0; i < matches.length; i++) {
			for (int j = 0; j < matches[0].length(); j++) {
				if (matches[i].charAt(j) == 'W')
					ans[i] += 3;
				if (matches[j].charAt(i) == 'L')
					ans[i] += 3;
				if (matches[i].charAt(j) == 'D')
					ans[i]++;
				if (matches[j].charAt(i) == 'D')
					ans[i]++;
			}
		}

		return ans;
	}

}
