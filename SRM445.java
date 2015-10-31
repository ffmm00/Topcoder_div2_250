public class SRM445 {

	public String encrypt(String message) {

		String ans = "";
		char co = 'a';
		char[] c = new char[26];

		for (int i = 0; i < message.length(); i++) {
			int temp = message.charAt(i) - 'a';
			if (c[temp] == 0) {
				c[temp] = co;
				co++;
			}
			ans += c[temp];
		}

		return ans;
	}

}
