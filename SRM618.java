public class SRM618 {

	public int write(String word) {

		int c = 0;

		for (int i = 0; i < word.length(); i++) {
			c += word.charAt(i) - 'A' + 1;
		}

		return c;
	}

}
