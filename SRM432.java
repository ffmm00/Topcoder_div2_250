public class SRM432 {

	public int howMany(String[] words) {

		int ans = 0;

		for (String word : words) {
			boolean test = true;
			boolean[] used = new boolean[26];

			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (used[c - 'a'] && i > 0 && c != word.charAt(i - 1)) {
					test = false;
					break;
				} else {
					used[c - 'a'] = true;
				}
			}
			if (test)
				ans++;
		}

		return ans;
	}

}
