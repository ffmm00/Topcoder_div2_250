public class SRM541 {

	public int countTuples(String S) {

		int ans = 0;

		for (int i = 1; i < S.length(); i++)
			for (int j = i + 1; j <= S.length(); j++) {
				int len = j - i;
				for (int k = j + 1; k + len < S.length(); k++) {
					if (S.substring(i, j).equals(S.substring(k, k + len)))
						ans++;
				}
			}
		

		return ans;
	}

}
