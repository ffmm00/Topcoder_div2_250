public class SRM448 {

	public int score(String[] cards) {

		int ans = 0;

		for (String s : cards) {
			char c = s.charAt(0);
			if (c == 'J' || c == 'Q' || c == 'K' || c == 'T') {
				ans += 10;
			} else if (c == 'A') {
				ans += 11;
			} else {
				ans += c - '0';
			}
		}

		return ans;
	}

}
