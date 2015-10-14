public class SRM487 {

	public int getMaximum(String black, String gray, String white) {

		int ans = 0;

		for (int i = 0; i < black.length(); i++) {
			char b = black.charAt(i);
			char g = gray.charAt(i);
			char w = white.charAt(i);

			if (g == w) {
				if (g != b)
					ans += 2;
			} else
				ans++;
		}

		return ans;
	}

}
