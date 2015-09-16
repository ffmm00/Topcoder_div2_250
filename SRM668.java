public class SRM668 {

	public String encrypt(String me, int[] key, int K) {

		int l = me.length();
		char[] ori = new char[l];
		String ans = me;

		while (K != 0) {
			for (int i = 0; i < l; i++) {
				ori[key[i]] = ans.charAt(i);
			}

			ans = "";

			for (char c : ori) {
				ans += c;
			}
			K--;
		}
		return ans;
	}

}
