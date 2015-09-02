
public class SRM556 {

	public int maxLength(String letters) {

		int max = 0;

		for (int i = 0; i < letters.length(); i++)
			for (int k = 0; k < letters.length(); k++) {
				int[] f = new int[26];
				boolean ok = false;
				for (int m = i; m <= k; m++) {
					f[letters.charAt(m) - 'a']++;
					if (f[letters.charAt(m) - 'a'] == 2)
						ok = true;
				}
				if (!ok)
					max = Math.max(max, k - i + 1);
			}
		return max;
	}

}
