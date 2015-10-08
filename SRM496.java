import java.util.HashSet;

public class SRM496 {

	public int getMaximumSubset(String[] S) {

		HashSet<String> set = new HashSet<String>();

		for (String s : S) {
			int[] count = new int[26];
			for (int i = 0; i < s.length(); i++)
				count[s.charAt(i) - 'a']++;

			String sign = "";

			for (int i = 0; i < count.length; i++) {
				if (count[i] > 0)
					sign += ('a' + i) + count[i];
			}

			set.add(sign);

		}

		return set.size();
	}

}
