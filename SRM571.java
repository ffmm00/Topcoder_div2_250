public class SRM571 {

	public int countStars(String[] result) {

		int ans = 0;

		for (int i = 0; i < result.length; i++) {
			for (int k = 0; k < result[0].length(); k++) {
				if (result[i].charAt(k) == 'o')
					ans++;

			}
		}

		return ans;
	}

}
