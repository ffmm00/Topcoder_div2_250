public class SRM416 {
	public static String listMostCommon(String[] s) {

		int[] az = new int[26];

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) != ' ') {
					int a = s[i].charAt(j) - 'a';
					az[a]++;
				}
			}
		}

		String ans = "";
		int c = -1;

		for (int i = 0; i < 26; i++) {
			if (az[i] > c) {
				ans = (char) (i + 'a') + "";
				c = az[i];
			} else if (az[i] == c) {
				ans += (char) (i + 'a');

			}
		}

		return ans;
	}

}
