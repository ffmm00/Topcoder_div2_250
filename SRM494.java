public class SRM494 {

	public int bestInvitation(String[] first, String[] second) {

		int ans = 0;

		for (int i = 0; i < first.length; i++) {
			String[] s = new String[] { first[i], second[i] };
			for (int j = 0; j < 2; j++) {
				int c = 0;

				for (int k = 0; k < first.length; k++) {
					if (s[j] == first[k] || s[j] == second[k])
						c++;
				}

				ans = Math.max(ans, c);
			}
		}

		return ans;
	}

}
