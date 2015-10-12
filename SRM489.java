public class SRM489 {

	public int count(String badPrefix, String badSuffix, String badSubstring,
			String[] voca) {

		int ans = 0;

		for (String s : voca) {
			if (s.startsWith(badPrefix)
					|| s.endsWith(badSuffix)
					|| (s.length() > 2 && s.substring(1, s.length() - 1)
							.contains(badSubstring))) {
				ans++;
			}
		}

		return ans;
	}

}
