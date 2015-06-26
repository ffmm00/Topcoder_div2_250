import java.util.Arrays;

public class SRM656 {

	public String reconstructMessage(String s, int k) {

		int L = s.length();
		int[] alp = new int[26];

		for (int i = 0; i < L; i++) {
			alp[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < alp.length; i++) {
			if (alp[i] == L - k) {

				char[] r = new char[L];
				Arrays.fill(r, (char) (i + 'a'));
				return new String(r);

			}
		}

		return null;

	}
}
